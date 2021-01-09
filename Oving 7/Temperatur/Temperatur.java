class Temperatur{
	final private String navn;
	private int[][] Temp;

	public Temperatur(String navn, int dag, int time){
		this.navn = navn;
		this.Temp = new int[dag][time];
	}

	public String getNavn(){
		return navn;
	}

	//antall dager
	public int finnAntDager(){
		return Temp.length;
	}
	// antall timer
	public int finnTime(){
		return (Temp.length > 0) ? Temp[0].length : -1;
	}

	public boolean setTemp(int dagnr, int timenr, int nyTemp){
		if(gyldigeIndekser(dagnr, timenr)){
			Temp[dagnr][timenr]=nyTemp;
			return true;
		}else{
			return false;
		}
	}

	public int finnTempSpesDagTid(int dagnr, int timenr){
		return (gyldigeIndekser(dagnr,timenr)) ? Temp[dagnr][timenr]: -1;
	}

	public double[] finnTempHelDag(){
		double[] dagTabell = new double[finnAntDager()];
		for(int j = 0; j < dagTabell.length; j++){
			double sum = 0;
			double teller = 0;
			for(int i = 0; i < finnTime(); i++){
				sum = sum + Temp[j][i];
				teller++;
			}
			double gjen = sum/teller;
			dagTabell[j] = gjen;
		}
		return dagTabell;
	}

	public double[] finnTempEnSpesTime(){
		double[] timeTabell = new double[finnTime()];
		for(int j = 0; j < timeTabell.length; j++){
			double sum = 0;
			double teller = 0;
			for(int i = 0; i < finnAntDager(); i++){
				sum += Temp[i][j];
				teller++;
			}
			double gjen = sum/teller;
			timeTabell[j] = gjen;
		}
		return timeTabell;
	}


	public double finnTotalenIHeleDriten(){
		double sum = 0;
		int teller = 0;
		for(int d = 0; d < finnAntDager(); d++){
			for(int t = 0; t < finnTime(); t++){
				sum += Temp[d][t];
				teller++;
			}
		}
		double gjen = sum/teller;
		return gjen;
	}




	public int[] tellAntallAvSpesiell(){
		int[] nyTabell = new int[5];
		for(int d = 0; d < finnAntDager(); d++){
			for(int t = 0; t < finnTime(); t++){
				double tall = Temp[d][t];
				if(tall < -5){
					nyTabell[0] ++;
				}else if(tall >= -5 && tall <= 0){
					nyTabell[1] ++;
				}else if(tall <= 5 && tall >= 0){
					nyTabell[2] ++;
				}else if(tall >= 5 && tall <= 10){
					nyTabell[3] ++;
				}else if(tall > 10){
					nyTabell[4] ++;
				}
			}//for
		}//for
		return nyTabell;
	}


	private boolean gyldigDagnr(int dagnr){
		return (dagnr>= 0 && dagnr < finnAntDager());
	}

	private boolean gyldigTime(int timenr){
		return (timenr>= 0 && timenr < finnTime());
	}

	private boolean gyldigeIndekser(int dagnr, int timenr){
		return (gyldigDagnr(dagnr) && gyldigTime(timenr));
	}


// start klientprogram
	public static void main(String[] args){

		Temperatur test = new Temperatur ("Temperatur",3,3);
		test.setTemp(0,0,5);
		test.setTemp(0,1,3);
		test.setTemp(0,2,2);

		test.setTemp(1,0,1);
		test.setTemp(1,1,2);
		test.setTemp(1,2,3);

		test.setTemp(2,0,6);
		test.setTemp(2,1,7);
		test.setTemp(2,2,8);

		double[] dagTabell = test.finnTempHelDag();
		for (int d = 0; d < test.finnAntDager(); d++){
			System.out.println("Middentemperatur for dag " + (d+1) + " i månenden er " + dagTabell[d]);
		}

		double[] timeTabell = test.finnTempEnSpesTime();
		for (int t = 0; t < test.finnTime(); t++){
				System.out.println("Middeltemperatur for time " + (t+1) + " er " + timeTabell[t]);
			}

		System.out.println("Middeltemperatur for hele måneden er " + test.finnTotalenIHeleDriten());

		int[] tabellTall = test.tellAntallAvSpesiell();
		System.out.println("Det er " + tabellTall[0] + " ganger temperaturen er under -5");
		System.out.println("Det er " + tabellTall[1] + " ganger temperaturen er mellom -5 og 0");
		System.out.println("Det er " + tabellTall[2] + " ganger temperaturen er mellom 5 og 0");
		System.out.println("Det er " + tabellTall[3] + " ganger temperaturen er mellom 5 og 10");
		System.out.println("Det er " + tabellTall[4] + " ganger temperaturen er over 10");

	}
}


