package exemplos.diagramaclasses;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class InstituicaoEnsino {
    
    private String nomeInstituicao;
    private List<Professor> prof;


    public InstituicaoEnsino(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
        this.prof = new ArrayList<>();
    }

    public List<Professor> getProf() {
        return prof;
    }

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    
    public void adicionarProfessor(Professor pProf){
        this.prof.add(pProf);
    }
    
        public void removerProfessor(Professor pProf){
        this.prof.remove(pProf);
    }
        
    public double faturamento(List<Despesa> despesa, List<Receita> receita){
        double totalDespesas = 0;
        double totalReceitas = 0;
        double totalFaturamento = 0;
       
        for(int i = 0; i < despesa.size(); i++)
        {   
            totalDespesas += despesa.get(i).getValor();
             
        }         
        for(int i = 0; i < receita.size(); i++)
        {   
            totalReceitas += receita.get(i).getValor();
             
        }    
        
        totalFaturamento = totalReceitas - totalDespesas;
        
        //JOptionPane.showMessageDialog(null,"Valor do faturamento: " + totalFaturamento);
        return totalFaturamento;
        
    }
   
    
}
