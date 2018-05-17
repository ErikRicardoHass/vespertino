package exercicio02;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela {

	//CIRAR JFRAME
	public void janelaGrafica(){
		JFrame formulario = new JFrame("DESCONTO");
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		//CRIAR JLABEL
		JLabel produto = new JLabel("Produto:");
		produto.setBounds(10, 10, 200, 20);

		//CRIAR JTEXTFIELD
		JTextField produtoDigitado = new JTextField();
		produtoDigitado.setBounds(130, 10, 200, 20);

		//CRIAR JLABEL
		JLabel preco = new JLabel("Preço:");
		preco.setBounds(10, 40, 200, 20);
		
		//LABELS A APARECER
		JLabel produtoDesconto = new JLabel();
		JLabel precoDesconto = new JLabel();
		//CRIAR JTEXTFIELD
		JTextField precoDigitado = new JTextField();
		precoDigitado.setBounds(130, 40, 200, 20);
		
		//CRIAR BOTAO
		Button botao = new Button("Calcular Desconto(10%)");
		botao.setBounds(160, 70, 200, 20);
		
		//AÇAO
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				double preco, precoComDesconto;
				

				preco = Double.parseDouble(precoDigitado.getText());
				
				precoComDesconto = preco-(preco*0.1);
				produtoDesconto.setText("Produto: "+produtoDigitado.getText());
				precoDesconto.setText("Preco: R$"+String.valueOf(precoComDesconto));
				precoDesconto.setBounds(10, 85, 200, 20);
				produtoDesconto.setBounds(10, 70, 200, 20);
				botao.setBounds(160, 100, 200, 20);
				formulario.add(precoDesconto);
				formulario.add(produtoDesconto);
				
				//REESCREVER FORMULARIO
				formulario.setVisible(false);
				formulario.setVisible(true);
			}
		});
		

		//ADICIONAR ITENS AO JFRAME
		formulario.add(produto);
		formulario.add(produtoDigitado);
		formulario.add(preco);
		formulario.add(precoDigitado);
		formulario.add(botao);
		
		//JFRAME VISIVEL
		formulario.setVisible(true);

	}

}
