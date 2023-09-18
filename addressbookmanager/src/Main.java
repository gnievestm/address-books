import Model.AddressBook;
import Model.UnitTest;
import Model.User;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");

        User user = new User(1, "pepe", "099325678", "es pepe");
        User user2 = new User(2, "Juan", "123455", "es juan");
        User user3 = new User(3, "Ernesto", "123455", "es ernesto");

        UnitTest test = new UnitTest();

        System.out.println("Test 1 [Valid description]: " + test.ValidDescription(user));
        System.out.println("Test 2 [Valid phone number]: " + test.ValidPhoneNumber(user));
        System.out.println("Test 3 [Valid Name]: " + test.ValidName(user));
        System.out.println("Test 4 [Delete user]: " + test.DeleteUser(user));




    }


}
