import java.util.Scanner;
class Swapping{
    public static void main(String [] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter two values:");
        int a=ob.nextInt();
        int b=ob.nextInt();
        //using temp
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping a:"+a);
        System.out.println("After Swapping b:"+b);
        //using arithmetic operator(+,-)
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping a:"+a);
        System.out.println("After Swapping b:"+b);
        //using arithmetic operator(*,/)
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("After Swapping a:"+a);
        System.out.println("After Swapping b:"+b);
        //using XOR
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After Swapping a:"+a);
        System.out.println("After Swapping b:"+b);
    }
}