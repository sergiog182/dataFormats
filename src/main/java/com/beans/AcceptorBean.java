package com.beans;

import com.dataformatxml.*;

public class AcceptorBean {
	public void accept(Order order) {
		int totalOrder = 0;
		int totalItems = 0;
		for (Item item : order.getItems().getItem()) {
			int itemValue = Integer.parseInt(item.getValue());
			int itemQuantity = Integer.parseInt(item.getQuantity());
			
			totalOrder = totalOrder + itemValue;
			totalItems = totalItems + itemQuantity;
		}
		order.setItemsQuantity(Integer.toString(totalItems));
		
		int total = Integer.parseInt(order.getTotal());
		if (total != totalOrder) {
			order.setTotal(Integer.toString(totalOrder));
			order.setComments("Valor ajustado: " + total);
		}
		
		if (totalOrder >= 1000000) {
			order.setAccepted("true");
		} else {
			order.setAccepted("false");
		}
	}
}
