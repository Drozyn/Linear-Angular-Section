package section;

import javax.swing.JFrame;

public class okno_wciecie_katowe extends JFrame{
	public okno_wciecie_katowe() {
		super("Wciêcie k¹towe");
	
PanelWciecieKatowe panel_z_przyciskami = new PanelWciecieKatowe();
add(panel_z_przyciskami);
setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
pack();
setVisible(true);
	}
}
