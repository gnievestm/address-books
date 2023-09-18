package Model;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<User> users;

    public AddressBook() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {

        User found = findUserByIdNumber(user.getIdNumber());
        if(found==null){
            users.add(user);
        }
    }

    public void deleteUser(User user) {

        int index = users.indexOf(user);

        if (index != -1) {
            users.remove(users);
        } else {
            System.out.println("El usuario no existe");
        }


    }

    public User findUserByIdNumber(int idNumber) {

        for (User users : users) {

            if (users.getIdNumber() == idNumber) {
                return users;
            }
        }

        return  null;
    }

    public List<User> getUsers() {
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }
}
