package br.com.liol.ui;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.Point;

public class RelatoriosPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public RelatoriosPanel() {
		setBackground(new Color(0, 0, 0));
		setBounds(10, 10, 680, 483);
		setLayout(null);
		
		JLabel lblRelatorios = new JLabel("Relatórios");
		lblRelatorios.setHorizontalAlignment(SwingConstants.CENTER);
		lblRelatorios.setForeground(Color.WHITE);
		lblRelatorios.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRelatorios.setBounds(259, 43, 161, 20);
		add(lblRelatorios);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(new Color(0, 0, 0));
		panelMenu.setBounds(10, 80, 330, 369);
		add(panelMenu);
		panelMenu.setLayout(null);
		
		RelatoriosMenuPanel menuRelatorios = new RelatoriosMenuPanel();

		panelMenu.removeAll();
		menuRelatorios.setBounds(0, 0, 330, 369);
		panelMenu.add(menuRelatorios);
		menuRelatorios.setLayout(null);
		
		
	}
}
