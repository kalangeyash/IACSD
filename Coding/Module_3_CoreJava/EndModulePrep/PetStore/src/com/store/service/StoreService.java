package com.store.service;
//Pet Store Application Menu: 
//Login
//Add new Pet (Admin only functionality)
//Update Pet details (Admin only functionality)
//Display all available pets
//Order a Pet
//Check order status by Order Id
//Update order status (Admin only functionality)
//Exit

import com.store.core.Category;
import com.store.core.OrderStatus;
import com.store.exception.AuthenticationException;
import com.store.exception.AuthorizationException;
import com.store.exception.MyStoreException;
import com.store.exception.OutOfStockException;

public interface StoreService {
	String login(String username,String password) throws AuthenticationException;
	
	String addNewPet(String name, Category category, double unitPrice, int stocks) throws AuthorizationException;
	
	String updatePetDetails(int petId) throws AuthorizationException;
	
	void displayAllPets();
	
	String orderPet(int petId, int quantity, OrderStatus status) throws OutOfStockException;
	
	String checkOrderStatus(int orderId) throws MyStoreException;
	
	String updateOrderStatus(int orderId) throws  AuthorizationException,MyStoreException;
}
