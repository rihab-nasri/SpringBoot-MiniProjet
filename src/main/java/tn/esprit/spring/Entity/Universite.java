package tn.esprit.spring.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Universite {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer idUniv;
private String nomUniv;
@OneToMany(cascade = CascadeType.ALL)
    private Set<Department>departements;
}
