package Econogen;

import java.util.Scanner;

public class objetoCliente {

	public static void main(String[] args) {
		
		
		cliente clien1 = new cliente();	
		clien1.Nome();
		clien1.Idade();
		
		
	
		if(clien1.getIdade()<18)
		{	
			System.out.println("\nMenor de 18 anos n�o pode utilizar nosso app, estaremos encerrando!");
		}
		else
		{
		
		clien1.renda();
		clien1.TotalDespesas();
		//clien1.rendaMeses();
		clien1.sobraMensal();
		clien1.menuValorSonho();
		clien1.tipoSonho();
		clien1.valorSonho();
		clien1.opcoes();
		/*Jeffrey colocou como coment�rio, e criou m�todo opcoes
		 * clien1.opcao1();
		clien1.opcao2();
		clien1.opcao3();*/
		
	/*	if(clien1.getRendaMensal()>20000)
	{
			System.out.println("\n" + clien1.getNomeCliente()+"\nParabens voc� alcan�ou seu objetivo");
	}
		else
	{
			System.out.println("\n"+clien1.getNomeCliente()+"\nInfelizmente Voc� m�o alcan�ou seu objetivo");
	}*/}
		
	
	
}}
