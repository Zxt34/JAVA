import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        int count=0;
//        for (int num = 1; num <= 100; num++) {
//            if(num/10==9)
//                count++;
//            if(num%10==9)
//                count++;
//        }
//        System.out.println(count);

//        for (int year = 1000; year <= 2000; year++) {
//            if(year%100==0){
//                if(year%400==0){
//                    System.out.println(year + "年是闰年");
//                }else{
//                    System.out.println(year + "年不是闰年");
//                }
//            }else{
//               if(year%4==0) {
//                   System.out.println(year + "年是闰年");
//               }else{
//                   System.out.println(year + "年不是闰年");
//               }
//            }
//        }

//        int isPrime = 0;
//        int check = 0;
//        for (isPrime = 1; isPrime <= 100; isPrime++) {
//            for (check = 2; check < isPrime; check++) {
//                if (isPrime % check == 0) {
//                    break;
//                }
//            }
//            if (check == isPrime) {
//                System.out.print(isPrime + " ");
//            }
//        }

//                int num = 5;
//                int i = 2;
//                for (i = 2; i < num; i++) {
//                    if (num % i == 0) {
//                        System.out.println(num + " 不是素数");
//                        break;
//                    }
//                }
//                if (i == num) {
//                    System.out.println(num + " 是素数");
//                } else if (num <= 1){
//                    System.out.println("您的数字有误!");
//                }

//        Scanner sc=new Scanner(System.in);
//        int age=sc.nextInt();
//        if(age>56)
//            System.out.println("老年");
//        else if(age>29)
//            System.out.println("中年");
//        else if(age>19)
//            System.out.println("青年");
//        else
//            System.out.println("少年");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
            for (int i = 0; i <num ; i++) {
                for (int j = 0; j < num; j++) {
                if(i==j)
                    System.out.print("*");
                else if(j==num-i-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
                }
                System.out.printf("\n");
            }
    }
}