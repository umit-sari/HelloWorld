package Day23_multiDimensionalArrays;

import java.util.Arrays;

public class C04_OrtakIndeksliSayilariToplama {
    public static void main(String[] args) {

        /*
        Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip,
        yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        input : int[][] arr = {{3,4,5}, {2,3,6,7}};
        output: [5, 7, 11]
         */
        int[][] arr = {{3,4,5}, {2,3,6,7}};

        int uzunluk=arr[0].length<arr[1].length ? arr[0].length:arr[1].length; // uzunluklarına bakıyoruz

        int [] yeniArr=new int[uzunluk];// [0,0,0] bize olusturur

        for (int i = 0; i < yeniArr.length; i++) {

            yeniArr[i]=arr[0][i]+arr[1][i]; // inner sıra sayısı değismiyor inner içindeki elementin indeks degisiyor.

            // yeni arr[0]=arr[0][0]+arr[1][0]
            // yeni arr[1]=arr[0][1]+arr[1][1]
            // yeni arr[2]=arr[0][2]+arr[1][2]

        }

        System.out.println(Arrays.toString(yeniArr));

    }
}
