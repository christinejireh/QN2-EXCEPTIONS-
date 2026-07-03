import java.io.*;

public class TryWithResourcesDemo {
    public static void main(String[] args) {
        String filename = "data.txt";

        // Create the file automatically if it doesn't exist
        try {
            File file = new File(filename);
            if (!file.exists()) {
                try (PrintWriter writer = new PrintWriter(file)) {
                    writer.println("This is test data for the OOP exam");
                    writer.println("Question 2 try-with-resources demo");
                }
                System.out.println("Created new file: " + filename);
            }
        } catch (IOException e) {
            System.out.println("Failed to create file");
        }

        // Now read it using try-with-resources
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine();
            System.out.println("SUCCESS: " + line);
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}

