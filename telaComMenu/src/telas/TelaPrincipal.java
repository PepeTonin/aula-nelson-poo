package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JMenuBar barMenu;
	private JMenu cadastroMenu;
	private JMenu compraMenu;
	private JMenu ajudaMenu;
	private JMenuItem clienteMenuItem;
	private JMenuItem fornecedorMenuItem;
	private JMenuItem produtoMenuItem;
	private JMenuItem sobreMenuItem;
	private JMenuItem sairMenuItem;
	
	
	public TelaPrincipal() {
		super("Loja IFPR");
		
		barMenu = new JMenuBar();
		
		cadastroMenu = new JMenu("Cadastro");
		compraMenu = new JMenu("Compra");
		ajudaMenu = new JMenu("Ajuda");
		
		clienteMenuItem = new JMenuItem("Cliente");
		fornecedorMenuItem = new JMenuItem("Fornecedor");
		produtoMenuItem = new JMenuItem("Produto");
		
		sobreMenuItem = new JMenuItem("Sobre");
		sairMenuItem = new JMenuItem("Sair");
		
		cadastroMenu.setMnemonic('C');
		compraMenu.setMnemonic('o');
		ajudaMenu.setMnemonic('A');
		
		setJMenuBar(barMenu);
		
		barMenu.add(cadastroMenu);
		barMenu.add(compraMenu);
		barMenu.add(ajudaMenu);
		
		cadastroMenu.add(clienteMenuItem);
		cadastroMenu.add(fornecedorMenuItem);
		cadastroMenu.add(produtoMenuItem);
		
		ajudaMenu.add(sobreMenuItem);
		ajudaMenu.add(sairMenuItem);
		
		sobreMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(TelaPrincipal.this, "SOBRE CLICADO");				
			}
		});
		
		sairMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(EXIT_ON_CLOSE);
			}
		});
		
	}
}
