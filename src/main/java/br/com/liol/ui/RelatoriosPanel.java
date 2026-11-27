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

public class RelatoriosPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private final ButtonGroup buttonGroupRelatorio = new ButtonGroup();
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
		
		JRadioButton rdbtnConsultarFaturametoMensal = new JRadioButton("Consultar faturamento mensal");
		buttonGroupRelatorio.add(rdbtnConsultarFaturametoMensal);
		rdbtnConsultarFaturametoMensal.setBackground(new Color(0, 0, 0));
		rdbtnConsultarFaturametoMensal.setForeground(new Color(255, 255, 255));
		rdbtnConsultarFaturametoMensal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnConsultarFaturametoMensal.setBounds(18, 39, 253, 21);
		panelMenu.add(rdbtnConsultarFaturametoMensal);
		
		JRadioButton rdbtnConsultarMesesAnteriores = new JRadioButton("Consultar meses anteriores");
		buttonGroupRelatorio.add(rdbtnConsultarMesesAnteriores);
		rdbtnConsultarMesesAnteriores.setForeground(Color.WHITE);
		rdbtnConsultarMesesAnteriores.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnConsultarMesesAnteriores.setBackground(Color.BLACK);
		rdbtnConsultarMesesAnteriores.setBounds(18, 74, 253, 21);
		panelMenu.add(rdbtnConsultarMesesAnteriores);
		
		JRadioButton rdbtnConsultarHistoricoFinanceiroAluno = new JRadioButton("Consultar histórico financeiro do aluno");
		buttonGroupRelatorio.add(rdbtnConsultarHistoricoFinanceiroAluno);
		rdbtnConsultarHistoricoFinanceiroAluno.setForeground(Color.WHITE);
		rdbtnConsultarHistoricoFinanceiroAluno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnConsultarHistoricoFinanceiroAluno.setBackground(Color.BLACK);
		rdbtnConsultarHistoricoFinanceiroAluno.setBounds(18, 144, 284, 21);
		panelMenu.add(rdbtnConsultarHistoricoFinanceiroAluno);
		
		JRadioButton rdbtnConsultarInadimplencia = new JRadioButton("Consultar inadimplência");
		buttonGroupRelatorio.add(rdbtnConsultarInadimplencia);
		rdbtnConsultarInadimplencia.setForeground(Color.WHITE);
		rdbtnConsultarInadimplencia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnConsultarInadimplencia.setBackground(Color.BLACK);
		rdbtnConsultarInadimplencia.setBounds(18, 109, 253, 21);
		panelMenu.add(rdbtnConsultarInadimplencia);
		
		JRadioButton rdbtnConsultarFaturamentoTotal = new JRadioButton("Consultar faturamento total");
		buttonGroupRelatorio.add(rdbtnConsultarFaturamentoTotal);
		rdbtnConsultarFaturamentoTotal.setForeground(Color.WHITE);
		rdbtnConsultarFaturamentoTotal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnConsultarFaturamentoTotal.setBackground(Color.BLACK);
		rdbtnConsultarFaturamentoTotal.setBounds(18, 179, 253, 21);
		panelMenu.add(rdbtnConsultarFaturamentoTotal);
		
		textField = new JTextField();
		textField.setBackground(new Color(0, 0, 0));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField.setCaretColor(new Color(0, 0, 0));
		textField.setBorder(new LineBorder(new Color(124, 77, 255), 2, true));
		textField.setBounds(18, 230, 96, 18);
		panelMenu.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_1.setColumns(10);
		textField_1.setCaretColor(Color.BLACK);
		textField_1.setBorder(new LineBorder(new Color(124, 77, 255), 2, true));
		textField_1.setBackground(Color.BLACK);
		textField_1.setBounds(18, 258, 96, 18);
		panelMenu.add(textField_1);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(124, 232, 44, 12);
		panelMenu.add(lblNewLabel);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setForeground(Color.WHITE);
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCpf.setBounds(124, 260, 44, 12);
		panelMenu.add(lblCpf);
	}
}
