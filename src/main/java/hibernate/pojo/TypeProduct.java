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


}
