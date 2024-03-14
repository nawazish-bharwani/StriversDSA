class Solution {
    public void setZeroes(int[][] matrix) {
                //row and column array to keep a track of which row and columns will be marked 0
        int[] rowArray = new int[matrix.length];
        int[] colArray = new int[matrix[0].length];
        //marking rowArray and colArray with 1 which will specify if that row/col needs to be 0
        for (int rowPointer=0; rowPointer<matrix.length;rowPointer++){
            for(int colPointer=0;colPointer<matrix[0].length;colPointer++){
                if (matrix[rowPointer][colPointer]==0){
                    rowArray[rowPointer]=1;
                    colArray[colPointer]=1;
                }
            }
        }
        //making matrix elements 0 by checking in rowArray and colArray
        for (int rowPointer=0; rowPointer<matrix.length;rowPointer++){
            for(int colPointer=0;colPointer<matrix[0].length;colPointer++){
                if(rowArray[rowPointer]==1 | colArray[colPointer]==1) {
                    matrix[rowPointer][colPointer]=0;
                }
            }
        }
    }
}