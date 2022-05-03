package lv.tsi.book.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @JsonProperty
    public String author;

    @JsonProperty
    public String name;

    @JsonProperty
    public int copies;
}
