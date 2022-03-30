public class Matrices {
    public static void main (String [] args){
        int[][] m = new int[3][3];
    
        for (int x=0; x < m.length; x++) {
            for (int y=0; y < m[x].length; y++) {
              m[x][y] = (int) (Math.random()*9+1);
            }
          }
          //imprimir respuesta
          String respuesta=" ";
          for(int i=0;i<m.length;i++){
              for(int j=0;j<m.length;j++){
              respuesta=respuesta+" "+ m[i][j];    
              }
              respuesta=respuesta +"\n";
          }
          System.out.println(respuesta);

          EncontrarMayorMenor(m);
          NumPrimos(m);
          NumeroPar(m);
          Promedio(m);
          Diagonal(m);
          SumFila(m);

    }
    public static void EncontrarMayorMenor(int [][]matriz){
        int numeroMayor = matriz[0][0];
        int numeroMenor = matriz[0][0];
        String mayorPosicion = "0,0";
String menorPosicion = "0,0";
        for (int x=0;x<matriz.length;x++) {
            for (int y=0;y<matriz[x].length;y++) {
              if (matriz[x][y] > numeroMayor) {
                numeroMayor = matriz[x][y];
                mayorPosicion = x + "," + y;
              }
              if (matriz[x][y] < numeroMenor) {
                numeroMenor = matriz[x][y];
                menorPosicion = x + "," + y;
              }
            }                
          }
          System.out.println("El número mayor de la matriz es " + numeroMayor + " en la posición " + mayorPosicion);
        System.out.println("El número menor de la matriz es " + numeroMenor + " en la posición " + menorPosicion);
}
public static void NumPrimos(int[][] matriz) {
    int count=0;
    for(int i=0; i<matriz.length;i++){
        for(int j=0; j<matriz[i].length;j++){

        
int contador=0;
for(int k=1;k<=matriz[i][j];k++){
    if(matriz[i][j] % k==0){
        contador++;
    }
   

}
if(contador==2){
    System.out.println("Numero primo: "+matriz[i][j]);
    
}else{
    System.out.println("Numero no primo "+matriz[i][j]);

}
}
System.out.println();
}
}
public static void NumeroPar(int[][] matriz){
    int count=0;
    for(int i=0; i<matriz.length;i++){
        for(int j=0; j<matriz[i].length;j++){
            if( matriz[i][j]%2==0){
                count++;
                System.out.println("Numero par: "+ matriz[i][j]);
            }

        

}
System.out.println("El total de num pares es: "+ count);

System.out.println();
}
}

public static void Promedio(int[][]matriz){
    double total=0;
    for(int i=0; i<matriz.length;i++){
        for(int j=0; j<matriz[i].length;j++){
            total += matriz[i][j];

        }
        
    }
    System.out.println();
    System.out.println("La suma de todos los valores es: " + total);
    System.out.println("El promedio es: " + (total/ matriz.length ));
}

public static void Diagonal(int [][] mat){
int pd=0, sd=0;
for(int k=0; k<mat.length;k++){
for(int l=0; l<mat.length;l++){
    if (k == l)
                    pd += mat[k][l];
  
                // diagonal sec
                if ((k + l) == (mat.length - 1))
                    sd += mat[k][l];
}
}
System.out.println("Suma diagonal Principal:"  + pd);
      System.out.println("Suma diagonal secundaria:"+ sd);
}
public static void SumFila(int [][] matriz){
    for (int y = 0; y < matriz.length; y++) {
        int suma = 0;
        for (int x = 0; x < matriz[y].length; x++) {
            System.out.printf("%d ", matriz[y][x]);
            suma += matriz[y][x];
        }
        System.out.printf("= %d\n", suma);
    }
}

}
