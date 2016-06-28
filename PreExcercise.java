package dayTwo;

import java.util.Scanner;

/**
 * Created by student on 28-Jun-16.
 */
public class PreExcercise {

    public static void main (String[] args) {
        Scanner userInput = new Scanner(System.in);
        final int  theNumber = Integer.parseInt(userInput.nextLine());

    DrawPyramid(theNumber);

    }

    static void  DrawPyramid (int height)
    {
        //the number Blanks starts at 0
        int blanks = 0;
        //this first for loop -  base count starts at 1, and as long as the count is smaller than height
        //do the following for loops
        for (int count = 1; count <= height; count++)
        {
            //the number of blanks is dependant on the height minus the count
            blanks = height - count;


            for (int b = 0; b <  blanks; b++)
            {
                System.out.print(" ");
            }
            for (int c = 0; c < count; c++)
            {
                System.out.print(count + " ");
            }
            if (count < height){
                System.out.println();
            }
        }



    }
}


