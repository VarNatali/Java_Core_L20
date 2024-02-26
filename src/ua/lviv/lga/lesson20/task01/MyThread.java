package ua.lviv.lga.lesson20.task01;

import java.util.Scanner;

public class MyThread extends Thread {
    int num;
    private int delay;

    public MyThread(int delay) {
        this.delay = delay;
    }

    @Override
    public void run() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть кількість чисел Фібоначчі для потоку Thread: ");
        num = sc.nextInt();

        if (num > 1) {
            Integer[] fib = new Integer[num];
            fib[0] = 0;
            fib[1] = 1;
            for (int i = 2; i < num; i++) {
                fib[i] = fib[i - 2] + fib[i - 1];
            }
            System.out.print(" \n Потік Thread :  ");
            for (int i = 0; i < num; i++) {
                System.out.print(fib[i] + "t  ");

                try {
                    Thread.sleep(delay);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("\n Процес Thread завершено");
            System.out.println("Введіть кількість чисел Фібоначчі для потоку Runnable: ");


        } else {
            if (num == 1) System.out.print(" \n Потік Thread : 0 ");
            else System.out.print("Недопустима кількість");
        }


    }


}
