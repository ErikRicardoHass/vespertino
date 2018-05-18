package exercicio11;

import javax.swing.JFrame;
import javax.swing.JLabel;
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
		
		//JLABEL
		JLabel nota1 = new JLabel("Nota 1:");
		nota1.setBounds(10, 10, 200, 20);
		JLabel nota2 = new JLabel("Nota 2:");
		nota2.setBounds(10, 30, 200, 20);
		JLabel nota3 = new JLabel("Nota 3:");
		nota3.setBounds(10, 50, 200, 20);
		JLabel nota4 = new JLabel("Nota 4:");
		nota4.setBounds(10, 70, 200, 20);
		JLabel faltas = new JLabel("Faltas:");
		faltas.setBounds(400, 10, 200, 20);
		
		//JTEXTFIELD
		JTextField nota1Digitado = new JTextField();
		nota1Digitado.setBounds(100, 10, 200, 20);
		JTextField nota2Digitado = new JTextField();
		nota2Digitado.setBounds(100, 30, 200, 20);
		JTextField nota3Digitado = new JTextField();
		nota3Digitado.setBounds(100, 50, 200, 20);
		JTextField nota4Digitado = new JTextField();
		nota4Digitado.setBounds(100, 70, 200, 20);
		JTextField faltasDigitado = new JTextField();
		faltasDigitado.setBounds(400, 30, 40, 20);
		
		//Button
		
		
		//AÇAO
		
		
		//ADICIONAR ITENS AO JFRAME FORMULARIO
		formulario.add(nota1);
		formulario.add(nota1Digitado);
		formulario.add(nota2);
		formulario.add(nota2Digitado);
		formulario.add(nota3);
		formulario.add(nota3Digitado);
		formulario.add(nota4);
		formulario.add(nota4Digitado);
		formulario.add(faltas);
		formulario.add(faltasDigitado);
		
		
		
		//ALTERAR VISIBILIDADE DO JFRAME FORMULARIO
		formulario.setVisible(true);
	}
	
}
