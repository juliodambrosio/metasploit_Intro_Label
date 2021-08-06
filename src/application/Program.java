package application;
import java.util.concurrent.TimeUnit;

import Exception.metaException;
import UI.UI;

public class Program {

	public static void main(String[] args)  {

		executarMetasploit();
	}
	
	public static void executarMetasploit() {
		String icon = "[*]";
		String metasploit = "starting the metasploit framework console";
		char giro[] = new char[]{
				'\\', '|', '/', '-',
				'\\', '|', '/', '-',
				'\\', '|', '/', '-',
				'\\', '|', '/', '-',
				'\\', '|', '/', '-',
				'\\', '|', '/', '-',
				'\\', '|', '/', '-',
				'\\', '|', '/', '-',
				'\\', '|', '/', '-',
				'\\', '|', '/', '-',
				'\\', '|', '/', '-',
				'|','-'};
		//List<Character> list = Arrays.asList('\\', '|', '/', '-');
		String cont = "";

		do {
			try {
				for (int i = 0; i < metasploit.length(); i++) {
					
					System.out.println(icon + cont + UI.toUpper(metasploit.charAt(i))
					+ metasploit.substring(i + 1, metasploit.length()) + "..." + giro[i]);
					
					// TimeUnit.SECONDS.sleep(1);
					TimeUnit.MILLISECONDS.sleep(150);
					UI.clearScreen();

					
					cont += metasploit.charAt(i);

				}
			}
			catch(InterruptedException e) {
				throw new metaException("Erro: " + e.getMessage());
			}
			cont = "";
			
		} while (true);

	}
	
}
