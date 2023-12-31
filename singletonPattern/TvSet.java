package singletonPattern;

public class TvSet {
	private static volatile TvSet tvSet = null  ; 
	
	private TvSet() {
		System.out.println("Tv set instantiated !!");
	}
	
	public static TvSet getTvInstance() {
		if(tvSet == null) {
			synchronized(TvSet.class) {
				if(tvSet == null) {
					tvSet = new TvSet() ; 
				}
			}
		}
		return tvSet ; 
	}
	
}
