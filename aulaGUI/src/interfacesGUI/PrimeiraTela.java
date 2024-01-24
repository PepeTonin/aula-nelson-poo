package interfacesGUI;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class PrimeiraTela extends JFrame {
	
	// ATRIBUTOS
	private static final long serialVersionUID = 1L;

	private JLabel lblNome;
	private JTextField txtNome;

	private JLabel lblEndereco;
	private JTextField txtEndereco;

	private JLabel lblTelefone;
	private JFormattedTextField txtTelefone;

	private JLabel lblTipoSangue;
	private JComboBox cmbTipoSangue;
	private final String[] TIPOS_SANGUE = { "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" };

	private JLabel lblCursoAtual;
	private JComboBox cmbCursoAtual;
	private final String[] CURSOS = { "TADS", "QUIMICA" };

	private JLabel lblNomeContatoEmergencia;
	private JTextField txtNomeContatoEmergencia;

	private JLabel lblTelefoneContatoEmergencia;
	private JFormattedTextField txtTelefoneContatoEmergencia;

	private JButton btnInserir;
	private JButton btnCancelar;

	private Container ctn;

	// CONSTRUTOR
	public PrimeiraTela() {
		int larguraTela = 1000;
		int alturaTela = 300;

		setSize(larguraTela, alturaTela);
		setTitle("Inserir Paciente");

		ctn = getContentPane();

		lblNome = new JLabel("Nome");
		txtNome = new JTextField();

		lblEndereco = new JLabel("Endereco");
		txtEndereco = new JTextField();

		lblTelefone = new JLabel("Telefone");
		try {
			txtTelefone = new JFormattedTextField(new MaskFormatter("(##)#-####-####"));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		lblTipoSangue = new JLabel("Tipo sanguineo");
		cmbTipoSangue = new JComboBox(TIPOS_SANGUE);

		lblCursoAtual = new JLabel("Curso atual");
		cmbCursoAtual = new JComboBox(CURSOS);

		lblNomeContatoEmergencia = new JLabel("Contato de emergencia");
		txtNomeContatoEmergencia = new JTextField();

		lblTelefoneContatoEmergencia = new JLabel("Telefone de emergencia");
		try {
			txtTelefoneContatoEmergencia = new JFormattedTextField(new MaskFormatter("(##)#-####-####"));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		btnInserir = new JButton("Inserir");
		btnCancelar = new JButton("Cancelar");

		ctn.setLayout(null);

		int alturaComponente = 25;
		int larguraComponenteTexto = larguraTela / 4;
		int larguraComboBox = larguraTela / 4;
		int larguraLabel = larguraTela / 6;

		int posicaoVerticalInicial = 10;
		int incrementoPosicaoVertical = 10;

		int posicaoHorizontalInicial = 10;
		int espacamentoEntreComponentes = larguraTela / 16;

		int alturaBotao = alturaComponente * 2;
		int larguraBotao = (larguraTela / 2) - (2 * posicaoHorizontalInicial) - (espacamentoEntreComponentes);

		lblNome.setBounds(posicaoHorizontalInicial, posicaoVerticalInicial, larguraLabel, alturaComponente);
		txtNome.setBounds(posicaoHorizontalInicial + larguraLabel, posicaoVerticalInicial, larguraComponenteTexto,
				alturaComponente);
		ctn.add(lblNome);
		ctn.add(txtNome);

		lblEndereco.setBounds(
				posicaoHorizontalInicial + larguraLabel + larguraComponenteTexto + espacamentoEntreComponentes,
				posicaoVerticalInicial, larguraLabel, alturaComponente);
		txtEndereco.setBounds(posicaoHorizontalInicial + larguraLabel + larguraComponenteTexto
				+ espacamentoEntreComponentes + larguraLabel, posicaoVerticalInicial, larguraComponenteTexto,
				alturaComponente);
		ctn.add(lblEndereco);
		ctn.add(txtEndereco);

		lblTelefone.setBounds(posicaoHorizontalInicial,
				posicaoVerticalInicial + 1 * (alturaComponente + incrementoPosicaoVertical), larguraLabel,
				alturaComponente);
		txtTelefone.setBounds(posicaoHorizontalInicial + larguraLabel,
				posicaoVerticalInicial + 1 * (alturaComponente + incrementoPosicaoVertical), larguraComponenteTexto,
				alturaComponente);
		ctn.add(lblTelefone);
		ctn.add(txtTelefone);

		lblTipoSangue.setBounds(
				posicaoHorizontalInicial + larguraLabel + larguraComponenteTexto + espacamentoEntreComponentes,
				posicaoVerticalInicial + 1 * (alturaComponente + incrementoPosicaoVertical), larguraLabel,
				alturaComponente);
		cmbTipoSangue.setBounds(
				posicaoHorizontalInicial + larguraLabel + larguraComponenteTexto + espacamentoEntreComponentes
						+ larguraLabel,
				posicaoVerticalInicial + 1 * (alturaComponente + incrementoPosicaoVertical), larguraComboBox,
				alturaComponente);
		ctn.add(lblTipoSangue);
		ctn.add(cmbTipoSangue);

		lblCursoAtual.setBounds(posicaoHorizontalInicial,
				posicaoVerticalInicial + 2 * (alturaComponente + incrementoPosicaoVertical), larguraLabel,
				alturaComponente);
		cmbCursoAtual.setBounds(posicaoHorizontalInicial + larguraLabel,
				posicaoVerticalInicial + 2 * (alturaComponente + incrementoPosicaoVertical), larguraComboBox,
				alturaComponente);
		ctn.add(lblCursoAtual);
		ctn.add(cmbCursoAtual);

		lblNomeContatoEmergencia.setBounds(posicaoHorizontalInicial,
				posicaoVerticalInicial + 3 * (alturaComponente + incrementoPosicaoVertical), larguraLabel,
				alturaComponente);
		txtNomeContatoEmergencia.setBounds(posicaoHorizontalInicial + larguraLabel,
				posicaoVerticalInicial + 3 * (alturaComponente + incrementoPosicaoVertical), larguraComponenteTexto,
				alturaComponente);
		ctn.add(lblNomeContatoEmergencia);
		ctn.add(txtNomeContatoEmergencia);

		lblTelefoneContatoEmergencia.setBounds(
				posicaoHorizontalInicial + larguraLabel + larguraComponenteTexto + espacamentoEntreComponentes,
				posicaoVerticalInicial + 3 * (alturaComponente + incrementoPosicaoVertical), larguraLabel,
				alturaComponente);
		txtTelefoneContatoEmergencia.setBounds(
				posicaoHorizontalInicial + larguraLabel + larguraComponenteTexto + espacamentoEntreComponentes
						+ larguraLabel,
				posicaoVerticalInicial + 3 * (alturaComponente + incrementoPosicaoVertical), larguraComponenteTexto,
				alturaComponente);
		ctn.add(lblTelefoneContatoEmergencia);
		ctn.add(txtTelefoneContatoEmergencia);

		btnInserir.setBounds(posicaoHorizontalInicial,
				posicaoVerticalInicial + 5 * (alturaComponente + incrementoPosicaoVertical), larguraBotao, alturaBotao);
		ctn.add(btnInserir);
		
		btnCancelar.setBounds(posicaoHorizontalInicial + larguraBotao + espacamentoEntreComponentes,
				posicaoVerticalInicial + 5 * (alturaComponente + incrementoPosicaoVertical), larguraBotao, alturaBotao);
		ctn.add(btnCancelar);

		btnInserir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tratarBotaoInserir();	
			}
			
		});
		
		btnCancelar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tratatBotaoCancelar();
			}
		});
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	// MÉTODOS EVENTOS
	public void tratarBotaoInserir() {
		System.out.println("inserir clicado");
	}
	
	public void tratatBotaoCancelar() {
		System.out.println("cancelar clicado");
	}
	
}
