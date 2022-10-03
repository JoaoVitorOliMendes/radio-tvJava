package atvPoo.fabrica;

public class TV extends Eletrodomestico {
	
	private int tamanho, canal, volume;
	
	public TV(int tamanho, int voltagem) {
		super(false, voltagem);
		this.tamanho = tamanho;
		this.canal = 0;
		this.volume = 0;
	}
	
	@Override
	public void ligar() {
		this.setLigado(true);
		this.canal = 3;
		this.volume = 25;
	}
	
	@Override
	public void desligar() {
		this.setLigado(false);
		this.canal = 0;
		this.volume = 0;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "TV [tamanho=" + tamanho + ", canal=" + canal + ", volume=" + volume + "]";
	}
}
