package Model;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<User> users;

    public AddressBook() {
        users = new ArrayList();

    }

    public void addUser(User user) {

        User found=findUserByIdNumber(user.getIdNumber());
        if(found==null){
            users.add(user);
        }
    }

    public void deleteUser(User user) {
        int pos = 0;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i) == user) {
                pos = i;
            }
            users.remove(pos);
        }
    }

    public User findUserByIdNumber(int idNumber) {
        for (int i = 0; i < users.size(); i++) {
            if (idNumber == users.get(i).getIdNumber()) {
                return users.get(i);
            }
        }
        return null;
    }
}


//   public List<User> getUsers () {
//  throw new java.lang.UnsupportedOperationException("Not supported yet.");
//  }
//}
