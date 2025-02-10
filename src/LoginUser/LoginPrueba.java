package LoginUser;

import java.util.Scanner;

public class LoginPrueba {

    private static final String USUARIO_GUARDADO = "usuario123";
    private static final String CONTRASENA_GUARDADA = "password1";

    private static void comprobarUsuario(String usuario, String contrasena) {
        if (!usuario.matches("[a-zA-Z0-9]+")) {
            throw new IllegalArgumentException("El usuario solo puede contener letras y números.");
        }
        if (!contrasena.matches(".*\\d.*") || contrasena.length() < 6 || contrasena.length() > 20) {
            throw new IllegalArgumentException(
                    "La contraseña debe tener al menos 6 caracteres y contener al menos un número.");
        }
        if (!usuario.equals(USUARIO_GUARDADO) || !contrasena.equals(CONTRASENA_GUARDADA)) {
            throw new IllegalArgumentException("Usuario o contraseña incorrectos.");
        }
    
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el usuario (solo letras y números): ");
        String usuario = scanner.nextLine();
        System.out.print("Introduce la contraseña (mínimo 6 carácteres, debe contener un número): ");
        String contrasena = scanner.nextLine();

        try {
            comprobarUsuario(usuario, contrasena);
            System.out.println("Inicio de sesión exitoso.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}