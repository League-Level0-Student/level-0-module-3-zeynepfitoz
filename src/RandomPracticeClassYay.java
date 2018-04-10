import java.util.Random;

public class RandomPracticeClassYay {
public static void main(String[] args) {
	Random greg= new Random();
	int num=greg.nextInt(101);
	int HI=greg.nextInt(279);
	int great=greg.nextInt((125-50)+1)+50;
	int yay=greg.nextInt((396-172)+1)+172;

	System.out.println("The numbers are " + num + " " +HI + " " +great + " " +yay);
	
}
}
