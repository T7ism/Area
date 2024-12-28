public class SonarDemo {

    public static void main(String[] args) {
        // Hardcoded credentials (Security issue)
        String username = "admin";
        String password = "12345";

        // Unused variable
        int unusedVariable = 42;

        // Potential NullPointerException
        String nullableString = null;
        System.out.println(nullableString.length());

        // Magic number
        int area = calculateArea(5, 10);

        // Empty catch block
        try {
            int result = 10 / 0;
        } catch (Exception e) {
            // Do nothing
        }
    }

    // Method without proper documentation
    public static int calculateArea(int width, int height) {
        return width * height;
    }
}
