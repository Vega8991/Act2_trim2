package LoginUser;

public abstract class Usuario {
	private String nombreUsuario;
	private String contraseña;
	private int tipo;
	
	public Usuario(String nombreUsuario, String contraseña, int tipo) {
		this.nombreUsuario = nombreUsuario;
		this.contraseña = contraseña;
		this.tipo = tipo;
	}
}
