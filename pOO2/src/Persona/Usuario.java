package Persona;

public class Usuario {
	
	//Atributos 
	private	String tipoUsuario;
	private	String username;
	private	String password;
	
	
	//Crear un nuevo usuario (constructor)
	public Usuario(String tipoUsuario, String username, String password) {
		this.tipoUsuario = tipoUsuario;
		this.username = username;
		this.password = password;
	}//constructor
	
	
	//Recuperar contraseña? (getter)
	public String getPassword( ) {
		//Si el usuario registrado conicide con el usuario que paso como parametro, entonces obtengo la contraseña
			return password;
	}
		
	//Cambiar contraseña? (setter)
	public voif setPassword(String nuevaContraseña) {
		//si la nueva contraseña es diferente a una cadena vacia y es diferente a la contraseña anterior
		if (nuevoPassword 1= "" && nuevoPassword != password) {
			//.. entonces reemplazo la contraseña anterior
			password = nuevoPassword
	
	}

}//class Usuario
