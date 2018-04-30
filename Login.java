import java.util.Scanner; //Command line scanner

public class Login {
public void run() {
    Scanner scan = new Scanner (new File("/net/areas/homes/up201709560/Desktop/SC LabC/Users.txt");
    Scanner keyboard = new Scanner (System.in);
    String user = scan.nextLine(); // Scan do ficheiro
    String pass = scan.nextLine();
    String inpUser = keyboard.nextLine(); // Input no terminal
    String inpPass = keyboard.nextLine(); 
    if (inpUser.equals(user) && inpPass.equals(pass)) {

        System.out.print("Sucesso");
    } else {
        System.out.print("Erro no Login");
    }
}
}
