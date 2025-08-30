package extras;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterSample {
    public static void main (String [] args){
        String filePath= "src/IntermediateBroCode/products.txt";

        try (FileWriter writer = new FileWriter(filePath)){
            writer.write("Coffee,89.00\n");
            writer.write("Tea,75.00\n");
            writer.write("Mango Smoothie,120.00\n");
            writer.write("Chocolate Cake,250.00");

            System.out.println("File updated successfully.");
        } catch (IOException e) {
            System.out.println("An error occured. " + e.getMessage());
        }
    }
}
