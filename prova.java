package Prova2B;
import javax.swing.JOptionPane;
public class prova 
{
	public static void main (String[]args)
	{
		clinica objclinica = new clinica();
	objclinica.imprimirDados();
	
		paciente objpaciente = new paciente();
	objpaciente.calcularIMC();
	objpaciente.imprimirDados();
	
	}
}
