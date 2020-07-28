
package Java_Progs;

import java.util.Arrays;

public class arraysAdd {

    public static void main(String[] args)
    {
        int[] firstArray = {2,4,6,8,10};
        int[] secondArray = {1,3,5,7,9};
        int fal = firstArray.length;
        int i;

        int[] result = new int[fal];
        for(i=0;i<fal;i++) {
            result[i] = firstArray[i] + secondArray[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
