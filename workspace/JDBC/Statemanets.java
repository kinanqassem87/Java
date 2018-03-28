import java.sql.*;

public class Statemanets {

   private Connection con=null;

   private Statement selectStatement,s1;

   private ResultSet selectResult,R1;

   

   public void connectToDB() {

      try{

         System.out.println("Loading the driver ...");

         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");//gownload jdbc driver

         System.out.println("Connecting to database ...");
        
        // con = DriverManager.getConnection("jdbc:odbc:DB");//address of DB
          con = DriverManager.getConnection("jdbc:odbc:DB" );
         
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

   public void processBooksQuery(){

      String  query = "select Names from students  ";
     //do not excute statment with insertStatment in the same try moreevre statment from oracle
     //like this : INSERT INTO students  ( Names,Numbers,Score ) Values('hhhhh','70',90)
     //when write statment with button into everyone write its define for statment 
      String  query1 = "select Numbers from students  ";

      try{   //every Statment need  define String as query 

        
         s1 = con.createStatement();
        

         System.out.println("Sending Query to database Table ...\n");

         R1 = s1.executeQuery(query1);
         System.out.print("kk\n");
         
         selectStatement = con.createStatement();
         selectResult = selectStatement.executeQuery(query);
        
      

         System.out.println("The Query  :  "+query+"\n");

 

        // System.out.println("Query results\n");

         while(selectResult.next()) {
        	
        	System.out.println(selectResult.getString("Names") );

         }
            selectResult.close();
         while(R1.next()) {
         	 System.out.println(R1.getString("Numbers") );

         }
        
         R1.close();

      }

      catch(SQLException sqle){

         System.out.println(sqle.getMessage());

      }

   }

   public static void main(String[] args){

	   Statemanets sq = new Statemanets();

      sq.connectToDB();

      sq.processBooksQuery();

      sq.closeDB();

   }  

}