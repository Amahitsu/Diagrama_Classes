
package exemplos.diagramaclasses;

import java.util.ArrayList;

public class Prefeito extends Pessoa {

    private String Partido;
   

    public Prefeito(String nome, String sexo, String Partido) {
        super(nome, sexo);
        this.nome = nome;
        this.Partido = Partido;
    }

    public String getNome() {
        return nome;
    }

    public String getPartido() {
        return Partido;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPartido(String Partido) {
        this.Partido = Partido;
    }
    
}
