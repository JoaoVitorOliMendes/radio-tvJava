package atvPoo.fabrica;

public abstract class Eletrodomestico {

	private boolean ligado;
	private int voltagem;
	
	public Eletrodomestico() {
		super();
	}
	public Eletrodomestico(boolean ligado, int voltagem) {
		super();
		this.ligado = ligado;
		this.voltagem = voltagem;
	}
	
	public abstract void ligar();
	public abstract void desligar();
	
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public int getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
}
