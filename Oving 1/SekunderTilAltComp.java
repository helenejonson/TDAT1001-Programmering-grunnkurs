import static javax.swing.JOptionPane.*;
class SekunderTilAltComp {
	public static void main(String [] args) {
			String totalLest = showInputDialog("Totale sekunder");
			int totSek = Integer.parseInt(totalLest);

			int timer = totSek/3600;
			int minutter =(totSek - timer*3600) / 60;
			int sekunder =(totSek - timer*3600 - minutter*60);
			System.out.println("Det blir " + timer + " timer," + minutter + " minutter og " + sekunder + " sekunder");
		}
}