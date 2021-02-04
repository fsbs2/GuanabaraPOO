package bancos;

public class Main {
	public static void main( String args[]) {
		ContaBanco jubileu = new ContaBanco();
		jubileu.abrirConta("cc");
		jubileu.setUsuario("Jubileu");
		jubileu.setNumConta(123);
		jubileu.depositar(200);
		jubileu.mensalidade();
		jubileu.statusConta();
		
		ContaBanco creuza = new ContaBanco();
		creuza.abrirConta("CP");
		creuza.setUsuario("Creuza");
		creuza.setNumConta(455);
		creuza.depositar(500);
		creuza.mensalidade();
		creuza.statusConta();
		
	}
}
