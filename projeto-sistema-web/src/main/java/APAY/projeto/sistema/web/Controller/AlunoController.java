package APAY.projeto.sistema.web.Controller;

import APAY.projeto.sistema.web.Service.AlunoService;
import APAY.projeto.sistema.web.model.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @PostMapping("/create")
    public ResponseEntity<AlunoModel> create(@RequestBody AlunoModel aluno) {
        return ResponseEntity.ok(alunoService.salvar(aluno));
    }

    @GetMapping
    public ResponseEntity<List<AlunoModel>> findAll() {
        return ResponseEntity.ok(alunoService.listarTodos());
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Optional<AlunoModel>> findById(@PathVariable Long id) {
        return ResponseEntity.ok(alunoService.buscarPorId(id));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<AlunoModel> update(@PathVariable Long id, @RequestBody AlunoModel aluno) {
        return ResponseEntity.ok(alunoService.update(aluno, id));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        alunoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
