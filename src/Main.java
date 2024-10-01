import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Specify the file path and name
        String filePath = "Soccer_Matches.txt";

        try {
            // Create a File object
            File file = new File(filePath);

            // Create a Scanner object to read the file
            Scanner scanner = new Scanner(file);

            // Read the file line by line and print each line
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            // Close the Scanner object
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        }
    }
}
