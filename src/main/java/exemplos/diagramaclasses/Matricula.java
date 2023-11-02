package exemplos.diagramaclasses;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Matricula {
    
    private int numero;
    private Date data;
    ArrayList<Matricula> ListaMatricula = new ArrayList<>();

    public void gerarMatricula(){
     Double x =  (1+ Math.random())*85+5/2;  
     this.data = new Date();
     this.numero = x.intValue();
     
    }
    
    public void setlistaMatricula(Matricula matricula) {
        this.ListaMatricula.add(matricula);
    }

    
    public int getNumero() {
        return numero;
    }

    public Date getData() {
        return data;
    }
    
     
}
