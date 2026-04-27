package queue;

import  java.util.ArrayList;
import  java.util.List;

public class Queue<Trem> {
    private List<Trem>fila;

    public Queue() {
        this.fila= new ArrayList<>();
    }
    public void enfileirar (Trem x){
        fila.add(x);
    }
    public Trem desenfileirar() throws Exception{
        if(estaVazia()){
            throw new Exception("Fila vazia");
        }
        return fila.remove(0);
    }

    public boolean estaVazia(){
        return fila.isEmpty();
    }

    public int tamanho(){
        return fila.size();
    }


}
