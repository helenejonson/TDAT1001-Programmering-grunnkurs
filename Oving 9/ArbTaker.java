class ArbTaker{
	private Person person;
	private double månedslønn;
	private double skattepros;
	private int ansattnr;
	private int ansår;

	public ArbTaker(Person person, double månedslønn, double skattepros, int ansattnr, int ansår){
		String fornavn = person.getFornavn();
		String etternavn = person.getEtternavn();
		int fødselsår = person.getFødselsår();
		this.person = new Person(fornavn, etternavn, fødselsår);
		this.månedslønn = månedslønn;
		this.skattepros = skattepros;
		this.ansattnr = ansattnr;
		this.ansår = ansår;
	}

	public Person getPersonilla(){
		return new Person(person.getFornavn(), person.getEtternavn(), person.getFødselsår());
	}

	public void setPerson(Person person){
			String nyttFornavn = person.getFornavn();
			String nyttEtternavn = person.getEtternavn();
			int nyFødselår = person.getFødselsår();
	}

	public double getMånedslønn(){
		return månedslønn;
	}

	public void setMånedslønn(double månedslønn){
		this.månedslønn = månedslønn;
	}

	public void setSkattePros(double skattepros){
			this.skattepros = skattepros;
	}

	public double getSkattepros(){
		return skattepros;
	}

	public int getAnsår(){
		return ansår;
	}

	public double brutoLønn(){
		double månedLønn = getMånedslønn();
		double bruto = månedLønn * 12;
		return bruto;
	}

	public double skatteTrekkMåned(){
		double månedLønn = getMånedslønn();
		double skattePros = getSkattepros();
		double skatteTrekk = månedLønn * skattePros / 100;
		return skatteTrekk;
	}

	public double skatteTrekkÅr(){
		double månedLønn = getMånedslønn();
		double skattePros = getSkattepros();
		double måned = 0;
		double lønn = 0;
		for(int i = 0; i < 12; i++){
			if(i==5){
				måned = 0;
			}
			 else if (i==11){
				måned = månedLønn * ((skattePros / 100)/2);
			}else{
				måned = månedLønn * skattePros / 100;
			}
			lønn = lønn + måned;
		}
		return lønn;
	}

	public String navn(){
		String fornavn = person.getFornavn();
		String etternavn = person.getEtternavn();
		return etternavn + " " + fornavn;
	}

	public int årIBedrift(){
		java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
		int år = kalender.get(java.util.Calendar.YEAR);
		int ansattÅr = getAnsår();
		int totÅr = år - ansattÅr;
		return totÅr;
	}

	public String merEnXår(int år){
		int totÅr = årIBedrift();
		String antÅrBedrift;
		if(totÅr < år){
			antÅrBedrift = "Ja, de har vært ansatt i ";
		}else{
			antÅrBedrift = "Nei, de har vært ansatt i ";
		}
		return antÅrBedrift + totÅr;
	}

	public int alder(){
		java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
		int år = kalender.get(java.util.Calendar.YEAR);
		int født = person.getFødselsår();
		int alder = år - født;
		return alder;
	}


}
