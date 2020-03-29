package com.swd.shoesinventorymanagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.swd.shoesinventorymanagement.entity.InventoryEntity;

public interface InventoryService {
	List<InventoryEntity> getListInventory();
	
	void createInventory(@RequestBody InventoryEntity inventory);
	
	void deleteInventoryById(@PathVariable int id);
	
	Optional<InventoryEntity> findInventoryById(@PathVariable int id);
	
	
}
