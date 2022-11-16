package day1assignment;

public class sumcommandline {
	public static void main(String[] args) {
		int num1=Integer.valueOf(args[0]);
		int num2=Integer.valueOf(args[1]);
		int num3=Integer.valueOf(args[2]);
		int num4=Integer.valueOf(args[3]);
		int sum=num1+num2+num3+num4;
		System.out.println("Sum Of Commandline Arguments is:"+sum);
		
		

	}

}
