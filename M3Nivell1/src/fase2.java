import java.util.*;
public class fase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String[] arrayCities; //declaraci�n array
        arrayCities = new String[6]; //iniciaci�n array y n�mero elementos que tendr�

        //rellenar array -> string[] arrayCities = {Barcelona, Madrid,.....}

        arrayCities[0] = "Barcelona";
        arrayCities[1] = "Madrid";
        arrayCities[2] = "Valencia";
        arrayCities[3] = "M�laga";
        arrayCities[4] = "C�diz";
        arrayCities[5] = "Santander";

        System.out.print("Las ciudades son: \n");
        
        int i;
        for (i = 0; i <= 5; i ++)
        {
        	System.out.println(i + 1 + ".-" + arrayCities[i]);
        }

        //Ordenar Array Ascendentemente
        Arrays.sort(arrayCities);

        //Imprimir
        System.out.print("\n\n");
        System.out.print("Array ordenado:\n");
        for (i = 0; i <= 5; i ++)
        {
        	System.out.println(i + 1 + ".-" + arrayCities[i]);
        }     
    }
}
		
		
		
		
		
	


