package com.balakrishna.statepatternwithbuilder;

public class SelectSuitDeliveryAddressState implements StateInterface {
	
SuitFactory suitFactory;
	
	public SelectSuitDeliveryAddressState(SuitFactory suitFactory) {
		this.suitFactory = suitFactory;
	}
	
	@Override
	public void selectSuitSize(int size) {

		System.out.println("You already selected the Size");

	}

	@Override
	public void selectSuitColor(String color) {

		System.out.println("You already selected the suit color");

	}

	@Override
	public void selectSuitDeliveryAddress(String deliveryAddress) {
		if(deliveryAddress != null) {
		System.out.println("You selected Delivery Address : " + deliveryAddress);
		} else {
			System.out.println("You can't place order until delivery address is selected");
			System.out.println("You can't track delivery until suit order is placed");
		}

	}

	@Override
	public void placeSuitOrder() {
		System.out.println("No Order Placed");

	}

	@Override
	public void trackSuitdelivery(int size, String color, String deliveryAddress) {
		System.out.println("You can't track delivery until suit order is placed");

	}


}
