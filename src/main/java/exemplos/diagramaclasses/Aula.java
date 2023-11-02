package exemplos.diagramaclasses;


public class Aula {
    private Professor prof;
    private Sala sala;
    private Turma turma;

    public Aula(Professor prof, Sala sala, Turma turma) {
        this.prof = prof;
        this.sala = sala;
        this.turma = turma;
    }

    public Professor getProf() {
        return prof;
    }

    public Sala getSala() {
        return sala;
    }

    public Turma getTurma() {
        return turma;
    }
    
}
