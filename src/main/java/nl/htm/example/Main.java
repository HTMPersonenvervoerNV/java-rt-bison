package nl.htm.example;

import nl.htm.example.controller.NDOVReceiver;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    private static ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

    public static void main(String[] args) throws Exception {
        new Thread(new NDOVReceiver()).start();

        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.now().withHour(6).withMinute(0).withSecond(0);
        LocalDateTime ldt3 = LocalDateTime.now().withHour(4).withMinute(0).withSecond(0);

        if (ldt1.isAfter(ldt2) || ldt1.isAfter(ldt3)) {
            ldt2 = ldt2.plusDays(1);
        }

        long untilExit = ChronoUnit.SECONDS.between(ldt1, ldt2);
        System.out.println(ldt2);
        System.out.println("Seconds until exit: " + untilExit);

        executorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.exit(0);
            }
        },  untilExit, TimeUnit.SECONDS);
    }
}
