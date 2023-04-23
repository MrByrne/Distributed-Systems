// JPane MoistureClient.java
 
package grpc.client;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ClientGUI implements ActionListener{
	
	// defining input and output
	private JTextField entry1, reply1;
	
	private JPanel getService1JPanel() {
	
		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Type 'Moisture' to check current conditions:")	;
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(100, 0)));
		entry1 = new JTextField("",10);
		panel.add(entry1);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Run Check");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply1 = new JTextField("", 35);
		reply1 .setEditable(false);
		panel.add(reply1 );
		
		panel.setLayout(boxlayout);
		
		// Create a titled border with an underlined font
		Border border = BorderFactory.createTitledBorder(
		    BorderFactory.createMatteBorder(1, 0, 0, 0, java.awt.Color.BLACK), "Moisture Service", TitledBorder.CENTER, TitledBorder.TOP);

		// Set the border to the panel
		panel.setBorder(border);

		return panel;
	}
	
	public static void main(String[] args) {
	
		ClientGUI gui = new ClientGUI();
	
		gui.build();
	}

	private void build() { 

		JFrame frame = new JFrame("Service Controller Sample");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Set the panel to add buttons
		JPanel panel = new JPanel();

		// Set the BoxLayout to be X_AXIS: from left to right
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

		panel.setLayout(boxlayout);

		// Set border for the panel
		panel.setBorder(new EmptyBorder(new Insets(50, 50, 50, 50)));
	
		panel.add( getService1JPanel() );

		// Set size for the frame
		frame.setSize(300, 300);

		// Set the window to be visible as the default to be false
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}


// test below
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		String label = button.getActionCommand();  

		if (entry1.getText().equals("Moisture")) {

			if (label.equals("Run Check")) {
				System.out.println("service 3 to be invoked ...");

				ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
				grpc.service3.MoistureGrpc.MoistureBlockingStub blockingStub = grpc.service3.MoistureGrpc.newBlockingStub(channel);

				//preparing message to send
				grpc.service3.MoistureRequest request = grpc.service3.MoistureRequest.newBuilder().setText(entry1.getText()).build();

				//Retrieving reply from service
				grpc.service3.MoistureReply response = blockingStub.checkMoisture(request);
								
				reply1.setText(String.valueOf(response));


			} else {

		    }
		} else {
			
			reply1.setText(String.valueOf("Error: Please Type 'Moisture' to check moisture levels"));
			
		}
	}	
}
