package section;
import javax.swing.JFrame;
public class main_window extends JFrame {
	public main_window() {
		super("Okno g³ówne aplikacji");
	
PanelOknaGlownego panel_z_przyciskami = new PanelOknaGlownego();
add(panel_z_przyciskami);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
pack();
setVisible(true);
	}
}
