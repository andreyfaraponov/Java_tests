import java.util.ArrayList;
import java.util.Scanner;

public class text_surfer {
	public static void main(String[] args) 
	{
		int i;
		String text;
		Scanner scanner;
		ArrayList<Integer> list_A;
		ArrayList<Integer> list_a;
		ArrayList<Integer> list_literals;
		ArrayList<Integer> list_not_lit;

		list_A = new ArrayList<Integer>();
		list_a = new ArrayList<Integer>();
		list_literals = new ArrayList<Integer>();
		list_not_lit = new ArrayList<Integer>();
		i = 0;
		scanner = new Scanner(System.in);
		putstr("Введите текст который необходимо просмотреть:");
		text = scanner.nextLine();
		System.out.println(text.length());
		while (i < text.length())
		{
			if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z')
				list_A.add(i);
			if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z')
				list_a.add(i);
			if ((text.charAt(i) >= 'a' && text.charAt(i) <= 'z') ||
					(text.charAt(i) >= 'A' && text.charAt(i) <= 'Z'))
				list_literals.add(i);
			if (!(text.charAt(i) >= 'a' && text.charAt(i) <= 'z') ||
					!(text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') &&
					!(text.charAt(i) > 0 && text.charAt(i) < 33 ))
				list_not_lit.add(i);
			i++;
		}
		i = 1;
		System.out.println("Список заглавных букв");
		for (Integer integer : list_A) 
		{
			System.out.println("Буква\t" + i++ + ":\t" + text.charAt(integer));
		}
		scanner.close();
	}
	private static void putstr(String str) 
	{
		System.out.println(str);
	}
}
