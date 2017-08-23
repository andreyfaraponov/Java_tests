import java.util.Scanner;


public class Speed_converter 
{
	public static void main(String[] args) 
	{
		Scanner sc;
		int speedKm;
		int speedM;
		sc = new Scanner(System.in);
		System.out.print("Введите скорость км/ч: ");
		speedKm = sc.nextInt();
		System.out.println("Скорость: " + ((speedKm
				* 1000)/3600) + " м/c");
		sc.close();
	}

}
