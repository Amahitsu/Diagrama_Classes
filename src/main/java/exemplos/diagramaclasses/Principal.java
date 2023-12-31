package exemplos.diagramaclasses;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
              
        //Cadastro de pessoa        
        Pessoa pessoa1 = new Pessoa("Mateus", "Masculino");
        Pessoa pessoa2 = new Pessoa("Amanda","Feminino");
        Pessoa pessoa3 = new Pessoa("Gustavo", "Masculino");
        Pessoa pessoa4 = new Pessoa("Alan", "Masculino");
        Pessoa pessoa5 = new Pessoa("Pedro", "Masculino");
        
        //Cadastro de cidade
        Cidade cidade1 = new Cidade(" Blumenau", "SC", "Argelino", "Masculino", "Novo");
        Cidade cidade2 = new Cidade(" Indaial", "SC", "Sandrine","Feminino", "Psol");
        Cidade cidade3 = new Cidade(" Rio de janeiro", "RJ", "Rita Camargo","Feminino", "Psol");
        Cidade cidade4= new Cidade(" São Paulo", "SP", "Marcio Rosa","Masculino", "PT");  
        
        
        //Cadastro de endereço professor     
        Endereco endProf = new Endereco("Canela Fina", cidade1, 775, 89184000);
        Endereco endProf2 = new Endereco("Inhame", cidade2, 755, 89184233);
        Endereco endProf3 = new Endereco("Batata", cidade3, 760, 87089000);
        Endereco endProf4 = new Endereco("Getúlio Vargas", cidade4, 799, 89298367);
        //cadastro da matricula
        Matricula m = new Matricula();
        m.gerarMatricula();      
        Matricula m2 = new Matricula();
        m2.gerarMatricula();
        Matricula m3 = new Matricula();
        m3.gerarMatricula();
        
        //Cadastro de Aluno        
        Aluno aluno1 = new Aluno(pessoa1.nome, pessoa1.sexo, m3);
        Aluno aluno2 = new Aluno(pessoa2.nome, pessoa2.sexo, m2);               
        Aluno aluno3 = new Aluno(pessoa3.nome, pessoa3.sexo, m); 
        
        //Cadastro de Professor
        Professor prof1 = new Professor(pessoa4.nome, pessoa4.sexo, 666);
        Professor prof2 = new Professor(pessoa5.nome, pessoa5.sexo, 665);
        
               
        //-----------------------------------------------------------------------
        // Exemplo associação reflexiva
        JOptionPane.showMessageDialog(null,":::EXEMPLO ASSOCIAÇÃO REFLEXIVA:::");
        
            aluno1.realizaProvaCom(aluno2);
            aluno1.realizaProvaCom(aluno3);
                JOptionPane.showMessageDialog(null,aluno1.getNome()+ 
                            " sua dupla se chama: "+ aluno2.nomeDupla());
                       
        JOptionPane.showMessageDialog(null,"::: FIM EXEMPLO ASSOCIAÇÃO REFLEXIVA:::");
        
        //-----------------------------------------------------------------------
        // Exemplo associação Binaria
        JOptionPane.showMessageDialog(null,"EXEMPLO ASSOCIAÇÃO BINARIA 1.1");
            
        prof1.cadastrarEndereco(endProf);
            JOptionPane.showMessageDialog(null, prof1.mostrarDados());
               prof2.cadastrarEndereco(endProf2);
               JOptionPane.showMessageDialog(null, prof2.mostrarDados());     
               
        //-----------------------------------------------------------------------
        // Exemplo associação binaria       
        JOptionPane.showMessageDialog(null,"EXEMPLO ASSOCIAÇÃO BINARIA 1.2*");
        InstituicaoEnsino ie = new InstituicaoEnsino("Senac ");
        ie.adicionarProfessor(prof2);
        ie.adicionarProfessor(prof1);
        for (int x = 0; x < ie.getProf().size(); x++) {
            JOptionPane.showMessageDialog(null, ie.getNomeInstituicao() + ie.getProf().get(x).mostrarDados());
        }
        
        ie.removerProfessor(prof1);
        JOptionPane.showMessageDialog(null,"Removeu "+prof1.getNome()+" da instituição "+ ie.getNomeInstituicao());
        for (int x = 0; x < ie.getProf().size(); x++) {
            JOptionPane.showMessageDialog(null, ie.getNomeInstituicao() + ie.getProf().get(x).mostrarDados());
        }
                       
        //-----------------------------------------------------------------------
        JOptionPane.showMessageDialog(null,"EXEMPLO ASSOCIAÇÃO TERNARIA");
        Turma turma = new Turma("ADS 2ª", "Noturno");
        Sala sala = new Sala("205", 40);
        Aula aula1 = new Aula(prof1,sala,turma);
        Aula aula2 = new Aula(prof2,sala,turma);
        JOptionPane.showMessageDialog(null,"Aula 1: " +"\n"+"\n"+aula1.getProf().mostrarDados()+
                                      "\n"+"Sala: "+aula1.getSala().getNome()+"\n"+
                                      "\n"+"Turma: "+aula1.getTurma().getNome()+ " , Periodo: "+aula1.getTurma().getPeriodo());
        JOptionPane.showMessageDialog(null,"Aula 2: "+ "\n"+"\n"+aula2.getProf().mostrarDados()+
                                      "\n"+"Sala: "+aula2.getSala().getNome()+"\n"+
                                      "\n"+"Turma: "+aula2.getTurma().getNome()+ " , Periodo: "+aula2.getTurma().getPeriodo());

        JOptionPane.showMessageDialog(null,"EXEMPLO ASSOCIAÇÃO BINARIA 0.*, 1.1");
        cidade1.adicionarEndereco(endProf);
        cidade2.adicionarEndereco(endProf2);
        cidade3.adicionarEndereco(endProf3);
        cidade4.adicionarEndereco(endProf4);
        JOptionPane.showMessageDialog(null, cidade1.getNome() + "/ " + cidade1.getSiglaUF()
                     +"\n Prefeito : " + cidade1.getPrefeito().getNome()+ "\n Partido: "
                     + cidade1.getPrefeito().getPartido());
        JOptionPane.showMessageDialog(null, cidade2.getNome() + "/ " + cidade2.getSiglaUF()
                     +"\n Prefeito : " + cidade2.getPrefeito().getNome()+ "\n Partido: "
                     + cidade2.getPrefeito().getPartido());
        JOptionPane.showMessageDialog(null, cidade3.getNome() + "/ " + cidade3.getSiglaUF()
                     +"\n Prefeito : " + cidade3.getPrefeito().getNome()+ "\n Partido: "
                     + cidade3.getPrefeito().getPartido());
        JOptionPane.showMessageDialog(null, cidade4.getNome() + "/ " + cidade4.getSiglaUF()
                     +"\n Prefeito : " + cidade4.getPrefeito().getNome()+ "\n Partido: "
                     + cidade4.getPrefeito().getPartido());
   //------------------------------------------------------------------------------------------
             
        //instanciando as classes Receita e Despesas
        Receita receita1 = new Receita("mensalidade paga",10000.00f);
        Receita receita2 = new Receita("auxilio bolsa",900.000f);
        ArrayList<Receita> receita = new ArrayList<Receita>(); 
        receita.add(receita1);
        receita.add(receita2);    
        
        Despesa despesa1 = new Despesa("alimento",700.000f);
        Despesa despesa2 = new Despesa("luz", 900.000f);
        ArrayList<Despesa> despesa = new ArrayList<Despesa>(); 
        despesa.add(despesa1);
        despesa.add(despesa2);      
        
        //calculando o faturamento
        JOptionPane.showMessageDialog(null, "Total faturado: " + ie.faturamento(despesa, receita));
        
        //Mostrar cidade
        JOptionPane.showMessageDialog(null, cidade1.MapaBase64(48.2087f, -163.6894f));
        JOptionPane.showMessageDialog(null, cidade2.MapaBase64(7.4284f, 44.4679f));
        
        //Mostrar Endereço
        JOptionPane.showMessageDialog(null, endProf.MapaBase64(-78.0408f, -21.8515f));
        JOptionPane.showMessageDialog(null, endProf2.MapaBase64(61.8451f, -10.3599f));
    }

}

