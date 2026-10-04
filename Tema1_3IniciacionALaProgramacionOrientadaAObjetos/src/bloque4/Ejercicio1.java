package bloque4;

public class Ejercicio1 {
	public void show() {
		// La cara de una moneda
		boolean esCara = Math.random() < 0.5;
		System.out.println(esCara ? "Cara" : "Cruz");

		// El lanzamiento de un dado
		int dado = (int) (Math.random() * 6) + 1;
		System.out.println("Dado: " + dado);
		
		// Un número entre 34 y 68 ambos incluidos
		int entre34y68 = (int) (Math.random() * (68 - 34 + 1)) + 34;
		System.out.println("Entre 34 y 68: " + entre34y68);
			
		// Un número decimal
		double decimal = Math.random();
		System.out.println("Decimal: " + decimal);
		
		// Un día de la semana y mostrar si es fin de semana o no (1 = lunes ... 7 = domingo)
		int diaFinde = (int) (Math.random() * 7) + 1;
		boolean esFinDeSemana = diaFinde >= 6;
		System.out.println("Día " + diaFinde + ", ¿fin de semana? " + esFinDeSemana);
			
		// Un mes del año y mostrar si es verano o no (julio y agosto)
		int mesVerano = (int) (Math.random() * 12) + 1;
		boolean esVerano = mesVerano == 7 || mesVerano == 8;
		System.out.println("Mes " + mesVerano + ", ¿verano? " + esVerano);
		
		// Un día de la semana y mostrar qué día de la semana es
		int dia = (int) (Math.random() * 7) + 1;
		String nombreDia;
		switch (dia) {
		case 1:
			nombreDia = "Lunes";
			break;
		case 2:
			nombreDia = "Martes";
			break;
		case 3:
			nombreDia = "Miércoles";
			break;
		case 4:
			nombreDia = "Jueves";
			break;
		case 5:
			nombreDia = "Viernes";
			break;
		case 6:
			nombreDia = "Sábado";
			break;
		default:
			nombreDia = "Domingo";
			break;
		}
		System.out.println("Día de la semana: " + nombreDia);
		
		// Un mes del año y mostrar qué mes del año es
		int mes = (int) (Math.random() * 12) + 1;
		String nombreMes;
		switch (mes) {
		case 1:
			nombreMes = "Enero";
			break;
		case 2:
			nombreMes = "Febrero";
			break;
		case 3:
			nombreMes = "Marzo";
			break;
		case 4:
			nombreMes = "Abril";
			break;
		case 5:
			nombreMes = "Mayo";
			break;
		case 6:
			nombreMes = "Junio";
			break;
		case 7:
			nombreMes = "Julio";
			break;
		case 8:
			nombreMes = "Agosto";
			break;
		case 9:
			nombreMes = "Septiembre";
			break;
		case 10:
			nombreMes = "Octubre";
			break;
		case 11:
			nombreMes = "Noviembre";
			break;
		default:
			nombreMes = "Diciembre";
			break;
		}
		System.out.println("Mes del año: " + nombreMes);
	}

	public static void main(String[] args) {
		new Ejercicio1().show();
	}
}
