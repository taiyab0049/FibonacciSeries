import java.util.Scanner;
	public class FibonacciSeries{
		public static void main(String[] args){
			int count, num1 = 0, num2 = 1;
			System.out.println("How many numbers do you want to print in Fabinacci series");
			Scanner scan = new Scanner(System.in);
			count = scan.nextInt();
			System.out.print("here is your \"Fabinacci Series\" :");
			int i = 1;
			while(i<=count){
				System.out.print(num1+" ");
				int sumOfPrevTwo = num1 + num2 ;
				num1 = num2 ;
				num2 = sumOfPrevTwo;
				i++;
			}
		}
	}