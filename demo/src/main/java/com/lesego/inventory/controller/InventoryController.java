package com.lesego.inventory.controller;

import com.lesego.inventory.model.Inventory;

import com.lesego.inventory.service.InventoryServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {
private final InventoryServices service;


public InventoryController(InventoryServices service) {
    this.service = service;
}

@PostMapping
    public Inventory createInventory(@RequestBody Inventory item){
   return service.addItem(item);
}
    @GetMapping
    public List<Inventory> getAllItems() {
        return service.getAllItems();
    }

}
