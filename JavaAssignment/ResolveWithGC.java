package JavaAssignment;

public class ResolveWithGC {
    public static void main(String[] args) {
        try {
            // Using StringBuffer to continuously append millions of records
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < 1000000; i++) {
                stringBuffer.append("This is a sample record number " + i + ". ");
                if (i % 1000 == 0) {
                    System.gc(); // Trigger garbage collection every 1000 iterations
                }
            }
            System.out.println("Records appended successfully.");

            // Simulating out-of-memory error by continuing to append
            while (true) {
                stringBuffer.append("This is an additional sample record. ");
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Out of memory error occurred!");
        }
    }
}
