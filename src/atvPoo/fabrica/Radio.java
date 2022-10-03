package atvPoo.fabrica;

public class Radio extends Eletrodomestico {

	public static final int AM = 1;
	public static final int FM = 2;
	
	private int banda, volume;
	private float sintonia;
	
	public Radio(int voltagem) {
		super(false, voltagem);
		this.banda = Radio.FM;
		this.sintonia = 0;
		this.volume = 0;
	}
	
	@Override
	public void ligar() {
		this.setLigado(true);
		this.banda = Radio.FM;
		this.sintonia = 88.1f;
		this.volume = 25;
	}
	
	@Override
	public void desligar() {
		this.setLigado(false);
		this.sintonia = 0;
		this.volume = 0;
	}

	public int getBanda() {
		return banda;
	}

	public void setBanda(int banda) {
		this.banda = banda;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public float getSintonia() {
		return sintonia;
	}

	public void setSintonia(float sintonia) {
		this.sintonia = sintonia;
	}

	@Override
	public String toString() {
		return "Radio [banda=" + banda + ", volume=" + volume + ", sintonia=" + sintonia + "]";
	}
}
