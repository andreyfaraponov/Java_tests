import java.util.Scanner;


public class file_format
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		String f_name = sc.nextLine();
		f_name = f_name.replace(' ', '.');
		System.out.println(f_name);
	}

}
