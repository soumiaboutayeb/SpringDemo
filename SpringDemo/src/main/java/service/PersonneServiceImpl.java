package service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import Dao.PersonneRepository;
import entity.Personne;

@Service
public class PersonneServiceImpl implements PersonneService {


    private final PersonneRepository personneRepository;

    @Autowired
    public PersonneServiceImpl(PersonneRepository personneRepository) {
        this.personneRepository = personneRepository;
    }


    @Override
    public List<Personne> findAll() {
        return personneRepository.findAll();
    }

    @Override
    public Personne findById(int id) {
        Optional<Personne> result = personneRepository.findById(id);
        Personne personne = null;
        if (result.isPresent()) personne = result.get();
        else throw new RuntimeException("Did not find personne with id - " + id);

        return personne;
    }

    @Override
    public void save(Personne personne) {
        Optional<Personne> result = personneRepository.findPersonneByCIN(personne.getCIN());
        if (result.isPresent())
            throw new RuntimeException("CIN exit");
        personneRepository.save(personne);

    }

    @Override
    public void deleteById(int id) {
        personneRepository.deleteById(id);
    }

    @Override
    public void update(Personne personne) {
        List<Personne> personnes = personneRepository.findPersonnesByCIN(personne.getCIN());
        if (!(personnes.size() > 1)) {
            personneRepository.save(personne);
        }
    }

}

