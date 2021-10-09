package com.balakrishna.statepatternwithbuilder;

public class PlaceSuitOrderState implements StateInterface {
	SuitFactory suitFactory;

	public PlaceSuitOrderState(SuitFactory suitFactory) {
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
		System.out.println("You can't track delivery until suit order is dispatched");

	}

}
