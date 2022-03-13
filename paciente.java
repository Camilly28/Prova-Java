package Prova2B;
import javax.swing.JOptionPane;
public class paciente extends pessoa
{
	//atributos
	private String cpf;
	private int dataNascimento;
	private int peso;
	private int altura;
	private int idade;
	
	private clinica atRefclinica;
	
		public clinica getAtRefclinica() {
		return atRefclinica;
	}

	public void setAtRefclinica(clinica atRefclinica) {
		this.atRefclinica = atRefclinica;
	}

	//metodo SET E GET
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

		//metodo construtor
		
		public paciente()
		{
			cpf = JOptionPane.showInputDialog("Informe o seu CPF:")
			dataNascimento = Integer.parseInt(JOptionPane.showInputDialog("Informe a data de nascimento:"));
			peso =Integer.parseInt(JOptionPane.showInputDialog("Informe o seu peso: "));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Informe sua altura: "));
			idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
		}
		
		//operações
		public void calcularIMC()
		{
			 (peso/altura)*2;
		}
		public void imprimirDados()
		{
			JOptionPane.showMessageDialog(null, "DADOS DA IMPRESSÃO DE PACIENTE OU CLINICA?");
					if(resposta.equalsIgnoreCase("PACIENTE"))
					{
					+"/ncpf"+cpf
					+"/ndata Nascimento"+dataNascimento
					+"/npeso"+peso
					+"/naltura"+altura
					+"/nidade"+idade
					}
					else
					{
							+"/n/n DADOS DE CLINICA"
							+"/n"+atRefclinica.getNome()
							+"/n"+atRefclinica.getRazaoSocial()
					}
			calcularIMC();
		}
}
