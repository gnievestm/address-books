import Model.AddressBook;
import Model.User;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //new AddressBook();
        AddressBook addressBook = new AddressBook();
        User user1 = new User(90, "leo","10","sasd");
        User user2 = new User(91, "leonel","02","sasdd");
        User user3 = new User(92, "leonard","23","sasddwe");
        User user4 = new User(92, "leonard","23","sasddwe");




        addressBook.addUser(user1);
        addressBook.addUser(user2);
        addressBook.addUser(user3);
        addressBook.addUser(user4);

        addressBook.deleteUser(user4);

        System.out.println(addressBook.findUserByIdNumber(92));
        }

    }
