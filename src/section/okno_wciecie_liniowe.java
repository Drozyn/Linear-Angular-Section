package section;

import javax.swing.JFrame;

public class okno_wciecie_liniowe extends JFrame{
	public okno_wciecie_liniowe() {
		super("Wciêcie liniowe");
	
PanelWciecieLiniowe panel_z_przyciskami = new PanelWciecieLiniowe();
add(panel_z_przyciskami);
setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
pack();
setVisible(true);
	}
}