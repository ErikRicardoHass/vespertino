package ex08_ButtonGroup;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Principal {

	public static void main(String[] args) {
		
		//JFrame
		JFrame formulario = new JFrame("Usando ButtonGroup");
		formulario.setSize(500, 300);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		//JRadioButton
		JRadioButton turnoMatutino = new JRadioButton("Matutino");
		turnoMatutino.setBounds(10, 10, 100, 20);
		turnoMatutino.setActionCommand("Matutino");
		
		JRadioButton turnoVespertino = new JRadioButton("Vespertino");
		turnoVespertino.setBounds(110, 10, 100, 20);
		turnoVespertino.setActionCommand("Vespertino");
		
		JRadioButton turnoNoturno = new JRadioButton("Noturno");
		turnoNoturno.setBounds(210, 10, 100, 20);
		turnoNoturno.setActionCommand("Noturno");
		
		//ButtonGroup
		ButtonGroup turnos = new ButtonGroup();
		turnos.add(turnoMatutino);
		turnos.add(turnoVespertino);
		turnos.add(turnoNoturno);
		
		//JButton
		JButton botao = new JButton("Verificar turno");
		botao.setBounds(50, 50, 200, 20);
		
		//A�AO
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, turnos.getSelection().getActionCommand());
				
			}
		});
		
		//ADICIONAR COMPONENTES
		formulario.add(turnoMatutino);
		formulario.add(turnoVespertino);
		formulario.add(turnoNoturno);
		formulario.add(botao);
		
		
		//EXIBIR O FORMUL�RIO E OS SEUS COMPONENTES
		formulario.setVisible(true);
		
	}

}
