import java.util.Scanner;
public class method {
    public static int gradeofstudent(int marks){
        if(marks<50){
            System.out.println("fail");
        }
        else if(marks>50 && marks<59)
        {
            System.out.println("Grade: 'D' ");
        }
        else if(marks>60 && marks<69){
            System.out.println("Grade: 'C'");
        }
        else if(marks>70 && marks<79){
            System.out.println("Grade: 'B' ");
        }
        else if(marks>80 && marks<89){
            System.out.println("Grade : 'A'");
        }
        else if(marks>90 && marks<100){
            System.out.println("Grade: 'A+' ");
        }
        else{
            System.out.println("invalid");
        }
        return marks;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        gradeofstudent(marks);



    }
    
}
