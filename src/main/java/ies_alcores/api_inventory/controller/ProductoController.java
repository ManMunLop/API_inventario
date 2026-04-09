package ies_alcores.api_inventory.controller;

import ies_alcores.api_inventory.model.Producto;
import ies_alcores.api_inventory.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/inv")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping("")
    public ResponseEntity<List<Producto>> findAll(){
        return ResponseEntity.ok(this.productoService.findAll());
    }

}
