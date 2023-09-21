import Model.AddressBook;
import Model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(TestUnit_1());
        System.out.println(TestUnit_2());
        System.out.println(TestUnit_3());
        System.out.println(TestUnit_4());

    }

    public static boolean TestUnit_1() {

        AddressBook addressBook = new AddressBook();
        User user1 = new User(1, "Socrates", "097026032", "Description for example test");
        addressBook.addUser(user1);
        boolean expectedResult = true;

        return (addressBook.findUserByIdNumber(user1.getIdNumber()) != null) == expectedResult;
    }

    public static boolean TestUnit_2() {
        AddressBook addressBook = new AddressBook();
        User user1 = new User(1, "Socrates", "097026032", "Description for example test");
        addressBook.addUser(user1);
        boolean expectedResult = true;

        return (addressBook.findUserByIdNumber(user1.getIdNumber()) == user1) == expectedResult;
    }

    public static boolean TestUnit_3() {
        AddressBook addressBook = new AddressBook();
        User user1 = new User(1, "Socrates", "097026032", "Description for example test");
        addressBook.addUser(user1);

        boolean expectedResult = true;

        addressBook.deleteUser(user1);
        return (addressBook.findUserByIdNumber(user1.getIdNumber()) == null) == expectedResult;
    }

    public static boolean TestUnit_4() {
        AddressBook addressBook = new AddressBook();
        User user1 = new User(1, "Socrates", "097026032", "Description for example test");
        User user2 = new User(2, "Pepito", "094032040", "Description for example test");

        addressBook.addUser(user1);
        addressBook.addUser(user2);

        boolean expectedResult = false;

        return (addressBook.getUsers() == null) == expectedResult;
    }
}