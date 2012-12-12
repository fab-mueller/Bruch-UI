package org.itsmind.fab.bruchui;

import java.util.ArrayList;

import org.itsmind.fab.bruchui.gui.BruchWindow;

public class Main {

	
	private static ArrayList<BruchWindow> windows = new ArrayList<BruchWindow>(); 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*while(true){
		windows.add(new BruchWindow());
		new Thread(windows.get(windows.toArray().length-1));
		}*/
		new BruchWindow();
	}

}
