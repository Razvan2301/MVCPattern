
public class Writer {
	int result ; 
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	private void showMessage() { 
		System.out.println("Nasul dupa toate zilele este:  " + getResult());
	}
	
	Writer(int result) { 
		setResult(result);
		showMessage(); 
	}
}
