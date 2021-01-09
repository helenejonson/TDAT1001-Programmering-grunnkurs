import static javax.swing.JOptionPane.*;
class Konverter {
	public static void main (String[] args){
		String valutanavnLest = showInputDialog("1. Dollar \n" + "2. Euro \n" + "3. Svenske kroner \n" + "4. Avbryt");
		int valuta = Integer.parseInt (valutanavnLest);
		String tall = valutanavnLest;

		switch (tall){
			case "1":
			{
				String startLest = showInputDialog("1 = NOK til Dollar \n" + "2 = Dollar til NOK");
				int start = Integer.parseInt (startLest);
				String belopLest = showInputDialog("Beløp:");
				Double belop = Double.parseDouble (belopLest);
				if (start == 1){
					Valuta nokValuta = new Valuta (0.118, "Dollar", 0);

					nokValuta.utforRegning(belop);
					double ny = nokValuta.getSum();

					System.out.println(belop + " NOK = " + ny + " Dollar");
				}if (start == 2){
					Valuta dolValuta = new Valuta (8.451, "NOK", 0);

					dolValuta.utforRegning(belop);
					double ny = dolValuta.getSum();

					System.out.println(belop + " Dollar = " + ny + " NOK");
				}
				break;
			}
			case "2":
			{
				String startLest = showInputDialog("1 = NOK til Euro \n" + "2 =  Euro til NOK");
				int start = Integer.parseInt (startLest);
				String belopLest = showInputDialog("Beløp:");
				Double belop = Double.parseDouble (belopLest);

				if (start == 1){
					Valuta nokValuta = new Valuta (0.102, "Euro", 0);

					nokValuta.utforRegning(belop);
					double ny = nokValuta.getSum();

					System.out.println(belop + " NOK = " + ny + " Euro");
				}
				if (start == 2){
					Valuta euValuta = new Valuta (9.779, "NOK", 0);

					euValuta.utforRegning(belop);
					double ny = euValuta.getSum();

					System.out.println(belop + " Euro = " + ny + " NOK");
				}
				break;
			}
			case "3":
			{
				String startLest = showInputDialog("1 = NOK til SEK \n" + "2 =  SEK til NOK");
				int start = Integer.parseInt (startLest);
				String belopLest = showInputDialog("Beløp:");
				Double belop = Double.parseDouble (belopLest);

				if (start == 1){
					Valuta nokValuta = new Valuta (1.072, "SEK", 0);

					nokValuta.utforRegning(belop);
					double ny = nokValuta.getSum();

					System.out.println(belop + " NOK = " + ny + " SEK");
				}
				if (start == 2){
					Valuta sekValuta = new Valuta (0.933, "NOK", 0);

					sekValuta.utforRegning(belop);
					double ny = sekValuta.getSum();

					System.out.println(belop + " SEK = " + ny + " NOK");
				}
				break;
			}
			case "4":
			break;
		}
	}
}

