// Record Tracker

// import necessary packages and classes
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args) 
    {
    
        // Initialize the array with the count of lines
         String[] recordsArray = new String[31];
         
        // Setup scanner for file input
        try 
        {
            Scanner fileScanner = new Scanner(new File("records.txt"));


            // pass: Read lines into array
            int index = 0;
            while (fileScanner.hasNextLine())
            {
                recordsArray[index++] = fileScanner.nextLine();
            }

            // Display file data
            
            System.out.println("----------------------------\n|     HILTON RECORD BOARD   |\n-----------------------------");
            for (String record : recordsArray)
            {
                System.out.println("|\t" + record + "\t    |");
            }
            System.out.println("-----------------------------");
            
            fileScanner.close();
            
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        // Setup scanner for user input
        Scanner input = new Scanner(System.in);

        // Variables
        String distance;
        String recordHolder, stroke;
        String newRecord;

        // Get user data
        System.out.print("Congrats! You got a record! What's your name? ");
        recordHolder = input.nextLine();

        System.out.print("What stroke was it? ");
        stroke = input.next();

        System.out.print("What time was it? Please enter in the format \"0:00.00\"");
        newRecord = input.next();
        
        
        
        //Check data values

        if(stroke.equals("free")) {
           System.out.print("Was it the 50, 100, 200, or 500?");
           distance = input.next();
           System.out.println("Congrats on your record time of " + newRecord + " in the " + distance + " " + stroke + "!");
           
                if (distance.equals("50")) {
                    recordsArray[9] = (" " + recordHolder);
                    recordsArray[10] = (" " + newRecord);
                } else if (distance.equals("100")) {
                    recordsArray[17] = (" " + recordHolder);
                    recordsArray[18] = (" " + newRecord);
                } else if (distance.equals("200")) {
                    recordsArray[1] = (" " + recordHolder);
                    recordsArray[2] = (" " + newRecord);
                } else if (distance.equals("500")) {
                    recordsArray[21] = (" " + recordHolder);
                    recordsArray[22] = (" " + newRecord);
                }
          
        } else if (stroke.equals("back")) {
           distance = "100";
            System.out.println("Congrats on your record time of " + newRecord + " in the " + distance + " " + stroke + "!");
            recordsArray[25] = (" " + recordHolder);
            recordsArray[26] = (" " + newRecord);
        } else if (stroke.equals("breast")) {
           distance = "100";
           System.out.println("Congrats on your record time of " + newRecord + " in the " + distance + " " + stroke + "!");
           recordsArray[29] = (" " + recordHolder);
           recordsArray[30] = (" " + newRecord);
        } else if (stroke.equals("fly")) {
           distance = "100";
           System.out.println("Congrats on your record time of " + newRecord + " in the " + distance + " " + stroke + "!");
           recordsArray[13] = (" " + recordHolder);
           recordsArray[14] = (" " + newRecord);
        } else if (stroke.equals("IM")) {
           distance = "200";
          System.out.println("Congrats on your record time of " + newRecord + " in the " + distance + " " + stroke + "!");
            recordsArray[5] = (" " + recordHolder);
            recordsArray[6] = (" " + newRecord);
        }
        
            System.out.println("----------------------------\n|     HILTON RECORD BOARD   |\n-----------------------------");
            for (String record : recordsArray)
            {
                System.out.println("|\t" + record + "\t    |");
            }
            System.out.println("-----------------------------");
     
     //close the scanner
        input.close();
        
  
    }
}