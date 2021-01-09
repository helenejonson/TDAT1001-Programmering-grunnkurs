import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Vindu extends JFrame{
	public Vindu(String tittel){
		setTitle(tittel);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Tegning tegningen = new Tegning();
		add(tegningen);
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
		//tegneflate.setColor(Color.pink);
		//tegneflate.fillArc(150,135,30,100, -163, 164);

	}
}


class Smiley{
	public static void main(String[] args){
		Vindu etVindu = new Vindu("Smiley");
		etVindu.setVisible(true);
	}
}


