
public class MiClase
{
	//devuelve la suma de a y b
	static int sumarNumeros(int a, int b)
	{
		//Sumar a + b
		return a+b;
	}
	
	//devuelve la resta de a y b
	static int restarNumeros(int a, int b)
	{
		//restar a-b
		return a-b;
	}
	
	//devuelve la multiplicación de a y b
	static int multiplicarNumeros(int a, int b)
	{
		//multiplicar a*b
		return a*b;
	}
	
	//devuelve true si num es par, de lo contrario, devuelve false
	static boolean esPar(int num)
	{
		//si es par va a retornar true y si no es par va a retornar false
	
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
		//si a es mayor que b y a mayor que c retorna a
		if(a>b && a>c){
			return a;
			//si b es mayor que a y que c retorna b
		}else if(b>a && b>c){
			return b;
		}
		//si ninguna de las otras es mayor que la otra retorna c
		return c;
	}
	
	//devuelve num elevado a la potencia
	
	static int potencia(int num, int potencia)
	
	{
		//introducimos el numero que queremos elevar a la potencia
		
		int acumulador = num;
		for(int i=1;i<potencia;i++)
		{
			//acumulador es igual al acumulador por el numero ingresado 
		      acumulador=acumulador*num;
		}

		
		return acumulador;
	}

	
	
	//devuelve el numero mayor del arreglo
	static int sumarArreglo(int arreglo[])
	{
		//sumamos los arreglo
		int suma=0;

		//este nos sirve para ver cual es el numero mayor
		for(int i=0; i<arreglo.length;i++){
//la suma es igual a suma mas arrglo 
			suma=suma+arreglo[i];
		}
		//retorna el resultado
		return suma;
	}
	
	
	
	
	//devuelve el numero mayor de un arreglo
	static int getMayorArreglo(int arreglo[])
	{
//introducimos el arreglo
				int resultado = arreglo[0]; 
//
				
				for(int i=0; i<arreglo.length; i++) 
				{ 
			//es para ver si arreglo es mayor que resultado
					if(arreglo[i] > resultado) 
				{ 
		//el resultado es igual al arreglo			
				resultado = arreglo[i]; 
				} 

				} 
//retorna el resultado				
				return resultado; 
			
	}
	
	//devuelve el numero menor de un arreglo
	static int getMenorArreglo(int arreglo[])
	{
		//Introducir el arreglo
				int resultado = arreglo[0]; 
				
				for(int i=0; i<arreglo.length; i++) 
				{ 
				//buscamos el arreglo manor	
				if(arreglo[i] < resultado) 
				{ 
				//el resultado es igual al arreglo menor
				resultado = arreglo[i]; 
				} 
				} 
				//retorna el resultado del arreglo menor
				return resultado; 

			}

	
	//devuelve true si encuentra cadena dentro arreglo
	static boolean existe(String arreglo[],String cadena)
	{
		
		for(int i=0; i<arreglo.length;i++){
		//si encuantra cadena dentro del arrglo devolvera true
			if(arreglo[i].equals(cadena)){
				
				return true;
			}
		}
		//si no encuentra cadena retorna false
		return false;
	}

	
	public static void main(String args[])
	{
		System.out.print("Hola");
	}
}
