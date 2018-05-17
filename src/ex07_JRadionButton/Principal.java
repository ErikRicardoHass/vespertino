package ex07_JRadionButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Principal {

	public static void main(String[] args) {


		//INSTANCIAR JFrame
		JFrame formulario = new JFrame();
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(230, 150);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Utilizando JCheckBox");
		formulario.setLayout(null);
		formulario.setResizable(false);


		//JRADIONBUTTON
		JRadioButton rbtMasculino = new JRadioButton("Masculino");
		rbtMasculino.setBounds(25, 10, 100, 20);

		JRadioButton rbtFeminino = new JRadioButton("Feminino");
		rbtFeminino.setBounds(125, 10, 100, 20);

		//JBUTTON
		JButton botao = new JButton("Clique aqui!");
		botao.setBounds(40, 50, 150, 20);

		//AÇAO
		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if((rbtMasculino.isSelected())&&(rbtFeminino.isSelected())){
					JOptionPane.showMessageDialog(null, "Ambos estão selecionados");
				}else if(rbtMasculino.isSelected()){
					JOptionPane.showMessageDialog(null, "Masculino está selecionado");
				}else if(rbtFeminino.isSelected()){
					JOptionPane.showMessageDialog(null, "Feminino está selecionado");
				}else{
					JOptionPane.showMessageDialog(null, "Nenhum Está selecionado");
				}

			}
		});

		//ADICIONAR COMPONENTES AO JFRAME
		formulario.add(rbtMasculino);
		formulario.add(rbtFeminino);
		formulario.add(botao);

		//EXIBIR TODA A ESTRUTURA
		formulario.setVisible(true);


	}

}


