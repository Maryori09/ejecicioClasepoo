package ejecicioClasepoo;

public class Estudiante extends Persona  {
	private int creditosObtenidos; 
	
	public Estudiante(String nombresParam,String apellidosParam,String cuentaBancariaParam, int creditosObtenidosParam) {
		super(nombresParam, apellidosParam, cuentaBancariaParam);
		creditosObtenidos = creditosObtenidosParam;
	}
	
	@Override //Hace que un método de la clase hija reemplace al método de la clase padre, en vez de usar el original
	public void imprimirInformacion() {
		super.imprimirInformacion();
		System.out.println("creditosObtenidos: " + creditosObtenidos);
	}
	
	

}
