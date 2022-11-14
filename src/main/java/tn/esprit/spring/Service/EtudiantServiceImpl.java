package tn.esprit.spring.Service;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Entity.Contrat;
import tn.esprit.spring.Entity.Department;
import tn.esprit.spring.Entity.Equipe;
import tn.esprit.spring.Entity.Etudiant;
import tn.esprit.spring.IService.IEtudiantService;
import tn.esprit.spring.repository.ContratRepository;
import tn.esprit.spring.repository.DepartementRepository;
import tn.esprit.spring.repository.EquipeRepository;
import tn.esprit.spring.repository.EtudiantRepository;

import java.util.List;
@Service
@Slf4j

public class EtudiantServiceImpl implements IEtudiantService {
    @Autowired
    EtudiantRepository EtudiantRepo;
    DepartementRepository departmentRepo;
    ContratRepository contratRepo;
    EquipeRepository equipeRepo;
    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        List<Etudiant> etudiant=EtudiantRepo.findAll();
        for(Etudiant E: etudiant)
        {
            log.info("etudiant"+E.toString());
        }
        return etudiant;
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return EtudiantRepo.save(e);

    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return EtudiantRepo.save(e);

    }

    @Override
    public Etudiant retrieveEtudiant(Integer idEtudiant) {
        return EtudiantRepo.findById(idEtudiant).get();

    }

    @Override
    public void removeEtudiant(Integer idEtudiant) {
        EtudiantRepo.deleteById(idEtudiant);

    }
    @Override
    public List<Etudiant> findByDepartementsIdDepart(Integer idDepart)
    {
        return EtudiantRepo.findByDepartementsIdDepart(idDepart);
    }
    @Override
    public void assignEtudiantToDepartement (Integer etudiantId, Integer departementId)
    {
        Etudiant etudiant= EtudiantRepo.findById(etudiantId).orElse(null);
        Department department=departmentRepo.findById(departementId).orElse(null);
        etudiant.setDepartements(department);
        EtudiantRepo.save(etudiant);


    }

    @Override
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe) {
        Contrat c=contratRepo.findById(idContrat).orElse(null);
        Equipe eq=equipeRepo.findById(idEquipe).orElse(null);
        c.setEtudiant(e);
        eq.getEtudiants().add(e);
        EtudiantRepo.save(e);
        return e;

    }
}
