import java.util.Set;

/** TwitterUser is an immutable datatype representing a Twitter user account. */
public class TwitterUser {
    private final String username;
    // Rep invariant:
    //    username.length > 0
    //    username consists only of letters (A-Z or a-z), digits, and underscores ("_")
    // Abstraction function: 
    //    represents a case-insensitive username of a Twitter user (so "rbmllr" and "RbMllr"
    //      are equivalent)
    // Safety from rep exposure:
    //   All fields are private and immutable.
    
    public TwitterUser(String username) {
        this.username = username;
    }
    
    public String toString() {
        return username;
    }
    
    // TODO: this class needs equals() and hashCode()
}
