package br.com.liol.ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import br.com.liol.entities.Aluno;

import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PerfilAlunoPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldNome;
	private JTextField textFieldCPF;
	private JTextField textFieldDataNasc;
	private JTextField textFieldPeso;
	private JLabel lblNome;
	private JLabel lblCPF;
	private JLabel lblDataNasc;
	private JLabel lblTelefone;
	private JLabel lblPeso;
	private JLabel lbAltura;
	private JLabel lblEmail;
	private JLabel lblKg;
	private JLabel lblMetros;
	private JTextField textFieldAltura;
	private JTextField textFieldTelefone;
	private JTextField textFieldEmail;
	private JLabel lblMatricula;
	private JLabel lblObjetivo;
	private JRadioButton rdbtnAtiva;
	private JRadioButton rdbtnExpirada;
	private JRadioButton rdbtnCancelada;

	private JRadioButton rdbtnHipertrofia;
	private JRadioButton rdbtnEmagrecimento;
	private JRadioButton rdbtnCondicionamento;
	
	private MenuBase menuBase;

	/**
	 * Create the panel.
	 */
	public PerfilAlunoPanel(MenuBase menuBase, Aluno aluno) {
		this.menuBase = menuBase;
		setForeground(new Color(128, 128, 192));
		setBackground(new Color(0, 0, 0));
		setLayout(null);
		
		JLabel lblTitulo = new JLabel("Perfil aluno");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setBounds(271, 43, 128, 20);
		add(lblTitulo);
		
		textFieldNome = new JTextField();
		textFieldNome.setForeground(new Color(255, 255, 255));
		textFieldNome.setEditable(false);
		textFieldNome.setBorder(new LineBorder(new Color(124, 77, 255), 2, true));
		textFieldNome.setBackground(Color.BLACK);
		textFieldNome.setBounds(178, 102, 131, 18);
		add(textFieldNome);
		textFieldNome.setColumns(10);
		
		textFieldCPF = new JTextField();
		textFieldCPF.setForeground(new Color(255, 255, 255));
		textFieldCPF.setEditable(false);
		textFieldCPF.setBackground(Color.BLACK);
		textFieldCPF.setBorder(new LineBorder(new Color(124, 77, 255), 2, true));
		textFieldCPF.setBounds(178, 130, 131, 18);
		add(textFieldCPF);
		textFieldCPF.setColumns(10);
		
		textFieldDataNasc = new JTextField();
		textFieldDataNasc.setForeground(new Color(255, 255, 255));
		textFieldDataNasc.setEditable(false);
		textFieldDataNasc.setBackground(Color.BLACK);
		textFieldDataNasc.setBorder(new LineBorder(new Color(124, 77, 255), 2, true));
		textFieldDataNasc.setBounds(178, 158, 131, 18);
		add(textFieldDataNasc);
		textFieldDataNasc.setColumns(10);
		
		textFieldPeso = new JTextField();
		textFieldPeso.setForeground(new Color(255, 255, 255));
		textFieldPeso.setEditable(false);
		textFieldPeso.setBorder(new LineBorder(new Color(124, 77, 255), 2, true));
		textFieldPeso.setBackground(Color.BLACK);
		textFieldPeso.setColumns(10);
		textFieldPeso.setBounds(178, 214, 101, 18);
		add(textFieldPeso);
		
		lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setForeground(new Color(255, 255, 255));
		lblNome.setBounds(58, 102, 44, 17);
		add(lblNome);
		
		lblCPF = new JLabel("CPF");
		lblCPF.setForeground(Color.WHITE);
		lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCPF.setBounds(58, 129, 44, 17);
		add(lblCPF);
		
		lblDataNasc = new JLabel("Data nascimento");
		lblDataNasc.setForeground(Color.WHITE);
		lblDataNasc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDataNasc.setBounds(58, 157, 128, 17);
		add(lblDataNasc);
		
		lblTelefone = new JLabel("Telefone");
		lblTelefone.setForeground(Color.WHITE);
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTelefone.setBounds(58, 185, 80, 17);
		add(lblTelefone);
		
		lblPeso = new JLabel("Peso");
		lblPeso.setForeground(Color.WHITE);
		lblPeso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPeso.setBounds(58, 213, 44, 17);
		add(lblPeso);
		
		lbAltura = new JLabel("Altura");
		lbAltura.setForeground(Color.WHITE);
		lbAltura.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbAltura.setBounds(58, 241, 44, 17);
		add(lbAltura);
		
		lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmail.setBounds(58, 269, 44, 17);
		add(lblEmail);
		
		lblKg = new JLabel("Kg");
		lblKg.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblKg.setForeground(new Color(255, 255, 255));
		lblKg.setBounds(289, 214, 44, 25);
		add(lblKg);
		
		lblMetros = new JLabel("M");
		lblMetros.setForeground(Color.WHITE);
		lblMetros.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMetros.setBounds(289, 242, 44, 25);
		add(lblMetros);
		
		JButton btnNewButton = new JButton("Consultar plano");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuBase.mostrarPainelTelaCheia(
                        new PlanoAlunoPanel(menuBase, aluno));
			}
		});
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(198, 176, 255));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(58, 335, 150, 20);
		add(btnNewButton);
		
		JButton btnConsultarTreino = new JButton("Consultar treino");
		btnConsultarTreino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuBase.mostrarPainelTelaCheia(
                        new TreinoAlunoPanel(menuBase, aluno));
			}
		});
		btnConsultarTreino.setBorderPainted(false);
		btnConsultarTreino.setBackground(new Color(198, 176, 255));
		btnConsultarTreino.setForeground(new Color(0, 0, 0));
		btnConsultarTreino.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnConsultarTreino.setBounds(218, 335, 150, 20);
		add(btnConsultarTreino);
		
		textFieldAltura = new JTextField();
		textFieldAltura.setForeground(new Color(255, 255, 255));
		textFieldAltura.setEditable(false);
		textFieldAltura.setColumns(10);
		textFieldAltura.setBorder(new LineBorder(new Color(124, 77, 255), 2, true));
		textFieldAltura.setBackground(Color.BLACK);
		textFieldAltura.setBounds(178, 242, 101, 18);
		add(textFieldAltura);
		
		textFieldTelefone = new JTextField();
		textFieldTelefone.setForeground(new Color(255, 255, 255));
		textFieldTelefone.setEditable(false);
		textFieldTelefone.setColumns(10);
		textFieldTelefone.setBorder(new LineBorder(new Color(124, 77, 255), 2, true));
		textFieldTelefone.setBackground(Color.BLACK);
		textFieldTelefone.setBounds(178, 184, 131, 18);
		add(textFieldTelefone);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setForeground(new Color(255, 255, 255));
		textFieldEmail.setEditable(false);
		textFieldEmail.setColumns(10);
		textFieldEmail.setBorder(new LineBorder(new Color(124, 77, 255), 2, true));
		textFieldEmail.setBackground(Color.BLACK);
		textFieldEmail.setBounds(178, 270, 131, 18);
		add(textFieldEmail);
		
		rdbtnCondicionamento = new JRadioButton("Condicionamento");
		rdbtnCondicionamento.setEnabled(false);
		rdbtnCondicionamento.setFocusable(false);
		rdbtnCondicionamento.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnCondicionamento.setBackground(Color.BLACK);
		rdbtnCondicionamento.setForeground(new Color(255, 255, 255));
		rdbtnCondicionamento.setBounds(430, 290, 156, 20);
		add(rdbtnCondicionamento);
		
		rdbtnEmagrecimento = new JRadioButton("Emagrecimento");
		rdbtnEmagrecimento.setEnabled(false);
		rdbtnEmagrecimento.setFocusable(false);
		rdbtnEmagrecimento.setForeground(new Color(255, 255, 255));
		rdbtnEmagrecimento.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnEmagrecimento.setBackground(Color.BLACK);
		rdbtnEmagrecimento.setBounds(430, 268, 156, 20);
		add(rdbtnEmagrecimento);
		
		rdbtnHipertrofia = new JRadioButton("Hipertrofia");
		rdbtnHipertrofia.setEnabled(false);
		rdbtnHipertrofia.setFocusable(false);
		rdbtnHipertrofia.setForeground(new Color(255, 255, 255));
		rdbtnHipertrofia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnHipertrofia.setBackground(Color.BLACK);
		rdbtnHipertrofia.setBounds(430, 246, 156, 20);
		add(rdbtnHipertrofia);
		
		rdbtnExpirada = new JRadioButton("Expirada");
		rdbtnExpirada.setEnabled(false);
		rdbtnExpirada.setFocusable(false);
		rdbtnExpirada.setForeground(new Color(255, 255, 255));
		rdbtnExpirada.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnExpirada.setBackground(Color.BLACK);
		rdbtnExpirada.setBounds(430, 148, 156, 20);
		add(rdbtnExpirada);
		
		rdbtnCancelada = new JRadioButton("Cancelada");
		rdbtnCancelada.setEnabled(false);
		rdbtnCancelada.setFocusable(false);
		rdbtnCancelada.setForeground(new Color(255, 255, 255));
		rdbtnCancelada.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnCancelada.setBackground(Color.BLACK);
		rdbtnCancelada.setBounds(430, 170, 156, 20);
		add(rdbtnCancelada);
		
		rdbtnAtiva = new JRadioButton("Ativa");
		rdbtnAtiva.setEnabled(false);
		rdbtnAtiva.setFocusable(false);
		rdbtnAtiva.setForeground(new Color(255, 255, 255));
		rdbtnAtiva.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnAtiva.setBackground(Color.BLACK);
		rdbtnAtiva.setBounds(430, 126, 156, 20);
		add(rdbtnAtiva);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setForeground(new Color(124, 77, 255));
		btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEditar.setBounds(132, 422, 91, 21);
		add(btnEditar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setForeground(new Color(124, 77, 255));
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSalvar.setBounds(289, 422, 91, 21);
		add(btnSalvar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setForeground(new Color(124, 77, 255));
		btnExcluir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnExcluir.setBounds(446, 422, 91, 21);
		add(btnExcluir);
		
		lblMatricula = new JLabel("MATRÍCULA");
		lblMatricula.setForeground(new Color(255, 255, 255));
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMatricula.setBounds(430, 102, 112, 18);
		add(lblMatricula);
		
		lblObjetivo = new JLabel("OBJETIVO");
		lblObjetivo.setForeground(Color.WHITE);
		lblObjetivo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblObjetivo.setBounds(430, 217, 96, 18);
		add(lblObjetivo);
		
//Preenche os campos com os dados dos alunos
		textFieldNome.setText(aluno.getNome());

		textFieldCPF.setText(aluno.getCpf());

		textFieldDataNasc.setText(
		        aluno.getDataNascimento());

		textFieldTelefone.setText(
		        aluno.getTelefone());

		textFieldPeso.setText(
		        String.valueOf(aluno.getPeso()));

		textFieldAltura.setText(
		        String.valueOf(aluno.getAltura()));

		textFieldEmail.setText(
		        aluno.getEmail());
//Aqui vão os enums
		switch (aluno.getMatricula()) {

		case ATIVA:
		    rdbtnAtiva.setSelected(true);
		    break;

		case EXPIRADA:
		    rdbtnExpirada.setSelected(true);
		    break;

		case CANCELADA:
		    rdbtnCancelada.setSelected(true);
		    break;
		}
		switch (aluno.getObjetivo()) {

		case HIPERTROFIA:
		    rdbtnHipertrofia.setSelected(true);
		    break;

		case EMAGRECIMENTO:
		    rdbtnEmagrecimento.setSelected(true);
		    break;

		case CONDICIONAMENTO:
		    rdbtnCondicionamento.setSelected(true);
		    break;
		}
		
	}
}