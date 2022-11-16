package day1assignment;
import java.util.Scanner;
public class leapyear {
	public static void main(String[] args) {
		int year;
		Scanner Scan=new Scanner(System.in);
        System.out.println("Enter  year  ");
         year = Scan.nextInt(); 
        if(year>= 1582   )
        {
        	if(year%4==0 || year%400==0 && year%100!=0)
        	{
        		System.out.println("Year is Leap Year");
        	}
        	else
        	{
        		System.out.println("Year is Not Leap Year");
        	}
        	
        }

}
}
