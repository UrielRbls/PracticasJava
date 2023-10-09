package Persona;

public class AsistenteDental {
	
	//1 Atributos privados
	private String fechaIngreso;
	private double salario;
	
	
	//2 Contructor publico (dejo el contructor publico para poder acceder a el de forma sencilla)
	public AsistenteDental(String fechaIngreso, double salario) {
		this.fechaIngreso = fechaIngreso;
		this.salario = salario;
	}//constructor

	
	
	
	
	
	
	//3 Metodos 
	//Metodo para imprimir informacion
		public void mostrarDatosAsistente() {
			System.out.println("La fecha de ingreso del asistente es: " + fechaIngreso);
			System.out.println("El salario del asistente es: " + salario);
		}//metodo imprimir informacion
		
		
		//Getter y setter para poder  acceder a mis datos privados y poder realizar operaciones con ellos
		//Sin getters, la informacion me aparece en null
		//Sin setter, no puedo cambiar la informacion
		
		
		public String getfechaIngreso () {
			return fechaIngreso;
		}//	
		
		
		//getter para salario
		public double getSalario() {
			return salario;
		}//getSalario
		
						
		//setter para salario (modificar los datos)
		public void setSalario(double nuevoSalario) {
			if (nuevoSalario >0 && nuevoSalario <100) {
				salario = nuevoSalario;
			}//cierre if
		}//cierre setter
		
}//cierre AsistenteDental



