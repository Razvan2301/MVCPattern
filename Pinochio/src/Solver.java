import java.lang.reflect.Constructor;

public class Solver {

	private final int NUMBER_OF_DAYS_IN_WEEK  = 7 ; 
	private int nas ; 
	private int totalDays ; 
	
	
	public int getNas() {
		return nas;
	}
	public void setNas(int nas) {
		this.nas = nas;
	}
	public int getTotalDays() {
		return totalDays;
	}
	public void setTotalDays(int totalDays) {
		this.totalDays = totalDays;
	}
	
	private boolean isWeekend ( int day){
		if(day % NUMBER_OF_DAYS_IN_WEEK > 0 && day % NUMBER_OF_DAYS_IN_WEEK < 6)
			return true ; 
		return false; 
	}
	
	private int addToNas( ){ 
		return getNas() + 4 ;
	}
	
	private int substractFromNas() { 
		return getNas() -1 ; 
	}
	
	public Solver ( int nas , int totalDays){
		setNas(nas);
		setTotalDays(totalDays);
		solverProblem();
	}
	
	private void solverProblem ( ){ 
		for(int day = 1 ; day <= getTotalDays() ; day++ )
			if(isWeekend(day))
				setNas(substractFromNas());
			else 
				setNas(addToNas()) ; 
	}
	
		
}
