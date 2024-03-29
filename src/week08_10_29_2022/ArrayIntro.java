package week08_10_29_2022;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

//        if we know the elements of the array

        int[] arrayName = {1,2,3,4,5,6};

//        if we don't know the elements we have to define size of ARRAY
//        use new keyword
        int [] array = new int[10];
//        put the values in array
        array[0]=10;
        array[1]=10;
        array[2]=10;
        array[3]=10;
        array[4]=10;
        array[5]=10;
        array[6]=10;
        array[7]=10;
        array[8]=10;
        array[9]=10;
//        print the elements we need to use toString() method with Arrays utility class
        System.out.println(Arrays.toString(array));
                        //  0   1   2   3
        char [] letters = {'B','S','D','Y'};
        System.out.println(Arrays.toString(letters));
//      how to get specific element
        System.out.println(letters[1]);
        System.out.println(letters[3]);

        boolean[] array1=new boolean[3];

//        array1[0]="trtrtrrt"; we can not put the different data type
        double[] doubles=new double[2];
        doubles[1]=10;

        //sort method is sorting elements to
        int [] numbers={2,3,1,10,5};

        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("=======after sort=======");
        System.out.println(Arrays.toString(numbers));

//equals method is using for compare two array ! order of elements are important

        int[] array3={1,2,3};
        int[] array4={2,1,3};
        int[] array5={2,1,3};
        System.out.println(Arrays.equals(array3,array4));
        Arrays.sort(array4);

        System.out.println(Arrays.equals(array3,array4));





    }
}
