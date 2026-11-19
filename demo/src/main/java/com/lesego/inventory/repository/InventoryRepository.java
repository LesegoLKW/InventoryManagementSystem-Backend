package com.lesego.inventory.repository;
import com.lesego.inventory.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
public interface InventoryRepository extends JpaRepository<Inventory,Long> {

}
