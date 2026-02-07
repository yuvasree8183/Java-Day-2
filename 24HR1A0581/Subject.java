import java.util.Scanner;
class Subject{
    public static void main(String [] args){
        Scanner marks=new Scanner(System.in);
        System.out.println("Marks of 3 subjects:");
        byte sub1=marks.nextByte();
        byte sub2=marks.nextByte();
        byte sub3=marks.nextByte();
        int total=sub1+sub2+sub3;
        System.out.println("Total Marks:"+total);
        float average=sub1+sub2+sub3/3;
        System.out.println("Average:"+average);   
    }
}