package Persona;

public class TestUsuario {
	
	public static void main(String[] args) {
		
		//Instancia de usuario
		
		Usuario Felipe = new Usuario ("Doctor", "DoctorFelipe", "paracetamol");
		
		//Cambiar la contraseña
		Felipe.setPassword("paracetamol1"); //error
		
	}
}
