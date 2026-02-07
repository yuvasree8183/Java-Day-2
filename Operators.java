import java.util.Scanner;
class Operators{
    public static void main(String [] args){
        Scanner num=new Scanner(System.in);
        System.out.println("Enter the values of a & b:");
        int a=num.nextInt();
        int b=num.nextInt();
        //Arithmetic operator
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        //Relational operator
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>=b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a<b);
        //Unary operator
        System.out.println(+a);
        System.out.println(-b);
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(--b);
        System.out.println(b--);
        System.out.println(b);
        //Assignment operator
        System.out.println(a+=5);
        System.out.println(a-=3);
        System.out.println(a*=4);
        System.out.println(a/=5);
        System.out.println(a%=2);
        //Bitwise operator
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(~a);
        System.out.println(~b);
        //Logical operator
        System.out.println(a<5 && b>7);
        System.out.println(a<5 || b>7);
        System.out.println(!(a>4));
        //Shift operator
        System.out.println(a>>2);
        System.out.println(b<<3);
        //Ternary operator
        int max=(a>b)?a:b;
        System.out.println(max);
    }
}