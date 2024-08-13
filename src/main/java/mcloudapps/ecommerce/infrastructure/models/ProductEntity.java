package mcloudapps.ecommerce.infrastructure.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String brand;

    private int stock;

    public ProductEntity() {
    }

    public ProductEntity(String name, String brand, int stock) {
        this.name = name;
        this.brand = brand;
        this.stock = stock;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    @Override
    public String toString() {
        return "ProductEntity{" +
                "id=" + this.getId() +
                ", name='" + this.getName() + '\'' +
                ", brand='" + this.getBrand() + '\'' +
                ", stock=" + this.getStock() +
                '}';
    }
    
}
