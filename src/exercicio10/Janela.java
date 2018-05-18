package exercicio10;

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
		JLabel moeda1 = new JLabel("Moedas de R$00,01");
		moeda1.setBounds(10,  10, 200, 20);
		JLabel moeda2 = new JLabel("Moedas de R$00,05");
		moeda2.setBounds(10,  30, 200, 20);
		JLabel moeda3 = new JLabel("Moedas de R$00,10");
		moeda3.setBounds(10,  50, 200, 20);
		JLabel moeda4 = new JLabel("Moedas de R$00,25");
		moeda4.setBounds(10,  70, 200, 20);
		JLabel moeda5 = new JLabel("Moedas de R$00,50");
		moeda5.setBounds(10,  90, 200, 20);
		JLabel moeda6 = new JLabel("Moedas de R$01,00");
		moeda6.setBounds(10,  110, 200, 20);
		
		JLabel informa = new JLabel();
		
		//JTEXTFIELD
		JTextField moeda1Digitado = new JTextField();
		moeda1Digitado.setBounds(130,  10, 35, 20);
		JTextField moeda2Digitado = new JTextField();
		moeda2Digitado.setBounds(130,  30, 35, 20);
		JTextField moeda3Digitado = new JTextField();
		moeda3Digitado.setBounds(130,  50, 35, 20);
		JTextField moeda4Digitado = new JTextField();
		moeda4Digitado.setBounds(130,  70, 35, 20);
		JTextField moeda5Digitado = new JTextField();
		moeda5Digitado.setBounds(130,  90, 35, 20);
		JTextField moeda6Digitado = new JTextField();
		moeda6Digitado.setBounds(130,  110, 35, 20);
		
		//BUTTON
		Button botao = new Button("Verificar Total");
		botao.setBounds(160, 150, 200, 20);
		
		//AÇAO
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				boolean valida=false;
				int m1=0 , m2=0, m3=0, m4=0, m5=0, m6=0;
				double total=0;
				if(moeda1Digitado.getText().equals("")){
					moeda1Digitado.setText("0");
				}
				if(moeda2Digitado.getText().equals("")){
					moeda2Digitado.setText("0");
				}
				if(moeda3Digitado.getText().equals("")){
					moeda3Digitado.setText("0");
				}
				if(moeda4Digitado.getText().equals("")){
					moeda4Digitado.setText("0");
				}
				if(moeda5Digitado.getText().equals("")){
					moeda5Digitado.setText("0");
				}
				if(moeda6Digitado.getText().equals("")){
					moeda6Digitado.setText("0");
				}
				
				
				
				try{
					m1 = Integer.parseInt(moeda1Digitado.getText());
					valida=true;
				}catch (Exception e1) {
					valida=false;
				}
				valida=false;
				try{
					m2 = Integer.parseInt(moeda2Digitado.getText());
					valida=true;
				}catch (Exception e2){
					valida=false;
				}
				valida=false;
				try{
					m3 = Integer.parseInt(moeda3Digitado.getText());
					valida=true;
				}catch (Exception e3){
					valida=false;
				}
				valida=false;
				try{
					m4 = Integer.parseInt(moeda4Digitado.getText());
					valida=true;
				}catch (Exception e4){
					valida=false;
				}
				valida=false;
				try{
					m5 = Integer.parseInt(moeda5Digitado.getText());
					valida=true;
				}catch (Exception e5){
					valida=false;
				}
				valida=false;
				try{
					m6 = Integer.parseInt(moeda6Digitado.getText());
					valida=true;
				}catch (Exception e6){
					valida=false;
				}
				
				if(valida==true){
					total=0.01*m1;
					total+=0.05*m2;
					total+=0.10*m3;
					total+=0.25*m4;
					total+=0.50*m5;
					total+=1.00*m6;
					formulario.setVisible(false);
					informa.setText("Total: R$"+total);
					informa.setBounds(10, 130, 200, 20);
					botao.setBounds(160, 150, 200, 20);
					formulario.add(informa);
					formulario.setVisible(true);
				}
				
			}
		});
		
		//ADICIONAR ITENS AO JFRAME FORMULARIO
		formulario.add(moeda1);
		formulario.add(moeda1Digitado);
		formulario.add(moeda2);
		formulario.add(moeda2Digitado);
		formulario.add(moeda3);
		formulario.add(moeda3Digitado);
		formulario.add(moeda4);
		formulario.add(moeda4Digitado);
		formulario.add(moeda5);
		formulario.add(moeda5Digitado);
		formulario.add(moeda6);
		formulario.add(moeda6Digitado);
		formulario.add(botao);
		
		//ALTERAR VISIBILIDADE DO JFRAME FORMULARIO
		formulario.setVisible(true);
		
	}
}
