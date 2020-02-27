import java.util.Scanner;

public class Gravitacija {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int visina = sc.nextInt();
		final double C = 6.674* (Math.pow(10, -11));
		final double M = 5.972* (Math.pow(10, 24));
		final double r = 6.371*(Math.pow(10, 6));
		double a = (C*M)/((r+visina)*(r+visina));
		System.out.println(a);
		System.out.println("ziga");
	}

}