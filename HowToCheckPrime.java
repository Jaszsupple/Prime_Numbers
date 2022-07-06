import java.util.Scanner;

public class HowToCheckPrime {

	public static void main(String[] args) {

		Scanner userinput = new Scanner(System.in);
		System.out.println("Please input the number: ");
		int x = userinput.nextInt();
		System.out.println("The Prime Numbers are: ");


		if ( x >=2 ) {
			System.out.print("2" + " ");
		} if ( x >=3 ) {
			System.out.print("3" + " ");
		} if ( x >=5 ) {
			System.out.print("5" + " ");
		} if ( x >=7 ) {
			System.out.print("7" + " ");
		}

		for (int k = 2; k < x; k++) {
			if ((k % 2 != 0) && (k % 3 != 0) && (k % 5 != 0) && (k % 7 != 0)  ) {
				System.out.print(k + " ");
			}
		}
    
		userinput.close();
	}

}
