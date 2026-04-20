package stack;

import java.util.ArrayList;
import java.util.List;

public class Stack<Trem> {

    private List<Trem> vetor;
    private int topo;

    public Stack (){
        this.vetor = new ArrayList<Trem>();
        this.topo = 0;
    }

    public void empilhar(Trem x) {
        this.vetor.add(x);
        this.topo++;
    }

   public Trem desempilhar() throws Exception {
    if(this.estaVazia()) {
        throw new Exception("Pilha Vazia"); // Lançar a exceção conforme pede o teste
    }
    // Decrementa o topo e remove o último elemento da lista
    this.topo--;
    return this.vetor.remove(this.topo);
    }

    public boolean estaVazia() {
        return this.vetor.isEmpty();
    }

    public int tamanho() {
        return this.vetor.size();
    }
}

