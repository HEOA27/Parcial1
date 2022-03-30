
public class ArrayIntegers{
    public static void main (String [] args){
        //Definimos el arreglo de enteros
        int[] arreglo = new int[17];
    

                for(int i=0; i<arreglo.length;i++){
                    int aleatorio = (int) (Math.random()*20)+1;
                    arreglo[i]=aleatorio;
                    System.out.println(arreglo[i]);
                  
                   
        }
        EncontrarMenor(arreglo);
        EncontrarMayor(arreglo);
        EncontrarPrimo(arreglo);
        EncontrarNumPar(arreglo);
        OrdenAscendente1(arreglo);
        PromedioArreglo(arreglo);
        SumarPrimerUltimo(arreglo);
        
    }
    public static void  EncontrarMenor(int []arreglo){
        int menor=0;
        menor=arreglo[0];

        for(int i=0;i<arreglo.length;i++){
            if( arreglo[i]<menor){
                menor=arreglo[i];
            }
        }
        System.out.println("El menor es: "+ menor);
    }
    public static void EncontrarMayor(int []arreglo){
        int mayor= arreglo[0];
        for(int i=0;i<arreglo.length;i++){

        if(arreglo[i]>mayor){
            mayor=arreglo[i];
        }
    }
    System.out.println("El mayor es: "+ mayor);

}

public static void EncontrarPrimo(int []arreglo) {
int count=0;
    for(int i=0; i<arreglo.length;i++){
int contador=0;
for(int j=1;j<=arreglo[i];j++){
    if(arreglo[i]%j==0){
        contador++;
    }
   

}
if(contador==2){
    System.out.println("Numero primo: "+arreglo[i]);
    count++;
}
}
System.out.println("Total de num primos "+count);

}

public static void EncontrarNumPar(int arreglo []){
int count=0;
    for(int i=0;i<arreglo.length;i++){
        if( arreglo[i]%2==0){
            count++;
            System.out.println("Numero par: "+ arreglo[i]);
        }
    }
    System.out.println("El total de num pares es: "+ count);
}
public static void OrdenAscendente1(int arr []){
    for(int k=0;k<arr.length;k++){
        for (int i : arr) {
			System.out.print(i+" ");
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("\nDespues de Clasificar...");
		for (int i : arr) {
			System.out.print(i+" ");
		}
    }
}
public static void PromedioArreglo(int arreglo[] ){
    double total=0;
    for (int i = 0; i < arreglo.length; i++) {
        total += arreglo[i];
    }
    System.out.println();
    System.out.println("La suma de todos los valores es: " + total);
    System.out.println("El promedio es: " + (total/ arreglo.length ));
    
}
public static void SumarPrimerUltimo(int arreglo[]){
    int suma=0;
    int suma2=0;
    int a=0, b=0;
    a=arreglo[0];
    b=arreglo.length;
        suma2=arreglo[0]+arreglo[16];

    System.out.println("Suma del primer y ultimo valor del arreglo: " + suma2);
}
}
