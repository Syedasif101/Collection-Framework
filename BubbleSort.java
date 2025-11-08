import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr, int n)
    {
        for(int i=0; i<n; i++)
        {
            int flag = 0;
            for(int j=0; j<n-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                flag = 1;


            }
            if(flag == 0)
            {
                break;
            }
        }

        return arr;
    }
    public static void main(String[] args)
    {
        int[] arr = {11,22,33,10,3};
        int n = arr.length;

        System.out.println(Arrays.toString(BubbleSort.bubbleSort(arr, n)));
    }
}
