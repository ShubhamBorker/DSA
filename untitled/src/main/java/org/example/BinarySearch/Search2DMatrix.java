package org.example.BinarySearch;

public class Search2DMatrix {
    public static boolean searchMatrixBrute(int[][] matrix, int target) {

        for(int[] row:matrix){
            for (int num:row){
                if(num==target){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean searchMatrixOpt(int[][] matrix, int target) {
        int m= matrix.length; int n=matrix[0].length;
        int left=0; int right=m*n-1;

        while (left<=right){
            int mid=left+(right-left)/2;
            int midValue=matrix[mid/n][mid%n];
            
            if (midValue==target){
                return true;
            } else if (midValue<target) {
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return false;
    }

    public static void main(String[]args){
        int [][]matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println("Search 2D matrix(Brute): "+ searchMatrixBrute(matrix,16));
        System.out.println("Search 2D matrix(optimized): "+ searchMatrixOpt(matrix,10));
        System.out.println("Search 2D matrix(optimized): "+ searchMatrixOpt(matrix,2));

    }
}
