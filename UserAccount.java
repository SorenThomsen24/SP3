
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public class UserAccount {
    Scanner s = new Scanner(System.in);
    String filename = "C:/Users/csten/OneDrive/Datamatikker/account.txt";
    public UserAccount()
    {
       try{

           System.out.println("Startmenu");
           System.out.println("------------------");
           System.out.println("1. Create user account");
           System.out.println("2. Login user account");
           System.out.println("------------------");
           System.out.println("Enter choice : ");
           String choice = s.nextLine();
           if(choice.equals("1"))
           {
               createaccount();
           }
           else if (choice.equals("2"))
           {
               login();
           }
           else {
               System.out.println("Invalid choice!");
               System.out.println("Please press a key to continue");
               String proc = s.nextLine();
               new UserAccount();
           }

       }catch(Exception ex)
       {
           System.out.println(ex.getMessage());
       }
    }

    void login()
    {
    try
    {
        Path path = Paths.get(filename.toString());
        InputStream input = Files.newInputStream(path);
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        System.out.println("\nL O G I N \n ");
        System.out.print("Enter username : ");
        String username = s.nextLine();
        System.out.print("Enter password : ");
        String password = s.nextLine();
        String _temp = null;
        String _user;
        String _pass;
        boolean found = false;
        while((_temp=reader.readLine()) !=null)
        {
            String[] account  = _temp.split(" ");
            _user = account[0];
            _pass = account[1];
            if(_user.equals(username)&& _pass.equals(password))
            {
                found = true;

            }

        }

        if(found==true)
        {
            System.out.println("Acesss granted!");
        }
        else {
            System.out.println("Acess denied username or password incorrect! ");
        }
        reader.close();
        System.out.println("Please press a key to continue");
        String proc = s.nextLine();
        new UserAccount();
    }
    catch (Exception ex)
    {
        System.out.println(ex.getMessage());
    }
    }
    void createaccount()
    {
        try{
            Path path = Paths.get(filename.toString());
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(path, APPEND));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
            System.out.println("\nC R E A T E  A C C O U N T \n ");
            System.out.print("Enter username : ");
            String username = s.nextLine();
            System.out.print("Enter password : ");
            String password = s.nextLine();

            writer.write( username +" "+ password);
            writer.newLine();
            System.out.println("Account has been succesfully saved!");
            writer.close();
            output.close();

            System.out.println("Please press a key to continue");
            String proc = s.nextLine();
            new UserAccount();
        }catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new UserAccount();
    }

}
