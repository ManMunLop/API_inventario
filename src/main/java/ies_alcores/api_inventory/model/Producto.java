package ies_alcores.api_inventory.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Data

@Document(collection = "Producto")
public class Producto {

    @Id
    private int id;

    private String marca;
    private String modelo;
    private double precio;
    private int stock;
    private Date fecha_lanzamiento;
    private Categoria categoria;
}
