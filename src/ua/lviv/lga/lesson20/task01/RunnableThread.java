package ua.lviv.lga.lesson20.task01;

import java.util.Scanner;

public class RunnableThread implements Runnable {
    int num;
    private int delay;
    private Thread thread;

    public RunnableThread(int delay) {
        this.delay = delay;
        this.thread = new Thread(this);
        thread.start();
    }


    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);

        try {
            Thread.sleep(delay);

            num = sc.nextInt();

            if (num > 1) {
                Integer[] fib = new Integer[num];
                fib[0] = 0;
                fib[1] = 1;

                for (int i = 2; i < num; i++) {
                    fib[i] = fib[i - 2] + fib[i - 1];
                }
                System.out.print("\n Потік Runnable: ");

                for (int i = num - 1; i >= 0; i--) {
                    System.out.print(fib[i] + "r  ");

                    try {
                        Thread.sleep(delay);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("\n Процес Runnable завершено");

            } else {
                if (num == 1) System.out.print(" \n Потік Runnable : 0 ");
                else System.out.print("Недопустима кількість");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //   sc.close();
    }
}
