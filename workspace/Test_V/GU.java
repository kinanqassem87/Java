import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



 public class GU extends JFrame {
	 //private JTextField textField1, textField2, textField3;
	 private JButton Click,start;
	 
	 private Connection con=null;

	   private Statement selectStatement,s1;

	   private ResultSet selectResult,r1;
	   
	   String  query = "select Numbers from students  ";
	   
	   String  query1 = "select Names from students  ";
	 
	// int t1,t2,t3,t4;
	 String out="";
	 
	 // set up GUI
 public GU()
 {
 super( "GUI With Sql" );
// get content pane and set its layout
 Container container = getContentPane();
 container.setLayout( new FlowLayout() );
 
 /*textField1 = new JTextField( 10 );//size of textfield 10 char
 container.add( textField1 );
 textField2 = new JTextField( 10 );//size of textfield 10 char
 container.add( textField2 );
 textField3 = new JTextField( 10 );//size of textfield 10 char
 container.add( textField3 );*/
 
 
 start = new JButton( "start" );
 container.add( start );

 
 Click = new JButton( "Click" );
 container.add( Click );
 
 ButtonHandler handler = new ButtonHandler();//event for button
 Click.addActionListener( handler );
 start.addActionListener( handler );
 

 setSize( 275, 200 );
 setVisible( true );
 setLocation(200,200);
 }
 
 
 
 
 public void connectToDB() {

     try{

        System.out.println("Loading the driver ...");

        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

        System.out.println("Connecting to database ...");

        con = DriverManager.getConnection("jdbc:odbc:DB");

        if(con!=null)
        	
           System.out.println("Connected to database ...");
        

     }
     
     catch(SQLException sqle) {

        System.out.println(sqle.getMessage());

     }

     catch(ClassNotFoundException cnfe){
    	 
        System.out.println(cnfe.getMessage());

     }
     
    }

  public void closeDB(){

        try {
        	
           if(con != null)
        	   
              con.close();
           
        }

        catch(SQLException sqle) {
        	
           System.out.println(sqle.getMessage());
           

        }
       
  }
  
 
  
  
  
  
  
  

 // execute application
 public static void main( String args[] )
 {
 
GU application = new GU();

 application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
 
 

 application.connectToDB();



 //application.closeDB();//for close DB after excute if you want 
 
 
 

 }
 
 
 private class ButtonHandler implements ActionListener {
	
	 // handle button event
	 public void actionPerformed( ActionEvent event )
	 {
		/* t1=Integer.parseInt(textField1.getText());
		 t2=Integer.parseInt(textField2.getText());
		 t3=Integer.parseInt(textField3.getText());
		 t4=t1+t2+t3;
		 out+=t4;*/
		 
		
		 if(event.getSource()==Click){
			
			
			 
			
			 try{
				 
				
				 selectStatement = con.createStatement();
				 
				 selectResult = selectStatement.executeQuery(query);
				
				
				 while(selectResult.next()) {
			        	
			        	
		        	 out+=selectResult.getString("Numbers") ;
		        	
		         }

		         selectResult.close();
		        
		         

		      }

		      catch(SQLException sqle){

		         System.out.println(sqle.getMessage());

		      }
		     

		   }
		 else if(event.getSource()==start){
			 
			 
			 try{
				 s1 = con.createStatement();
				 r1 = s1.executeQuery(query1);
				 while(r1.next()) {
			        	
			        	
		        	 out+=r1.getString("Names") ;

		         }

		         r1.close();
		        
		         

		      }

		      catch(SQLException sqle){

		         System.out.println(sqle.getMessage());

		      }

			 
		      
		 }
			 
		
		 
		 JOptionPane.showMessageDialog(null,out);
	
	 }

	 } 
 
 
 
} // end class ButtonTest