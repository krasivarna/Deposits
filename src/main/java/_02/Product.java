package _02;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    private int quantity;

    private BigDecimal price;

    @OneToMany(targetEntity = Sale.class, mappedBy = "product")
    private Set<Sale> sales;

    public Product() {

    }

    public Product(String name, int quantity, BigDecimal price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}
