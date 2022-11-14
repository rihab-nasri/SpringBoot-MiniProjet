package tn.esprit.spring.Service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Entity.Department;
import tn.esprit.spring.Entity.Etudiant;
import tn.esprit.spring.Entity.Universite;
import tn.esprit.spring.IService.IUniversiteService;
import tn.esprit.spring.repository.DepartementRepository;
import tn.esprit.spring.repository.EtudiantRepository;
import tn.esprit.spring.repository.UniversityRepository;

import java.util.List;
@Service
@Slf4j

public class UniversiteServiceImpl implements IUniversiteService {
    @Autowired
    UniversityRepository UniversityRepo;
    DepartementRepository DepartmentRepo;
    @Override
    public List<Universite> retrieveAllUniversites() {
        List<Universite> universite=UniversityRepo.findAll();
        for(Universite u: universite)
        {
            log.info("universite"+u.toString());
        }
        return universite;
    }

    @Override
    public Universite addUniversite(Universite u) {
        return UniversityRepo.save(u);

    }

    @Override
    public Universite updateUniversite(Universite u) {
        return UniversityRepo.save(u);

    }

    @Override
    public Universite retrieveUniversite(Integer idUniversite) {
        return UniversityRepo.findById(idUniversite).get();

    }
    @Override
    public void removeUniversite(Integer idUniversite) {

        UniversityRepo.deleteById(idUniversite);
    }

    @Override
    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement)
    {
        Universite u=UniversityRepo.findById(idUniversite).orElse(null);
        Department d = DepartmentRepo.findById(idDepartement).orElse(null);
        u.getDepartements().add(d);
        UniversityRepo.save(u);
    }

}
