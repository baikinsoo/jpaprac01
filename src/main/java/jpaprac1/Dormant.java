package jpaprac1;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Dormant {

    @Id
    private Long AuthorId;

    @MapsId
    @OneToOne
    @JoinColumn(name = "AUTHOR_ID")
    private Author author;

    private Date created;
}
