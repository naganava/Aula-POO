package matriz;

import java.util.Scanner;

/**
 *
 * @author teclaserti
 */
public class Matriz {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        
        System.out.println("linhas matriz 1: ");
        int x1 = leitura.nextInt();
        System.out.println("colunas matriz 1: ");
        int y1 = leitura.nextInt();
        
        System.out.println("linhas matriz 2: ");
        int x2 = leitura.nextInt();
        System.out.println("colunas matriz 2: ");
        int y2 = leitura.nextInt();
        
        if (y1 == x2){
            int[][] matriz1 = new int[x1][y1];
            int[][] matriz2 = new int[x2][y2];
            int[][] matrizR = new int[x1][y2];
            int[][] matrizO = new int[x1][y2];
            
            for(int i=0;i<x1;i++){
                for(int j=0;j<y1;j++){
                    System.out.println("Matriz1["+i+"]["+j+"]: ");
                    matriz1[i][j] = leitura.nextInt();
                }

            }
            for(int i=0;i<x2;i++){
                for(int j=0;j<y2;j++){
                    System.out.println("Matriz2["+i+"]["+j+"]: ");
                    matriz2[i][j] = leitura.nextInt();
                }

            }
            
            for(int i=0;i<x1;i++){
                for(int j=0;j<y1;j++){
                    System.out.println(matriz1[i][j]+ "\t");
                }
                System.out.println();
            }
            
            for(int i=0;i<x2;i++){
                for(int j=0;j<y2;j++){
                    System.out.println(matriz2[i][j]+ "\t");
                }
                System.out.println();
            }
            
            for(int i=0;i<x1;i++){
                for(int j=0;j<y2;j++){
                    for(int k=0;k<y1;k++){
                        matrizR[i][j] += matriz1[i][k] * matriz2[k][j];
                        matrizO[i][j] += matriz1[i][k] * matriz2[k][j] * -1;
                    }
                System.out.println("MatrizR: "+matrizR[i][j]+ "\t");
                }
                System.out.println();
            }    
        }else{
            System.out.println("Impossível multiplicar essas matrizes");
        }
    }
    
}
