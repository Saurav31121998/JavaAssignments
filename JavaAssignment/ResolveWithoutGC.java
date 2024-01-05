package JavaAssignment;

public class ResolveWithoutGC {
    public static void main(String[] args) {
        try {
            // Using StringBuilder for more efficient memory handling
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < 1000000; i++) {
                // Append more data in each iteration
                stringBuilder.append("This is a sample record number " + i + ". This part is appended more for testing purposes. ");

                // Manually releasing memory every 1000 iterations
                if (i % 1000 == 0) {
                    stringBuilder = new StringBuilder();
                }
            }
            System.out.println("Records appended successfully.");
        } catch (OutOfMemoryError e) {
            System.out.println("Out of memory error occurred!");
        }
    }
}
