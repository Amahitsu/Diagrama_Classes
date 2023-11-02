package exemplos.diagramaclasses;

public class Endereco implements ILocalizacao{
    private String rua;
    private Cidade cidade;
    private int numero;
    private int cep;

    public Endereco() {
    }

    public Endereco(String rua, Cidade cidade, int numero, int cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.numero = numero;
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    @Override
    public String MapaBase64(float latitude, float longitude) {
        
            return "A rua "+ this.rua +"\n fica na latitude de: " + latitude +
                "\n e sua longitude é de: " + longitude;
    }
    
    
}
