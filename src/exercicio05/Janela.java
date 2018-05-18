package exercicio05;

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
		formulario.setResizable(false);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		//JLABEL
		JLabel dia2 = new JLabel("Digite um Dia");
		dia2.setBounds(10, 50, 200, 20);
		
		JLabel informar = new JLabel();
		
		
		//JTEXTEFIELD
		JTextField diaDigitado = new JTextField();
		diaDigitado.setBounds(130, 50, 250, 20);
		
		//BUTTON
		Button botao = new Button("Verificar Dia");
		botao.setBounds(160, 90, 200, 20);
		
		//AÇAO
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int dia;
				dia = Integer.parseInt(diaDigitado.getText());
				if(dia<1){
					 formulario.setVisible(false);
					 botao.setBounds(160, 130, 200, 20);
					 informar.setText("ERRO: DATA INVÁLIDA!");
					 informar.setBounds(10, 90, 200, 20);
					 formulario.add(informar);
					 formulario.setVisible(true);

				}else if(dia>28){
					 formulario.setVisible(false);
					 botao.setBounds(160, 130, 200, 20);
					 informar.setText("ERRO: DATA INVÁLIDA!");
					 informar.setBounds(10, 90, 200, 20);
					 formulario.add(informar);
					 formulario.setVisible(true);
					

				}else if((dia==4)||(dia==11)||(dia==18)||(dia==25)||(dia==3)||(dia==10)||(dia==17)||(dia==24)){
					 formulario.setVisible(false);
					 botao.setBounds(160, 130, 200, 20);
					 informar.setText("Fim de Semana!");
					 informar.setBounds(10, 90, 200, 20);
					 formulario.add(informar);
					 formulario.setVisible(true);

				}else{
					 formulario.setVisible(false);
					 botao.setBounds(160, 130, 200, 20);
					 informar.setText("Dia de Semana!");
					 informar.setBounds(10, 90, 200, 20);
					 formulario.add(informar);
					 formulario.setVisible(true);
		
				}
				
			}
		});
		
		//ADICIONAR ITENS AO JFRAME FORMULARIO
		formulario.add(dia2);
		formulario.add(diaDigitado);
		formulario.add(botao);
		
		//TONAR FORMULARIO VISIVEL
		formulario.setVisible(true);
		
	}
	
	
}
