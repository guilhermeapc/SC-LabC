import java.util.Scanner; //Command line scanner
import java.io.*;

public class Regist{
    public void run(){


System.out.println("Registration Page");
                System.out.println("O Username é único e não pode ser alterado no futuro");
                System.out.printf("Username: ");
		Scanner input = new Scanner(System.in);
                String user = input.next().toUpperCase;
                System.out.printf("Password: ");
                String pass = input.next();
                System.out.printf("Confirm Password: ");
                String conf = input.next();
                int length = pass.length();
                int passInt = Integer.parseInt(pass);
                int confInt = Integer.parseInt(conf);
                if(length < 6)
                    System.out.println("Too short password, password must be 6 characters or more");
                else
                {
                if(passInt == confInt)
                {
                Scanner z = null;
                try{
                z = new Scanner(new File("C:\\Users\\فاطمة\\Downloads\\accounts.txt"));
                boolean checkname = false;
                while(z.hasNext())
                {
                String a = z.next();
                int b = z.nextInt();
                if(a == null ? user == null : a.equals(user))
                checkname = true;
                }
                if(checkname)
                System.out.println("Username is already exists and used, please type another one");
                else
                {
                Formatter x = null;
                try{
                FileWriter f = new FileWriter("C:\\Users\\فاطمة\\Downloads\\accounts.txt", true);
                x = new Formatter(f);
                x.format("%s %s%n",user.toUpperCase(),pass);
                System.out.println("You registered succesfully");
                x.close();
                }
                catch(Exception e)
                {
                e.printStackTrace();
                }
                }
                }                    
                catch(Exception e){}
                }
                else
                    System.out.println("Password and confirm password are not matching");
                }
    }
}
