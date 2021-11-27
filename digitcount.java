import java.util.Scanner;
public class digitcount {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        char ch;
        do{        
            
            
            int count=0;
            System.out.println("enter  number: ");
            num=sc.nextInt();

        while(num>0)
            {
                num=num/10;
                count++;
            }
            if(count>=1 && count<7)
            {
          System.out.println("You have entered "+count+" digit number");
        }
          else
        {
          System.out.println("Number is too high");
        }
        System.out.println("Do you want to continue (Y/N)?: ");
        ch=sc.next().charAt(0);
        
        

        }while(ch=='y'||ch=='Y');

    }
    
}
