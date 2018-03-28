import java.sql.*;

public class SelectQuery {

   private Connection con=null;

   private Statement selectStatement,select1;

   private ResultSet selectResult,selectR1;

   

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

   public void processBooksQuery(){

      String  query = "select Numbers from students  ";
     // String  query1 = "select * from students  ";

      try{   //every Statment need try and catch and define String as query 

         selectStatement = con.createStatement();
       

         System.out.println("Sending Query to database Table ...\n");

         

         selectResult = selectStatement.executeQuery(query);
      

         System.out.println("The Query  :  "+query+"\n");

 

         System.out.println("Query results\n");

         while(selectResult.next()) {
        	
        	
        	 System.out.println(selectResult.getString("Numbers") );

         }

         selectResult.close();
        
         

      }

      catch(SQLException sqle){

         System.out.println(sqle.getMessage());

      }

   }

   public static void main(String[] args){

      SelectQuery sq = new SelectQuery();

      sq.connectToDB();

      sq.processBooksQuery();

      sq.closeDB();

   }  

}