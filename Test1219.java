import java.util.Scanner;
public class Test1219{
    public static void main(String[] args) {
//        int []arr={1,2,3,4,5,6,7,8,9,10};
//        SortArr(arr);
        int result=Sum(3,4);
//        double result1=Max(3.5,4.5);
        double result1=Sum(3.5,5.5,4.5);
        System.out.println(result);
        System.out.println(result1);
    }

    public static int Sum(int a, int b) {
        return a+b;
    }

    public static double Sum(double a, double b,double c) {
        return a+b+c;
    }

    public static int Max(int a, int b) {
        return a>b?a:b;
    }

    public static double Max(double a, double b) {
        return a>b?a:b;
    }

    public static double Max(double a, double b,int c) {
        return Max(a,b)>c?Max(a,b):c;
    }

    public static int Max3(int a, int b, int c) {
        return Max2(a,b)>c?Max2(a,b):c;
    }

    public static int Max2(int a, int b) {
        return a>b?a:b;
    }

    public static void SortArr(int[] arr) {
        int n=arr.length;
        int i;
        int j;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(arr[j]%2!=0){
                    int tmp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=tmp;
                }
            }
            System.out.print(arr[i]+" ");
        }
    }

    public static int FactorialSum(int n) {
        int sum=0;
        for (int i = 1; i <= n; i++) {
            sum+=Factorial(i);
        }
        return sum;
    }

    public static int Factorial(int i) {
        int result=1;
        for (int j = 1; j <= i; j++) {
            result*=j;
        }
        return result;
    }

    public static int Fibonacci(int n) {
        if(n==1||n==2)
            return 1;
        else
            return Fibonacci(n-1)+Fibonacci(n-2);
    }

    public static void findOnceNum(int[] arr) {
        int num=arr.length;
        for (int i = 0; i < num; i++) {
            for (int j = num-1; j >=0; j--) {
                if(arr[i]==arr[j]&&i!=j)
                    break;
                if(j==0)
                    System.out.println(arr[i]);
            }
        }
    }
}



