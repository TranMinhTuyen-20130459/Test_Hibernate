package hibernate.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class PriceRange implements Serializable {

    @Id
    private String name_price_range;
    private BigDecimal price_start;
    private BigDecimal price_end;

    public String getName_price_range() {
        return name_price_range;
    }

    public void setName_price_range(String name_price_range) {
        this.name_price_range = name_price_range;
    }

    public BigDecimal getPrice_start() {
        return price_start;
    }

    public void setPrice_start(BigDecimal price_start) {
        this.price_start = price_start;
    }

    public BigDecimal getPrice_end() {
        return price_end;
    }

    public void setPrice_end(BigDecimal price_end) {
        this.price_end = price_end;
    }
}
