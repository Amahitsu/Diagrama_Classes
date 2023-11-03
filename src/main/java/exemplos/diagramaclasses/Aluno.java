package exemplos.diagramaclasses;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Aluno extends Pessoa{

    private Aluno colegaAtividade; // Associação unária com a mesma classe
    private Matricula matricula;

    public Aluno(String nome, String sexo, Matricula matricula)  {
        super(nome , sexo);
        this.matricula = this.matricula;
    }
    
    public Aluno getColegaAtividade() {
        return colegaAtividade;
    }

    public void setColegaAtividade(Aluno colegaAtividade) {
        this.colegaAtividade = colegaAtividade;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void realizaProvaCom(Aluno dupla) {

        if (this.colegaAtividade == null && dupla.getColegaAtividade() == null) {
            this.colegaAtividade = dupla;
            dupla.setColegaAtividade(this);
            JOptionPane.showMessageDialog(null, this.nome + " realizará a prova com " + dupla.getNome());
        } else {
            JOptionPane.showMessageDialog(null, this.nome + " já possuem dupla, " + dupla.getNome() + " procure outra dupla, por favor!");
        }
    }

    public String nomeDupla() {
        if (this.colegaAtividade != null && this.nome != null) {
            return this.nome + "_" + this.colegaAtividade.nome;
        } else {
            return "Aluno " + this.nome + " sem dupla";
        }
    }
}
