package test;

import org.junit.Test;
import stack.Stack;

import static org.junit.Assert.*;

public class StackTest {



    @Test
    public void testPilhaVazia() {
        Stack<String> pilha = new Stack<>();
        assertTrue("pilha deveria está fazia",pilha.estaVazia());
    }

    @Test
    public void testPilhanaoVazia() {
        Stack<String> pilha = new Stack<>();
        pilha.empilhar( String.valueOf(10));
        assertFalse("pilha deveria está fazia", pilha.estaVazia());
    }

    @Test
    public void testEmpilhar() {
        Stack<String> pilha = new Stack<>();
        pilha.empilhar(String.valueOf(10));
        pilha.empilhar(String.valueOf(20));
        pilha.empilhar(String.valueOf(30));
        assertEquals(3, pilha.tamanho());

    }

    @Test(expected = Exception.class)
    public void testDesempilharPilhaVazia() throws Exception{
        Stack<String> pilha = new Stack<>();
        pilha.desempilhar();



    }



}