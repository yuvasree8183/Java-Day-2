import java.util.Scanner;
class Task{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two values:");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float sum=a+b;
        System.out.println(sum);
        if(a>0){
            System.out.println("The number is positive");
        }    
        else{
            System.out.println("The number is negative");
        }
        if(a>0 && a%2==0){
            System.out.println("The given number is positive and even");
        }
        else if(a>0 && a%2!=0){
            System.out.println("The given number is positive and not even");
        }
        else if(a<0 && a%2==0){
            System.out.println("The given number is negative and even");
        }
        else{
            System.out.println("The number is not positive and not even");
        }
        float x=a;
        System.out.println(x);
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(a);
    }
}