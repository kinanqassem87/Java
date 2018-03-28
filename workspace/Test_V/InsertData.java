import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



 public class InsertData extends JFrame {
	 private JTextField textField1, textField2, textField3;
	 private JButton Add,Show;
	 
	 private Connection con=null;

	   private Statement selectStatement,s1;

	   private ResultSet r1;
	  String t1;
	   int t2,t3;
	   
	   
	   
	
	 String out="";
	 
	 // set up GUI
 public InsertData()
 {
 super( "Insert  Data" );
// get content pane and set its layout
 Container container = getContentPane();
 container.setLayout(new FlowLayout()  );
textField1 = new JTextField( 10 );//size of textfield 10 char
 container.add( textField1 );

 Add = new JButton( "Add" );
 container.add( Add );
 textField2 = new JTextField( 10 );//size of textfield 10 char
 container.add( textField2 );


 Show = new JButton( "Show" );
 container.add( Show );
 textField3 = new JTextField( 10 );//size of textfield 10 char
 container.add( textField3 );

 

 
 
 

 

 
 ButtonHandler handler = new ButtonHandler();//event for button
 Add.addActionListener( handler );
 Show.addActionListener( handler );
 

 setSize( 275, 200 );
 setVisible( true );
 setLocation(200,200);
 }
 
 
 
 
 public void connectToDB() {

     try{

        System.out.println("Loading the driver ...");

        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
       // Class.forName("com.mysql.jdbc.Driver"); 

        System.out.println("Connecting to database ...");

        con = DriverManager.getConnection("jdbc:odbc:DB");
       // con = DriverManager.getConnection("jdbc:mysql:DB");
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
 
InsertData application = new InsertData();

 application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
 
 

 application.connectToDB();



 //application.closeDB();//for close DB after excute if you want 
 
 
 

 }
 
 
 private class ButtonHandler implements ActionListener {
	
	 // handle button event
	 public void actionPerformed( ActionEvent event )
	 {
		 
		
		
		 
		
		 if(event.getSource()==Add){
			
			
			 t1=(textField1.getText());
			 t2=Integer.parseInt(textField2.getText());
			 t3=Integer.parseInt(textField3.getText());
			 
			 
			 try{
				 
				
				 selectStatement = con.createStatement();
				// String  query = "insert into students(Names, Numbers,score) values (  'kinan'  ,12,30)";
				//three comma for string
				 String query = "INSERT into students(Names,Numbers,Score) "+"values ( '"+ t1+  "' ,"+t2+","+t3 +")";
				   selectStatement.executeUpdate(query);

				   selectStatement.close();
		      
		         JOptionPane.showMessageDialog(null,"Added Succeed");

		      }

		      catch(SQLException sqle){

		         System.out.println(sqle.getMessage());
		         JOptionPane.showMessageDialog(null," ERROR");

		      }
		      
		      System.out.print(""+t1+"  "+t2+"  "+t3);
		     // closeDB();

		   }
		 else if(event.getSource()==Show){
			 
			 
			 try{
				 s1 = con.createStatement();
				 //String  query1 = "SELECT *  FROM students   ";
				//write string in single contation
				 //String  query1 = "SELECT names  FROM students WHERE numbers>50";
				 String  query1 = "SELECT *  FROM students WHERE names = 'Mohammad' AND Numbers > 50  ";
				 
				 r1 = s1.executeQuery(query1);
				 while(r1.next()) {
			        	
			        	
		        	 out+=r1.getString("Names")+"   "+r1.getString("Numbers")+"   "+r1.getString("score") ;

		         out+="\n";
				 }

		         r1.close();
		        
		        

		      }

		      catch(SQLException sqle){

		         System.out.println(sqle.getMessage());

		      }

		      JOptionPane.showMessageDialog(null,out);
		      
		      
		 }
			 
		
		 
		 
	
	 }

	 } 
 
 
 
} 