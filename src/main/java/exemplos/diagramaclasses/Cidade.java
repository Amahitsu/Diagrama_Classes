package exemplos.diagramaclasses;

import java.util.ArrayList;
import java.util.List;

public class Cidade implements ILocalizacao{
    private String nome;
    private String siglaUF;
    private List<Endereco> end;
    private Prefeito prefeito;
    private List<Cidade> cidade;


    public Cidade() {
    }

    public Cidade(String nome, String siglaUF, String nomePrefeito, String sexoPrefeito, String partidoPrefeito) {
        this.nome = nome;
        this.siglaUF = siglaUF;
        this.end = new ArrayList<>();
        prefeito = new Prefeito(nomePrefeito, sexoPrefeito, partidoPrefeito);
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
        
        return "A cidade" + this.nome + "\n tem a latitude de: " + latitude +
                "\n e longitude de: " + longitude;
    }
    
}
