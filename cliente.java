package Econogen;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class cliente {
	
	private String nomeCliente;
	private int idade;
	private float rendaMensal;
	private int meses;
	private float despesas;
	private float resto ;
	private float op1,op2,op3;
	private float sonho;
	private float parcelas;
	
	Scanner leia = new Scanner (System.in);
	DecimalFormat df = new DecimalFormat();
	NumberFormat moeda = NumberFormat.getCurrencyInstance();
			
	public cliente()
	{
		this.nomeCliente = nomeCliente;
		this.idade = idade;
		this.rendaMensal = rendaMensal;
		this.resto = resto;
		this.despesas = despesas;
	}
	
	/*Deivide colocou como coment�rio
	 * public String formatarRenda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(getRendaMensal());
		return formatoMoeda;
	}
	public String formatarResto()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(getResto());
		return formatoMoeda;
	}*/
	
	public void Nome()
	{
		System.out.println("\nNome cliente :");
		nomeCliente = leia.nextLine();
	}
	
	public void Idade()
	{
		System.out.println("\nQual a sua idade :");
		idade = leia.nextInt();
	}
	
	public void renda()
	{
		System.out.println("\nQual sua renda :");
		rendaMensal = leia.nextFloat();
	}
	
	public void TotalDespesas()
	{
		System.out.println("\nQual o valor total de despesas mensal:");
		despesas = leia.nextFloat();	
	}
	
	public void sobraMensal()
	{
		resto = rendaMensal - despesas;
		System.out.println("\nSobrou "+moeda.format(resto) +" do seu sal�rio, vamos economizar para realizar o seu sonhos?");
	}
	
	/*Jeffrey colocou como comentario
	 * public void rendaMeses()
	{
		System.out.println("\nQuantidade de meses :");
		meses = leia.nextInt();
		rendaMensal = rendaMensal*meses;
		System.out.println("\n"+nomeCliente+ " Tem uma renda de " + moeda.format(getRendaMensal()) + " em " +meses+ " meses");
		System.out.println("\n*************************************************************");
	}
	
	public void opcao1()
	{
		op1 = (resto * 50)/100;
		parcelas = sonho/op1;
		System.out.println("\nVoc� tem a op��o 1 de pegar 50 porcento do valor que te sobra mensalmente e dividr em "
		+df.format(Math.ceil(parcelas)) + " parcelas" + " de " + moeda.format(op1));
	}
	
	public void opcao2()
	{
		op2 = (resto * 75)/100;
		parcelas = sonho/op2;
		System.out.println("\nVoc� tem a op��o 2 de pegar 75 porcento do valor que te sobra mensalmente e dividr em "
		+df.format(Math.ceil(parcelas)) + " parcelas" + " de " + moeda.format(op2));
	}
	
	public void opcao3()
	{
		op3 = resto;
		parcelas = sonho/op3;
		System.out.println("\nVoc� tem a op��o 3 de pegar o valor total que sobra mensalmente e dividr em "
		+df.format(Math.ceil(parcelas)) + " parcelas" + " de " + moeda.format(op3));
	}
	*/
	
	//Jeffrey adicionou
		public void menuValorSonho()
		{
			int escolha;
			
				System.out.println("\nVoc� deseja continuar? ");
				System.out.println("[1] SIM");
				System.out.println("[2] N�O");
				escolha = leia.nextInt();
				if (escolha==1)
				{
					System.out.println("\nTudo bem, podemos continuar!");
				}
				else
				{
					System.out.println("\nAt� a pr�xima!");
				}

		}
		
		
	//adicionado pelo jeffrey
		public void tipoSonho()
		{
			int escolha;
				System.out.println("\nQual � o seu sonho ? ");
				System.out.println("\n1 - Autom�vel");
				System.out.println("2 - Casa");
				System.out.println("3 - Casamento");
				System.out.println("4 - Viagem");
				System.out.println("5 - P� de meia");
				escolha = leia.nextInt();
			if(escolha==1)
			{
				System.out.println("\nMuito bem, um autom�vel � uma �tima escolha!");
			}
			else if(escolha==2)
			{
				System.out.println("\nUma escolha incr�vel, ter sua pr�pria casa � uma meta maravilhosa!");
			}
			else if(escolha==3)
			{
				System.out.println("\nPara um casamento dos sonhos, � sempre melhor se preparar!");
			}
			else if(escolha==4)
			{
				System.out.println("\nAquela viagem incr�vel, que em breve voc� poder� desfrutar!");
			}
			else if(escolha==5)
			{
				System.out.println("\nFazer um p� de meia, � sempre importante!");
			}
			else
			{
				System.out.println("Escolha inv�lida!");
				System.out.println("\nEscolha uma das op��es mostradas: \n1 - Autom�vel \n2 - Casa \n3 - Casamento \n4 - Viagem \n5 - P� de meia ");
				escolha = leia.nextInt();
				
			}
		}
		
		public void valorSonho()
		{
			System.out.println("\nQual o valor do seu sonho");
			sonho = leia.nextFloat();
		}
		
		//adicionado pelo Jeffrey
		public void opcoes(){
			int escolha;
			System.out.println("\nQual plano voc� gostaria de aderir ? ");
			System.out.println("\n1 - GenBasic (Sobra mais dinheiro no bolso, e seu sonho � realizado com o prazo mais longo)");
			System.out.println("2 - GenSilver (Sobra um pouquinho de dinheiro no bolso, e seu sonho � realizado em um prazo m�dio)");
			System.out.println("3 - GenGold (N�o sobra dinheiro no bolso, mas seu sonho � realizado de forma super r�pida, no prazo curto)");
			escolha = leia.nextInt();
			
			if(escolha==1)
			{
				op1 = (resto * 50)/100;
				parcelas = sonho/op1;
				System.out.println("\nVoc� escolheu o plano GenBasic, e com isso voc� pode pagar "
				+df.format(Math.ceil(parcelas)) + " parcelas" + " de " + moeda.format(op1) +" para realizar o seu sonho!" );
			}
			
			else if(escolha ==2)
			{
				op2 = (resto * 75)/100;
				parcelas = sonho/op2;
				System.out.println("\n\nVoc� escolheu o plano GenSilver, e com isso voc� pode pagar "
				+df.format(Math.ceil(parcelas)) + " parcelas" + " de " + moeda.format(op2) +" para realizar o seu sonho!");
			}
			else if(escolha ==3)
			{
				op3 = resto;
				parcelas = sonho/op3;
				System.out.println("\n\nVoc� escolheu o plano GenGold, e com isso voc� pode pagar "
				+df.format(Math.ceil(parcelas)) + " parcelas" + " de " + moeda.format(op3) +" para realizar o seu sonho!");
			}
			else
			{
				System.out.println("Escolha inv�lida!");
				System.out.println("\nEscolha uma das op��es mostradas: \n1 - GenBasic \n2 - Casa \n3 - GenSilver \n4 - GenGold");
				escolha = leia.nextInt();
				
			}
		}
	
	public float getDespesas() {
		return despesas;
	}

	public void setDespesas(float despesas) {
		this.despesas = despesas;
	}

	public float getResto() {
		return resto;
	}

	public void setResto(float resto) {
		this.resto = resto;
	}

	public String getNomeCliente() 
	{
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public float getRendaMensal() {
		return rendaMensal;
	}


	public void setRendaMensal(float rendaMensal) {
		this.rendaMensal = rendaMensal;
	}
}
