// Demonstrates all types of exception handling in Java

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ExceptionHandlingDemo {

    // Method that declares it might throw a checked exception
    static void methodWithThrows() throws CustomException {
        throw new CustomException("Custom checked exception thrown from methodWithThrows()");
    }

    // Method that demonstrates use of throw keyword
    static void methodWithThrow() {
        throw new ArithmeticException("Explicitly thrown ArithmeticException in methodWithThrow()");
    }

    public static void main(String[] args) {
        // try-catch block with multiple catch clauses
        try {
            int[] arr = {1, 2};
            System.out.println(arr[5]); // This will throw ArrayIndexOutOfBoundsException

            int result = 10 / 0; // This will throw ArithmeticException

            methodWithThrow(); // This will throw ArithmeticException

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            // Catches any other exception
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            // finally block always executes
            System.out.println("This is the finally block (always executes).");
        }

        // Handling checked exception using throws
        try {
            methodWithThrows();
        } catch (CustomException e) {
            System.out.println("Caught CustomException: " + e.getMessage());
        }
    }
}
