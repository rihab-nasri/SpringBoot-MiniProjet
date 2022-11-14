package tn.esprit.spring.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Equipe implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer idEquipe;
    private String nomEquipe;

    @Enumerated(EnumType.STRING)
    private Niveau niveau;
@OneToOne
    private DetailEquipe detailequipe;

    @ManyToMany(mappedBy = "equipes",cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Etudiant> etudiants;


}
