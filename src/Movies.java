import java.util.*;

public class Movies {
    public static void main(String [] args){
        /*
        Question #6
        Declaring a Scanner object
        Declaring a String type ArrayList
        Declare Random Object
        Create String variable
        Create boolean variable

        While(true)
            Prompt the user to enter his/her favorite movie
            IF user Input Q/q
                bol=false
            End IF
            Else
                //Add Movies to an ArrayList
                movies.add(str)
            End Else
         End While Loop

         Output an ArrayList
         Collection.sort(movies) //Sort An ArrayList
         Output the Sorted ArrayList
         Select randomly an ArrayLst value
         Output the generated or selected values of an array
         */

        Scanner input = new Scanner(System.in);
        ArrayList<String> movies = new ArrayList<String>();
        Random rand = new Random();

        String str;
        boolean bol= true;

        while (bol){
            System.out.println("Enter your Favorite Movies Until You Want! If you don't press Q/q ");
            str=input.nextLine();
            if(str.equalsIgnoreCase("q")){
                bol=false;
            }
            else{
                movies.add(str);
            }
        }
        System.out.println("\nYour Favorite Movies:\n"+movies);
        Collections.sort(movies);
        System.out.println("\nMovies in Order:\n " + movies);
        int arrayListSize = rand.nextInt(movies.size());
        System.out.println("\nSuggested Movie For You to Watch is:\n " + movies.get(arrayListSize));
    }
}
