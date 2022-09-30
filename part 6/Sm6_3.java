/*ID: 21CE103
Name: Smit Patel
Repository Link: https://github.com/Smit103/21CE103_Part6_Java.git
AIM : Write a program to increment the value of one variable 
by one and display it after one second using thread using 
sleep() method.
*/

import java.util.Scanner;

class Incre extends Thread {

    int n;

    Incre(int n) {

        this.n = n;
    }

    public void run() {

        n += 1;

        try {

            sleep(1000);

        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Incremented number: " + n);
    }
}

public class Sm6_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Integer: ");
        int n = sc.nextInt();
        Thread tl = new Incre(n);
        tl.start();
    }
}