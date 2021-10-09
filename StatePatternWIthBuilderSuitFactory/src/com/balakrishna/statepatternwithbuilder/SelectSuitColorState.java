package com.balakrishna.statepatternwithbuilder;

public class SelectSuitColorState implements StateInterface{
	
	SuitFactory suitFactory;
	
	public SelectSuitColorState(SuitFactory suitFactory) {
		this.suitFactory = suitFactory;
	}
	
	@Override
	public void selectSuitSize(int size) {

		System.out.println("You already selected the Size");

	}

	@Override
	public void selectSuitColor(String color) {
		if(color != null) {
		System.out.println("You selected the suit color : " + color);
		} else {
			System.out.println("you can't select delivery address until Color Selected");
			System.out.println("You can't place order until delivery address is selected");
			System.out.println("You can't track delivery until suit order is placed");
		}

	}

	@Override
	public void selectSuitDeliveryAddress(String deliveryAddress) {
		System.out.println("No Delivery Address Selected");

	}

	@Override
	public void placeSuitOrder() {
		System.out.println("You can't place order until delivery address is selected");

	}

	@Override
	public void trackSuitdelivery(int size, String color, String deliveryAddress) {
		System.out.println("You can't track delivery until suit order is placed");

	}

}
