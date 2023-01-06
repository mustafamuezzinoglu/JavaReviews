package week09_11_05_2022;

public class MultiDimensionanalArrayIntro {
    public static void main(String[] args) {

        int[] firstArray = {1, 2, 3};
        int[] secondArray = {1, 2, 3};
        int[] thirdArray = {1, 2, 3};

        int[][] twoDimenArray = {
//               0  1  2
                {1, 2, 3},      //first array
                {4, 5, 6},      //second array
//               0  1  2  3
                {7, 8, 9, 10}   //third array

        };

        //int [][] array2D = {{},{},{}};
        int[][] array2D = {firstArray, secondArray, thirdArray}; // WE CAN USE LİKE THİS
        System.out.println(twoDimenArray[0][1]); //in order to reach to first we need to go to first array by using
        // index of array which is 0 then I need to that element by using index of element which is 1
        System.out.println(twoDimenArray[2][2]);
//                          //3 row number

        for (int i = 0; i < twoDimenArray.length; i++) { // in order to go to array one y one
            System.out.println(i + 1 + ". array ");
//                              column number
            for (int j = 0; j < twoDimenArray[i].length; j++) { //this is for finding element inside inner array
                System.out.println(twoDimenArray[i][j]);
            }
        }

        int[][][] array3D = {
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {1, 2, 3},
                        {4, 5, 6}
                }

        };
    }
}
