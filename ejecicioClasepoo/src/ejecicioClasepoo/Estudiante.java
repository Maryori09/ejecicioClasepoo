package ejecicioClasepoo;

public class Estudiante extends Persona  {
	private int creditosObtenidos; 
	
	public Estudiante(String nombresParam,String apellidosParam,String cuentaBancariaParam, int creditosObtenidosParam) {
		super(nombresParam, apellidosParam, cuentaBancariaParam);
		creditosObtenidos = creditosObtenidosParam;
	}
	
	@Override
	public void imprimirInformacion() {
		super.imprimirInformacion();
		System.out.println("creditosObtenidos: " + creditosObtenidos);
	}
	
	

}
