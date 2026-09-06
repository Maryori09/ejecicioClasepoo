package ejecicioClasepoo;

public class Catedratico extends Persona  {
     
	private double sueldo = 0.0;
	
	public Catedratico(String nombresParam, String apellidosParam, String cuentaBancariaParam, double sueldoParam) {
		super(nombresParam, apellidosParam, cuentaBancariaParam);
		sueldo = sueldoParam;
	}
	
	@Override
	public void imprimirInformacion() {
		super.imprimirInformacion();
		System.out.println("Sueldo: " + sueldo);
		
	}
	
	
}
