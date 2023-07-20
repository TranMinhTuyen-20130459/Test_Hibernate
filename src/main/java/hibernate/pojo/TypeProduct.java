package hibernate.pojo;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Type_Products")
public class TypeProduct {

    @Id
    private int id_type;

    private String name_type;

    @OneToMany(mappedBy = "type_product", fetch = FetchType.LAZY)
    private Set<Product> products;

    public int getId_type() {
        return id_type;
    }

    public void setId_type(int id_type) {
        this.id_type = id_type;
    }

    public String getName_type() {
        return name_type;
    }

    public void setName_type(String name_type) {
        this.name_type = name_type;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
