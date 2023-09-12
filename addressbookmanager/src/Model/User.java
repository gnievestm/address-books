package Model;

public class User {

    private int idNumber;
    private String name;
    private String phoneNumber;
    private String description;

    public User(int idNumber, String name, String phoneNumber, String description) {
        this.idNumber = idNumber;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.description = description;
    }

    // Getters and setters
    public int getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "User{" +
                "  Id Number=" + idNumber +
                ", name='" + name + '\'' +
                ", phone Number='" + phoneNumber + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        User otherUser = (User) obj;
        return this.idNumber == otherUser.idNumber;
    }
}
