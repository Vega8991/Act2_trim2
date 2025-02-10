package LoginUser;

import java.util.Scanner;

public class LoginUser {

    private static final String STORED_USERNAME = "usuario123";
    private static final String STORED_PASSWORD = "password1";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el usuario: ");
        String username = scanner.nextLine();

        System.out.print("Introduce la contraseña: ");
        String password = scanner.nextLine();

        try {
            validateCredentials(username, password);
            System.out.println("Inicio de sesión exitoso.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

    private static void validateCredentials(String username, String password) {
        if (!username.matches("[a-zA-Z0-9]+")) {
            throw new IllegalArgumentException("El usuario solo puede contener letras y números.");
        }

        if (password.length() < 6 || !password.matches(".*\\d.*")) {
            throw new IllegalArgumentException("La contraseña debe tener al menos 6 caracteres y contener al menos un número.");
        }

        if (!username.equals(STORED_USERNAME) || !password.equals(STORED_PASSWORD)) {
            throw new IllegalArgumentException("Usuario o contraseña incorrectos.");
        }
    }
}