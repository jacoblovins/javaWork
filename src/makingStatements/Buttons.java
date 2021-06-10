package makingStatements;

import javax.swing.*;


public class Buttons extends JFrame{
	JPanel pnl = new JPanel();
	
	ImageIcon tick = new ImageIcon("Tick.png");
	ImageIcon cross = new ImageIcon("Cross.png");

	JButton btn = new JButton("Click Me");
	JButton tickBtn = new JButton(tick);
	JButton crossBtn = new JButton("STOP", cross);

	
	public Buttons() {
		super("Swing Window");
		setSize(500, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(pnl);
		pnl.add(btn);
		pnl.add(tickBtn);
		pnl.add(crossBtn);
		setVisible(true);
	}

	public static void main(String[] args) {
		Buttons gui = new Buttons();
		

	}

}
