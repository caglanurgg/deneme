package day22_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class myTest {
    public static void main(String[] args) {

        // verilen bir array'in uzunlugunu bir artirarak
        // verilen bir element'i ekleyin

        int [] arr = {3,7,8};
        int eklenecekSayi = 10;


        int [] yeniArr = new int [arr.length+1]; // [0,0,0,0]


        for (int i = 0; i < arr.length ; i++) {

            yeniArr[i]= arr[i];

        } // [3, 7, 8, 0]


        yeniArr[yeniArr.length-1] = eklenecekSayi;


        arr = yeniArr;


        System.out.println("arr'nin son hali : " + Arrays.toString( arr));
        // arr'nin son hali : [3, 7, 8, 10]


    } // main method sonu

} // class body'nin sonu

