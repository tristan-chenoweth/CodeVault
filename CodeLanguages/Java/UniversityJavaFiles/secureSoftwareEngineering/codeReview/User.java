import java.util.*;
import java.lang.*;

public class User{
    private int id; //
    private String firstName;
    private String lastName;
    private int age;
    private String profession; // not declared on separate lines
    private ArrayList<User> children;

    public User(int id, String firstName, String lastName, int age, String profession) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.profession = profession; // profession is not passed into User args
    }

    public String getChildName(User child) throws Exception { // throws exception added
        if (!this.children.contains(child)) {
            throw new Exception("Invalid argument!"); // throw keyword added and spelling changed
        }

        else {                                        // edit to match formatting
            String name = null;
            if (child.getFirstName() != null) {
                name = child.getFirstName();
            }

            if (name.equals("Harry")){
                name.replace('r',  'p');
            }

            // remove name.length check
            name.concat(child.getLastName());
        }
        return this.getChildName(child);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    } // keep method formatting the same fo all methods
}