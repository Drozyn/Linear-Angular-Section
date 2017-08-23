package section;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelWciecieKatowe extends JPanel implements ActionListener{
	public static final int HEIGHT = 200;
	public static final int WIDTH = 400;
	private JButton Button1;
	private JButton Button2;
	private JTextField TextField1;
	private JTextField TextField2;
	private JTextField TextField3;
	private JTextField TextField4;
	private JTextField TextField5;
	private JTextField TextField6;
	private JTextField TextField7;
	private JTextField TextField8;
	
	private JLabel Label1;
	private JLabel Label2;
	private JLabel Label3;
	private JLabel Label4;
	private JLabel Label5;
	private JLabel Label6;
	private JLabel Label7;
	private JLabel Label8;
	private JLabel Label9;
	private JLabel Label10;
	private JLabel Label11;
	private JLabel Label12;
	private JLabel Label13;
	private JLabel Label14;
	private JLabel Label15;
	
	public PanelWciecieKatowe() {
		Label1 = new JLabel("Wprowadz dane");
		Button1 = new JButton("Oblicz");
		Label2 = new JLabel("X lewy");
		TextField1 = new JTextField("", 10);
		Label3 = new JLabel("Y lewy");
		Label3.setHorizontalAlignment(JLabel.RIGHT);
		TextField2 = new JTextField("", 10);
		Label4 = new JLabel("X prawy");
		TextField3 = new JTextField("", 10);
		Label5 = new JLabel("Y prawy");
		Label5.setHorizontalAlignment(JLabel.RIGHT);
		TextField4 = new JTextField("", 10);
		Label6 = new JLabel("K¹t lewy");
		TextField5 = new JTextField("", 10);
		Label7 = new JLabel("K¹t prawy");
		Label7.setHorizontalAlignment(JLabel.RIGHT);
		TextField6 = new JTextField("", 10);
		Label8 = new JLabel("Wyniki");
		Label9 = new JLabel("X");
		TextField7 = new JTextField("", 10);
		Label10 = new JLabel("Y");
		Label10.setHorizontalAlignment(JLabel.RIGHT);
		TextField8 = new JTextField("", 10);
		Button2 = new JButton("Zapisz");
		Label11 = new JLabel("");
		Label12 = new JLabel("");
		Label13 = new JLabel("");
		Label14 = new JLabel("");
		Label15 = new JLabel("");
		
		Button1.addActionListener(this);
		Button2.addActionListener(this);
		Button2.setEnabled(false);
		
		setLayout(new GridLayout(7,4));
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		add(Label1);
		add(Button1);
		add(Label12);
		add(Label13);
		add(Label2);
		add(TextField1);
		add(Label3);
		add(TextField2);
		add(Label4);
		add(TextField3);
		add(Label5);
		add(TextField4);
		add(Label6);
		add(TextField5);
		add(Label7);
		add(TextField6);
		add(Label8);
		add(Label11);
		add(Label14);
		add(Label15);
		add(Label9);
		add(TextField7);
		add(Label10);
		add(TextField8);	
		add(Button2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();
		
		if(source == Button1) {
			punkt punkt11 = new punkt();
			punkt punkt22 = new punkt();
			double x1 = Double.parseDouble(TextField1.getText());
			double y1 = Double.parseDouble(TextField2.getText());
			double x2 = Double.parseDouble(TextField3.getText());
			double y2 = Double.parseDouble(TextField4.getText());
			punkt11.setX(x1);
			punkt11.setY(y1);
			punkt22.setX(x2);
			punkt22.setY(y2);
			double katl = Double.parseDouble(TextField5.getText());
			double katp = Double.parseDouble(TextField6.getText());
			WciecieKatowe wciecie = new WciecieKatowe(punkt11, punkt22, katp, katl);
			Double wynikx = wciecie.getWciecie(punkt11, punkt22, katp, katl).getX();
			Double wyniky = wciecie.getWciecie(punkt11, punkt22, katp, katl).getY();
			TextField7.setText(wynikx.toString());
			TextField8.setText(wyniky.toString());
			Button2.setEnabled(true);
		}
		if (source == Button2) {
			String nazwaPliku = "raport_wciecie_katowe.txt";
			try {
				Plik.zapisPliku(nazwaPliku,0, Double.parseDouble(TextField1.getText()), Double.parseDouble(TextField2.getText()), Double.parseDouble(TextField3.getText()), Double.parseDouble(TextField4.getText()), Double.parseDouble(TextField5.getText()), Double.parseDouble(TextField6.getText()), Double.parseDouble(TextField7.getText()),Double.parseDouble(TextField8.getText()));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}
	

}

