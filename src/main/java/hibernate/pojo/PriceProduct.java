package hibernate.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "Price_Products")
public class PriceProduct implements Serializable {

    @Id
    private Long id_price_product;
    private BigDecimal listed_price;
    private BigDecimal promotional_price;
    private Timestamp created_at;

}
