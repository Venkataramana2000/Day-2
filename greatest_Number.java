import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

import javafx.scene.paint.Stop;
public class greatest_Number {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number:");
        num1=sc.nextInt();
        System.out.println("Enter second Number:");
        num2=sc.nextInt();
        System.out.println("Enter third Number:");
        num3=sc.nextInt();
        if(num1>num2 && num1>num3)
        {
            System.out.println("Greatest Number is:"+num1);
        }
        else if(num2>num1 && num2>num3)
        {
            System.out.println("Greatest Number is:"+num2);
        }
        else
        {
            System.out.println("Greatest Number is:"+num3);
        }
    }
}
