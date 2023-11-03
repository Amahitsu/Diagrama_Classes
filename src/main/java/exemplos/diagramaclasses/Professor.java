package exemplos.diagramaclasses;

import java.util.ArrayList;

public class Professor extends Pessoa{
    Pessoa pessoa;
    private int numeroMatricula;
    private Endereco endProf;
    ArrayList<Professor> listaProfessor = new ArrayList<>();

    public Professor(String nome, String sexo, int numeroMatricula) {
        super(nome, sexo);
        this.numeroMatricula = numeroMatricula;
        this.endProf = new Endereco();
    }
    
    public void setlistaProfessor(Professor professor) {
        this.listaProfessor.add(professor);
    }

    public String mostrarDados() {
        return "Nome Professor: " + this.nome +"\n"
                + " do sexo " + this.sexo+"\n"
                + " nº matricula: " + Integer.toString(this.numeroMatricula)+"\n"
                + " Mora na Rua " + endProf.getRua()+"\n"
                + " nº " + Integer.toString(endProf.getNumero())+"\n"
                + " CEP: " + Integer.toString(endProf.getCep())+"\n"
                + " na cidade de" + endProf.getCidade().getNome()+"\n";
    }

    public boolean cadastrarEndereco(Endereco pEnd) {
        try {
            this.endProf = pEnd;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}

