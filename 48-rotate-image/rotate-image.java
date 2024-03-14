class Solution {
    public void rotate(int[][] matrix) {
        transposeMatrix(matrix);
        for (int i = 0; i < matrix.length; i++) {
            reverse(matrix,i);
        }
    }
        static void transposeMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
        static void reverse(int[][] arr, int rowNum)
    {
        int p1=0,p2=arr[0].length-1;
        while (p1<p2)
        {
            int temp=arr[rowNum][p1];
            arr[rowNum][p1]=arr[rowNum][p2];
            arr[rowNum][p2]=temp;
            p1++;p2--;
        }
    }
}