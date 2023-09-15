import Model.AddressBook;
import Model.User;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new AddressBook();
        AddressBook addressBook = new AddressBook();
        User pepe = new User(90, "leo","0","sasd");


        addressBook.addUser(pepe);
        Scanner teclado=new Scanner(System.in);

        }

    }
}