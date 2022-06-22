package au.com.melbourne.jug;

//import io.quarkus.hibernate.orm.panache.PanacheEntity;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import javax.persistence.Entity;

@Entity
public class Todo extends PanacheEntity {
    public String title;
    public String description;
    public boolean isDone = false;
}
