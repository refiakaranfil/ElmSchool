package section1_2;

public class Variables2 {
	
public static void main(String [] args) {
		
		int num1 = 5;
		int num2 = 10;
		int temp = num1;
		num1 = num2;

		System.out.print(num2 + temp + ", ");
		System.out.print(num1 + num2 + ", ");
		System.out.println(num1 + temp);
	}

}
