package br.com.liol.ui;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ButtonGroup;

public class RelatoriosMenuPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldNome;
	private JTextField textFieldCpf;
	private final ButtonGroup buttonGroupTipoRelatorio = new ButtonGroup();

	/**
	 * Create the panel.
	 */
	public RelatoriosMenuPanel() {
		setBackground(new Color(0, 0, 0));
		setLayout(null);
		setBounds(10, 80, 625, 469);
		
		JRadioButton rdbtnConsultarFaturametoMensal = new JRadioButton("Consultar faturamento mensal");
		buttonGroupTipoRelatorio.add(rdbtnConsultarFaturametoMensal);
		rdbtnConsultarFaturametoMensal.setForeground(Color.WHITE);
		rdbtnConsultarFaturametoMensal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnConsultarFaturametoMensal.setBackground(Color.BLACK);
		rdbtnConsultarFaturametoMensal.setBounds(10, 6, 253, 21);
		add(rdbtnConsultarFaturametoMensal);
		
		JRadioButton rdbtnConsultarMesesAnteriores = new JRadioButton("Consultar meses anteriores");
		buttonGroupTipoRelatorio.add(rdbtnConsultarMesesAnteriores);
		rdbtnConsultarMesesAnteriores.setForeground(Color.WHITE);
		rdbtnConsultarMesesAnteriores.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnConsultarMesesAnteriores.setBackground(Color.BLACK);
		rdbtnConsultarMesesAnteriores.setBounds(10, 41, 253, 21);
		add(rdbtnConsultarMesesAnteriores);
		
		JRadioButton rdbtnConsultarInadimplencia = new JRadioButton("Consultar inadimplência");
		buttonGroupTipoRelatorio.add(rdbtnConsultarInadimplencia);
		rdbtnConsultarInadimplencia.setForeground(Color.WHITE);
		rdbtnConsultarInadimplencia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnConsultarInadimplencia.setBackground(Color.BLACK);
		rdbtnConsultarInadimplencia.setBounds(10, 76, 253, 21);
		add(rdbtnConsultarInadimplencia);
		
		JRadioButton rdbtnConsultarHistoricoFinanceiroAluno = new JRadioButton("Consultar histórico financeiro do aluno");
		buttonGroupTipoRelatorio.add(rdbtnConsultarHistoricoFinanceiroAluno);
		rdbtnConsultarHistoricoFinanceiroAluno.setForeground(Color.WHITE);
		rdbtnConsultarHistoricoFinanceiroAluno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnConsultarHistoricoFinanceiroAluno.setBackground(Color.BLACK);
		rdbtnConsultarHistoricoFinanceiroAluno.setBounds(10, 111, 284, 21);
		add(rdbtnConsultarHistoricoFinanceiroAluno);
		
		JRadioButton rdbtnConsultarFaturamentoTotal = new JRadioButton("Consultar faturamento total");
		buttonGroupTipoRelatorio.add(rdbtnConsultarFaturamentoTotal);
		rdbtnConsultarFaturamentoTotal.setForeground(Color.WHITE);
		rdbtnConsultarFaturamentoTotal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnConsultarFaturamentoTotal.setBackground(Color.BLACK);
		rdbtnConsultarFaturamentoTotal.setBounds(10, 146, 253, 21);
		add(rdbtnConsultarFaturamentoTotal);
		
		textFieldNome = new JTextField();
		textFieldNome.setDisabledTextColor(Color.WHITE);
		textFieldNome.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textFieldNome.setColumns(10);
		textFieldNome.setCaretColor(Color.BLACK);
		textFieldNome.setBorder(new LineBorder(new Color(124, 77, 255), 2, true));
		textFieldNome.setBackground(Color.BLACK);
		textFieldNome.setBounds(10, 197, 96, 18);
		add(textFieldNome);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setForeground(Color.WHITE);
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setBounds(116, 199, 44, 16);
		add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setForeground(Color.WHITE);
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCpf.setBounds(116, 227, 44, 16);
		add(lblCpf);
		
		textFieldCpf = new JTextField();
		textFieldCpf.setDisabledTextColor(Color.WHITE);
		textFieldCpf.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textFieldCpf.setColumns(10);
		textFieldCpf.setCaretColor(Color.BLACK);
		textFieldCpf.setBorder(new LineBorder(new Color(124, 77, 255), 2, true));
		textFieldCpf.setBackground(Color.BLACK);
		textFieldCpf.setBounds(10, 225, 96, 18);
		add(textFieldCpf);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnImprimir.setForeground(new Color(124, 77, 255));
		btnImprimir.setBounds(10, 280, 150, 31);
		add(btnImprimir);

	}
}
