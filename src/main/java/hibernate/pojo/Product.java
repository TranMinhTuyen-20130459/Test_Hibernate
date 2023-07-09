package hibernate.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@MappedSuperclass
public abstract class Product implements Serializable {

    @Id
    private Long id_product;
    private String name_product;
    private int star_review;

    @OneToMany(fetch = FetchType.LAZY)
    private List<PriceProduct> price;

    @OneToMany(fetch = FetchType.LAZY)
    private Set<ImageProduct> images;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_status_product")
    private StatusProduct status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_brand")
    private Brand brand;

}
