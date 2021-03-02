
import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("원하는 구구단을 입력하세요: ");
		int multiplication = s.nextInt();
		if(multiplication > 1 && multiplication < 10) {
			switch(multiplication) {
			case 2:
				System.out.println("2 * 1 = " + 2 * 1);
				System.out.println("2 * 2 = " + 2 * 2);
				System.out.println("2 * 3 = " + 2 * 3);
				System.out.println("2 * 4 = " + 2 * 4);
				System.out.println("2 * 5 = " + 2 * 5);
				System.out.println("2 * 6 = " + 2 * 6);
				System.out.println("2 * 7 = " + 2 * 7);
				System.out.println("2 * 8 = " + 2 * 8);
				System.out.println("2 * 9 = " + 2 * 9);
				break;
			case 3:
				System.out.println("3 * 1 = " + 3 * 1);
				System.out.println("3 * 2 = " + 3 * 2);
				System.out.println("3 * 3 = " + 3 * 3);
				System.out.println("3 * 4 = " + 3 * 4);
				System.out.println("3 * 5 = " + 3 * 5);
				System.out.println("3 * 6 = " + 3 * 6);
				System.out.println("3 * 7 = " + 3 * 7);
				System.out.println("3 * 8 = " + 3 * 8);
				System.out.println("3 * 9 = " + 3 * 9);
				break;
			case 4:
				for(int i = 1; i < 10; i++) {
					System.out.println("4 * " + i + " = " + 4 * i);
				}
				break;
			case 5:
				for(int i = 1; i < 10; i++) {
					System.out.println("5 * " + i + " = " + 5 * i);
				}
				break;
			case 6:
				for(int i = 1; i < 10; i++) {
					System.out.println("6 * " + i + " = " + 6 * i);
				}
				break;
			case 7:
				for(int i = 1; i < 10; i++) {
					System.out.println("7 * " + i + " = " + 7 * i);
				}
				break;
			case 8:
				for(int i = 1; i < 10; i++) {
					System.out.println("8 * " + i + " = " + 8 * i);
				}
				break;
			case 9:
				for(int i = 1; i < 10; i++) {
					System.out.println("9 * " + i + " = " + 9 * i);
				}
				break;
			}
		} else {
			System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
		}
	}
}