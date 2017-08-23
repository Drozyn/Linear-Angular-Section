package section;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelOknaGlownego extends JPanel implements ActionListener{
	public static final int HEIGHT = 200;
	public static final int WIDTH = 300;
	private JButton Button1;
	private JButton Button2;
	
	private JLabel Label;
	
	public PanelOknaGlownego() {
		Label = new JLabel("Wybierz zadanie obliczeniowe");
		Button1 = new JButton("Wciêcie k¹towe");
		Button2 = new JButton("Wciêcie liniowe");

		
		
		Button1.addActionListener(this);
		Button2.addActionListener(this);
		
		
		setLayout(new FlowLayout());
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		add(Label);
		add(Button1);
		add(Button2);

		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();
		
		if(source == Button1) {
			new okno_wciecie_katowe();
			
		}
		if(source == Button2) {
			new okno_wciecie_liniowe();
			
		}
	}
	

}

