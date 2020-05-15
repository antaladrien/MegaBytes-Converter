package com.antaladrien;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter kiloBytes: ");
        int num = myObj.nextInt();
        printMegaBytesAndKiloBytes(num);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = (kiloBytes / 1024);
            int remainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = "
                    + megaBytes + " MB and " + remainder + " KB");
        }
    }
}
