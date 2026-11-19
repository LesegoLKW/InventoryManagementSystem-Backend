package com.lesego.inventory.service;
import com.lesego.inventory.model.Inventory;
import com.lesego.inventory.repository.InventoryRepository;
import org.springframework.stereotype.Service;
import java.util.List;;

@Service
public class InventoryServices {
    private InventoryRepository repository;
    public InventoryServices(InventoryRepository repository) {
        this.repository = repository;
    }
    public Inventory addItem(Inventory inventory) {
        return repository.save(inventory);
    }
    public List<Inventory> getAllItems() {
        return repository.findAll();
    }
    public Inventory getItem(Long id) {
        return repository.findById(id).orElseThrow();
    }
    public void deleteItem(Long id) {
        repository.deleteById(id);
    }
}
