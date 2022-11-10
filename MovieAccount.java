import java.util.Scanner;

public class MovieAccount {

    Scanner m = new Scanner(System.in);
    public MovieAccount()
    {
        try
        {

            System.out.println("Main menu");
            System.out.println("--------------------------");
            System.out.println("1. Search");
            System.out.println("2. Search for movies in a category");
            System.out.println("3. List of watched movies");
            System.out.println("4. List of saved movies");
            System.out.println("--------------------------");
            System.out.print("Enter choice");
            String choice = m.nextLine();
            if(choice.equals("1"))
            {
                search();
            }
        }
        catch (Exception ex)
        {

        }

    }

    void search()
    {
        try
        {

        }
        catch(Exception ex)
        {

        }

    public static void main(String[] args)
    {
        new MovieAccount();


        }
    }



}


