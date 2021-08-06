package UI;

import java.io.IOException;


public class UI {
	
	
	public static void clearScreenCMD() throws InterruptedException, IOException {
		// Limpa a tela no windows, no linux e no MacOS
		//Link disponivel em: https://dicasdejava.com.br/java-como-limpar-a-tela-do-console/
		
		if (System.getProperty("os.name").contains("Windows")) {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		}

		else {
			 Runtime.getRuntime().exec("clear");
		}
	}

		    

	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
	

	public static char toUpper(char c) {
		return Character.toUpperCase(c);
	}


}
