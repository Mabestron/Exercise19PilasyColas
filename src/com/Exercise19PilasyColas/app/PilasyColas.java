package com.Exercise19PilasyColas.app;
import java.util.Stack;
public class PilasyColas
{

	public static void main(String[] args) 
	{
		String cad="LA funci�n del Comit� de Participaci�n Social es articular a ese organismo con la sociedad, pues est� compuesto "
				+ "por las instancias de Gobierno relacionadas con lA transparencia"
				+ " y rendici�n de cuentas; adem�s emite recomendaciones y observaciones de nombramientos y pol�ticas p�blicas.";
		Stack<Character> letters = new Stack<Character>(); // se crea una pila de nombre letters
		char[] lettersArray=cad.toCharArray();// se convierte el string en un arreglo de caracteres para poderlo usar en el for each
		
		
		//For each
		//Se analiza y se buscan las letras A de la cadena, elevando todas las a a mayusculas y las compara
		for(Character c: lettersArray)
		{
			if(Character.toUpperCase(c)=='A')
			{
				letters.push(c);
			}
			
		}
		
		//se muestran los elementos de la pila 
		while (!letters.isEmpty())
		{
			System.out.println(letters.pop());
		}
		

	}

}
