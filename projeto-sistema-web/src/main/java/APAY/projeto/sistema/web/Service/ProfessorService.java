package APAY.projeto.sistema.web.Service;

import APAY.projeto.sistema.web.model.DisciplinaModel;
import APAY.projeto.sistema.web.model.ProfessorModel;
import APAY.projeto.sistema.web.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProfessorService {

    private final ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public List<ProfessorModel> listarTodos() {
        return professorRepository.findAll();
    }

    public Optional<ProfessorModel> buscarPorId(Long id) {
        return professorRepository.findById(id);
    }

    public ProfessorModel salvar(ProfessorModel professor) {
        return professorRepository.save(professor);
    }

    public ProfessorModel update(ProfessorModel professor, Long id) {
        ProfessorModel professorExistente = professorRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Professor: " + id + " não encontrada"));

        professorExistente.setNome(professor.getNome());
        professorExistente.setDisciplinas(professor.getDisciplinas());
        professorExistente.setEmail(professor.getEmail());

        return professorRepository.save(professorExistente);
    }

    public void deletar(Long id) {
        professorRepository.deleteById(id);
    }
}
