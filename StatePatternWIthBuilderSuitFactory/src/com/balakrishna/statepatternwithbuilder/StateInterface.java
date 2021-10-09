package com.balakrishna.statepatternwithbuilder;

//This interface will manage the states
public interface StateInterface {
	public void selectSuitSize(int size);

	public void selectSuitColor(String color);

	public void selectSuitDeliveryAddress(String deliveryAddress);

	public void placeSuitOrder();

	public void trackSuitdelivery(int size, String color, String deliveryAddress);
}
