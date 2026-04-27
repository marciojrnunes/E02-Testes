package test;

import org.junit.Test;
import stack.Stack;

import static org.junit.Assert.*;

public class StackTest {
    @Test
    public void deveComecarVazia(){
        Stack<Integer>pilha = new Stack<>();
        assertTrue(pilha.estaVazia());
    }

    @Test
    public void naoDeveEstarVaziaAposEmpilhar(){
        Stack<Integer>pilha = new Stack<>();
        pilha.empilhar(10);
        assertFalse(pilha.estaVazia());
    }
    @Test
    public void deveEmpilharCorretamente() throws Exception{
        Stack<Integer>pilha = new Stack<>();
        pilha.empilhar(10);
        pilha.empilhar(20);
        assertEquals(20,pilha.tamanho());
    }
    @Test
    public void deveDesempilharCorretamente() throws Exception{
        Stack<Integer>pilha = new Stack<>();
        pilha.empilhar(10);
        pilha.empilhar(20);
        int valor = pilha.desempilhar();
        assertEquals(20,valor);
    }

    @Test(expected=Exception.class)
    public void deveLancarExcecaoAoDesempilharPilhaVazia() throws Exception{
        Stack<Integer>pilha = new Stack<>();
        pilha.desempilhar();
    }
}
