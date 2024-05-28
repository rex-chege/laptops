package homejava;

import java.util.Scanner;

class Utility {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String myName = scanner.toString();
        int price = 100000;
        System.out.printf("enter the name of the item");
        scanner.nextLine();

        String myReg = scanner.toString();
        System.out.printf("enter the prize you want amount should range upto" + price);
        scanner.nextLine();

        String error = scanner.toString();
        System.out.print("we dont have that camera sorry");
        scanner.nextLine();

        /*
         * String myPrice = scanner.toString();
         * 
         * System.out.print("enter the price you want");
         * scanner.nextLine();
         * 
         * String error = scanner.toString();
         * System.out.print(" the amount entered is low");
         * scanner.nextLine();
         * 
         * 
         * // Double number1 = scanner.nextDouble();
         * 
         * // scanner Scanner = new scanner((Object) system);
         * // String myName = ("enter your name");
         * // String myReg = ("enter your regestration number");
         * 
         * // System.out.println("myReg");
         */
        scanner.close();

    }
}
