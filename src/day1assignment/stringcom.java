package day1assignment;
import java.util.Scanner;
public class stringcom {
	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
        System.out.println("Enter your first string  ");
        String str1 = Scan.next(); 
        System.out.println(str1);
        System.out.println("Enter your second string  ");
        String str2 = Scan.next(); 
        System.out.println(str2);
        if(str1==str2)
        {
        	System.out.println("Both Strings Are Equal");
        }
        else
        {
         	System.out.println("Both Strings Are Not Equal");
        }
		
		
		

	}

}



