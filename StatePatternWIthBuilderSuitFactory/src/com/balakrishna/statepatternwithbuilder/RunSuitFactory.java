package com.balakrishna.statepatternwithbuilder;

public class RunSuitFactory {
	
	public static void main(String[] args) {
		
		SuitFactory suitFactory = new SuitFactory();
		
		System.out.println(suitFactory);
		
		//Negative Case wihtout size
		suitFactory.selectSuitSize(0);
		suitFactory.selectSuitColor("red");
		suitFactory.selectSuitDeliveryAddress("2361, Chicago");
		suitFactory.placeSuitOrder();
		suitFactory.trackSuitdelivery();
		System.out.printf("%n");
		
		System.out.println(suitFactory);
		
		//Negative Case wihtout color
		suitFactory.selectSuitSize(44);
		suitFactory.selectSuitColor(null);
		suitFactory.selectSuitDeliveryAddress("2361, Chicago");
		suitFactory.placeSuitOrder();
		suitFactory.trackSuitdelivery();
		System.out.printf("%n");
		
		System.out.println(suitFactory);
		
		//Negative Case wihtout addresss
		suitFactory.selectSuitSize(44);
		suitFactory.selectSuitColor("red");
		suitFactory.selectSuitDeliveryAddress(null);
		suitFactory.placeSuitOrder();
		suitFactory.trackSuitdelivery();
		System.out.printf("%n");
		
		System.out.println(suitFactory);
		
		//Positve Case
		suitFactory.selectSuitSize(44);
		suitFactory.selectSuitColor("Red");
		suitFactory.selectSuitDeliveryAddress("2361, Chicago");
		suitFactory.placeSuitOrder();
		suitFactory.trackSuitdelivery();
		System.out.printf("%n");
		
		//With Builder change delivery address
		TrackDeliveryBuilder trackDeliveryBuilder = new TrackSuitDeliveryState(suitFactory).changeDeliveryAddress("2361 naperville").build();
		System.out.println(trackDeliveryBuilder);
		
		
	}

}
