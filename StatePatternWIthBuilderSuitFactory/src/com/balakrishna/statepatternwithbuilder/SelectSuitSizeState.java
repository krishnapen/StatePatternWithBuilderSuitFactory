package com.balakrishna.statepatternwithbuilder;

public class SelectSuitSizeState implements StateInterface {
	
//	private int size;
//    private String color;
//    private double deliveryAddress;

	SuitFactory suitFactory;
	
	public SelectSuitSizeState(SuitFactory suitFactory) {
		this.suitFactory = suitFactory;
	}
	
	@Override
	public void selectSuitSize(int size) {

		if(size > 0) {
		System.out.println("You selected the Size : " + size);
		} else {
			System.out.println("You can't select color until suit size is selected");
			System.out.println("You can't select delivery address until suit size & color is selected");
			System.out.println("You can't place order until suit size & color is selected");
			System.out.println("You can't track delivery until suit order is placed");
		}

	}

	@Override
	public void selectSuitColor(String color) {

		System.out.println("You can't select color until suit size is selected");

	}

	@Override
	public void selectSuitDeliveryAddress(String deliveryAddress) {
		System.out.println("You can't select delivery address until suit size & color is selected");

	}

	@Override
	public void placeSuitOrder() {
		System.out.println("You can't place order until suit size & color is selected");

	}

	@Override
	public void trackSuitdelivery(int size, String color, String deliveryAddress) {
		System.out.println("You can't track delivery until suit order is placed");

	}

}
