class Test{
	public static void main (String[] args){

		Oppgaveoversikt T = new Oppgaveoversikt(4);

		T.nyStud("a",3);
		T.nyStud("b",5);
		T.nyStud("c",7);
		System.out.println(T.toString());

		System.out.println(T.finnAntStud());

		System.out.println(T.finnAntOppgForStud("a"));

		System.out.println(T.okOppgForStud("a", 5));
		System.out.println(T.finnAntOppgForStud("a"));
	}
}

