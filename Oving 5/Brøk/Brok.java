class Brok{

	private int teller;
	private int nevner;

	public Brok(int teller, int nevner){
		this.teller = teller;
		this.nevner = nevner;
		if(nevner==0){
			throw new IllegalArgumentException("Nevner kan ikke være 0");
		}
	}

	public Brok(int teller){
		this.teller = teller;
		this.nevner = 1;
	}

	public int getTeller(){
		return teller;
	}

	public int getNevner(){
		return nevner;
	}

	public void adder(Brok testEn){
		int fellesnevner = nevner*testEn.getNevner();
		int tellerA = teller*testEn.getNevner();
		int tellerB = testEn.getTeller()*nevner;
		int sumTeller = tellerA + tellerB;

		this.teller = sumTeller;
		this.nevner = fellesnevner;


	}

	public void sub(Brok testEn){
			int fellesnevner = nevner*testEn.getNevner();
			int tellerA = teller*testEn.getNevner();
			int tellerB = testEn.getTeller()*nevner;
			int sumTeller = tellerA - tellerB;

			this.teller = sumTeller;
			this.nevner = fellesnevner;

	}

	public void gang(Brok testEn){
		int fellesnevner = nevner*testEn.getNevner();
		int sumTeller = teller*testEn.getTeller();

		this.teller = sumTeller;
		this.nevner = fellesnevner;
	}

	public void del(Brok testEn){
		int fellesnevner = nevner*testEn.getTeller();
		int sumTeller = teller*testEn.getNevner();

		this.teller = sumTeller;
		this.nevner = fellesnevner;
	}

	public String toString(){
		return teller + "/" + nevner;
	}


	public static void main(String[] args){

		Brok testEn = new Brok (2,3);
		Brok testTo = new Brok (1,3);

		testEn.adder(testTo);
		System.out.println(testEn);

		testEn.sub(testTo);
		System.out.println(testEn);

		testEn.gang(testTo);
		System.out.println(testEn);

		testEn.del(testTo);
		System.out.println(testEn);
	}

}

