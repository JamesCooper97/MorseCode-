import java.util.HashMap;
import java.util.Scanner;

public class MorseTextDecode {
	public void morseToText(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		String morseCode;
		String[] inputLetter;
		String[] inputWord;
		
		morseCode = (".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / "
				+ ".--. .-. --- --. .-. .- -- -- . .-. / "
				+ "--. --- --- -.. / .-.. ..- -.-. -.- / "
				+ "--- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / "
				+ "- --- -.. .- -.--");
		
		for(Letter k : Letter.values()) {
			map.put(k.getMorseLetter(), k.toString());
		}
		
		inputWord = morseCode.split(" / ");
		for (String i : inputWord) {
			inputLetter = i.split(" ");
			for (String j : inputLetter) {
				System.out.print(map.get(j));
			}
			System.out.print(" ");
		}
		
		for(Letter k : Letter.values()) {
			map.put(k.toString(),k.getMorseLetter());
		}
		
		Scanner m = new Scanner(System.in);
		
		String message = m.nextLine();
		
		
		inputWord = message.toUpperCase().split(" ");
		for (String i : inputWord) {
			inputLetter = i.split("");
			for (String j : inputLetter) {
				System.out.print(map.get(j) + " ");
			}
			System.out.print("/ ");
		}
	}
}
