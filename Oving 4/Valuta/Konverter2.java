import static javax.swing.JOptionPane.*;
class Konverter {
	public static void main (String[] args){
		String valutanavnLest = showInputDialog("1 = Dollar \n" + "2 = Euro \n" + "3 = Svenske kroner \n" + "4 = Avbryt");
		int valuta = Integer.parseInt (valutanavnLest);

		String startLest = showInputDialog("fra Nok\n" + "til Nok");
		int start = Integer.parseInt (startLest);

		String belopLest = showInputDialog("Beløp:");
		Double belop = Double.parseDouble (belopLest);


	}
}


