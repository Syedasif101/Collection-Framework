public class MergeSortExample {


    public static void mergeSort(int[] arr)
    {
        int n = arr.length;

        if(n < 2)
        {
            return;
        }
        int mid = n / 2;

        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[n - mid];

        for(int i=0; i<mid; i++)
        {
            leftHalf[i] = arr[i];
        }

        for(int i = mid; i<n; i++)
        {
            rightHalf[i - mid] = arr[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(arr,leftHalf,rightHalf);
    }


    public static void merge(int[] arr, int[] leftHalf, int[] rightHalf)
    {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i=0, j=0, k=0;

        while(i < leftSize && j < rightSize)
        {
            if(leftHalf[i] <= rightHalf[j])
            {
                arr[k] = leftHalf[i];
                i++;
            } else{
                arr[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while(i<leftSize)
        {
            arr[k] = leftHalf[i];
            i++;
            k++;
        }

        while(j<rightSize)
        {
            arr[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args){
        int[] arr = {60,30,50,10,40,20};


        MergeSortExample.mergeSort(arr);
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
