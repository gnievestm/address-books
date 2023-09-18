package Model;
import java.util.ArrayList;
import java.util.List;
import Model.UnitTest;

public class AddressBook {
    private List<User> users;

    public AddressBook() {
        this.users = new ArrayList<User>();
    }

    public void addUser(User user) {
        users.add(user);
    }
    public void deleteUser(User user) {
        users.remove(user);
        //System.out.println(user);
    }
    public User findUserByIdNumber(int idNumber) {
        String u = String.valueOf(users.get(idNumber));
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }
    public List<User> getUsers() {
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }
}
