import java.util.*;
public class MultipleAddressBook{
    static HashMap<String, List<Contact>> multi=new HashMap<>();
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        boolean exit =true;
        while(exit) {
            System.out.println("Add Address Book to Shelf\nEnter the name for Address Book:");
                        String name=sc.next();
                        if(multi.containsKey(name)) {
                            System.out.println("Key already exists.");
                        }
                        else {
                            AddressBookMain abms= new AddressBookMain();
                            abms.addContact();
                            multi.put(name, abms.addressBook);
                            System.out.println("Address book added to shelf");
                            exit=false;
                        }
                    }

        }
}