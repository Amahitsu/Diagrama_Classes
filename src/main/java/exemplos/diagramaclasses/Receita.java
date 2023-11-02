package exemplos.diagramaclasses;

import java.util.ArrayList;

public class Receita {
    
    private String tipo;
    private float valor;
    ArrayList<Receita> listaReceita = new ArrayList<>();
    
    
    public Receita(String tipo, float valor){
        this.tipo = tipo;
        this.valor = valor;
    }
    
    public Receita(){}
    
    public void addListaReceita(Receita receita) {
        this.listaReceita.add(receita);
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public ArrayList<Receita> getListaReceita() {
        return listaReceita;
    }
    
    
    
}
