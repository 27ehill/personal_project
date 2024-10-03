//Record Tracker

import java.util.Scanner;
import java.util.*;
import java.io.*;


public class Main
{
    public static void main(String[] args)
    {
        //setup scanner
        Scanner input = new Scanner(System.in);
        
        //Variables
        int distance;
        String recordHolder, stroke;
        double newRecord;
        
        //get user data
        System.out.print("Congrats! you got a record! what's your name?");
        recordHolder = input.next();
        
        System.out.print("What stroke was it?");
        stroke = input.next();
        
        System.out.print("What time was it?");
        newRecord = input.nextDouble();


        if(stroke.equals("freestyle")) {
           System.out.print("Was it the 50, 100, 200, or 500?");
           distance = input.nextInt();
           System.out.println("Congrats on your record time of " + newRecord + " in the " + distance + " " + stroke + "!");
        
        } else if (stroke.equals("backstroke")) {
           distance = 100;
                   System.out.println("Congrats on your record time of " + newRecord + " in the " + distance + " " + stroke + "!");
        } else if (stroke.equals("breaststroke")) {
           distance = 100;
           System.out.println("Congrats on your record time of " + newRecord + " in the " + distance + " " + stroke + "!");
        } else if (stroke.equals("butterfly")) {
           distance = 100;
           System.out.println("Congrats on your record time of " + newRecord + " in the " + distance + " " + stroke + "!");
        } else if (stroke.equals("IM")) {
           distance = 200;
          System.out.println("Congrats on your record time of " + newRecord + " in the " + distance + " " + stroke + "!");
        
        }
        
        //output
        
        
        
        
    }
}