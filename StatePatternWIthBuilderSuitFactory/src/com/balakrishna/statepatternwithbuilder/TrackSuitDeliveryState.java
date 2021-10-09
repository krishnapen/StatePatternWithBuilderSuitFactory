package com.balakrishna.statepatternwithbuilder;

public class TrackSuitDeliveryState implements StateInterface {

	private String deliveryAddress;
	
	SuitFactory suitFactory;

	public TrackSuitDeliveryState(SuitFactory suitFactory) {
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
		System.out.println("You selected Delivery Address");

	}

	@Override
	public void placeSuitOrder() {
		System.out.println("Your Order Placed");

	}

	@Override
	public void trackSuitdelivery(int size, String color, String deliveryAddress) {
		System.out.println("You delivery is on the way for suit : " + "size : " + size + " color : " + color  );

	}
	
	//Method to change the existing Values
	public TrackSuitDeliveryState changeDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
		return this;
	}

	public TrackDeliveryBuilder build() {
		return new TrackDeliveryBuilder(0, null,this.deliveryAddress);

	}
}
