import static javax.swing.JOptionPane.*;
class TommerTilCentimeter {
	public static void main (String [] args) {
		String tommerLest = showInputDialog("Tommer");
		double tommer = Double.parseDouble(tommerLest);
		double centimeter = tommer*2.54;
		String utskrift = tommer + " tommer er lik " + centimeter + "cm";
		showMessageDialog(null,utskrift);
	}
}