class Student{
	private String navn;
	private int antOppg;

	public Student(String navn, int antOppg){
		this.navn = navn;
		this.antOppg = antOppg;
	}

	public String getNavn(){
		return navn;
	}

	public int getAntOppg(){
		return antOppg;
	}

	public void okAntOppg(int okning){
		antOppg = antOppg + okning;
	}

	public String toString(){
		return "Studenten " + navn + " har l�st " + antOppg + " oppgaver.";
	}
}