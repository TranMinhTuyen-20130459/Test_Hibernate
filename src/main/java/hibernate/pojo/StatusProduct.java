package hibernate.pojo;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Status_Products")
@AttributeOverride(
        name = "id_status",
        column = @Column(name = "id_status_product")
)
public class StatusProduct extends Status {

    @OneToMany(mappedBy = "status_product", fetch = FetchType.LAZY)
    private Set<Product> products;

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
