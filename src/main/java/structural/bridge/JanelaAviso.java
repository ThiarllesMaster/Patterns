package structural.bridge;

public class JanelaAviso extends JanelaAbstrata{

	public JanelaAviso(JanelaImplementada janela) {
		super(janela);
	}

	@Override
	public void desenhar() {
		desenharJanela("Desenhando janela...");
		
	}

}
