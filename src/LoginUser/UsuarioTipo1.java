package LoginUser;

public class UsuarioTipo1 extends Usuario {
	public UsuarioTipo1(String usuario, String contraseña) {
		super(usuario, contraseña, 1);
	}
	
	public int metodoPropio(int a, int b) {
		return a + b;
	}
}
