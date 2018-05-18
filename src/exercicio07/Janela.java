package exercicio07;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela {

	public void janelaGrafica(){
		//JFRAME
		JFrame formulario = new JFrame();
		formulario.setSize(500, 100);
		formulario.setResizable(false);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setTitle("TABUADA");
		
		//JLABEL
		JLabel numero = new JLabel("Digite um número:");
		numero.setBounds(10, 10, 200, 20);
		JLabel n0 = new JLabel();
		JLabel n1 = new JLabel();
		JLabel n2 = new JLabel();
		JLabel n3 = new JLabel();
		JLabel n4 = new JLabel();
		JLabel n5 = new JLabel();
		JLabel n6 = new JLabel();
		JLabel n7 = new JLabel();
		JLabel n8 = new JLabel();
		JLabel n9 = new JLabel();
		JLabel n10 = new JLabel();
		
		//JTEXTFIELD
		JTextField numeroDigitado =  new JTextField();
		numeroDigitado.setBounds(130, 10, 200, 20);
		
		//BUTTON
		Button botao = new Button("Mostrar Tabuada");
		botao.setBounds(160, 30, 200, 20);
		
		//AÇAO
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(numeroDigitado.getText());
				formulario.setVisible(false);
				formulario.setSize(500, 300);
				n0.setText(num+" X 0 = "+num*0);
				n0.setBounds(10, 30, 200, 20);
				
				n1.setText(num+" X 1 ="+num*1);
				n1.setBounds(10, 50, 200, 20);
				
				n2.setText(num+" X 2 ="+num*2);
				n2.setBounds(10, 70, 200, 20);
				
				n3.setText(num+" X 3 ="+num*3);
				n3.setBounds(10, 90, 200, 20);
				
				n4.setText(num+" X 4 ="+num*4);
				n4.setBounds(10, 110, 200, 20);
				
				n5.setText(num+" X 5 ="+num*5);
				n5.setBounds(10, 130, 200, 20);
				
				n6.setText(num+" X 6 ="+num*6);
				n6.setBounds(10, 150, 200, 20);
				
				n7.setText(num+" X 7 ="+num*7);
				n7.setBounds(10, 170, 200, 20);
				
				n8.setText(num+" X 8 ="+num*8);
				n8.setBounds(10, 190, 200, 20);
				
				n9.setText(num+" X 9 ="+num*9);
				n9.setBounds(10, 210, 200, 20);
				
				n10.setText(num+" X 10 ="+num*10);
				n10.setBounds(10, 230, 200, 20);
				
				botao.setBounds(160, 250, 200, 20);
				
				//ADICIONAR TABUADA AO JFRAME FORMULARIO
				formulario.add(n0);
				formulario.add(n1);
				formulario.add(n2);
				formulario.add(n3);
				formulario.add(n4);
				formulario.add(n5);
				formulario.add(n6);
				formulario.add(n7);
				formulario.add(n8);
				formulario.add(n9);
				formulario.add(n10);
				
				formulario.setVisible(true);
				
			}
		});
		
		//ADICIONAR ITENS AO JFRAME FORMULARIO
		formulario.add(numero);
		formulario.add(numeroDigitado);
		formulario.add(botao);
		
		//TONRAR JFRAME FORMULARIO VISIVEL
		formulario.setVisible(true);
	}
}
