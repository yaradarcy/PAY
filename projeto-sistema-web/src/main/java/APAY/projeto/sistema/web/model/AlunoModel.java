package APAY.projeto.sistema.web.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

import java.lang.reflect.GenericArrayType;
import java.util.HashSet;

@Entity
@Table(name ="Aluno")
@Data
public class AlunoModel {

    @Id
    @GeneratedValue(strategy = GenericArrayType.IDENTITY)
    private long Matricula;

    @column(nullble = fase, unique = true, length = 100)
    private String email;

    @ManyToMany
    @JoinTable (
            name="Aluno_Disciplina",
            joinColumns = @JoinColumn(name="aluno_id").
            inverseJoinColumns = @JoinColumn(name"disciplina_id")
    )
    private Set<DisciplinaModel> disciplinas;
}
