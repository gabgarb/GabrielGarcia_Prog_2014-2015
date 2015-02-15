
public class DatosGenerales {
	
	//Lista de monedas y dolares.
	final static String MONEDA_DOL="Dolares";
	final static float VALOR_DOL=1.13f;
	final static String MONEDA_EUR="Euros";
	final static float VALOR_EUR=1f;
	final static String MONEDA_LIB="Libras";
	final static float VALOR_LIB=0.75f;
	final static String MONEDA_YEN="Yen";
	final static float VALOR_YEN=132.47f;
	
	private String textoMoneda[]={MONEDA_DOL,MONEDA_EUR,MONEDA_LIB,MONEDA_YEN};
	private float valorConversion[]={VALOR_DOL,VALOR_EUR,VALOR_LIB,VALOR_YEN};

	public DatosGenerales() {
	
	}

	public String [] getMoneda(){
		return textoMoneda;
	}
	
	public float [] getValorConversionMoneda(){
		return valorConversion;
	}
}
