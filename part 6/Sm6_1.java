/* ID: 21CE103
Name: Smit Patel
Repository Link: https://github.com/Smit103/21CE103_Part6_Java.git
Aim :Write a program to create thread which display “Hello World” message. 
by extending Thread class B. by using Runnable interface */
class S1 extends Thread
    {
        @Override
        public void run()
        {
            System.out.println("Hello world!!");
        }
    }

    class S2 implements Runnable
    {
        @Override
        public void run()
        {
            System.out.println("Hello world!");
        }
    }
  
public class Sm6_1
{
    public static void main(String[] args) {
        S1 s1 = new S1();
        S2 s2 = new S2();
        Thread s3 = new Thread(s2);
        
        s1.start();
        s3.start();
    
    }
}