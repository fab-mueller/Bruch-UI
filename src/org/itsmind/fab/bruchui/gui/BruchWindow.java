package org.itsmind.fab.bruchui.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.UIManager;

/*
buttonAdd
buttonSub
buttonMul
buttonDiv
buttonEquals
*/

public class BruchWindow extends JFrame implements ActionListener/*, Runnable*/ {

	private static ArrayList<BruchWindow> windows = new ArrayList<BruchWindow>(); 
	/**
	 * 
	 */
	private static final long serialVersionUID = 5415311018890507017L;
	
	private JButton buttonAdd = new JButton(new ImageIcon("org/itsmind/fab/bruchui/res/bruch_button.png"));
	private JButton buttonSub = new JButton(new ImageIcon("org/itsmind/fab/bruchui/res/bruch_button.png"));
	private JButton buttonMul = new JButton(new ImageIcon("org/itsmind/fab/bruchui/res/bruch_button.png"));
	private JButton buttonDiv = new JButton(new ImageIcon("org/itsmind/fab/bruchui/res/bruch_button.png"));
	private JButton buttonEquals = new JButton(new ImageIcon("org/itsmind/fab/bruchui/res/bruch_button.png"));
	private Container buttons= new Container();
	private SpringLayout layout = new SpringLayout();
	
	public BruchWindow(){
		super();
//		try {
//			UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName() );
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		setAlwaysOnTop(true);
		this.setLayout(layout);
		buttonAdd.setText("+");
		buttonSub.setText("–");
		buttonMul.setText("*");
		buttonDiv.setText(":");
		buttonEquals.setText("=");
		buttonSub.setSize(71, 24);
		buttonMul.setSize(71, 24);
		buttonDiv.setSize(71, 24);
		buttonEquals.setSize(71, 24);
//		layout.putConstraint(SpringLayout.EAST, buttonAdd,5, SpringLayout.EAST, this);
//		layout.putConstraint(SpringLayout.WEST, buttonAdd, 25, SpringLayout.EAST, buttonAdd);
//		layout.putConstraint(SpringLayout.NORTH, buttonAdd, 5, SpringLayout.NORTH, this);
//		layout.putConstraint(SpringLayout.SOUTH, buttonAdd, 10, SpringLayout.NORTH, buttonAdd);
//		buttons.add(buttonAdd);
//		buttons.add(buttonSub);
//		buttons.add(buttonMul);
//		buttons.add(buttonDiv);
//		buttons.add(buttonEquals);
//		buttons.setSize(114, 200);
//		buttons.setBackground(new Color(68,68,68));
//		this.add(buttons);
		this.add(buttonAdd);
		this.setSize(300, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}

	/*@Override
	public void run() {
		while(true){
			windows.add(new BruchWindow());
			new Thread(windows.get(windows.toArray().length-1));
			Math.random();
		}
	}*/

}
