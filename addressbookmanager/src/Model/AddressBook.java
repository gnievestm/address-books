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
            throw new java.lang.UnsupportedOperationException("Usuario ya existente");
        } else {
            this.users.add(user);
        }

    }

    public void deleteUser(User user) {
        if (users.isEmpty()) {
            throw new java.lang.UnsupportedOperationException("La lista esta vacia");
        } else if (findUserByIdNumber(user.getIdNumber()) == user) {
            this.users.remove(user);
        } else {
            throw new java.lang.UnsupportedOperationException("El usuario no esta en la lista");
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
