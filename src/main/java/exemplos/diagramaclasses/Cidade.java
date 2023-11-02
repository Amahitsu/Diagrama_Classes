package exemplos.diagramaclasses;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Cidade implements ILocalizacao{
    private String nome;
    private String siglaUF;
    private List<Endereco> end;
    private Prefeito prefeito;

    public Cidade() {
    }

    public Cidade(String nome, String siglaUF, String nomePrefeito, String partidoPrefeito) {
        this.nome = nome;
        this.siglaUF = siglaUF;
        this.end = new ArrayList<>();
        prefeito = new Prefeito(nomePrefeito, partidoPrefeito);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Prefeito getPrefeito() {
        return prefeito;
    }

    public String getSiglaUF() {
        return siglaUF;
    }

    public void setSiglaUF(String siglaUF) {
        this.siglaUF = siglaUF;
    }
    
        public void adicionarEndereco(Endereco pEnd){
        this.end.add(pEnd);
    }
    
        public void EnderecoEndereco(Endereco pEnd){
        this.end.remove(pEnd);
    }

    public List<Endereco> getEnd() {
        return end;
    }

    @Override
    public String MapaBase64(float latitude, float longitude) {
        latitude = 12.7701f;
        longitude = 39.8850f;
        
        return "\n Sua latitude é de: " + latitude +
                "\n e sua longitude é de: " + longitude;
    }

    
}
