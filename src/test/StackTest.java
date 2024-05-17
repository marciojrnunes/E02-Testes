package test;

import org.junit.Test;
import stack.Stack;

import static org.junit.Assert.*;

public class StackTest {
    private Stack<Integer> stack;

    @org.junit.Before
    public void setUp() {
        stack = new Stack<>();
    }

    @Test
    public void testPilhaEstaVazia() {
        assertTrue("A pilha deve estar vazia inicialmente.",stack.estaVazia());
    }

    @Test
    public void testPilhaNaoEstaVazia() {
        stack.empilhar(1);
        assertFalse("A pilha não deve estar vazia após empilhar um elemento.",stack.estaVazia());
    }

    @Test
    public void testEmpilharElementos() {
        stack.empilhar(1);
        stack.empilhar(2);
        assertEquals(String.valueOf(2), stack.tamanho(), "A pilha deve conter 2 elementos.");
    }

    @Test
    public void testDesempilharElementos() throws Exception {
        stack.empilhar(1);
        stack.empilhar(2);
        int elemento = stack.desempilhar();
        assertEquals(String.valueOf(2), elemento, "O elemento desempilhado deve ser 2.");
        assertEquals(String.valueOf(1), stack.tamanho(), "A pilha deve conter 1 elemento após desempilhar.");
    }

    @Test
    public void testDesempilharPilhaVazia() {
        Exception exception = assertThrows(Exception.class, () -> {
            stack.desempilhar();
        });
        assertEquals("A pilha está vazia!", exception.getMessage(), "Deve retornar: 'A pilha está vazia!'");
    }
}
