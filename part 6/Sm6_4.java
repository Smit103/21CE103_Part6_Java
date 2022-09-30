/*ID: 21CE103
Name: Smit Patel
Repository Link: https://github.com/Smit103/21CE103_Part6_Java.git
AIM : Write a program to create three threads ‘FIRST’, ‘SECOND’, 
‘THIRD’. Set the priority of the ‘FIRST’ thread to 3, the ‘SECOND’
thread to 5(default) and the ‘THIRD’ thread to 7.
*/

public class Sm6_4 extends Thread {

    public void run() {

        System.out.println("running");
    }
    public static void main(String args[]) {

        Sm6_4 tl = new Sm6_4();
        Sm6_4 t2 = new Sm6_4();
        Sm6_4 t3 = new Sm6_4();
        tl.setPriority(3);
        t2.setPriority(5);
        t3.setPriority(7);
        System.out.println("Priority of thread tl is: " + tl.getPriority());
        System.out.println("Priority of thread t2 is: " + t2.getPriority() + "(default)");
        System.out.println("Priority of thread t3 is: " + t3.getPriority());
        tl.start();
    }

}