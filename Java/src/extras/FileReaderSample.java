package extras;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderSample {
    public static void main (String [] args){
        String filePath= "src/IntermediateBroCode/products.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null){
                String [] parts = line.split(",");
                String productName= parts[0];
                double price= Double.parseDouble(parts[1]);

                System.out.printf("Product Name: %-17s | Price: P%-20.2f\n",productName, price);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
