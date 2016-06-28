package dayTwo.Example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import  static dayTwo.Example.PersonCreation.*;

/**
 * Created by student on 28-Jun-16.
 */
public class programme {
    //easiest way to print them is to collect them first and then print them out after

    public static void main (String[] args){

        //this is no longer array, its an advanced array, you wouldnt need a whole loop to do any delete and add stuff anymore
        //collection is a root of all collection, makes it easier to convert different sets of data at once
        Collection <Person> people = new ArrayList<>();

        //list is also a bigger sister of array list
        List <Person> people2 = new ArrayList<>();

        people.add(alex);
        people.add(abdul);

        //this is how you itterate through the collection]
        //for every Person p in collection
        //print the following
        for (Person p: people)
        {
            System.out.println(p);
        }
    }


}
