package text;

import java.util.List;

public class Printer {

	public static void printOptions(List<Option> listOptions) {
		for (int i = 0; i < listOptions.size(); i++) {
			System.out.println(listOptions.get(i).getId() + " - " + listOptions.get(i).getText());
		}
	}
	
}
