package Atividade;

import java.util.Scanner;
import java.util.Stack;

 public class Validar {
	    public static boolean verificar(String expressao) {
	        Stack<Character> pilha = new Stack<>();

	        for (char caractere : expressao.toCharArray()) {
	            if (caractere == '(') {
	                pilha.push(caractere);
	            }
	            else if (caractere == ')') {
	                if (pilha.isEmpty() && pilha.pop() != '(' ) {
	                    return false;
	                }
	            }
	        }

	        return pilha.isEmpty();
	    }

	    public static void main(String[] args) {
	    	Scanner scanner = new Scanner(System.in);
	         
	        
	        System.out.println("Informe a Expressao1:	");
	        String expressao1 = scanner.next();
	        
	        System.out.println("Informe a Expressao2:	");
	        String expressao2 = scanner.next();
	        
	        System.out.println(verificar(expressao1)); 
	        System.out.println(verificar(expressao2)); 
	       
	    }
	}