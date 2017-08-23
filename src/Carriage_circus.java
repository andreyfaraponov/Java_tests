
public class Carriage_circus 
{
	public static void main(String[] args) {
		long last_min = System.currentTimeMillis();
		long cur_raz;
		while (true)
		{
			cur_raz = System.currentTimeMillis() - last_min;
			//System.out.print('\b');
			if (cur_raz >= 500 && cur_raz < 600)
				System.out.print('|');
			if (cur_raz >= 1000 && cur_raz < 1100)
				System.out.print('/');
			if (cur_raz >= 1500 && cur_raz < 1600)
				System.out.print('-');
			if (cur_raz >= 2000 && cur_raz < 2100)
				System.out.print('\\');
			if (cur_raz >= 2500)
				last_min = System.currentTimeMillis();
			System.out.print('\b');
		}
	}
}
