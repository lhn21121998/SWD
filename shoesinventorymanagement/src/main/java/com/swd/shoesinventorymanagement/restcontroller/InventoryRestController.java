package com.swd.shoesinventorymanagement.restcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swd.shoesinventorymanagement.entity.InventoryEntity;
import com.swd.shoesinventorymanagement.services.InventoryService;

@RestController
@RequestMapping("/api/v1")
public class InventoryRestController {
	
	@Autowired
	private InventoryService inventoryService;
	
	@GetMapping("/inventory")
	public List<InventoryEntity> getListInventory() {
		return inventoryService.getListInventory();
	}
	
	@PostMapping("/inventory")
	public void createInventory(InventoryEntity inventory) {
		inventoryService.createInventory(inventory);
	}
	
	@PutMapping("/inventory")
	public void updateInventory(InventoryEntity inventory) {
		inventoryService.createInventory(inventory);
	}
	
	@DeleteMapping("/inventory")
	public void deleteInventory(int id) {
		inventoryService.deleteInventoryById(id);
	}
	
	@GetMapping("/inventory/{id}")
	public Optional<InventoryEntity> getInventoryById(int id) {
		return inventoryService.findInventoryById(id);
	}
}
