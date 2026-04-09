package ies_alcores.api_inventory.repository;

import ies_alcores.api_inventory.model.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends MongoRepository<Producto, Integer> {
}
