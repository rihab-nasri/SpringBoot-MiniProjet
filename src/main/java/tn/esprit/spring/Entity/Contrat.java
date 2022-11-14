package tn.esprit.spring.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contrat implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer idContrat;
private Date dateDebutContrat;
private Date dateFinContrat;
private Boolean archive;
private Integer montantContrat;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
@ManyToOne
    Etudiant etudiant;

}
