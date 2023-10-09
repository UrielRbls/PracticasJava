package Persona;

import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona Felipe = new Persona("Felipe", "Maqueda", (byte)31, "5512345678", "felipe@mail.com");
		
		System.out.println(Felipe); //imprime lugar memoria
		Felipe.imprimirInfo();//imprime informacion
		Felipe.saludar();//imprime saludo
		
	}//Instancia de Dentista
	Dentista Simi = new Dentista("Dr.simi", "Lares", (byte)50, "12345678", "simi@lares.com", "Odontologia", "5512345678", "intermedio", "matutino", 500,);
	System.out.prinln("**************");
	Simi.calcularSalario();
	Simi.imprimirInfoDentista(;)
	
	
	//instancia de paciente con todos los datos 
	Paciente Chencho = new Paciente("CHNCH1234", "RH Positivo", true, true , "05/Oct/2023", "Doc. Simi Lares", false);
	System.out.println("**************");
	System.out.println("Chencho");
	
	//instancia de paciente con todos los datos obligatorios 
//	Paciente Masiosare = new Paciente("MAS12345", false, false);
//	System.out.println("**************");
//	System.out.println("Masiosare");
	
	//Cambiar el false de seguroMedico a true
	Masiosare.seguroGastosMedicos = true;
	
	System.out.println("**************");
	System.out.println(Masiosare);
	
	
	//Implementacion de ArrayList de Dentistas
	List<Dentista> listaDentistasArrayList = new ArrayList<>();
	
	Dentista DeChapatin = new Dentista("Dr.Chapatin", "Chespirito", (byte)45, "11223344", "chapatin@mail.com", "General", "667123455", "Consultorio 200", "avanzado", "matutino", 450);
	
	//Luego la agrego a la lista 
	listaDentistaArrayList.add(DrChapatin);
	
	//Si agrego la instancia a una variable, puedo imprimir su informacion usando un toString, o un metodo mostrandoInfo();
	
	//Hago una instancia y la agrego directamente a la lista
	listaDentistasArrayList.add(new Dentista("Dr.simi", "Lares", (byte)50, "12345678", "simi@lares.com", "Odontologia", "55113344", "Consultorio 500", "avanzado", "matutino", 500));
	
	
	//Implementacion de lista de Dentistas con un Hashset
	set<Dentista> conjuntoDentistas = new HashSet<>();
	
	
	//Agregando Dentista a mi Conjunto
	conjuntoDentistas.add(new Dentista("Dr.simi", "Lares", (byte)50, "12345678", "simi@lares.com", "Odontologia", "55113344", "Consultorio 500", "avanzado", "matutino", 500));
	
	
	//Implemetacion de un hashmap de Dentistas
	Map<String, Dentista> mapaDentistas = new HashMap<>();
	
	//Agregar un dentista a mi mapa 
	mapaDentistas.put("Dr Smith", new Dentista ("Gregoryi", "House", (byte)55, "12345678", "house.com", "Cirujano", "55113344", "Consultorio 600", "avanzado", "matutino", 1400));
	
	//Imprimir el objeto Doctor House 
	String DoctorBuscado = mapaDentistas.get("Dr House";)
			
	System.out.println(DoctorBuscado);

	
}//cierre class Persona
