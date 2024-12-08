// TODO: File Header

//
// NOTE: YOU SHOULD NOT HAVE TO IMPORT ANY OTHER PACKAGES TO COMPLETE THIS
// ASSIGNMENT.
//
// If you add extraneous packages (intentionally or not), then your
// code might fail Gradescope compilation.
//

// TODO: Class Header
public class DynamicArray {

    // constant variables for DynamicArray
    private static final int DEFAULT_CAPACITY = 5;
    
    // Instance variables for DynamicArray
    private Post[] data;
    private int size;

    // TODO: Method Header
    public DynamicArray(int initialCapacity) {

    }

    // TODO: Method Header
    public void append(Post post) {

    }

    // TODO: Method Header
    public Post remove(int index) {
        return null;
    }

    // TODO: Method Header
    public Post get(int index) {
        return null;
    }

    // TODO: Method Header
    public int size() {
        return -1;
    }

    // TODO: Method Header
    public int getCapacity() {
        return -1;
    }

    // TODO: Method Header
    @SuppressWarnings("checkstyle:MagicNumber") // DO NOT CHANGE THIS LINE!!!
    public static boolean unitTests() { 
        // example test case: tests correctness of constructor
        DynamicArray array = new DynamicArray(5);
        if (array.data.length != 5 || array.size != 0) {
            return false;
        }

        return true;
    }

    // TODO: Method Header
    public static void main(String[] args) {
        if (unitTests()) {
            System.out.println("All unit tests passed.\n");
        } else {
            System.out.println("ERROR: Failed test.\n");
            return;
        }
    }
}
