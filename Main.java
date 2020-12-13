import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("请输入一个数：");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        for (int i = 0; i < 32; i++) {
            if(((num>>>i)&1)==1)
                count++;
        }
        System.out.printf("%d的二进制数中1的个数为：%d",num,count);
    }







//        System.out.println("请输入一个数：");
//        Scanner sc=new Scanner(System.in);
//        int temp=sc.nextInt();
//        System.out.printf("%d的每一位是：",temp);
//        while(temp!=0){
//            System.out.printf("%d ",temp%10);
//            temp/=10;
//        }
//    }

//        System.out.println("您想得到几乘几的乘法表：");
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//        mulTable(num);
//    }
//
//    private static void mulTable(int num) {
//        for (int i = 1; i <= num; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.printf("%dx%d=%-2d ",j,i,i*j);
//            }
//            System.out.println();
//        }
//    }

//        Scanner sc=new Scanner(System.in);
//        String password=setPassword(sc);
//        if(verifyPassword(sc,password,3)){
//            System.out.printf("登陆成功");
//        }else{
//            System.out.println("已达上限，登录失败");
//        }
//    }
//
//    private static boolean verifyPassword(Scanner sc, String actualPassword, int i) {
//        for (int j = 0; j < i; j++) {
//            System.out.println("请输入密码：");
//            String tryPassword=sc.nextLine();
//            if(actualPassword.equals(tryPassword))
//                return true;
//            if(j!=i)
//                System.out.printf("密码错误，还有%d次机会\n",i-1);
//        }
//        return false;
//    }
//
//    public static String setPassword(Scanner sc) {
//        System.out.println("请设置密码：");
//        String str=sc.nextLine();
//        return str;

//        System.out.println("请输入两个数：");
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int result=gCD(a,b);
//        System.out.println("这两个数的最大公约数为："+result);
//    }
//
//    private static int gCD(int a, int b) {
//        int num=Min(a,b);
//        for (int i = num; i > 0;i--) {
//            if(a%i==0&&b%i==0)
//                return i;
//        }
//        return 1;
//    }
//
//    private static int Min(int a, int b) {
//        return a<b?a:b;
//    }

//    public static double CalcItem(int i){
//        return (1.0 / i) - (1.0 / (i+1));
//    }
//    public static double CalcSeries(int num){
//        double sum=0;
//        for (int i = 1; i < num; i+=2) {
//            sum+=CalcItem(i);
//        }
//        return sum;
//    }
//    public static void main(String[] args) {
//        double num=CalcSeries(100);
//        System.out.println("sum="+num);

//        Random random=new Random();
//        int num=random.nextInt(100)+1;
//        Scanner sc=new Scanner(System.in);
//        while(true){
//            System.out.println("请输入您猜的数：");
//            int guess=sc.nextInt();
//            if(num<guess){
//                System.out.println("您猜大了");
//            }else if(num>guess){
//                System.out.println("您猜小了");
//            }else{
//                System.out.println("恭喜您猜对啦！");
//                break;
//            }
//        }
}
