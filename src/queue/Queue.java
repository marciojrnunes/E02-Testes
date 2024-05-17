package queue;

public class Queue<Trem> {
    private LinkedList<Trem> fila;

    public Queue() {
        this.fila = new LinkedList<>();
    }

    public boolean estaVazia() {
        return this.fila.isEmpty();
    }
    public void enfileirar(Trem item) {
        this.fila.add(item);
    }
    public int tamanho() {
        return this.fila.size();
    }
    public Trem desenfileirar() {
        if (this.estaVazia()) {
            return null;
        }
        return this.fila.remove();
    }

}
