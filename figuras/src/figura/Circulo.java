package figura;

//Herencia de la clase abrstracta Figura
public class Circulo extends Figura{
	
	//1. Atributos
	double pi;
	double area;
	
	
	//2. Constructor 
	Circulo(double pi, double area){
		this.pi = pi;
		this.area = area;
	}//Constructor 
	
	
	//3. Metodos (metodo abstracto heredado de Figura)
	@override
	public double calcularArea() {
		double areaCirculo = pi * (radio*radio);
		return areaCirculo;
	}//metodo calcularArea
	
	

}//class Circulo
