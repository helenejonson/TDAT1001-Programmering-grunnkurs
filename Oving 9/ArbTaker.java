class ArbTaker{
	private Person person;
	private double m�nedsl�nn;
	private double skattepros;
	private int ansattnr;
	private int ans�r;

	public ArbTaker(Person person, double m�nedsl�nn, double skattepros, int ansattnr, int ans�r){
		String fornavn = person.getFornavn();
		String etternavn = person.getEtternavn();
		int f�dsels�r = person.getF�dsels�r();
		this.person = new Person(fornavn, etternavn, f�dsels�r);
		this.m�nedsl�nn = m�nedsl�nn;
		this.skattepros = skattepros;
		this.ansattnr = ansattnr;
		this.ans�r = ans�r;
	}

	public Person getPersonilla(){
		return new Person(person.getFornavn(), person.getEtternavn(), person.getF�dsels�r());
	}

	public void setPerson(Person person){
			String nyttFornavn = person.getFornavn();
			String nyttEtternavn = person.getEtternavn();
			int nyF�dsel�r = person.getF�dsels�r();
	}

	public double getM�nedsl�nn(){
		return m�nedsl�nn;
	}

	public void setM�nedsl�nn(double m�nedsl�nn){
		this.m�nedsl�nn = m�nedsl�nn;
	}

	public void setSkattePros(double skattepros){
			this.skattepros = skattepros;
	}

	public double getSkattepros(){
		return skattepros;
	}

	public int getAns�r(){
		return ans�r;
	}

	public double brutoL�nn(){
		double m�nedL�nn = getM�nedsl�nn();
		double bruto = m�nedL�nn * 12;
		return bruto;
	}

	public double skatteTrekkM�ned(){
		double m�nedL�nn = getM�nedsl�nn();
		double skattePros = getSkattepros();
		double skatteTrekk = m�nedL�nn * skattePros / 100;
		return skatteTrekk;
	}

	public double skatteTrekk�r(){
		double m�nedL�nn = getM�nedsl�nn();
		double skattePros = getSkattepros();
		double m�ned = 0;
		double l�nn = 0;
		for(int i = 0; i < 12; i++){
			if(i==5){
				m�ned = 0;
			}
			 else if (i==11){
				m�ned = m�nedL�nn * ((skattePros / 100)/2);
			}else{
				m�ned = m�nedL�nn * skattePros / 100;
			}
			l�nn = l�nn + m�ned;
		}
		return l�nn;
	}

	public String navn(){
		String fornavn = person.getFornavn();
		String etternavn = person.getEtternavn();
		return etternavn + " " + fornavn;
	}

	public int �rIBedrift(){
		java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
		int �r = kalender.get(java.util.Calendar.YEAR);
		int ansatt�r = getAns�r();
		int tot�r = �r - ansatt�r;
		return tot�r;
	}

	public String merEnX�r(int �r){
		int tot�r = �rIBedrift();
		String ant�rBedrift;
		if(tot�r < �r){
			ant�rBedrift = "Ja, de har v�rt ansatt i ";
		}else{
			ant�rBedrift = "Nei, de har v�rt ansatt i ";
		}
		return ant�rBedrift + tot�r;
	}

	public int alder(){
		java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
		int �r = kalender.get(java.util.Calendar.YEAR);
		int f�dt = person.getF�dsels�r();
		int alder = �r - f�dt;
		return alder;
	}


}
