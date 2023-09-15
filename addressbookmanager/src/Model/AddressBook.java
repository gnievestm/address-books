package Model;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<User> users;

    public AddressBook() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {

        users.add(user);

    }

    public void deleteUser(User user) {

        users.remove(user);

    }

    public User findUserByIdNumber(int idNumber) {

        for (User users : users) {

            if (users.getIdNumber() == idNumber) {
                return users;
            }
        }
        //throw new java.lang.UnsupportedOperationException("Not supported yet.");
        return  null;
    }

    public List<User> getUsers() {
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }
}
