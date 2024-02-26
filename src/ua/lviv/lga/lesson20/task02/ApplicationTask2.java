package ua.lviv.lga.lesson20.task02;

import ua.lviv.lga.lesson20.task01.MyThread;
import ua.lviv.lga.lesson20.task01.RunnableThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ApplicationTask2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newScheduledThreadPool(5);
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                MyThread myThread = new MyThread(500);
                myThread.run();
            }
        });
        executorService.shutdown();

        ExecutorService executorService2 = Executors.newFixedThreadPool(5);
        executorService2.execute(new Runnable() {
            @Override
            public void run() {
                RunnableThread myRun = new RunnableThread(500);
                myRun.run();
            }
        });
        executorService2.shutdown();

    }
}
