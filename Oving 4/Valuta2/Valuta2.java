class Valuta2 {
	private final double valutakurs;
	private String nyvalutanavn;
	private String oldvalutanavn;
	private final double belop;
	private double sum;



	public Valuta2(double valutakurs, String nyvalutanavn, String oldvalutanavn, double belop){
		this.valutakurs = valutakurs;
		this.nyvalutanavn = nyvalutanavn;
		this.oldvalutanavn = oldvalutanavn;
		this.belop = belop;

	}

	public double getValutakurs(){
		return valutakurs;
	}
	public String getNyvalutanavn(){
		return nyvalutanavn;
	}
	public String getOldvalutanavn(){
		return oldvalutanavn;
	}
	public void utforRegning(double belop){
		 sum = valutakurs * belop;
	}
	public double getSum(){
		return sum;
	}
}

