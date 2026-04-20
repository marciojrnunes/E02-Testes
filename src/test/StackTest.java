package test;

import org.junit.Before;
import org.junit.Test;
import stack.Stack;
import static org.junit.Assert.*;

public class StackTest {

    private Stack<Integer> pilha;

    @Before
    public void init() {
        // Inicializa uma nova pilha antes de cada teste
        this.pilha = new Stack<>();
    }

    @Test
    public void testPilhaVazia() {
        assertTrue("A pilha deveria estar vazia inicialmente", pilha.estaVazia());
    }

    @Test
    public void testPilhaNaoEstaVazia() {
        pilha.empilhar(10);
        assertFalse("A pilha não deveria estar vazia após empilhar", pilha.estaVazia());
    }

    @Test
    public void testEmpilhar() {
        pilha.empilhar(1);
        pilha.empilhar(2);
        assertEquals("O tamanho da pilha deveria ser 2", 2, pilha.tamanho());
    }

    @Test
    public void testDesempilhar() throws Exception {
        pilha.empilhar(100);
        pilha.empilhar(200);
        
        // LIFO (Last In, First Out): o último a entrar é o primeiro a sair
        int r1 = pilha.desempilhar(); 
        assertEquals("O elemento desempilhado deveria ser 200", 200, r1);
        assertEquals("O tamanho da pilha deveria ser 1", 1, pilha.tamanho());
        
        int r2 = pilha.desempilhar();
        assertEquals("O elemento desempilhado deveria ser 100", 100, r2);
        assertTrue("A pilha deveria estar vazia agora", pilha.estaVazia());
    }

    @Test(expected = Exception.class)
    public void testDesempilharPilhaVaziaThrowsException() throws Exception {
        // Tenta desempilhar de uma pilha vazia, o que deve lançar uma exceção
        pilha.desempilhar();
    }
}