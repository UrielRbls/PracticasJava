package figura;

//Clase concreta que implementa metodos de una interfaz llamada Calculable

public class Esfera extends Figura implements Calculable{
	
	//Atributos
	double radio;
	double pi;

	@Override
	public double calcularArea() { 
	double area = (4*pi*r*r);
		return 0;
	}

	@Override
	public double calcularVolumen() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}//class Esfera
