package APAY.projeto.sistema.web.repository;

import APAY.projeto.sistema.web.model.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AlunoRepository extends JpaRepository<AlunoModel, Long> {
}


