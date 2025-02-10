package LoginUser;
import java.util.Scanner;

public class Login {   

    public static void main(String[] args) {
    	
    	Usuario usuario1 = new UsuarioTipo1("Usuario1", "Contrasena1");
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el usuario (solo letras y números): ");
        String usuario = scanner.nextLine();
        System.out.print("Introduce la contraseña (mínimo 6 carácteres, debe contener un número): ");
        String contrasena = scanner.nextLine();
        
        try {
            usuario1.comprobarUsuario(usuario, contrasena);
            System.out.println("Inicio de sesión exitoso.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}