package tn.esprit.spring.Entity;

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
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Integer idEtudiant; // Clé primaire
    private String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private Option op;
// Constructeur et accesseurs (getters) et mutateurs (setters)
    @OneToMany(mappedBy = "etudiant",cascade = CascadeType.ALL)
    private Set<Contrat>contracts;
@ManyToMany
    private Set<Equipe> equipes;
@ManyToOne
    private Department departements;

}