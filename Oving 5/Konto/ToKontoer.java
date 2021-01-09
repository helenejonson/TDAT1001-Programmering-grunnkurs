
class ToKontoer {
	public static void main(String[] args){

		konto oleskonto = new konto(12345667, "Ole Olsen", 2300.50);
		konto perskonto = new konto(22345667, "Per Hansen", 5000);

		oleskonto.utførTransaksjon(-1000.0);
		perskonto.utførTransaksjon(1000.0);

		double saldoOle = oleskonto.getSaldo();
		double saldoPer = perskonto.getSaldo();
		System.out.println("Etter transaksjonen er Oles saldo lik " + saldoOle);
		System.out.println("Etter transakjsonen er Pers saldo lik " + saldoPer);
	}
}
