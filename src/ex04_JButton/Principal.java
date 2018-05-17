package ex04_JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {
	
			public static void main(String[] args) {

				//INSTANCIAR JFrame
				JFrame formulario = new JFrame();
				formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				formulario.setSize(500, 150);
				formulario.setLocationRelativeTo(null);
				formulario.setTitle("Utilizando JFrame");
				formulario.setLayout(null);
				formulario.setResizable(false);

				//JLABEL
				JLabel rotulo = new JLabel();
				rotulo.setText("Informe seu nome");
				rotulo.setBounds(20, 10, 150, 20);

				//JTextField
				JTextField campo = new JTextField();
				campo.setBounds(140, 10, 200, 20);
				
				//JBUTTON
				JButton botao = new JButton();
				botao.setText("Clique aqui");
				botao.setBounds(170, 50, 150, 20);
				
				//ADICIONAR UMA AÇAO AO BOTAO
				botao.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						//EXIBIR O NOME
						JOptionPane.showMessageDialog(null, campo.getText());
						
						//LIMPAR O CAMPO CONTENDO O NOME
						campo.setText("");
						
						//SELECIONAR O CAMPO NOME
						campo.requestFocus();
					}
				});
				

				//ADICIONAR ELEMENTO AO JFRAME
				formulario.add(rotulo);
				formulario.add(campo);
				formulario.add(botao);
				
				
				//EXIBIR FORMULARIO
				formulario.setVisible(true);
				

			}
		
}

