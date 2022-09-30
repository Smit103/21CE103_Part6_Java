/*ID: 21CE103
Name: Smit patel
Repository Link: https://github.com/Smit103/21CE103_Part6_Java.git
AIM :Generate 15 random numbers from 1 to 100 and store it in an 
int array. Write a program to display the numbers stored at odd 
indexes by thread1 and display numbers stored at even indexes 
by thread2.
*/

import java.util.*;
class Odd extends Thread{
    int arr[] = new int[15];
    Odd(int []arr)
    {
        for(int i=0;i<15;i++)
        {
            this.arr[i] = arr[i];
        }
    }
    @Override
    public void run()
    {
        for(int i=0;i<15;i++)
        {
            if(arr[i]%2 != 0)
            {
                System.out.println("Odd number is:-  "+arr[i]);
            }
        }
    }
}
class Even extends Thread
{
    int arr[] = new int[15];
    Even(int [] arr)
    {
        for(int i=0;i<15;i++)
        {
            this.arr[i] = arr[i];
        }
    }

    @Override
    public void run()
    {
        for(int i=0;i<15;i++)
        {
            if(arr[i]%2 == 0)
            {
                System.out.println("Even number is:-  "+arr[i]);
            }
        }
        
    }
}
public class Sm6_2 {
    public static void main(String[] args) {
        int arr[] = new int[30];
        Random r = new Random();
        for(int i=0;i<15;i++)
        {
            arr[i] = r.nextInt(100);
        }
        Odd x = new Odd(arr);
        Even y = new Even(arr);

        x.start();
        y.start();
    }
}