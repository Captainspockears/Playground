import java.util.Scanner;
 class Main {

    public static void main(String[] args) {
        int row = 2, column = 3;
        int[][] matrix = { {2, 3, 4}, {5, 6, 4} };
		//Try out your code here
        int[][] t = new int[column][row];
      
       for(int i=0; i<row; i++){
       
         for(int j=0; j<column; j++){
           t[j][i] = matrix[i][j];
         }
       }
      display(t);
        
    }
  
    public static void display(int[][] matrix) {
        for(int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
    
   