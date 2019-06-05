package icone;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class jokenpografico extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jokenpografico frame = new jokenpografico();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
      int jogador = 0;
      private JLabel lblComputador;
      private JLabel lblResultado;
	/**
	 * Create the frame.
	 */
	
	public jokenpografico() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPedra = new JButton("");
		btnPedra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jogador = 1;
				jogo();
			}
		});
		btnPedra.setIcon(new ImageIcon(jokenpografico.class.getResource("/icone/pedra.png")));
		btnPedra.setBounds(24, 26, 131, 120);
		contentPane.add(btnPedra);
		
		JButton btnPapel = new JButton("");
		btnPapel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jogador = 2;
				jogo();
			}
		});
		btnPapel.setIcon(new ImageIcon(jokenpografico.class.getResource("/icone/papel.png")));
		btnPapel.setBounds(213, 26, 122, 120);
		contentPane.add(btnPapel);
		
		JButton btnTesoura = new JButton("");
		btnTesoura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jogador = 3;
				jogo();
			}
			
		});
		btnTesoura.setIcon(new ImageIcon(jokenpografico.class.getResource("/icone/tesoura.png")));
		btnTesoura.setBounds(395, 26, 111, 120);
		contentPane.add(btnTesoura);
		
		JLabel label = new JLabel("");
		label.setBounds(24, 190, 177, 22);
		contentPane.add(label);
		
		JLabel lblComputadorEscolheu = new JLabel("Computador escolheu");
		lblComputadorEscolheu.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblComputadorEscolheu.setBounds(24, 190, 177, 22);
		contentPane.add(lblComputadorEscolheu);
		
		lblComputador = new JLabel("");
		lblComputador.setBounds(254, 168, 171, 139);
		contentPane.add(lblComputador);
		
		lblResultado = new JLabel("l");
		lblResultado.setBounds(40, 271, 148, 30);
		contentPane.add(lblResultado);
	}
	    private void jogo() {
            
	    	
	    	int computador = (int)(Math.random()*3+1);
	    	System.out.println(computador);
	    	
	    	switch (computador) {
	    	case 1:
	    		System.out.println("computador escolheu PEDRA");
	    		lblComputador.setIcon(new ImageIcon(jokenpografico.class.getResource("/icone/pcpedra.png")));
	    		break;
	    		
	    	case 2:
	    		System.out.println("computador escolheu PAPEL");
	    		lblComputador.setIcon(new ImageIcon(jokenpografico.class.getResource("/icone/pcpapel.png")));
	    		break;
	    		
	    	case 3:
	    		
	    		lblComputador.setIcon(new ImageIcon(jokenpografico.class.getResource("/icone/pctesoura.png")));
	    		break;
	    		
	    	default:
	    	
	    		System.out.println("Opção inválida");
	    		break;
	    	

	    	
	    	
	    	}
	    	//lógica para determinar o vencedor ou empate 
	    	if (jogador == computador) {
	    		System.out.println("Empate");
	    		 lblResultado.setText("EMPATE");
	    	}else {
	    		if((jogador== 1 && computador == 3)||(jogador== 2 && computador == 1)|| (jogador == 3 && computador ==2)) {
	    		  System.out.println("JOGADOR VENCEU");	
	    		  lblResultado.setText("JOGADOR VENCEU");
	    		}else {
	    			
	    			System.out.println("COMPUTADOR VENCEU");
	    			 lblResultado.setText("COMPUTADOR VENCEU");
	    		}
	    	}
	    	
	    	
	    	
	    	
	    }
}
