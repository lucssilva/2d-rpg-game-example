import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class Game extends JPanel implements Runnable {
	final int escala = 3;
	final int ladrilhoBase = 16;
	final int ladrilhoFinal = ladrilhoBase * escala;
	final int colunas = 16; // x
	final int linhas = 12; // y
	final int largura = colunas * ladrilhoFinal;
	final int altura = linhas * ladrilhoFinal;
	Thread gameThread;

	public Game() {
		this.setPreferredSize(new Dimension(largura, altura));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
	}

	public void start() {
		this.gameThread = new Thread(this);
		this.gameThread.start();
	}

	@Override
	public void run() {
		while (gameThread != null) {
			System.out.println("O inverno está chegando...");
		}
	}
}
