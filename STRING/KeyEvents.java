
    import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;

public class KeyEvents extends JFrame implements KeyListener {
    private JLabel label;

    public KeyEvents() {
        // Create the label
        label = new JLabel("Press any key...");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        this.setTitle("Key Listener Example");
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); // Center the frame
        this.setLayout(new java.awt.BorderLayout());
        this.add(label, java.awt.BorderLayout.CENTER);

        this.addKeyListener(this);

        this.setVisible(true);
    }
    

    @Override
    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyReleased(KeyEvent e) {
        label.setText("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    public static void main(String[] args) {
        // Run the application
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new KeyEvents();
            }
        });
    }


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
    

