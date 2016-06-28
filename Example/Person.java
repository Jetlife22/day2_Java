package dayTwo.Example;

/**
 * Created by student on 28-Jun-16.
 */
public class Person {
    //fields - (Private) data regarding the class (eg first name last name)
    //properties -(public) a way to get and set the information from the field (get and set)
    //constructors
    //methods
    //event

    //fields
    private  String firstName;
    private String lastName;
    private int age;
    private boolean female;

    //properties
    //void - we do not need to return anything

    public void setFirstName(String fn) {this.firstName = fn; }
    public String getFirstName() { return  this.firstName;}

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //constructor - a way to define some field of a class
    //always runs
    //this is a default constructor, this is always there unless you write it out
    //then you can change it
    public Person()
    {

    }

    //constructor with a diff signature
    //constructor overloading - creating the same constructor name but with different signature () things in the brackets
    //NEVER has a RETURN TYPE
    public Person (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Methods - defines the behaviours of the class (ie eat, drive, move)
    public String talk() {return null;}
    public void walk() {}

    @Override
    public String toString()
    {
        return "Name:  " + firstName + " " + lastName;
    }



}
