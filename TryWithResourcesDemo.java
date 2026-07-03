import java.io.*;

public class TryWithResourcesDemo {
    public static void main(String[] args) {
        // Best practice: try-with-resources with multiple resources if needed
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            
            String line = br.readLine();
            System.out.println("Successfully read: " + line);
            
        } catch (IOException e) {
            System.out.println("Error: Unable to read the file - " + e.getMessage());
        } 
        // No finally block needed - resources are auto-closed
    }
}