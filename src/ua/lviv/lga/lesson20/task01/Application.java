package ua.lviv.lga.lesson20.task01;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Application {
    public static void main(String[] args) throws Exception {

        MyThread myThread = new MyThread(1000);
        myThread.start();
        myThread.setPriority(Thread.MAX_PRIORITY);
        RunnableThread myRunnables = new RunnableThread(1000);

    }
}
