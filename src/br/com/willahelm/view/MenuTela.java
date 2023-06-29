package br.com.willahelm.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Window.Type;

public class MenuTela {

	private JFrame ChurrasFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuTela window = new MenuTela();
					window.ChurrasFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuTela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ChurrasFrame = new JFrame();
		ChurrasFrame.setForeground(Color.WHITE);
		ChurrasFrame.setTitle("Churras-APP");
		ChurrasFrame.setBackground(Color.WHITE);
		ChurrasFrame.setBounds(100, 100, 500, 300);
		ChurrasFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
