
public class Ciudad {

	//ATRIBUTOS
	String nombreCiudad;
	
	//CONSTRUCTOR
	
	
	public Ciudad(String defCiudad) {
		//Inicialización
		this.nombreCiudad=defCiudad;
	}

	//METODOS
	public void setNombreCiudad(String defCiudad){
		this.nombreCiudad=defCiudad;
	}
	public String getNombreCiudad(){
		return this.nombreCiudad;
	}
}
