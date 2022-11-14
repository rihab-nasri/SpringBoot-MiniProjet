package tn.esprit.spring.IService;

import tn.esprit.spring.Entity.Etudiant;

import java.util.List;

public interface IEtudiantService {


    List<Etudiant> retrieveAllEtudiants();

    Etudiant addEtudiant (Etudiant e);

    Etudiant updateEtudiant (Etudiant e);

    Etudiant retrieveEtudiant(Integer idEtudiant);

    void removeEtudiant(Integer idEtudiant);
    List<Etudiant> findByDepartementsIdDepart(Integer idDepart);
    public void assignEtudiantToDepartement (Integer etudiantId, Integer departementId) ;
    Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe);
}
