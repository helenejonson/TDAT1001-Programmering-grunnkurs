class Oppgaveoversikt{

	private Student[] studenter;
	private int antStud = 0; //økes med 1 for hver ny student


	public Oppgaveoversikt(int s){
		this.studenter = new Student[s];
	}

	public void nyStud(String navn, int antOppg){
		studenter[antStud] = new Student(navn, antOppg);
		antStud++;
		}

	public int finnAntStud(){
		return antStud;
	}

	public Student finnAntOppgForStud(String navn){
		if (navn != null){
			for(int i = 0; i < antStud; i++){
				if(studenter[i].getNavn().equalsIgnoreCase(navn.trim())){
					return studenter[i];
				}
			}
		}
		return null;
	}

	public int okOppgForStud(String navn, int antOppg){
		Student stud = finnAntOppgForStud(navn);
		if(stud != null){
			stud.okAntOppg(antOppg);
			return stud.getAntOppg();
		}else{
			return -1;
		}
	}
	public String toString(){
		String resultat = "";
		for(int i = 0; i < antStud; i++){
			resultat += studenter[i].toString()+"\n";
		}
		return resultat;
	}

}
