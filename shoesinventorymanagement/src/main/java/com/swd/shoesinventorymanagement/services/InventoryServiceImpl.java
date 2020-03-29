package com.swd.shoesinventorymanagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swd.shoesinventorymanagement.entity.InventoryEntity;
import com.swd.shoesinventorymanagement.repository.InventoryRepository;

@Service
public class InventoryServiceImpl implements InventoryService{

	@Autowired
	private InventoryRepository inventoryRepository;

	@Override
	public List<InventoryEntity> getListInventory() {
		return inventoryRepository.findAll();
	}

	@Override
	public void createInventory(InventoryEntity inventory) {
		inventoryRepository.save(inventory);
	}

	@Override
	public void deleteInventoryById(int id) {
		inventoryRepository.deleteById(id);
	}

	@Override
	public Optional<InventoryEntity> findInventoryById(int id) {
		return inventoryRepository.findById(id);
	}
	
	
}
