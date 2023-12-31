package singletonPattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Driver {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2) ; 
		
		executor.execute(() -> TvSet.getTvInstance());
		executor.execute(() -> TvSet.getTvInstance());
		
//		TvSet tvInstance = TvSet.getTvInstance() ; 
//		System.out.println(tvInstance); 
//		TvSet tvInstance2 = TvSet.getTvInstance() ; 
//		System.out.println(tvInstance2); 
	}

}
