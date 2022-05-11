package _02;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="store_location")
public class StoreLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="location_name",nullable = false)
    private String locationName;

    @OneToMany(targetEntity = Sale.class,mappedBy = "storeLocation")
    private Set<Sale> sales;

    public StoreLocation(){}

    public StoreLocation(String locationName) {
        this.locationName = locationName;
    }
}
