package menus;

import java.util.ArrayList;
import java.util.List;

import text.Option;
import text.Printer;

public class MenuController {

	private static MenuController instance;

	public static synchronized MenuController getInstance() {
		if (instance == null) {
			instance = new MenuController();
		}
		return instance;
	}

	private List<Option> currentOptionList = new ArrayList<Option>();

	public void printCurrentOptions() {
		Printer.printOptions(currentOptionList);
	}

	public void receiveOptions(List<Option> optionsList) {
		currentOptionList.clear();
		currentOptionList = optionsList;
	}

}
