package exemplos.diagramaclasses;

import java.util.ArrayList;


public class Despesa {
    
    private String tipo;
    private float valor;

    public Despesa(String tipo, float valor){
        this.tipo = tipo;
        this.valor = valor;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    
}
