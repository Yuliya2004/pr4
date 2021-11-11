package rtu.mirea.gibo01.pr4;

import org.w3c.dom.ls.LSOutput;
import rtu.mirea.gibo01.pr4.Circle;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        rtu.mirea.gibo01.pr4.Circle[] arr = new rtu.mirea.gibo01.pr4.Circle[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            int xx, yy, rr;
            xx = sc.nextInt();
            yy = sc.nextInt();
            rr = sc.nextInt();
            arr[i] = new Circle(xx, yy, rr);
        }
        System.out.println("\nDefault Circle ");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
        System.out.println("\nCircle were sorted by max radius: ");
        Circle memp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].getR() > arr[j + 1].getR()) {
                    memp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = memp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("\nCircle were sorted by min radius: ");
        Circle temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].getR() < arr[j + 1].getR()) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}

