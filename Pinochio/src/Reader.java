import java.util.Scanner;

public class Reader {

	private int nas ; 
	private int totalDays ; 
	
	public void setNas(int nas) {
		this.nas = nas;
	}
	public int getNas() {
		return nas;
	}
	public void setTotalDays(int totalDays) {
		this.totalDays = totalDays;
	}
	public int getTotalDays() {
		return totalDays;
	}
	
	private void readData() { 
		Scanner scanner = new Scanner(System.in); 
		setNas(scanner.nextInt());
		setTotalDays(scanner.nextInt());
	}
	
	public Reader() { 
		readData();
	}
	
	public Reader(int nas , int totalDays){
		setNas(nas);
		setTotalDays(totalDays);
	}
}
