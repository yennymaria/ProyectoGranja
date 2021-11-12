package granja;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

/**
 *  Interfaz gráfica para registrar la compra de animales en la granja,
 *  y calcular el precio total de venta de todos los animales.
 * 
 * La parte visual de esta clase se generó con el IDE Eclipse Juno.
 */
@SuppressWarnings("serial")
public class FormularioGranja extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtPeso;
	private JTextField txtTotal;
	private JComboBox<String> comboBoxTipo;
	
	private Granja laGranja;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioGranja frame = new FormularioGranja();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormularioGranja() {
		
		laGranja = new Granja();
		
		setTitle("Granja de Animales");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 249);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{41, 46, 55, 86, 46, 59, 56, 86, 0};
		gbl_contentPane.rowHeights = new int[]{32, 23, 20, 31, 17, 40, 23, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton btnNewButton = new JButton("Calcular Precio Total");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				eventoCalculaTotal();
			}
		});
		
		JLabel lblNombre = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 1;
		contentPane.add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.gridwidth = 2;
		gbc_txtNombre.gridx = 3;
		gbc_txtNombre.gridy = 1;
		contentPane.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.NORTH;
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridwidth = 2;
		gbc_btnNewButton.gridx = 6;
		gbc_btnNewButton.gridy = 1;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		JLabel lblPeso = new JLabel("Peso:");
		GridBagConstraints gbc_lblPeso = new GridBagConstraints();
		gbc_lblPeso.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblPeso.insets = new Insets(0, 0, 5, 5);
		gbc_lblPeso.gridx = 1;
		gbc_lblPeso.gridy = 2;
		contentPane.add(lblPeso, gbc_lblPeso);
		
		txtPeso = new JTextField();
		GridBagConstraints gbc_txtPeso = new GridBagConstraints();
		gbc_txtPeso.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPeso.anchor = GridBagConstraints.NORTHWEST;
		gbc_txtPeso.insets = new Insets(0, 0, 5, 5);
		gbc_txtPeso.gridx = 3;
		gbc_txtPeso.gridy = 2;
		contentPane.add(txtPeso, gbc_txtPeso);
		txtPeso.setColumns(10);
		
		JLabel lblKg = new JLabel("Kg");
		GridBagConstraints gbc_lblKg = new GridBagConstraints();
		gbc_lblKg.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblKg.insets = new Insets(0, 0, 5, 5);
		gbc_lblKg.gridx = 4;
		gbc_lblKg.gridy = 2;
		contentPane.add(lblKg, gbc_lblKg);
		
		JLabel lblTotal = new JLabel("Total:");
		GridBagConstraints gbc_lblTotal = new GridBagConstraints();
		gbc_lblTotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblTotal.insets = new Insets(0, 0, 5, 5);
		gbc_lblTotal.gridx = 6;
		gbc_lblTotal.gridy = 2;
		contentPane.add(lblTotal, gbc_lblTotal);
		
		txtTotal = new JTextField();
		txtTotal.setEditable(false);
		GridBagConstraints gbc_txtTotal = new GridBagConstraints();
		gbc_txtTotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTotal.anchor = GridBagConstraints.NORTHWEST;
		gbc_txtTotal.insets = new Insets(0, 0, 5, 0);
		gbc_txtTotal.gridx = 7;
		gbc_txtTotal.gridy = 2;
		contentPane.add(txtTotal, gbc_txtTotal);
		txtTotal.setColumns(10);
		
		comboBoxTipo = new JComboBox<String>();
		comboBoxTipo.addItem("Oveja");
		comboBoxTipo.addItem("Gallina");
		comboBoxTipo.addItem("Vaca");
		
		JLabel lblTipo = new JLabel("Tipo:");
		GridBagConstraints gbc_lblTipo = new GridBagConstraints();
		gbc_lblTipo.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblTipo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipo.gridx = 1;
		gbc_lblTipo.gridy = 3;
		contentPane.add(lblTipo, gbc_lblTipo);
		GridBagConstraints gbc_comboBoxTipo = new GridBagConstraints();
		gbc_comboBoxTipo.fill = GridBagConstraints.BOTH;
		gbc_comboBoxTipo.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxTipo.gridx = 3;
		gbc_comboBoxTipo.gridy = 3;
		contentPane.add(comboBoxTipo, gbc_comboBoxTipo);
		
		JButton btnComprar = new JButton("Comprar");
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eventoCompraAnimal();
			}
		});
		GridBagConstraints gbc_btnComprar = new GridBagConstraints();
		gbc_btnComprar.anchor = GridBagConstraints.NORTH;
		gbc_btnComprar.insets = new Insets(0, 0, 5, 5);
		gbc_btnComprar.gridwidth = 3;
		gbc_btnComprar.gridx = 1;
		gbc_btnComprar.gridy = 5;
		contentPane.add(btnComprar, gbc_btnComprar);
	}
	
	/**
	 * Obtiene los datos del formulario para registar el animal en la granja
	 */
	public void eventoCompraAnimal() {
		String nombre = txtNombre.getText();
		double peso;
		try {
			peso = Double.parseDouble(txtPeso.getText());
		}
		catch (NumberFormatException errorPeso) {
			peso = 0;
		}
		String tipo = (String) comboBoxTipo.getSelectedItem();
		
		laGranja.comprarAnimal(nombre, peso, tipo);
		limpiarCampos();
		
	}
	
	/**
	 * Solicita el total a la granja para mostrarlo en el formulario
	 */
	public void eventoCalculaTotal() {
		double precioTotal = laGranja.calcularTotal();
		
		txtTotal.setText(""+precioTotal);
	}
	
	public void limpiarCampos() {
		txtNombre.setText("");
		txtPeso.setText("");
		comboBoxTipo.setSelectedIndex(0);
	}
}
