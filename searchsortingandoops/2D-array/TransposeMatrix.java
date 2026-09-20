// interchange row and column 
// when the value of array i and j eqaul to each other then we will not swap them 
//

public class TransposeMatrix {
    public static void main (String[] args ) {
        int arr [][] = new int [3][3];
        int nums [][] ={{1, 2, 3 },{ 4, 5, 6}, {7, 8, 9 } };

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            for ( int j = 0; j < nums [i].length; j++) {
                if (i != j) {
                    int temp = nums [i][j];
                    nums[i][j] = nums[j][i];
                    nums[j][i] = temp;
                    
                }
            }
        }
         
        for (int i = 0; i < nums.length; i++) {
            for ( int j = 0; j < nums [i].length; j++) {

            System.out.println(nums[i][j] + " "); 
        }       
            System.out.println();
        }
    }
}