package org.generation.getUsers.service;
/*
 * Haremos dos cosas:
 * 1. Emular la base de datos mediante un ArrayList, el cual nos sevira para realizar la consulta 
 * 2. Definir la operaciones del CRUD (create, read, update y delete). En este caso, solo utilizaremos read(GET).
 * Para definir que una clase es un Servicio, utilizamos la anotacion @Service e importamos desde spring framework.
 */

import java.util.ArrayList;

import org.generation.getUsers.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	//1. Crear una lista de objetos y debe contener los atributos definidos en el model. Para ello inicializado una variable constante.
	
	public final ArrayList<User> listaUsuarios = new ArrayList<User>();
	
	//Instanciando usuarios y agregandolos a mi lista en un metodo
	public UserService() {
		listaUsuarios.add(new User(1L, "Daniel", "Maldonado", "Tabasco", "daniel@gmail.com", "1122334455"));
		listaUsuarios.add(new User(2L, "Angel", "Torres", "Guadalajara", "pp.angel@gmail.com", "4775512215"));
		listaUsuarios.add(new User(3L, "Kenia", "Montalvo", "Nuevo León", "kenia@gmail.com", "1234569878"));
		listaUsuarios.add(new User(4L, "Brandon", "Palacios", "Hidalgo", "brandon@mail.com", "7751234567"));
		listaUsuarios.add(new User (5L, "Ernesto", "Santillan", "Guadalajara", "skjadhasd@mail.com", "5534756976"));
		listaUsuarios.add(new User(6L, "Alejandra", "Piedra", "Yucatán", "ale@gatito.com", "9933720000"));
		listaUsuarios.add(new User(7L, "Antonio", "Salcido", "Guadalajara, Jal", "antonio@mail", "7755664411"));
		listaUsuarios.add(new User(8L, "Alicia", "Diaz", "Guadalajara", "alicia@mail.com", "3411234567"));
		listaUsuarios.add(new User(9L, "Carolina", "Herrera", "Michoacan", "ankareta@gmail.com", "3531234567"));
		listaUsuarios.add(new User(10L, "Luis", "Miguel", "Miami", "elsol@gmail.com", "2211334455"));
	}
	
	//Metodos CRUD para poder iterar sobre nuestros usuarios 
	/*
	 * CRUD. Operaciones que permiten manipular la informacion.
	 * C (Create).	Crear algo 		POST para mandarlo al servidor. 
	 * R (Read). 	Leer algo 		GET para recibirlo desde el servidor.
	 * U (Update). 	Actualizar 		PUT para modificar / actualizar lo que ya existe en el servidor.
	 * D (Delete). 	Borrar algo		DELETE para borrar algo de nuestro servidor.
	 */
	
	//Metodo que me permite retornar (enviar) todos los usuarios al controller
	public ArrayList<User> enviarUsuarios(){
		return listaUsuarios;
	}
	
	
	
	
	
	
	
	
	
	
}



