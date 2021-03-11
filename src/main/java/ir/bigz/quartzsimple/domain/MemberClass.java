package ir.bigz.quartzsimple.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class MemberClass {

    @Id
    @GeneratedValue
    private long id;
    private String name;

    public MemberClass() { }
}
