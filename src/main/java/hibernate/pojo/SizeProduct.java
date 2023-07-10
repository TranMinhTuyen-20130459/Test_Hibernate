package hibernate.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Size_Products")
public class SizeProduct implements Serializable {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_product")
    private Product product;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "name_size")
    private Size size;

    private int quantity_available;

}
