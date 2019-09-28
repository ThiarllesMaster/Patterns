package structural.bridge;

public class Client {
	
	public static void main(String[] args) {
		JanelaAviso janelaAviso = new JanelaAviso(new JanelaWindows());
		janelaAviso.desenhar();
	}

}
