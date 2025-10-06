package retake;

public class User {
    private String ID;
    private String Name;
    private String lastName;
    private String email;

    public User(String email, String name, String lastName, String ID) {
        this.ID = ID;
        this.Name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public User(String id) {
    }

    public String getEmail() {
        return email;
    }

    public String getID() {
        return ID;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return Name;
    }
}
