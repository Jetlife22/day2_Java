package dayTwo.AddressBookProgramme;

import java.io.IOException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Created by student on 28-Jun-16.
 */
public class Programme {

    static AddressBook book = new AddressBook();

    public static void main(String[] args) {

        int choice;
        do {
            System.out.println("Welcome to Address Book! ");
            System.out.println("1. add a new Contact");
            System.out.println("2. edit a Contact");
            System.out.println("3. sort Contacts");
            System.out.println("4. Remove a Contact");
            System.out.println("5. Exit");
            System.out.println("Choose option!: ");

            //the user has the option to enter input
            Scanner scan = new Scanner(System.in);
            choice = scan.nextInt();
            System.out.println();

        } while (choice < 1 || choice > 5);

        switch (choice) {
            case 1:
                getDetails();

            case 2:
                findContact();

        }
    }


    static void getDetails() {
        String firstName, lastName, email, phoneNumber, address;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter First Name");
        firstName = s.nextLine();

        System.out.println("Enter Last Name");
        lastName = s.nextLine();

        System.out.println("Enter Address");
        address = s.nextLine();
        String[] data = address.split(",");

        System.out.println("Enter Email");
        email = s.nextLine();

        System.out.println("Enter Phone Number");
        phoneNumber = s.nextLine();

        book.addNewContact(firstName, lastName, new Address(data[0], data[1], data[2], data[3]), phoneNumber, email);
        for (Contact c : book.getContacts())
            if(c != null)
            System.out.println(c.getPerson().getFirstName() + ", your details have been saved. Thank you!");


    }

    static  void findContact(){
        String firstName;
        System.out.println("Input first name: ");
        Scanner s = new Scanner(System.in);

        firstName = s.nextLine();

        for(Contact c: book.getContacts()) {
            if (firstName == c.getPerson().getFirstName()) {
                c.getPerson().setFirstName("Alex");
                editContact();
            }
        }



    }
    static void editContact(){

    }

}


