package Prova2B;
import javax.swing.JOptionPane;
public abstract class pessoa 
{
	//atributos
protected String nome;
protected String email; 

	//atributos de referencia
protected endereco atRefendereco;
protected telefone atReftelefone;

	//metodo SET E GET
	
	public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public endereco getAtRefendereco() {
	return atRefendereco;
}
public void setAtRefendereco(endereco atRefendereco) {
	this.atRefendereco = atRefendereco;
}
public telefone getAtReftelefone() {
	return atReftelefone;
}
public void setAtReftelefone(telefone atReftelefone) {
	this.atReftelefone = atReftelefone;
}
	//metodo construtor
	public pessoa()
	{
		nome = JOptionPane.showInputDialog("Informe seu nome:");
		email = JOptionPane.showInputDialog("Informe seu email:");
		
	}
	//operações
	public void imprimirDados()
	{
		JOptionPane.showMessageDialog(null, "DADOS DA IMPRESSÃO"
			    +"/n/nDADOS DA PESSOA:"
			    +"/nNome:"+nome
				+"/nEmail:"+email
				+"/n/nDADOS DO ENDEREÇO:"
				+"/nBairro:"+atRefendereco.getBairro()
				+"/nCep:"+atRefendereco.getCep()
				+"/nCidade:"+atRefendereco.getCidade()
				+"/nComplemento:"+atRefendereco.getComplemento()
				+"/nEstado:"+atRefendereco.getEstado()
				+"/nNumero:"+atRefendereco.getNumero()
				+"/nRua:"+atRefendereco.getRua()
				+"/n/n/nDADOS DE TELEFONE"
				+"/nDDD:"+atReftelefone.getDdd()
				+"/nDDI:"+atReftelefone.getDdi()
				+"/nNumero:"+atReftelefone.getNumero()
				+"/nOperadora:"+atReftelefone.getOperadora()
				+"/nTipo:"+atReftelefone.getTipo()   );
		
	}
}
