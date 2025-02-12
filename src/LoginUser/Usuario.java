
/**
 * The Usuario class represents an abstract user with a username, password, and type.
 * It provides a method to validate the username and password.
 */
public abstract class Usuario {
	private String nombreUsuario;
	private String contraseña;
	private int tipo;
	
	public Usuario(String nombreUsuario, String contraseña, int tipo) {
		this.nombreUsuario = nombreUsuario;
		this.contraseña = contraseña;
		this.tipo = tipo;
	}
	
	public void comprobarUsuario(String usuario, String contrasena) {
        if (!usuario.matches("[a-zA-Z0-9]+")) {
            throw new IllegalArgumentException("El usuario solo puede contener letras y números.");
        }
        if (!contrasena.matches(".*\\d.*") || contrasena.length() < 6 || contrasena.length() > 20) {
            throw new IllegalArgumentException(
                    "La contraseña debe tener al menos 6 caracteres y contener al menos un número.");
        }
        if (!usuario.equals(this.nombreUsuario) || !contrasena.equals(this.contraseña)) {
            throw new IllegalArgumentException("Usuario o contraseña incorrectos.");
        }
    }
}
