package Person;

public class Paciente {
	//1 Attributes
	String socialNumber;
	String bloodType;
	boolean expedient;
	private boolean medicalInsurance;
	String appointment;
	String assinedDoctor;
	boolean allergies;
	
	
	//2 Constructor to get all data 
	public Paciente(String socialNumber, String bloodType, boolean expedient, boolean medicalInsurance,
			String appointment, String assinedDoctor, boolean allergies) {
		super();
		this.socialNumber = socialNumber;
		this.bloodType = bloodType;
		this.expedient = expedient;
		this.medicalInsurance = medicalInsurance;
		this.appointment = appointment;
		this.assinedDoctor = assinedDoctor;
		this.allergies = allergies;
	}
	
	
	//2.1 Constructor to get just mandatory data
	Paciente(String socialNumber, boolean expedient, boolean medicalInsurance) {
		this.socialNumber = socialNumber;
		this.expedient = expedient;
		this.medicalInsurance = medicalInsurance;
		
	}

	
	//3 Methods 
	@Override
	
	//Method named toString that utilizes string data type 
	public String toString() {
		return "Paciente [socialNumber=" + socialNumber + ", bloodType=" + bloodType + ", expedient=" + expedient
				+ ", medicalInsurance=" + medicalInsurance + ", appointment=" + appointment + ", assinedDoctor="
				+ assinedDoctor + ", allergies=" + allergies + "]";
	}
	
	
	//to String
	
	//getter
	public boolean getMedicalInsurance() {
		return medicalInsurance;
	}

	
	
	//setter
	public void setMedicalInsurance(boolean medicalInsurance) {
		this.medicalInsurance = medicalInsurance;
	}

}// Patient class 

