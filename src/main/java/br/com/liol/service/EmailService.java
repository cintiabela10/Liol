package br.com.liol.service;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class EmailService {

    private final Properties config;
    private final String remetente;
    private final String senha;
    private final String nomeExibicao;

    public EmailService() {
        this.config = carregarConfig();
        this.remetente = config.getProperty("mail.username");
        this.senha = config.getProperty("mail.password");
        this.nomeExibicao = config.getProperty("mail.from.name", "Liol - Sistema Gestor de Academia");

        if (remetente == null || remetente.isBlank() || senha == null || senha.isBlank()) {
            throw new IllegalStateException("Credenciais de e-mail não configuradas em email.properties.");
        }
    }

    private Properties carregarConfig() {
        Properties props = new Properties();
        try (InputStream in = getClass().getResourceAsStream("/config/email.properties")) {
            if (in == null) {
                throw new IllegalStateException(
                    "Arquivo /config/email.properties não encontrado. Crie-o a partir do email.properties.example."
                );
            }
            props.load(in);
        } catch (IOException e) {
            throw new RuntimeException("Erro ao carregar configurações de e-mail.", e);
        }
        return props;
    }

    public void enviarCodigoRecuperacao(String destinatario, String codigo) {
        String assunto = "Código de recuperação de senha - Sistema Liol";
        String mensagem = """
                Olá,

                Recebemos uma solicitação para redefinir a sua senha de acesso ao sistema da Academia Liol.
                Use o código abaixo para cadastrar uma nova senha:

                Código: %s

                Caso não tenha sido você quem solicitou, ignore este e-mail ou avise a gerência — sua senha atual continua sendo a mesma.

                Equipe Liol
                """.formatted(codigo);

        enviar(destinatario, assunto, mensagem);
    }

    public void enviarEmailBoasVindas(String destinatario, String nomeFuncionario) {
        String assunto = "Bem-vindo(a) à equipe - Sistema Liol";
        String mensagem = """
                Olá, %s!

                Seu cadastro na Academia Liol foi concluído e o seu acesso já está liberado.
                Você já pode entrar na plataforma utilizando o e-mail e a senha já definidos anteriomente no cadastro.

                Qualquer dúvida sobre suas permissões ou sobre o uso do sistema, procure a gerência.

                Bom trabalho!
                Equipe Liol
                """.formatted(nomeFuncionario);

        enviar(destinatario, assunto, mensagem);
    }

    private void enviar(String destinatario, String assunto, String texto) {
        if (destinatario == null || destinatario.isBlank()) {
            throw new IllegalArgumentException("O e-mail do destinatário não pode estar vazio.");
        }

        Session sessao = Session.getInstance(config, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(remetente, senha);
            }
        });

        try {
            Message email = new MimeMessage(sessao);
            // UTF-8 garante que acentos no nome da academia não virem caracteres estranhos
            email.setFrom(new InternetAddress(remetente, nomeExibicao, "UTF-8"));
            email.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario.trim()));
            email.setSubject(assunto);
            email.setText(texto);

            Transport.send(email);
        } catch (MessagingException | UnsupportedEncodingException e) {
            throw new RuntimeException("Não foi possível enviar o e-mail para " + destinatario, e);
        }
    }
}