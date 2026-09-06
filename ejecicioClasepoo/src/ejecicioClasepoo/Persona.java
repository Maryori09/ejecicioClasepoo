package ejecicioClasepoo;

public abstract class Persona {

	    public String nombres = "";
	    public String apellidos = "";
	    protected String cuentaBancaria = "";   

	    
	    public Persona(String nombresParam, String apellidosParam, String cuentaBancariaParam) {
	    	nombres = nombresParam;
			apellidos = apellidosParam;
			cuentaBancaria = cuentaBancariaParam;
	    }

	    public void imprimirInformacion() {
	        System.out.println("Nombres: " + nombres);
	        System.out.println("Apellidos: " + apellidos);
	        System.out.println("Cuenta bancaria: " + cuentaBancaria);
	    }
	}
