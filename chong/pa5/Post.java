// TODO: File Header

//
// NOTE: YOU SHOULD NOT HAVE TO IMPORT ANY OTHER PACKAGES TO COMPLETE THIS
// ASSIGNMENT.
//
// If you add extraneous packages (intentionally or not), then your
// code might fail Gradescope compilation.
//

// TODO: Class Header
public class Post {

    //region Private Properties
    // Instance variables for Post
    private String author;
    private String summary;
    private String details;
    private boolean resolved;

    // Formatted string for toString()
    private final static String FORMATTED_STRING = "Author:\t%s\n" +
        "Summary:\t%s\n" + "Details:\t%s\n" + "Resolved?:\t%b\n";
    //endregion

    //region Constructors
    public Post() {
        this.author = null;
        this.summary = null;
        this.details = null;
        this.resolved = false;

    }

    public Post(String author, String summary, String details,
                boolean resolved) {
        this.author = author;
        this.summary = summary;
        this.details = details;
        this.resolved = resolved;

    }
    //endregion

    // TODO: Method Header
    public String getAuthor() {
        return null;
    }

    // TODO: Method Header
    public String getSummary() {
        return null;
    }

    // TODO: Method Header
    public String getDetails() {
        return null;
    }

    // TODO: Method Header
    public boolean isResolved() {
        return false;
    }

    // TODO: Method Header
    public void setAuthor(String author) {

    }

    // TODO: Method Header
    public void setSummary(String summary) {

    }

    // TODO: Method Header
    public void setDetails(String details) {

    }

    // TODO: Method Header
    public void setResolved(boolean resolved) {

    }

    // TODO: Method Header
    public String toString() {
        return null;
    }
    
    // TODO: Method Header
    @SuppressWarnings("checkstyle:MagicNumber") // DO NOT CHANGE THIS LINE!!!
    public static boolean unitTests() { 
        // example test case: tests correctness of default constructor. 
        Post post = new Post();
        Post postnew = new Post("Roi" , " my first summary" , "details" , true);
        System.out.println(postnew.author + postnew.summary);
        if (post.author != null || post.summary != null ||
                post.details != null || post.resolved != false) {
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
