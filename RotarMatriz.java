import java.*;
import java.util.*;

public class RotarMatriz {
  public static void main(String[] args) {
      int m=5;
      int n=4;
      int cont=1;
      
      int[][] matrix = new int[m][n];
      
      for (int i = 0; i < m; ++i) {
          
          for (int j = 0; j <n; ++j) {
              matrix[i][j] = cont++;
          }
      } 
      
    
      
      int[][] results = rotar(matrix, 7);

  
      
      printMatrix(results);
  }
    
  private static int[][] rotar(int[][] entrada, int num_rotations) {
      int[][] output = entrada;
      int n = entrada[0].length;
      int m = entrada.length;
      
      for (int r = 0; r < num_rotations; ++r) {
          for (int row = 0; row < n; ++row) { // n = col nums
              for (int col = 0; col < m; ++col) {  
                  if (col == row && row < (n/2)) { 
                      output[col][row] = entrada[col][row+1]; 
                  } else if (col == row && row >= (n/2)) { 
                      output[col][row] = entrada[col][row-1];
                  } else if ((col == (m-row-1)) && row >= (n/2)) { 
                      output[col][row] = entrada[col+1][row];
                  //} else if ((col == (m-row-1))) { 
                  //   output[col][row] = entrada[col-1][row];
                  }
              }
          }
      }
      
      return output;
  }
    
  private static void printMatrix(int[][] matrix) {
    for (int row = 0; row < matrix.length; row++) {
        for (int col = 0; col < matrix[row].length; col++) {
            System.out.printf("%4d", matrix[row][col]);
        }
        System.out.println();
    }
  }
}