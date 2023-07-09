package hibernate.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Products")
public abstract class Product implements Serializable {

    @Id
    private Long id_product;
    private String name_product;
    private int star_review;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_status_product")
    private StatusProduct status_product;

    @ManyToOne()
    @JoinColumn(name = "id_brand")
    private Brand brand;

}
