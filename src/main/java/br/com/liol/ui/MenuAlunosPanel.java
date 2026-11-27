package br.com.liol.ui;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import java.util.List;

import br.com.liol.entities.Aluno;
import br.com.liol.mock.MockupAlunos;


public class MenuAlunosPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private MenuBase menuBase;

	/**
	 * Create the panel.
	 */
	public MenuAlunosPanel(MenuBase menuBase) {
		this.menuBase = menuBase;
		setBackground(new Color(0, 0, 0));
		setLayout(null);
		setBounds(10, 10, 680, 483);
		
		JLabel lblMenuAlunos = new JLabel("Menu Alunos");
		lblMenuAlunos.setBounds(288, 43, 104, 20);
		add(lblMenuAlunos);
		lblMenuAlunos.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMenuAlunos.setForeground(new Color(255, 255, 255));
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCadastrar.setBounds(284, 415, 111, 21);
		add(btnCadastrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setBorder(null);
		scrollPane.setBounds(71, 107, 537, 268);
		add(scrollPane);
		
		JPanel AlunosPanel = new JPanel();
		AlunosPanel.setForeground(new Color(255, 255, 255));
		AlunosPanel.setBackground(new Color(0, 0, 0));
		scrollPane.setViewportView(AlunosPanel);
		AlunosPanel.setLayout(new GridLayout(0, 3, 15, 15));
		
        List<Aluno> alunos = MockupAlunos.listar();

        for (Aluno aluno : alunos) {

            JButton btnAluno = new JButton(aluno.getNomeCompleto());

            btnAluno.setBackground(new Color(124, 77, 255));
            btnAluno.setForeground(Color.WHITE);
            btnAluno.setPreferredSize(
            	    new Dimension(100, 50));
            btnAluno.setFocusPainted(false);

            btnAluno.setFont(
                    new Font("Tahoma",
                    Font.PLAIN,
                    15));

            btnAluno.addActionListener(e -> {

            	menuBase.mostrarPainel(
                        new PerfilAlunoPanel(menuBase, aluno));

            });

            AlunosPanel.add(btnAluno);
        }

        scrollPane.setViewportView(AlunosPanel);
		
	}
	
}
