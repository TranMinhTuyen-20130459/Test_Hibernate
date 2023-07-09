package hibernate.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Level_Logs")
public class LevelLog implements Serializable {
    @Id
    private Long id_level;
    private String name;

    @OneToMany(mappedBy = "level_log", fetch = FetchType.LAZY)
    private Set<Log> logs;

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

    public Set<Log> getLogs() {
        return logs;
    }

    public void setLogs(Set<Log> logs) {
        this.logs = logs;
    }
}
