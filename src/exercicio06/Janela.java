package exercicio06;

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
		formulario.setSize(500, 250);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setResizable(false);
		formulario.setTitle("SOMA OU MULTIPLICA ?");
		
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
		Button botao = new Button("Realizar Operação");
		botao.setBounds(160, 50, 200, 20);
		
		//AÇAO
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int num1, num2;
				num1 = Integer.parseInt(n1Digitado.getText());
				num2 = Integer.parseInt(n2Digitado.getText());
				
				if(num1==num2){
					num1=num1+num2;
					formulario.setVisible(false);
					botao.setBounds(160, 70, 200, 20);
					informa.setText("A soma dos números é: "+num1);
					informa.setBounds(10, 50, 200, 20);
					formulario.add(informa);
					formulario.setVisible(true);
				}else{
					num1=num1*num2;
					formulario.setVisible(false);
					botao.setBounds(160, 70, 200, 20);
					informa.setText("A soma dos números é: "+num1);
					informa.setBounds(10, 50, 200, 20);
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
		
		//TORNAR JFRAME FORMULARIO VISIVEL
		formulario.setVisible(true);
	}
}
