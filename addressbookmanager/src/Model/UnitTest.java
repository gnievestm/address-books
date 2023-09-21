package Model;
import java.util.ArrayList;
import java.util.List;
import Model.AddressBook;

public class UnitTest {


    public static Boolean ValidDescription(User user){

        String description = user.getDescription();
        return !description.isEmpty();
    }

    public static Boolean ValidPhoneNumber(User user){

        String phone = user.getPhoneNumber();
        return phone.length() == 9;
    }

    public static Boolean ValidName(User user){

        String description = user.getName();
        return !description.isEmpty();
    }
    

}
