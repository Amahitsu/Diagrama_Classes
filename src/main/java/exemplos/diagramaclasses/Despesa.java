package exemplos.diagramaclasses;

import java.util.ArrayList;


public class Despesa {
    
    private String tipo;
    private float valor;
    ArrayList<Despesa> listaDespesa = new ArrayList<>();
    
    public Despesa(String tipo, float valor){
        this.tipo = tipo;
        this.valor = valor;
    }
    
    public Despesa(){}
    
    public void addListaDespesa(Despesa despesa) {
        this.listaDespesa.add(despesa);
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

    public ArrayList<Despesa> getListaDespesa() {
        return listaDespesa;
    }

    
}
