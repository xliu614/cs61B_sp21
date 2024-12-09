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
        return this.author;
    }

    // TODO: Method Header
    public String getSummary() {return this.summary;}

    // TODO: Method Header
    public String getDetails() {
        return this.details;
    }

    // TODO: Method Header
    public boolean isResolved() {
        return this.resolved;
    }

    // TODO: Method Header
    public void setAuthor(String author) {
        this.author = author;
    }

    // TODO: Method Header
    public void setSummary(String summary) {
        this.summary = summary;
    }

    // TODO: Method Header
    public void setDetails(String details) {
        this.details = details;
    }

    // TODO: Method Header
    public void setResolved(boolean resolved) {
        this.resolved = resolved;
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
//        postnew.setAuthor("Vivianne");
//        System.out.println(postnew.getSummary());
//        System.out.println(postnew.author + postnew.summary);
        if (post.author != null || post.summary != null ||
                post.details != null || post.resolved != false) {
            return false;
        }
        if (postnew.getAuthor() == null || postnew.getSummary() == null || postnew.getDetails() == null || !postnew.isResolved() ||
                postnew.getAuthor().isEmpty() || postnew.getSummary().isEmpty() || postnew.getDetails().isEmpty()) {
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
