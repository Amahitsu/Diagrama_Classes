/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos.diagramaclasses;

/**
 *
 * @author alan.beckhauser
 */
 public class Turma {
     private String nome;
     private String Periodo;

    public Turma(String nome, String Periodo) {
        this.nome = nome;
        this.Periodo = Periodo;
    }

    public String getNome() {
        return nome;
    }

    public String getPeriodo() {
        return Periodo;
    }
     
     
    
}









/*
public class Aluno {
  
private String nome;
   
public Aluno(String nome) {
    this.nome = nome;    
}
 public String getNome() {
 return nome;  }
}


    }
public class Disciplina {
    private String nome;
    
    
    
public Disciplina(String nome) {
        
       
this.nome = nome;
    }
    
    
    }
    

   
public String getNome() {
        return nome;
    }
}


    }
public class Professor {
    private String nome;
    
    
    
public Professor(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
}

public class Matricula {
   private Aluno aluno;
   private Disciplina disciplina;
   private Professor professor;
    
    public Matricula(Aluno aluno, Disciplina disciplina, Professor professor) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.professor = professor;
    }
    
    
    }
    
   

    }
public Aluno getAluno() {
        return aluno;
    }
    
public Disciplina getDisciplina() {
        
       
return disciplina;
    }
    
    
   
public Professor getProfessor() {
        return professor;
    }
}


    }
public class Main {
    
   
public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("Alice");
        Disciplina disciplina1 = new Disciplina("Programação em Java");
        Professor professor1 = new Professor("João");
        
        Matricula matricula1 = new Matricula(aluno1, disciplina1, professor1);
        
        System.out.println(
        
        System.out

        
        System
"Aluno: " + matricula1.getAluno().getNome() +
            
           
" está matriculado na disciplina: " + matricula1.getDisciplina().getNome() +
            
           
" ministrada pelo professor: " + matricula1.getProfessor().getNome());
    }
}
*/
