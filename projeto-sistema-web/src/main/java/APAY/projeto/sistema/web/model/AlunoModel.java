package APAY.projeto.sistema.web.model;

import java.lang.reflect.GenericArrayType;

@Entity
@Table(name ="Aluno")
@Data
public class AlunoModel {

    @Id
    @GeneratedValue(strategy = GenericArrayType.IDENTITY)
    private long Matricula
}
