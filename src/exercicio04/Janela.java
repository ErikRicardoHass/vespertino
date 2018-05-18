package exercicio04;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela {

	double preco2=0;

	public void janelaGrafica(){
		//INCIAR JFRAME
		JFrame formulario = new JFrame();
		formulario.setSize(500, 250);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setResizable(false);

		//JLabel
		JLabel nome = new JLabel("Digite o nome do produto:");
		nome.setBounds(10, 10, 200, 20);
		JLabel preco = new JLabel("Digite o preco do produto:");
		preco.setBounds(10, 40, 200, 20);
		JLabel nomeProduto = new JLabel("Digite o nome do produto:");
		nomeProduto.setBounds(10, 100, 200, 20);
		JLabel precoProduto = new JLabel("Digite o nome do produto:");
		precoProduto.setBounds(10, 130, 200, 20);

		//JTEXTFIEL
		JTextField nomeDigitado = new JTextField();
		nomeDigitado.setBounds(200, 10, 200, 20);
		JTextField precoDigitado = new JTextField();
		precoDigitado.setBounds(200, 40, 200, 20);

		//JCOMBOBOX
		JComboBox<String> combo = new JComboBox<>();
		combo.setBounds(160, 70, 200, 30);
		combo.addItem("À Vista");
		combo.addItem("Crédito");
		combo.addItem("Parcelado");

		//BOTAO
		Button botao = new Button("Verificar Total");
		botao.setBounds(160, 100, 200, 20);

		//ACAO
		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try{
					preco2 = Double.parseDouble(precoDigitado.getText());

					if(combo.getSelectedItem().equals("À Vista")){
						if(preco2>500){
							preco2=preco2-(preco2*0.1);
							formulario.setVisible(false);
							botao.setBounds(150, 160, 200, 20);
							nomeProduto.setText("Produto: "+nomeDigitado.getText());
							precoProduto.setText("Preço: R$"+String.valueOf(preco2));
							formulario.add(nomeProduto);
							formulario.add(precoProduto);
							formulario.setVisible(true);
						}else{
							formulario.setVisible(false);
							botao.setBounds(150, 160, 200, 20);
							nomeProduto.setText("Produto: "+nomeDigitado.getText());
							precoProduto.setText("Preço: R$"+String.valueOf(preco2));
							formulario.add(nomeProduto);
							formulario.add(precoProduto);
							formulario.setVisible(true);
						}


					}else{
						formulario.setVisible(false);
						botao.setBounds(150, 160, 200, 20);
						nomeProduto.setText("Produto: "+nomeDigitado.getText());
						precoProduto.setText("Preço: R$"+String.valueOf(preco2));
						formulario.add(nomeProduto);
						formulario.add(precoProduto);
						formulario.setVisible(true);

					}
				}catch (Exception e2) {
					formulario.setVisible(false);
					botao.setBounds(150, 160, 200, 20);
					nomeProduto.setText("Produto: ERRO(Redigite os dados)");
					precoProduto.setText("Preço: ERRO(Redigite os dados)");
					formulario.add(nomeProduto);
					formulario.add(precoProduto);
					formulario.setVisible(true);
				}

			}
		});

		//ADICIONAR ITENS AO JFRAME
		formulario.add(nome);
		formulario.add(preco);
		formulario.add(nomeDigitado);
		formulario.add(precoDigitado);
		formulario.add(combo);
		formulario.add(botao);

		//ALTERAR VISIBILIDADE DO JFRAME
		formulario.setVisible(true);


	}

}
