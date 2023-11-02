package exemplos.diagramaclasses;

import javax.swing.JOptionPane;


public class Pessoa {
    
    public String nome;
    public String sexo;
    
    public Pessoa(String nome, String sexo){
        this.nome = nome;
        this.sexo = sexo;        
    }
    
    public Pessoa(){};

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }    

        public int opcao(int op){        
        switch (op) {
            case 1: 
                Matricula matricula = new Matricula();
                matricula.gerarMatricula();
                Aluno aluno = new Aluno(nome, sexo, matricula);
            break;
            case 2: 
                int profMatricula = 
                        Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da matricula: "));
                Professor professor = new Professor(nome, sexo, profMatricula);
            break;     
            case 3: 
                
            default:
                System.out.println("Número invalido, digite novamente");
                
        }         
        return (op) ;
    }  
    
}
