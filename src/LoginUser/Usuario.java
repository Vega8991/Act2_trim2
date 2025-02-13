package LoginUser;

/**
 * Clase abstracta que representa a un usuario generico con metodos para comprobar credenciales.
 */
public abstract class Usuario {
    private String nombreUsuario;
    private String contrasena;
    private int tipo;

    /**
     * Constructor para inicializar un objeto Usuario.
     *
     * @param nombreUsuario El nombre del usuario.
     * @param contrasena La contrasena del usuario.
     * @param tipo El tipo de usuario (1 o 2).
     */
    public Usuario(String nombreUsuario, String contrasena, int tipo) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.tipo = tipo;
    }

    /**
     * Comprueba si las credenciales proporcionadas son v�lidas.
     *
     * @param usuario El nombre de usuario a comprobar.
     * @param contrasena La contrasena a comprobar.
     * @return true si las credenciales son v�lidas, false en caso contrario.
     * @throws IllegalArgumentException Si las credenciales no son v�lidas.
     */
    public boolean comprobarUsuario(String usuario, String contrasena) {
        if (!usuario.matches("[a-zA-Z0-9]+")) {
            throw new IllegalArgumentException("El usuario solo puede contener letras y n�meros.");
        } else if (!contrasena.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z\\d]{6,20}$")) {
            throw new IllegalArgumentException(
                    "La contrasena debe tener entre 6 y 20 caracteres, incluir al menos una may�scula, una min�scula y un n�mero.");
        } else if(!usuario.equals(this.nombreUsuario) || !contrasena.equals(this.contrasena)) {
            throw new IllegalArgumentException("Usuario o contrasena incorrectos.");
        } else 
        return true;
    }
}
