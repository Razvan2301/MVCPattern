package service;

public class NumberService {
	
	public int[] formatData ( int [] data){ 
		for (int i = 0; i < data.length; i++) {
			data[i] = i ;
		}
		return data;
	}

}
