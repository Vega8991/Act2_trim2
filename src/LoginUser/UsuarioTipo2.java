package LoginUser;

public class UsuarioTipo2 extends Usuario {
	public UsuarioTipo2(String usuario, String contraseña) {
		super(usuario, contraseña, 2);
	}
	
	public int metodoPropio(int[] a, int[] b) {
		return a[0] + b[0];
	}
}
