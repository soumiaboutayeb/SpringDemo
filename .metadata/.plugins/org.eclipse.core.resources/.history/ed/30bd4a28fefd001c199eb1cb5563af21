
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import entity.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Integer> {
    Optional<Personne> findPersonneByCIN(String cin);

    List<Personne> findPersonnesByCIN(String cin);
}
