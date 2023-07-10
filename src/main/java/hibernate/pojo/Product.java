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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    private List<HistoryPriceProduct> list_price;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "product")
    private Set<ImageProduct> images;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_status_product")
    private StatusProduct status_product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_brand")
    private Brand brand;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    private Set<SizeProduct> size_products;

}
