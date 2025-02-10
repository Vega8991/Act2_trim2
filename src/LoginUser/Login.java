package LoginUser;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Login {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Login login = new Login();
        System.out.print("Introduce la contraseña: ");
        String clave = login.sc.nextLine();
        
        if (login.validarclave(clave)) {
            System.out.println("Contraseña válida.");
        } else {
            System.out.println("Contraseña inválida.");
        }
    }

    public boolean validarclave(String clave) {
        if (clave.length() > 20) {
            return false;
        }

        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[-._@#]).{1,20}$");        
        Matcher matcher = pattern.matcher(clave);

        return matcher.find();
    }
}
