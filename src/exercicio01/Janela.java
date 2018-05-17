package exercicio01;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Janela {
	


	//CRIAR JFRAME
	public void janelaGrafica(){
		JFrame formulario = new JFrame();
		formulario.setSize(600, 500);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setResizable(false);
		formulario.setTitle("Formulario Totalmente Seguro");

		//CRIAR JLABEL NOME
		JLabel nome = new JLabel();
		nome.setText("Informe seu nome:");
		nome.setBounds(10, 10, 200, 20);

		//CRIAR TEXTFIELD NOME
		JTextField nomeDigitado = new JTextField();
		nomeDigitado.setBounds(130, 10, 200, 20);

		//CRIAR JLABEL IDADE
		JLabel idade = new JLabel();
		idade.setText("Informe sua Idade:");
		idade.setBounds(10, 40, 200, 20);

		//CRIAR TEXTFIELD IDADE
		JTextField idadeDigitado = new JTextField();
		idadeDigitado.setBounds(130, 40, 200, 20);

		//CRIAR JLABEL CIDADE
		JLabel cidade = new JLabel();
		cidade.setText("Informe sua Cidade:");
		cidade.setBounds(10, 70, 200, 20);

		//CRIAR TEXTFIELD CIDADE
		JTextField cidadeDigitado = new JTextField();
		cidadeDigitado.setBounds(130, 70, 200, 20);
		
		//Button
		Button botao = new Button("Inserir Dados");
		botao.setBounds(220, 100, 200, 20);
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
						JOptionPane.showMessageDialog(null, "Seu nome é "+nomeDigitado.getText()+", tem "+idadeDigitado.getText()+" de idade e mora na cidade de "+cidadeDigitado.getText());
				
				
				
			}
		});

		//ADICIONAR ITENS AO JFRAME
		formulario.add(nome);
		formulario.add(nomeDigitado);
		formulario.add(idade);
		formulario.add(idadeDigitado);
		formulario.add(cidade);
		formulario.add(cidadeDigitado);
		formulario.add(botao);

		//TORNAR JFRAME VISIVEL
		formulario.setVisible(true);
		
		
		
		
	}





}
