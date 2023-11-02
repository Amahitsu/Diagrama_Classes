package exemplos.diagramaclasses;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
                
        // Exemplo associação reflexiva
        JOptionPane.showMessageDialog(null,":::EXEMPLO ASSOCIAÇÃO REFLEXIVA:::");
        
        Matricula m = new Matricula();
            m.gerarMatricula();
        
            Aluno aluno1 = new Aluno("Nicolas", "M",m);
                Matricula m3 = new Matricula();
                    m3.gerarMatricula();
                        Matricula m2 = new Matricula();
                            m2.gerarMatricula();
        
                            
            aluno1.realizaProvaCom(new Aluno("Amanda", "F",m3));
                    aluno1.realizaProvaCom(new Aluno("Giorgia", "F",m2));
                       JOptionPane.showMessageDialog(null,aluno1.getNome()+ 
                            " sua dupla se chama: "+ aluno1.nomeDupla());
        JOptionPane.showMessageDialog(null,"::: FIM EXEMPLO ASSOCIAÇÃO REFLEXIVA:::");
        
        // Exemplo associação reflexiva
        JOptionPane.showMessageDialog(null,"EXEMPLO ASSOCIAÇÃO BINARIA 1.1");
        
            Professor prof1 = new Professor("Alan", "Masculino", 666);
                Professor prof2 = new Professor("Pedro", "Masculino", 665);
        
            Cidade cidade = new Cidade("Blumenau", "SC","Argelino","Novo");
                Cidade cidade2 = new Cidade("Indaial", "SC","Sandrine","Psol");
       
            Endereco endProf = new Endereco("Canela Fina", cidade, 775, 89184000);
                Endereco endProf2 = new Endereco("Inhame", cidade2, 755, 89184233);
        
      
            prof1.cadastrarEndereco(endProf);
            JOptionPane.showMessageDialog(null, prof1.mostrarDados());
               prof2.cadastrarEndereco(endProf2);
               JOptionPane.showMessageDialog(null, prof2.mostrarDados());        
        
        // Exemplo associação binaria       
        JOptionPane.showMessageDialog(null,"EXEMPLO ASSOCIAÇÃO BINARIA 0.*");
        InstituicaoEnsino ie = new InstituicaoEnsino("Senac");
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
        cidade.adicionarEndereco(endProf);
        cidade.adicionarEndereco(endProf2);
        for (int x = 0; x < cidade.getEnd().size(); x++) {
            JOptionPane.showMessageDialog(null, cidade.getNome() + cidade.getSiglaUF()
                     +" - "+cidade.getPrefeito().getNome()+ "-"+cidade.getPrefeito().getPartido());
        }
        
        //instanciando as classes Receita e Despesas
        Receita receita1 = new Receita("doação",400.00f);
        Receita receita2 = new Receita("auxilio governo",10.000f);
        Receita receitas = new Receita();
        receitas.addListaReceita(receita1);
        receitas.addListaReceita(receita2);
        
        Despesa despesa1 = new Despesa("alimento",200.000f);
        Despesa despesa2 = new Despesa("alimento", 08.000f);
        Despesa despesas = new Despesa();
        despesas.addListaDespesa(despesa1);
        despesas.addListaDespesa(despesa2);      

        JOptionPane.showMessageDialog(null, "Total faturado: " + ie.faturamento(despesas.getListaDespesa(), receitas.getListaReceita()));
        
    }

}

