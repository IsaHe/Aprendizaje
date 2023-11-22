package es.deusto.ingenieria.prog3.easybooking.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.TitledBorder;

import es.deusto.ingenieria.prog3.easybooking.domain.Flight;

public class CheckInDialog extends JDialog {

	private static final long serialVersionUID = 1L;

	private JTable jTablePassengers = new JTable();	
	private JButton jButtonConfirm = new JButton("Aceptar");
			
	public CheckInDialog(MainWindow mainWindow, Flight flight) {
		final CheckInDialog dialog = this;
		jButtonConfirm.addActionListener(e -> dialog.dispose());
		
		jTablePassengers = new JTable(new CheckInTableModel(flight));
		jTablePassengers.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		jTablePassengers.setFillsViewportHeight(true);
		
		//T5.A Crear un renderer personalizado para la tabla de personas
		//Crea un Rederer personalizado para la tabla de personas:
		//- Poner en color RGB(255, 113, 91) el texto y fondo blanco de las filas sin asiento asignado.
		//- Poner en color RGB(23, 137, 252) el fondo y texto blanco la fila seleccionada
		//  (tanto si tiene asiento asignado como si no lo tiene.
		//La columna LOCALIZADOR debe contener el localizador de la reserva y estar centrada.
		//El número de asiento debe aparecer centrado y con 3 dígitos (001 ó 045).
				
		//T5.B Pulsa F10 para asignar el asiento a una persona
		//Añade la funcionalidad necesaria para que cuando esté releccionada una persona
		//y se pulse la tecla F10 se abra un cuadro de diálogo para asignar el número de 
		//asiento. La lista desplegable de asientos sólo contendrá los asientos libres.
		//Además, al pulsar el botón aceptar del nuevo cuadro de diálogo, se invocará 
		//al método createBoardingPass(Reservation reservation, String passenger, int seat)
		//que se encuentra en la clase MainWindow.java.
				
		JPanel jPanelFlight = new JPanel();
		jPanelFlight.setBorder(new TitledBorder("Datos del vuelo"));
		jPanelFlight.setLayout(new GridLayout(3, 1));

		JLabel jLabelFlight = new JLabel(String.format("- %s", flight.getCode()));
		jLabelFlight.setIcon(new ImageIcon(String.format("resources/images/%s.png", flight.getAirline().getCode())));
		
		jPanelFlight.add(jLabelFlight);
		jPanelFlight.add(new JLabel(String.format("Origen: %s - %s", flight.getOrigin().getCode(), flight.getOrigin().getName())));
		jPanelFlight.add(new JLabel(String.format("Destino: %s - %s", flight.getDestination().getCode(), flight.getDestination().getName())));
				
		JPanel jPanelButtons = new JPanel();
		jPanelButtons.add(jButtonConfirm);
		
		add(jPanelFlight, BorderLayout.NORTH);
		add(new JScrollPane(jTablePassengers), BorderLayout.CENTER);
		add(jPanelButtons, BorderLayout.SOUTH);
		
		setTitle(String.format("Check-In del vuelo '%s'", flight.getCode()));		
		setIconImage(new ImageIcon("resources/images/tickets.png").getImage());		
		setSize(500, 700);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}