package Model;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<User> users;

    public AddressBook() {
        users = new ArrayList<User>();

    }

    public void addUser(User user) {
        //Validate if user exist in the collection
        User found=this.findUserByIdNumber(user.getIdNumber());
        if(found == null){
            users.add(user);
        }

    }

    public void deleteUser(User user) {
        users.remove(user);
    }

    public User findUserByIdNumber(int idNumber) {

        for (User user : users) {
            if (user.getIdNumber() == idNumber) {
                return user;
            }else{
                return null;
            }
        }


        return null;
        //throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    public List<User> getUsers() {

        for (User user : users) {
            user.toString();
            /*
            System.out.println("id:" + user.getIdNumber());
            System.out.println("nombre:" + user.getName());
            System.out.println("teléfono:" + user.getPhoneNumber());
            System.out.println("descripción:" + user.getDescription());
*/
        }
        return users;
        // throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }
}
