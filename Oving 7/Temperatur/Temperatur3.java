class Temperatur3{
	private int[][] temp;

	public Temperatur3(int antDager, int time){
		this.temp = new int[antDager][time];
	}

	public int finnAntDager(){
		System.out.println("4");
		return temp.length;
	}

	public int finnTimen(){
		return (temp.length > 0) ? temp[0].length: -1;
	}

	public int finnGjennomsnittDag(int antDager){
		int sum = 0;
		for(int i = 0; i < finnTimen(); i++){
			sum += temp[antDager][i];
		}
		return sum;
	}

	public int finnTotal(){
		int sum = 0;
		for(int d = 0; d < finnAntDager(); d++){
			for(int t = 0; t < finnTimen(); t++){
				sum += temp[d][t];
				System.out.println(sum);
			}
		}
		return sum;
	}

	public static void main(String[] args){

		Temperatur3 tempra = new Temperatur3(3,3);
		temp[][] = {{3,2,1},{1,2,3},{3,2,1}};

	}
}




