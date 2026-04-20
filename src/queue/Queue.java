package queue;

import java.util.ArrayList;
import java.util.List;

public class Queue<Trem> {

    private List<Trem> elementos;

    public Queue() {
        this.elementos = new ArrayList<>();
    }

    public void enfileirar(Trem x) {
        // Adiciona ao final da lista
        this.elementos.add(x);
    }

    public Trem desenfileirar() {
        if (this.estaVazia()) {
            // O teste QueueTest espera uma Exception aqui
            throw new RuntimeException("Fila Vazia"); 
        }
        // FIFO (First In, First Out): o primeiro a entrar é o primeiro a sair
        // Remove sempre o primeiro elemento (índice 0)
        return this.elementos.remove(0);
    }

    public boolean estaVazia() {
        return this.elementos.isEmpty();
    }

    public int tamanho() {
        return this.elementos.size();
    }
}