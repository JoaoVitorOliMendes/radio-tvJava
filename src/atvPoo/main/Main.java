package atvPoo.main;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import atvPoo.fabrica.Radio;
import atvPoo.fabrica.TV;

public class Main {
	
	public static Radio radio = new Radio(220);
	public static TV tv = new TV(120, 220);
	
	public static void main(String[] args) {
		
		boolean running = true;
		while (running) {
			String[] menus = {"Acessar tv", "Acessar radio", "Sair"};
			int op = JOptionPane.showOptionDialog(null,
					"Defina a opcao abaixo",
					"Menu Sistema", 1, 1,
					null, menus, menus[0]);
			switch(op) {
			case 0:
				showTVMenu();
				break;
			case 1:
				showRadioMenu();
				break;
			case 2:
				running = false;
				break;
			}
		}
		
	}
	
	public static void showRadioMenu() {
		boolean radioRunning = true;
		while (radioRunning) {
			String metodo1 = radio.isLigado() ? "Desligar" : "Ligar";
			String[] menus = {metodo1, "Mudar sintonia", "Aumentar volume", "Mutar", "Imprimir estado do radio", "Sair"};
			String menuDesc = "O radio agora esta " + (radio.isLigado() ? "Ligado 🟢" : "Desligado 🔴");
			
			int op = JOptionPane.showOptionDialog(null,
					menuDesc,
					"Radio", 1, 1,
					null, menus, menus[0]);
			switch(op) {
			case 0:
				if(radio.isLigado()) {
					radio.desligar();
				}else {
					radio.ligar();
				}
				break;
			case 1:
				JTextField sintonia = new JTextField();
				Object[] field = {
						"Digite a nova sintonia:", sintonia
				};
				int yOn = JOptionPane.showConfirmDialog(null, field, "Trocar sintonia", JOptionPane.YES_NO_OPTION);
				if(yOn == 0) {
					radio.setSintonia(Float.valueOf(sintonia.getText()));
				}
				break;
			case 2:
				JTextField volume = new JTextField();
				Object[] field2 = {
						"Digite o novo volume:", volume
				};
				int yOn2 = JOptionPane.showConfirmDialog(null, field2, "Trocar volume", JOptionPane.YES_NO_OPTION);
				if(yOn2 == 0) {
					radio.setVolume(Integer.valueOf(volume.getText()));
				}
				break;
			case 3:
				radio.setVolume(0);
				break;
			case 4:
				JOptionPane.showMessageDialog(null, radio.toString());
				break;
			case 5:
				radioRunning = false;
				break;
			}
		}
	}
	
	public static void showTVMenu() {
		boolean tvRunning = true;
		while (tvRunning) {
			String metodo1 = tv.isLigado() ? "Desligar" : "Ligar";
			String[] menus = {metodo1, "Mudar de canal", "Aumentar volume", "Mutar", "Imprimir estado da tv", "Sair"};
			String menuDesc = "A tv agora esta " + (tv.isLigado() ? "Ligado 🟢" : "Desligado 🔴");
			
			int op = JOptionPane.showOptionDialog(null,
					menuDesc,
					"TV", 1, 1,
					null, menus, menus[0]);
			switch(op) {
			case 0:
				if(tv.isLigado()) {
					tv.desligar();
				}else {
					tv.ligar();
				}
				break;
			case 1:
				JTextField canal = new JTextField();
				Object[] field = {
						"Digite o novo canal:", canal
				};
				int yOn = JOptionPane.showConfirmDialog(null, field, "Trocar canal", JOptionPane.YES_NO_OPTION);
				if(yOn == 0) {
					tv.setCanal(Integer.valueOf(canal.getText()));
				}
				break;
			case 2:
				JTextField volume = new JTextField();
				Object[] field2 = {
						"Digite o novo volume:", volume
				};
				int yOn2 = JOptionPane.showConfirmDialog(null, field2, "Trocar volume", JOptionPane.YES_NO_OPTION);
				if(yOn2 == 0) {
					tv.setVolume(Integer.valueOf(volume.getText()));
				}
				break;
			case 3:
				tv.setVolume(0);
				break;
			case 4:
				JOptionPane.showMessageDialog(null, tv.toString());
				break;
			case 5:
				tvRunning = false;
				break;
			}
		}
	}
}
