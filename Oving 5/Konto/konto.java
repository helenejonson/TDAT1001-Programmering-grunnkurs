class konto {
	private final long kontonr;
	private final String navn;
	private double saldo;

	public konto(long kontonr, String navn, double saldo){
		this.kontonr = kontonr;
		this.navn = navn;
		this.saldo = saldo;
	}
	public long getkontonr(){
		return kontonr;
	}

	public String getNavn(){
		return navn;
	}

	public double getSaldo(){
		return saldo;
	}

	public void utførTransaksjon(double belop){
		saldo += belop;
	}
}
