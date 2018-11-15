package nl.htm.example.controller;

import org.zeromq.ZMQ;
import org.zeromq.ZMsg;

import java.nio.charset.StandardCharsets;

public class NDOVReceiver implements Runnable {
    public final static String uri = "tcp://pubsub.besteffort.ndovloket.nl:7658";

    private void subscribeMe(ZMQ.Socket subscriber, String addr, String envelope) {
        subscriber.connect(addr);
        subscriber.subscribe(envelope.getBytes());
        subscriber.setReceiveTimeOut(300000);
    }

    public void run() {
        ZMQ.Context context = ZMQ.context(1);
        ZMQ.Socket subscriber = context.socket(ZMQ.SUB);
        subscribeMe(subscriber, uri, "/RIG/");

        boolean doContinue = true;

        while (doContinue) {
            ZMsg msg = ZMsg.recvMsg(subscriber);
            if (msg == null) {
                subscriber.close();
                subscribeMe(subscriber, uri, "/RIG/");
            }

            // System.out.println(msg.getFirst());

            String envelope = new String(msg.getFirst().getData(), StandardCharsets.UTF_8);
            if (envelope.endsWith("/KV6posinfo")) ProcessKV6.startRunnable(msg);

            if (envelope.endsWith("/KV17cvlinfo")) ProcessKV17.startRunnable(msg);
        }

        subscriber.close();
        context.term();
    }
}
