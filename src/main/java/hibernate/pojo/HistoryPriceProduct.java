package hibernate.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "History_Price_Products")
public class HistoryPriceProduct implements Serializable {

    @Id
    private Long id_price_product;
    private BigDecimal listed_price;
    private BigDecimal promotional_price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_product")
    private Product product;

    private Timestamp time_start;
    private Timestamp time_end;
    private Timestamp created_at;

}
