package DSA;
import java.io.*;
public class Filewriter {

    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("C:/Users/Siddhi/OneDrive/Desktop/union bank.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("ABC");
        System.out.println("Finished");
        bw.close();
    }
    
    
}
