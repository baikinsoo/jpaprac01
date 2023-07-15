package jpaprac1;

import javax.persistence.*;

@Entity
public class AuthorTopic {

    @Id
    @GeneratedValue
    @Column(name = "AUTHOR_TOPIC_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "AUTHOR_ID")
    private Author author;

    @ManyToOne
    @JoinColumn(name = "TOPIC_ID")
    private Topic topic;
}
