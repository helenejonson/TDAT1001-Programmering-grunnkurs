import java.util.*;
import java.io.*;
import static javax.swing.JOptionPane.*;
class Konto{
	public static void main(String[] args)throws IOException{
		Meny meny = new Meny();

		int valg = meny.lesValg();
		while(valg >= 0){
			meny.utforOppg(valg);
			valg = meny.lesValg();
		}

	}
}

class Meny {
	private final String[] VALG = {"Vis saldo","Vis tidligere transaksjoner", "Utfør transaksjon", "Avslutt"};
	private final int VIS_SALDO = 0;
	private final int VIS_TRANSAKSJONER = 1;
	private final int UTFOR_TRANSAKJSON = 2;
	private final int AVSLUTT = 3;



	public int lesValg()throws IOException{
		int valg = showOptionDialog(null, "Oppgaver", "Meny", DEFAULT_OPTION, PLAIN_MESSAGE, null, VALG, VALG[0]);
		if(valg == AVSLUTT){
			valg = -1;
		}
		return valg;
	}

	public void utforOppg(int valg)throws IOException{
		switch(valg){
			case VIS_SALDO:
				getSaldo();
				break;
			case VIS_TRANSAKSJONER:
				getTransaksjoner();
				break;
			case UTFOR_TRANSAKJSON:
				utforTransaksjon();
				break;
			default:
			break;
		}
	}

	public void getSaldo()throws IOException{
		String filnavn1 = "Saldo.txt";
		FileReader saldoLes = new FileReader(filnavn1);
		BufferedReader leser = new BufferedReader(saldoLes);
		String saldo = leser.readLine();
		String tekst = "Saldo:";
		while(saldo != null){
			tekst += ("\n" + saldo);
			saldo = leser.readLine();
		}
		leser.close();
		showMessageDialog(null, tekst);
	}

	public void getTransaksjoner()throws IOException{
		String filnavn2 = "Transaksjon.txt";
		FileReader transaksjonLes = new FileReader(filnavn2);
		BufferedReader les = new BufferedReader(transaksjonLes);
		String transaksjon = les.readLine();
		String tekst = "Tidligere transaksjoner:";
		while (transaksjon != null){
			tekst += ("\n" + transaksjon);
			transaksjon = les.readLine();
		}
		les.close();
		showMessageDialog(null, tekst);
	}

	public void utforTransaksjon()throws IOException{
		String filnavn1 = "Saldo.txt";
		String filnavn2 = "Transaksjon.txt";
		FileReader saldoLes = new FileReader(filnavn1);
		BufferedReader sLeser = new BufferedReader(saldoLes);
		FileReader transLes = new FileReader(filnavn2);
		BufferedReader tLeser = new BufferedReader(transLes);
		Scanner scan = new Scanner(sLeser);
		double nySaldo = 0;
		String transakLes = showInputDialog("Utfør transaksjon");
		double transak = Double.parseDouble(transakLes);
		double saldo = scan;
		nySaldo = saldo + transak;
	}
}

