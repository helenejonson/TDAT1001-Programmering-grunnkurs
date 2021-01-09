import javax.swing.*;
import java.awt.*;

public class SmileyApplet extends JApplet{
	public void init(){
		add(new Tegning());
	}
}
class Tegning extends JPanel{
	public void paintComponent(Graphics tegneflate){
		super.paintComponent(tegneflate);
		setBackground(Color.WHITE);

		tegneflate.setColor(Color.black);
		tegneflate.drawOval(49,29,202,202);
		tegneflate.setColor(Color.yellow);
		tegneflate.fillOval(50,30,200,200);
		tegneflate.setColor(Color.black);
		tegneflate.fillOval(105,100,20,20);
		tegneflate.fillOval(180,110,20,5);
		tegneflate.drawArc(100,50,100,150, -165, 150);
	}
}