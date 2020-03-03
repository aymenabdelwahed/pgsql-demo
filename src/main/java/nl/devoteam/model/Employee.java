package nl.devoteam.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "Employee", uniqueConstraints = {
        @UniqueConstraint(columnNames = "id")
})
@AllArgsConstructor @NoArgsConstructor @Getter @Setter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
}
