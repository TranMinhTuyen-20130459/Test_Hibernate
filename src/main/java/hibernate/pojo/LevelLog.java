package hibernate.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Level_Logs")
public class LevelLog implements Serializable {
    @Id
    private Long id_level;
    private String name;

    public Long getId_level() {
        return id_level;
    }

    public void setId_level(Long id_level) {
        this.id_level = id_level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
