package jpaprac1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Topic {

    @Id
    @GeneratedValue
    @Column(name = "TOPIC_ID")
    private Long id;

    private String title;

    private String description;

    private Date create;
}
