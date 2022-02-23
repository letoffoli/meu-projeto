package PortoSeguro1;

public class TesteAutomovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciando um objeto da classe automovel
		Automovel auto = new Automovel("Leticia Toffoli","Celta","RSA2J34",2015);
		
		auto.imprimirInfo();
		System.out.println("************************************");
		System.out.println("****Transferência de Proprietário");
		auto.setNomeProprietario("Emily");
		System.out.println("\n**********************************");
		auto.imprimirInfo();
	}

}
