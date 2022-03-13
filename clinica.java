package Prova2B;
import javax.swing.JOptionPane;
public class clinica extends pessoa 
{
private String cnpj;
private String razaoSocial;


public String getCnpj() {
	return cnpj;
}
public void setCnpj(String cnpj) {
	this.cnpj = cnpj;
}
public String getRazaoSocial() {
	return razaoSocial;
}
public void setRazaoSocial(String razaoSocial) {
	this.razaoSocial = razaoSocial;
}
	
	//metodo construtor
	public clinica()
	{
		super();
		cnpj = JOptionPane.showInputDialog("Informe seu CNPJ:");
		razaoSocial = JOptionPane.showInputDialog("Informe sua razão social:");
	}
	//operações
	public void imprimirDados()
	{
		
		JOptionPane.showMessageDialog(null, "DADOS DA IMPRESSÃO:"
				+"/nCNPJ:"+cnpj
				+"/nRAZÃO SOCIAL:"+razaoSocial);
	}
}
