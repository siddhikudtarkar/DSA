package DSA;
//import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        // Use FileReader with the correct constructor
       /* FileReader fr = new FileReader("C:/Users/Siddhi/OneDrive/Desktop/union bank.txt");
        BufferedReader bf = new BufferedReader(fr);

        String str;

        while ((str = bf.readLine()) != null) {
            System.out.println(str);
        }
        
        bf.close();*/


        FileReader fr= new FileReader("C:/Users/Siddhi/OneDrive/Desktop/union bank.txt");
        Scanner sc= new Scanner(fr);
        
        // String line =sc.NextLine();
        /*while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }*/

        sc.useDelimiter("\\Z");
        System.out.println(sc.nextLine());

        sc.close();

    


    }
}
