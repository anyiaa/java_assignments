package lv.tsi.student.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @JsonProperty
    public String fullName;

    @JsonProperty
    public String groupName;

    @JsonProperty
    public int age;
}
