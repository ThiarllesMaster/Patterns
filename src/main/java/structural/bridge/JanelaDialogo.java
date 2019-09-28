package structural.bridge;

public class JanelaDialogo extends JanelaAbstrata{

	public JanelaDialogo(JanelaImplementada janela) {
		super(janela);	
	}

	@Override
	public void desenhar() {
		desenharBotao("Desenhando botão");
		
	}

}
