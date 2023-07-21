package spring.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
Create table:
CREATE TABLE event {
  id SERIAL PRIMARY KEY,
  name TEXT NOT NULL,
  city TEXT NOT NULL
};
 */

//@Entity(name = "events") - that is the case, when table name and class name is not the same
@Entity
@Getter  //work with and from lombok library
@Setter //work with and from lombok library
@NoArgsConstructor //work with and from lombok library
public class Event {

  //we should have empty constructor and all getters and setters!
  //automatic numbers
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;
  private String city;

}
