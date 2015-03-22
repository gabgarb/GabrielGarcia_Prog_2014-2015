
public class Continente {

	public static void main(String[] args) {
		//Estamos definiendo 2 objetos diferentes.
		Ciudad c1=new Ciudad("Valencia");
		Ciudad c2=new Ciudad("Barcelona");
		
		//Accediendo a los atributos.
		System.out.println(c1.getNombreCiudad());
		System.out.println(c2.getNombreCiudad());
	}

}
