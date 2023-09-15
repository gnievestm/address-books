import Model.AddressBook;
import Model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");


        System.out.println(TestUnit_1());

    }

    public static boolean TestUnit_1() {
        try {
            AddressBook addressBook = new AddressBook();
            User user1 = new User(1, "Socrates", "097026032", "Description for example test");
            addressBook.addUser(user1);
            boolean expectedResult = true;

            return (addressBook.findUserByIdNumber(user1.getIdNumber()) == user1) == expectedResult;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}