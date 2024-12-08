// TODO: File Header

//
// NOTE: YOU SHOULD NOT HAVE TO IMPORT ANY OTHER PACKAGES TO COMPLETE THIS
// ASSIGNMENT.
//
// If you add extraneous packages (intentionally or not), then your
// code might fail Gradescope compilation.
//

// TODO: Class Header
public class DiscussionBoard {

    // Instance variables for DiscussionBoard
    private String courseName;
    private DynamicArray posts;

    // TODO: Method Header
    public DiscussionBoard(String courseName, int boardCapacity) {
    
    }

    // TODO: Method Header
    public void submitPost(Post post) {

    }

    // TODO: Method Header
    public Post deletePost(int index) {
        return null;
    }

    // TODO: Method Header
    public Post resolvePost(int index) {
        return null;
    }

    // TODO: Method Header
    public int countUnresolvedPosts() {
        return -1;
    }

    // TODO: Method Header
    public boolean exceedsPostThreshold(String author, int postThreshold) {
        return false;
    }

    // TODO: Method Header
    public DynamicArray getQueryMatchingPosts(String query) {
        return null;
    }

    // TODO: Method Header
    @SuppressWarnings("checkstyle:MagicNumber") // DO NOT CHANGE THIS LINE!!!
    public static boolean unitTests() { 
        // example test case: tests correctness of constructor. Note, this
        // test assumes your implementation of size() and getCapcity() for
        // DynamicArray is correct.
        DiscussionBoard board = new DiscussionBoard("cse 11", 5);
        if (!board.courseName.equals("cse 11") || 
                board.posts.size() != 0 || board.posts.getCapacity() != 5) {
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
