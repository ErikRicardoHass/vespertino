package exercicio08;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Janela {

	public void janelaGrafica(){
		
		//JFRAME
		JFrame formulario = new JFrame();
		formulario.setSize(500, 250);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setResizable(false);
		formulario.setTitle("CALCULADERA");
		
		//JLABEL
		JLabel n1 = new JLabel("Digite o 1º número:");
		n1.setBounds(10, 10, 200, 20);
		
		JLabel n2 = new JLabel("Digite o 2º número:");
		n2.setBounds(10, 30, 200, 20);
		
		JLabel informa = new JLabel();
		
		//JTEXTFIELD
		JTextField n1Digitado = new JTextField();
		n1Digitado.setBounds(130, 10, 200, 20);
		
		JTextField n2Digitado = new JTextField();
		n2Digitado.setBounds(130, 30, 200, 20);
		
		//BUTTON
		Button botao = new Button("Resultado");
		botao.setBounds(160, 70, 200, 20);
		
		//RADIOBUTTON
		JRadioButton soma = new JRadioButton("Soma");
		soma.setBounds(25, 50, 100, 20);
		soma.setActionCommand("soma");

		JRadioButton subtracao = new JRadioButton("Subtração");
		subtracao.setBounds(125, 50, 100, 20);
		subtracao.setActionCommand("subtracao");
		
		JRadioButton multiplicacao = new JRadioButton("Multilicação");
		multiplicacao.setBounds(225, 50, 100, 20);
		multiplicacao.setActionCommand("multiplicacao");

		JRadioButton divisao = new JRadioButton("Divisao");
		divisao.setBounds(325, 50, 100, 20);
		divisao.setActionCommand("divisao");
		
		//ButtonGroup
		ButtonGroup operacoes = new ButtonGroup();
		operacoes.add(soma);
		operacoes.add(subtracao);
		operacoes.add(multiplicacao);
		operacoes.add(divisao);
		
		//AÇAO
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double num1,num2, resultado;
				num1 = Integer.parseInt(n1Digitado.getText());
				num2 = Integer.parseInt(n2Digitado.getText());
				if(operacoes.getSelection().getActionCommand().equals("soma")){
					resultado = num1+num2;
					formulario.setVisible(false);
					informa.setText("O Resultado é: "+resultado);
					informa.setBounds(10, 70, 200, 20);
					botao.setBounds(160, 90, 200, 20);
					formulario.add(informa);
					formulario.setVisible(true);
					
					
				}else if(operacoes.getSelection().getActionCommand().equals("subtracao")){
					resultado = num1-num2;
					formulario.setVisible(false);
					informa.setText("O Resultado é: "+resultado);
					informa.setBounds(10, 70, 200, 20);
					botao.setBounds(160, 90, 200, 20);
					formulario.add(informa);
					formulario.setVisible(true);
					
				}else if(operacoes.getSelection().getActionCommand().equals("divisao")){
					resultado = num1/num2;	
					formulario.setVisible(false);
					informa.setText("O Resultado é: "+resultado);
					informa.setBounds(10, 70, 200, 20);
					botao.setBounds(160, 90, 200, 20);
					formulario.add(informa);
					formulario.setVisible(true);
					
				}else if(operacoes.getSelection().getActionCommand().equals("multiplicacao")){
					resultado = num1*num2;	
					formulario.setVisible(false);
					informa.setText("O Resultado é: "+resultado);
					informa.setBounds(10, 70, 200, 20);
					botao.setBounds(160, 90, 200, 20);
					formulario.add(informa);
					formulario.setVisible(true);
					
				}
				
			}
		});
		
		//ADICIONAR ITENS AO JFRAME FORMULARIO
		formulario.add(n1);
		formulario.add(n1Digitado);
		formulario.add(n2);
		formulario.add(n2Digitado);
		formulario.add(botao);
		formulario.add(soma);
		formulario.add(subtracao);
		formulario.add(multiplicacao);
		formulario.add(divisao);
		
		//ALTERAR VISIBILIDADE JFRAME FORMULARIO
		formulario.setVisible(true);
		
	}
	
}
