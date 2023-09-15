package Model;

import java.util.List;

public class AddressBook {
    private List<User> users;

    public AddressBook() {
        this.users = null;
    }

    public void addUser(User user) {
        for (int i=-1; i<users.size();i++){
            if(users.get(i)!=user){
                users.add(user);
                }else{
                System.out.println("ya existe este usuario");
            }
            }
    }

    public void deleteUser(User user) {
        int pos=0;
        for (int i=-1; i<users.size();i++){
            if(users.get(i)==user){
                pos=i;
            }
            users.remove(pos);
        }
    }

    public User findUserByIdNumber(int idNumber) {
       // for (int i=-1; i<users.size();i++){
         //   if(users.get(i)==){

           // }
           // }
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    public List<User> getUsers() {
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }
}
