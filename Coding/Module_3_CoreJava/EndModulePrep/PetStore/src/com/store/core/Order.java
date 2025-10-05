//Order (orderId, petId, quantity, status)
//Status is an enum with values like (PLACED, IN_PROCESS, COMPLETED)
//Example: 
//   orderId=1, petId=101, quantity=5, status=PLACED

package com.store.core;

	public class Order extends PetEntity {
		private int orderId;
		private static int orderIdCounter;
//		private int petId;
//		private static int petIdCounter;
		private int quantity;
		private OrderStatus status;
		static {
			orderIdCounter = 1;
		}
		public Order( int petId, int quantity, OrderStatus status) {
			super(petId);
			this.orderId = orderIdCounter++;
//			this.petId = petId;
			this.quantity = quantity;
			this.status = status;
		}

	public int getOrderId() {
		return 	this.orderId;
	}

	public void setOrdertId(int orderId) {
		this.orderId =orderId;
	}
	@Override
	public int getPetId() {
		return super.getPetId() ;
	}
	@Override
	public void setPetId(int petId) {
		super.setPetId(petId);
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}

}
