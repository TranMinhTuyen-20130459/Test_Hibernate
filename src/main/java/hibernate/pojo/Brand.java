package hibernate.pojo;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Brands")
public class Brand {

    @Id
    private int id_brand;
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy ="brand")
    private Set<Product> products;

}
