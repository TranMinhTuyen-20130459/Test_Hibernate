package hibernate.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Image_Products")
public class ImageProduct implements Serializable {

    @Id
    private Long id_image;
    private String path;

}
