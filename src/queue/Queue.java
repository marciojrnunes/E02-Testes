package queue;

import java.util.LinkedList;

public class Queue<T>  {
    private LinkedList<T> fila;

    public Queue() {
        fila = new LinkedList<>();
    }


    public void enfileirar(T elemento) {
        fila.add(elemento);
    }


    public boolean estaVazia(){
        return fila.isEmpty();
    }

    public T desenfileirar() throws Exception {
        if (estaVazia()) {
            throw new Exception("Fila vazia! Não é possível desenfileirar.");
        }
        return fila.poll();
    }

    public int tamanho(){
        return this.fila.size();
    }

}
