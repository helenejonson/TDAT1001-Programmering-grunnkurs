class Valuta {
	private final double valutakurs;
	private final String nyvalutanavn;
	private final double belop;
	private double sum;



	public Valuta(double valutakurs, String nyvalutanavn, double belop){
		this.valutakurs = valutakurs;
		this.nyvalutanavn = nyvalutanavn;
		this.belop = belop;

	}

	public double getValutakurs(){
		return valutakurs;
	}
	public String getNyvalutanavn(){
		return nyvalutanavn;
	}
	public void utforRegning(double belop){
		 sum = valutakurs * belop;
	}
	public double getSum(){
		return sum;
	}
}

