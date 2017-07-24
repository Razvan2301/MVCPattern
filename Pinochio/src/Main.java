
public class Main {
	public static void main (String [] args){
		Reader reader = new Reader() ; 
		System.out.println(reader.getNas()  + "  "  + reader.getTotalDays());
		Solver solver = new Solver(reader.getNas(), reader.getTotalDays());
		Writer Writer = new Writer(solver.getNas());
		
	}
}
