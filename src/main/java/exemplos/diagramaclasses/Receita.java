package exemplos.diagramaclasses;

import java.util.ArrayList;

public class Receita {
    
    private String tipo;
    private float valor;

    
    public Receita(String tipo, float valor){
        this.tipo = tipo;
        this.valor = valor;
    }
    
    public Receita(){}

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
    
}
