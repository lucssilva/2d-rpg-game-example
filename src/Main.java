import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		Game game = new Game();
		JFrame janela = new JFrame();
		
		janela.add(game);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setResizable(false);
		
		janela.pack();
		janela.setTitle("RPG Exemplo");
		janela.setVisible(true);
	}

}
