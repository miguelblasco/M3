import java.util.Scanner;

public class Nivell2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada = new Scanner(System.in);
		int i = 0;
		int j = 0;
		
		
		System.out.println("Introduce número de alumnos (filas):");
		int filas = entrada.nextInt();
		System.out.println("Introduce número total de notas (columnas):");
		int columnas = entrada.nextInt();
		
		
		double [][]calificaciones = new double[filas][columnas];//definición array
		
		
		//rellenar matriz con los datos pedidos al usuario
		for (i = 0; i< filas; i ++) {
				System.out.println("Nuevo Alumno:");				
					for (j = 0; j< columnas; j ++) {
						System.out.println("Nota - Fila " + i + " Columna " + j);
				
						calificaciones[i][j] = entrada.nextDouble();	
			}	
		}
		
		for (i = 0; i < filas; i ++) {
				double suma = 0;				
					for (j = 0; j < columnas; j ++) {
						suma = suma + calificaciones[i][j];	
			}
			
				double mitja = suma/columnas;
			
				if (mitja >= 5) {
					System.out.print("->Aprobado");
				}else System.out.print("->Suspendido");
								
			System.out.println(". La nota media del alumno " + (i + 1) + " es: " + mitja);			
		}		
		entrada.close();		
	}
}
