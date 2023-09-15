import Model.AddressBook;
import Model.User;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");

        User user = new User(1, "pepe", "123455", "es pepe");
        User user2 = new User(2, "Juan", "123455", "es juan");
        User user3 = new User(3, "Ernesto", "123455", "es ernesto");

        AddressBook addressBook = new AddressBook();
        addressBook.addUser(user);
        addressBook.addUser(user2);
        addressBook.addUser(user3);

        addressBook.deleteUser(user2);



    }


}
