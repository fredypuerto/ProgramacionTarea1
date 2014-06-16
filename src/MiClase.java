
public class MiClase
{
	//devuelve la suma de a y b
	static int sumarNumeros(int a, int b)
	{
		return a+b;
	}
	
	//devuelve la resta de a y b
	static int restarNumeros(int a, int b)
	{
		return a-b;
	}
	
	//devuelve la multiplicación de a y b
	static int multiplicarNumeros(int a, int b)
	{
		return a*b;
	}
	
	//devuelve true si num es par, de lo contrario, devuelve false
	static boolean esPar(int num)
	{
	
		{
			if (num % 2 == 0) {
				return true;
			}else {
		}
		return false;
	}
	}
	
	//devuelve el numero mayor entre a, b o c
	static int getMayor(int a, int b, int c)
	{
		if(a>b && a>c){
			return a;
		}else if(b>a && b>c){
			return b;
		}
		return c;
	}
	
	//devuelve num elevado a la potencia
	
	static int potencia(int num, int potencia)
	
	{
		int acumulador = num;
		for(int i=1;i<potencia;i++)
		{
		      acumulador=acumulador*num;
		}

		
		return acumulador;
	}

	
	
	//devuelve el numero mayor del arreglo
	static int sumarArreglo(int arreglo[])
	{
		int suma=0;

		
		for(int i=0; i<arreglo.length;i++){

			suma=suma+arreglo[i];
		}
		
		return suma;
	}
	
	
	
	
	//devuelve el numero mayor de un arreglo
	static int getMayorArreglo(int arreglo[])
	{

				int resultado = arreglo[0]; 

				
				for(int i=0; i<arreglo.length; i++) 
				{ 
			
					if(arreglo[i] > resultado) 
				{ 
					
				resultado = arreglo[i]; 
				} 

				} 
				
				return resultado; 
			
	}
	
	//devuelve el numero menor de un arreglo
	static int getMenorArreglo(int arreglo[])
	{
		
				int resultado = arreglo[0]; 
				
				for(int i=0; i<arreglo.length; i++) 
				{ 
					
				if(arreglo[i] < resultado) 
				{ 
				
				resultado = arreglo[i]; 
				} 
				} 
				
				return resultado; 

			}

	
	//devuelve true si encuentra cadena dentro arreglo
	static boolean existe(String arreglo[],String cadena)
	{
		for(int i=0; i<arreglo.length;i++){
		
			if(arreglo[i].equals(cadena)){
				
				return true;
			}
		}
		return false;
	}

	
	public static void main(String args[])
	{
		System.out.print("Hola");
	}
}
