package APAY.projeto.sistema.web.repository;

import APAY.projeto.sistema.web.model.DisciplinaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplinaRepository extends JpaRepository<DisciplinaModel, Long> {
}