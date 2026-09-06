package ejecicioClasepoo;

public class main {
	public static void main(String[] args) {
 Catedratico catedratico1 = new Catedratico ("William", "Zamora", "024530001", 6000.0);
 Catedratico catedratico2 = new Catedratico ("Brenda", "Garcia", "987653065", 7000.0);
 
 Estudiante estudiante1 = new Estudiante ("Hunter", "Garcia", "345287690", 89);
 Estudiante estudiante2 = new Estudiante ("Molly", "Solis", "24475891", 90);
 
 
 catedratico1.imprimirInformacion();
	System.out.println();
	catedratico2.imprimirInformacion();
	System.out.println();
	estudiante1.imprimirInformacion();
	System.out.println();
	estudiante2.imprimirInformacion();
 
	}
}
