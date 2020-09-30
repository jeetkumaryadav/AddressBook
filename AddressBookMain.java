import java.util.*;
public class AddressBookMain{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Address Book Program");
        Contact con=new Contact();
        List<Contact> addressBook = new ArrayList<Contact>();
        char ex='Y';
        while(ex=='Y'){
            System.out.println("Enter Contact Details\nEnter First Name:");
                con.setFirstName(sc.next());
            System.out.println("Enter Last Name:");
                con.setLastName(sc.next());
            System.out.println("Enter Address:");
                con.setAddress(sc.next());
            System.out.println("Enter Zip Code:");
                con.setZip(sc.next());
            System.out.println("Enter Phone Number:");
                con.setPhoneNo(sc.next());
            System.out.println("Enter Email Address:");
                con.setEmail(sc.next());
            System.out.println("Add new Contact: (Y/N ):");
            ex=sc.next().charAt(0);
            addressBook.add(con);

        }

    }
}