import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class GridHandler extends JFrame{
	private String Token = "X";
	JButton one = new JButton("");
    JButton two = new JButton("");
    JButton three = new JButton("");
    JButton four = new JButton("");
    JButton five = new JButton("");
    JButton six = new JButton("");
    JButton seven = new JButton("");
    JButton eight = new JButton("");
    JButton nine = new JButton("");
    JButton[][] buttonArr = {{one, two, three}, {four, five, six}, {seven, eight, nine}};
	public GridHandler() {
		JFrame frame = new JFrame();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JPanel buttonPanel = new JPanel();
	    JPanel containerPanel = new JPanel();
	    buttonArr[0][0].setName("1");
	    buttonArr[0][1].setName("2");
	    buttonArr[0][2].setName("3");
	    buttonArr[1][0].setName("4");
	    buttonArr[1][1].setName("5");
	    buttonArr[1][2].setName("6");
	    buttonArr[2][0].setName("7");
	    buttonArr[2][1].setName("8");
	    buttonArr[2][2].setName("9");
	    
	    buttonPanel.setLayout(new GridLayout(3,3));
	    buttonPanel.add(buttonArr[0][0]);
	    buttonPanel.add(buttonArr[0][1]);
	    buttonPanel.add(buttonArr[0][2]);
	    buttonPanel.add(buttonArr[1][0]);
	    buttonPanel.add(buttonArr[1][1]);
	    buttonPanel.add(buttonArr[1][2]);
	    buttonPanel.add(buttonArr[2][0]);
	    buttonPanel.add(buttonArr[2][1]);
	    buttonPanel.add(buttonArr[2][2]);
	    buttonPanel.setPreferredSize(new Dimension(300, 400));
	    containerPanel.add(buttonPanel);
	
	    frame.getContentPane().add(containerPanel);
	    frame.pack();
	    frame.setVisible(true);
	    
	    GridAction handler = new GridAction();
	    
	    buttonArr[0][0].addActionListener( handler );
	    buttonArr[0][1].addActionListener( handler );
	    buttonArr[0][2].addActionListener( handler );
	    buttonArr[1][0].addActionListener( handler );
	    buttonArr[1][1].addActionListener( handler );
	    buttonArr[1][2].addActionListener( handler );
	    buttonArr[2][0].addActionListener( handler );
	    buttonArr[2][1].addActionListener( handler );
	    buttonArr[2][2].addActionListener( handler );
	}	
	public void pullThePlug() {
	    
	    WindowEvent wev = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
	    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(wev);

	    setVisible(false);
	    dispose();
	    
	    System.exit(0); 
	}
	private class GridAction implements ActionListener 
	   {
	      
	    public void actionPerformed( ActionEvent event )
	      {
	    	JButton but = (JButton)event.getSource();
	    	//System.out.println(buttonName);
	    	
	    	if(event.getSource() != null) {
	    		if(but.getText() == "") {
	    				but.setText(Token);
	    				but.setName(Token);
	    		}
	    		else {
	    			JOptionPane.showMessageDialog(null, "Invalid Move! turn skipped.");
	    		}
	    	}
	    	GridController test = new GridController(buttonArr);
	    	if(test.checkTie()) {
	    		JOptionPane.showMessageDialog(null, "Game has tied.");
	    		pullThePlug();
	    	}
	    	if(test.checkWin()) {
	    		
	    		JOptionPane.showMessageDialog(null, Token + " Has won!!");
	    		pullThePlug();
	    	}
	    	if(Token == "X") {
	    		Token = "O";
	    	}
	    	else {
	    		Token = "X";
	    	}
	      }
	    
	   
	    	
	    	/*String string = ""; 

	         
	         if ( event.getSource() == textField1 )
	            string = String.format( "textField1: %s",
	               event.getActionCommand() );
	         
	         else if ( event.getSource() == textField2 )
	            string = String.format( "textField2: %s",
	               event.getActionCommand() );

	         else if ( event.getSource() == textField3 )
	            string = String.format( "textField3: %s", 
	               event.getActionCommand() );

	         else if ( event.getSource() == passwordField )
	            string = String.format( "passwordField: %s", 
	               new String( passwordField.getPassword() ) );*/
	}
}

