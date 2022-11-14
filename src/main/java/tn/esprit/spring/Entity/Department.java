package tn.esprit.spring.Entity;

import com.sun.istack.NotNull;
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
public class Department {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer idDepart;
private String nomDepart;
@OneToMany(mappedBy = "departements",cascade = CascadeType.ALL)
    private Set<Etudiant>etudiants;

}
