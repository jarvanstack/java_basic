package Java学习.JavaSE基础.Lab4;

import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class StasDemo {

    //ADD AN IMPORT STATEMENT HERE //for using files

    public static void main(String[] args) throws IOException//ADD A THROWS CLAUSE HERE
    {
        double sum = 0; //the sum of the numbers
        int count = 0; //the number of numbers added
        double mean = 0; //the average of the numbers
        double stdDev = 0; //the standard deviation of the numbers
        String line = null; //a line from the file
        double difference; //difference between the value and the mean
        //create an object of type Decimal Format
        DecimalFormat threeDecimals = new DecimalFormat("0.000");
        //create an object of type Scanner
        Scanner keyboard = new Scanner(System.in);
        String filename; // the user input file name
        //Prompt the user and read in the file name
        System.out.println("This program calculates statistics"
                + "on a file containing a series of numbers");
        System.out.print("Enter the file name: ");
        filename = "D:/Program Files/JetBrains/test1/Lab/src/xyz/Lab4/" + keyboard.nextLine();
        //ADD LINES FOR TASK #4 HERE
        //Create a FileReader object passing it the filename
        FileReader fileReader = new FileReader(filename);
        //Create a BufferedReader object passing it the FileReader object.
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        //priming(启动) read to read the first line of the file
        //create a loop that continues until you are at the end of the file
        while (bufferedReader.readLine() != null) {
            //convert the line to double value, add the value to the sum
            sum += Double.valueOf(bufferedReader.readLine());
            System.out.println(bufferedReader.readLine());
            //increment the counter
            count++;
        }
        //read a new line from the file
        //close the input file
        bufferedReader.close();
        //store the calculated mean
        mean = sum / count;

        System.out.println(mean);
        //ADD LINES FOR TASK #5 HERE
        //create a FileReader object passing it the filename
        FileReader fileReader1 = new FileReader(filename);
        //create a BufferedReader object passing it the FileReader object.
        BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
        //reinitialize the sum of the numbers
        sum = 0;
        //reinitialize the number of numbers added
        count = 0;
        double variance;
        while ((line = bufferedReader1.readLine()) != null) {


            //priming read to read the first line of the file
            //loop that continues until you are at the end of the file
            //convert the line into a double value and subtract the mean
            difference = Double.valueOf(line) - mean;
            //add the square of the difference to the sum
            sum += difference * difference;
            //increment the counter
            count++;
            //read a new line from the file
        }
        //close the input file
        bufferedReader1.close();
        //store the calculated standard deviation
        stdDev = sum / count;
        System.out.println(stdDev);
        //ADD LINES FOR TASK #3 HERE

        //create an object of type FileWriter using “Results.txt”
        FileWriter fileWriter = new FileWriter("D:/Program Files" +
                "/JetBrains/test1/Lab/src/xyz/Lab4/Results.txt");

        //create an object of PrintWriter passing it the FileWriter object.
        PrintWriter printWriter = new PrintWriter(fileWriter);
        //print the results to the output file
        //print the mean and the standard deviation(标准偏差) to the output file using the three
        //decimal format.
        printWriter.println("mean:" + threeDecimals.format(mean));
        printWriter.println("standard deviation:" + threeDecimals.format(stdDev));
        printWriter.flush();
        //close the output file
        printWriter.close();
    }

}
