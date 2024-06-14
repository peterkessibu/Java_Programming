public class Main {
    public static void main(String[] args) {
        // Create an InputStreamReader to read bytes and decode them into characters
        java.io.InputStreamReader reader = new java.io.InputStreamReader(System.in);
        // Create a StringBuilder to store the input
        StringBuilder name = new StringBuilder();
        
        System.out.print("Enter your name: ");
        
        try {
            // Read characters one by one from the input stream
            int character;
            while ((character = reader.read()) != '\n') {
                // Append each character to the StringBuilder
                name.append((char) character);
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        // Print the user's name back to the screen
        System.out.println("Hello, " + name + "!");
    }
}