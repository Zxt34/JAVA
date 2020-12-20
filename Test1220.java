import java.util.Arrays;

public class Test1220 {
    public static void main(String[] args) {
        int[] arr={5,7,4,1,8,3,10};
        int[] result=popSort(arr);
        System.out.println(Arrays.toString(result));
//        int[] arr={1,2,3,4,5};
//        int[] result=Arrays.copyOf(arr,arr.length);
//        System.out.println(Arrays.toString(result));
//        int[] arr=new int[100];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=i+1;
//        }
//        System.out.println(Arrays.toString(arr));
//        int[] arr={1,2,3,4,5,6};
//        printArray(arr);
//        int[] result=transform(arr);
//        System.out.println("原数组为："+Arrays.toString(arr));
//        System.out.println("修改之后为："+ Arrays.toString(result));
//        double result=avg(arr);
//        int result=sum(arr);
//        System.out.println(result);
    }

    public static int[] popSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] transform(int[] arr) {
        int[] result=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i]=arr[i]*2;
        }
        return result;
    }

    public static int sum(int[] arr) {
        int sum=0;
        for(int x:arr)
            sum+=x;
        return sum;
    }

    public static double avg(int[] arr) {
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum/arr.length;
    }
}

