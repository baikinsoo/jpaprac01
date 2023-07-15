package jpaprac1;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Author {

    @Id
    @GeneratedValue
    @Column(name = " AUTHOR_ID")
    private Long id;

    @OneToOne(mappedBy = "author")
    private Dormant dormant;

    private String name;

    private String profile;

    private Date created;
}
