package spring.simulatingoperationdohs.modelClass;

import java.io.Serializable;

public class User implements Serializable {
    protected int id;
    private String password;
    protected String name, email, status;
    private int contactNumber;

    // Default constructor
    public User() {
    }

    // Constructor with user ID and password (basic)
    public User(int id, String password) {
        this.id = id;
        this.password = password;
    }

    // Constructor with full details
    public User(int id, String password, String name, String email, String status) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.email = email;
        this.status = status;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", status='" + status + '\'' +
                ", contactNumber=" + contactNumber +
                '}';
    }


    public static User verifyLogin(int userID, String password) {
        // Replace with actual authentication logic
        if (userID == 1234 && password.equals("password")) {
            // Sample data returned for the verified user
            User user = new User(userID, password, "Test User", "test@example.com", "Active");
            user.setContactNumber(1234567890); // Sample contact number
            return user;
        } else {
            return null;  // Return null if verification fails
        }
    }

    public String getUsername() {
        return name;
    }
}
