import java.util.Scanner;


public class Roda {
    
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        boolean verdade = true;
        while(verdade == true){
            System.out.println("número de linhas");
            int linhas = ler.nextInt();
            
            System.out.println("número de colunas");
            int colunas = ler.nextInt();
            
           

            int [ ] [ ]  matz = new int [linhas] [colunas];
            Scanner read = new Scanner(System.in);
            for (int l = 0 ; l < linhas; l ++) {
                for (int j = 0; j < colunas; j ++){
                    System.out.println("insira um valor:");
                    matz[l] [j] =  read.nextInt();
                }
                
            }
            
            for (int l = 0 ; l < linhas; l ++) {
                for (int c = 0; c < colunas; c ++)
                System.out.print(matz[l] [c] + " ");
                System.out.println( " ");
                System.out.println(" ");
                
            }
            
            
            
            Scanner grau = new Scanner(System.in);
            System.out.println("Quantos graus deseja rodar ?");
            int girar = grau.nextInt();
            System.out.println("----------------------");
            
            if(girar == 90){
                matz = rodamais(matz);
                for (int i = 0; i < matz.length; i ++) {
                    for (int j = 0; j < matz.length; j ++) {
                        System.out.print(matz[i][j] + " ");
                        
                        
                    }
                    System.out.println();
                }
            }
            
            if(girar == 180){
                int c = 0;
                while (c < 2) {
                    matz = rodamais(matz);
                    c++;
                }
                for (int i = 0; i < matz.length; i ++) {
                    for (int j = 0; j < matz.length; j ++) {
                        System.out.print(matz[i][j] + " ");
                    }
                    System.out.println();
                }
            }
            
            if(girar == 270){
                int d = 0;
                while (d < 3) {
                    matz =  rodamais(matz);
                    d++;
                }
                for (int i = 0; i < matz.length; i ++) {
                    for (int j = 0; j < matz.length; j ++) {
                        System.out.print(matz[i][j] + " ");
                    }
                    System.out.println();
                }
            }
            
            if (girar == 360){
                int e = 0;
                while (e < 4) {
                    matz = rodamais(matz);
                    e++;
                }
                for (int i = 0; i < matz.length; i ++) {
                    for (int j = 0; j < matz[i].length; j ++) {
                        System.out.print(matz[i][j] + " ");
                    }
                    System.out.println();
                    
                }
            }
        }
        
    }
    
    public static int[][] rodamais(int [][] matrix){
        int  linha = matrix.length;
        int coluna = matrix[0].length;
        
        
        int[][] newMatriz = new int [linha] [coluna];
        for (int i = 0; i < linha; i ++) {
            for (int j = 0; j < coluna; j ++) {
                newMatriz[i][j] = matrix[linha - j - 1][i];
                
                
            }
            
        }
        return newMatriz;
    }
}
