import Model.AddressBook;
import Model.User;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello world");

        //Create the first instance of user

        User user1 = new User(1, "Pedrito", "096589210", "Pepito´s description");

        //Create the instance of the addressBook
        AddressBook addressBook = new AddressBook();

        //Add the first user
        addressBook.addUser(user1);

        //Create the second instance of user
        User user2 = new User(2, "Marta", "09888878", "Marta´s description");


        //Add second user
        addressBook.addUser(user2);


        //Create thirt  instance of user
        User user3 = new User(3, "Keila", "097678544", "Keila´s description");


        //Add the thirt user
        addressBook.addUser(user3);

        //show user
        System.out.println("first show");
        showUsers(addressBook);


        //delete a user
        addressBook.deleteUser(user3);


        //show then delete user3
        System.out.println("second show");
        showUsers(addressBook);

        System.out.println("third show");
        //search user
        if (addressBook.findUserByIdNumber(2) != null) {
            System.out.println(addressBook.findUserByIdNumber(2));
        } else {
            System.out.println("The user searched don´t exist");
        }

        //unit test

        System.out.println("unit test add: " + unitTestAddOK());
        System.out.println("unit test found: " + unitTestFoundOK());

    }

    public static void showUsers(AddressBook addressBook) {
        //show the users
        List<User> usuarios = addressBook.getUsers();

        //use the loop to show each user
        for (User user : usuarios) {

            //show the users
            System.out.println(user.toString());
        }

    }


    /**
     * unit test to try add user that exist
     */

    public static boolean unitTestAddOK() {
        //Create the instance of the addressBook
        AddressBook addressBook = new AddressBook();

        //instance of user
        User userExample = new User(3, "Keila", "097678544", "Keila´s description");
        int countUser = 0;
        addressBook.addUser(userExample);
        List<User> usuarios = addressBook.getUsers();

        //use the loop to show each user
        for (User user : usuarios) {

            if (user.equals(userExample)) {
                countUser++;
            }
        }
        return countUser == 1;
    }

    /**
     * unit test to try search a user with a negative index
     */

    public static boolean unitTestFoundOK() {

        //Create the instance of the addressBook
        AddressBook addressBook = new AddressBook();

        User resultFinal = addressBook.findUserByIdNumber(-1);

        User resultExpected = null;

        return resultFinal == resultExpected;
    }


}