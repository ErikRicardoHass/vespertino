package exercicio09;

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
		
		//JLABEL
		JLabel n1 = new JLabel("Digite o 1º número:");
		n1.setBounds(10, 10, 200, 20);
		JLabel n2 = new JLabel("Digite o 2º número:");
		n2.setBounds(10, 30, 200, 20);
		JLabel n3 = new JLabel("Digite o 3º número:");
		n3.setBounds(10, 50, 200, 20);
		
		JLabel informa = new JLabel();
		
		//JTEXTFIELD
		JTextField n1Digitado = new JTextField();
		n1Digitado.setBounds(130, 10, 200, 20);
		JTextField n2Digitado = new JTextField();
		n2Digitado.setBounds(130, 30, 200, 20);
		JTextField n3Digitado = new JTextField();
		n3Digitado.setBounds(130, 50, 200, 20);
		
		//BUTTON
		Button botao = new Button("Verificar");
		botao.setBounds(160, 70, 200, 20);
		
		//AÇAO
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double num1=0, num2=0, num3=0;
				boolean valida=false;
				try{
					num1 = Double.parseDouble(n1Digitado.getText());
					valida=true;
					
				}catch (Exception e1) {
					valida=false;
				}	
				valida=false;
				try{
					num2 = Double.parseDouble(n2Digitado.getText());
					valida=true;
					
				}catch (Exception e2) {
					valida=false;
				}	
				try{
					num3 = Double.parseDouble(n3Digitado.getText());
					valida=true;
					
				}catch (Exception e3) {
					valida=false;
				}	
				
				if(valida==true){
					double aux;
					
					if(num1<num2){	
						aux=num1;
						
						if(aux>num3){
							aux=num3;
							formulario.setVisible(false);
							informa.setText("O menor número é: "+aux);
							informa.setBounds(10, 70, 200, 20);
							botao.setBounds(10, 90, 200, 20);
							formulario.add(informa);
							formulario.setVisible(true);
							
						}else{
							formulario.setVisible(false);
							informa.setText("O menor número é: "+aux);
							informa.setBounds(10, 70, 200, 20);
							botao.setBounds(10, 90, 200, 20);
							formulario.add(informa);
							formulario.setVisible(true);
						}
						
					}else{
						aux=num2;
						formulario.setVisible(false);
						informa.setText("O menor número é: "+aux);
						informa.setBounds(10, 70, 200, 20);
						botao.setBounds(10, 90, 200, 20);
						formulario.add(informa);
						formulario.setVisible(true);
						if(aux>num3){
							aux=num3;
							formulario.setVisible(false);
							informa.setText("O menor número é: "+aux);
							informa.setBounds(10, 70, 200, 20);
							botao.setBounds(10, 90, 200, 20);
							formulario.add(informa);
							formulario.setVisible(true);
						}else{
							formulario.setVisible(false);
							informa.setText("O menor número é: "+aux);
							informa.setBounds(10, 70, 200, 20);
							botao.setBounds(10, 90, 200, 20);
							formulario.add(informa);
							formulario.setVisible(true);
						}
					}
				}
			}
		});
		
		//ADICIONAR ITENS AO JFRAME FORMULARIO
		formulario.add(n1);
		formulario.add(n1Digitado);
		formulario.add(n2);
		formulario.add(n2Digitado);
		formulario.add(n3);
		formulario.add(n3Digitado);
		formulario.add(botao);
		
		//ALTERAR VISIBILIDADE DO JFRAME
		formulario.setVisible(true);
		
	}
	
}
