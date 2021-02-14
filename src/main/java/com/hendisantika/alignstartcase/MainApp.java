package com.hendisantika.alignstartcase;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Project : align-start-case-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 15/02/21
 * Time: 05.38
 */
public class MainApp {
    static final int LIMIT = 100;

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Input number of line (max: 100): ");
        int rows = myObj.nextInt();

        if (rows <= LIMIT) {
            rightTriangle(rows);
        } else {
            System.out.println("Your number is beyond max number (100)");
        }

    }

    public static void rightTriangle(int rows) {
        int n = rows;
        int i, j;

        for (i = 0; i < n; i++) {
            for (j = 2 * (n - i); j >= 0; j--) {
                System.out.print(" ");
            }

            for (j = 0; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
