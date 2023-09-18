package Model;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<User> users;

    public AddressBook() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {

        if (users.isEmpty()) {
            this.users.add(user);
        } else if (findUserByIdNumber(user.getIdNumber()) == user) {
            return;
        } else {
            this.users.add(user);
        }

    }

    public void deleteUser(User user) {
        if (users.isEmpty()) {
            return;
        } else if (findUserByIdNumber(user.getIdNumber()) == user) {
            this.users.remove(user);
        } else {
            return;
        }
    }

    public User findUserByIdNumber(int idNumber) {
        for (User user : users) {
            if (user.getIdNumber() == idNumber) {
                return user;
            }
        }
        return null;
    }

    public List<User> getUsers() {
        if (users.isEmpty()) {
            return null;
        }
        return users;
    }
}
