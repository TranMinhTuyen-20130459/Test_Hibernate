package hibernate.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Brands")
public class Brand implements Serializable {

    @Id
    private int id_brand;
    private String name;

    @OneToMany(mappedBy = "brand", fetch = FetchType.LAZY)
    private Set<Product> products;

    public int getId_brand() {
        return id_brand;
    }

    public void setId_brand(int id_brand) {
        this.id_brand = id_brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

}
