package exercicio03;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela {

	//VARIAVEIS
	double nota1, nota2, nota3, nota4, media; 

	public void janelaGrafica(){

		//INICIAR JFRAME
		JFrame formulario = new JFrame();
		formulario.setSize(500, 250);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setResizable(false);

		//INICAR JLABEL
		JLabel n1 = new JLabel("Digite a 1º nota:");
		n1.setBounds(10, 10, 200, 20);
		JLabel n2 = new JLabel("Digite a 2º nota:");
		n2.setBounds(10, 30, 200, 20);
		JLabel n3 = new JLabel("Digite a 3º nota:");
		n3.setBounds(10, 50, 200, 20);
		JLabel n4 = new JLabel("Digite a 4º nota:");
		n4.setBounds(10, 70, 200, 20);

		//SITUAÇÂO
		JLabel situacao = new JLabel();
		situacao.setBounds(10, 90, 200, 20);

		//INICAR JTEXTFIELD
		JTextField n1Digitado = new JTextField();
		n1Digitado.setBounds(200, 10, 200, 20);
		JTextField n2Digitado = new JTextField();
		n2Digitado.setBounds(200, 30, 200, 20);
		JTextField n3Digitado = new JTextField();
		n3Digitado.setBounds(200, 50, 200, 20);
		JTextField n4Digitado = new JTextField();
		n4Digitado.setBounds(200, 70, 200, 20);

		//BOTAO
		Button botao = new Button("Verificar Situação");
		botao.setBounds(100, 100, 200, 20);

		//AÇAO
		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try{
					nota1 = Double.parseDouble(n1Digitado.getText());
					nota2 = Double.parseDouble(n2Digitado.getText());
					nota3 = Double.parseDouble(n3Digitado.getText());
					nota4 = Double.parseDouble(n4Digitado.getText());

					media=(nota1+nota2+nota3+nota4)/4;
					if(media<5){
						situacao.setText("Situação: REPROVADO!");
						formulario.setVisible(false);
						botao.setBounds(100, 110, 200, 20);
					}else if(media<7){
						situacao.setText("Situação: EM EXAME!");
						formulario.setVisible(false);
						botao.setBounds(100, 110, 200, 20);
					}else if(media<=10){
						situacao.setText("Situação: APROVADO!");
						formulario.setVisible(false);
						botao.setBounds(100, 110, 200, 20);
					}
						formulario.add(situacao);
						formulario.setVisible(true);
					}catch (Exception e2) {
						situacao.setText("Situação: REPROVADO!");
						formulario.setVisible(false);
						botao.setBounds(100, 110, 200, 20);
						formulario.add(situacao);
						formulario.setVisible(true);
					}
				}
			});

		//ADICIONAR ITENS AO JFRAME
		formulario.add(n1);
		formulario.add(n1Digitado);
		formulario.add(n2);
		formulario.add(n2Digitado);
		formulario.add(n3);
		formulario.add(n3Digitado);
		formulario.add(n4);
		formulario.add(n4Digitado);
		formulario.add(botao);

		//ALTERAR VISIBILIDADE
		formulario.setVisible(true);

		}

	}
