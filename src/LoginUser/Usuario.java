package LoginUser;

/**
 * Clase abstracta que representa a un usuario genérico con métodos para comprobar credenciales.
 */
public abstract class Usuario {
    private String nombreUsuario;
    private String contraseña;
    private int tipo;

    /**
     * Constructor para inicializar un objeto Usuario.
     *
     * @param nombreUsuario El nombre del usuario.
     * @param contraseña La contraseña del usuario.
     * @param tipo El tipo de usuario.
     */
    public Usuario(String nombreUsuario, String contraseña, int tipo) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.tipo = tipo;
    }

    /**
     * Comprueba si las credenciales proporcionadas son válidas.
     * @param usuario El nombre de usuario a comprobar.
     * @param contrasena La contraseña a comprobar.
     * @throws IllegalArgumentException Si las credenciales no son válidas.
     */
    public boolean comprobarUsuario(String usuario, String contrasena) {
        if (!usuario.matches("[a-zA-Z0-9]+")) {
            throw new IllegalArgumentException("El usuario solo puede contener letras y números.");
        } else if (!contrasena.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z\\d]{6,20}$")) {
            throw new IllegalArgumentException(
                    "La contraseña debe tener entre 6 y 20 caracteres, incluir al menos una mayúscula, una minúscula y un número.");
        } else if(!usuario.equals(this.nombreUsuario) || !contrasena.equals(this.contraseña)) {
            throw new IllegalArgumentException("Usuario o contraseña incorrectos.");
        } else 
        return true;
    }
}
