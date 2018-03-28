import java.sql.*;
 
public class SelectApp {
  public static void main(String args[]) {
    String url = "jdbc:msql://athens.imaginary.com:4333/db_web";
 
    try {
      Class.forName("imaginary.sql.iMsqlDriver");
    }
    catch( Exception e ) {
      System.out.println("Failed to load mSQL driver.");
      return;
    }
    try {
      Connection con = DriverManager.getConnection(url, "borg", "");
      Statement select = con.createStatement();
      ResultSet result = select.executeQuery
                          ("SELECT key, val FROM t_test");         
 
      System.out.println("Got results:");
      while(result.next()) { // process results one row at a time
        int key = result.getInt(1);
        String val = result.getString(2);
 
        System.out.println("key = " + key);
        System.out.println("val = " + val);
      }
      select.close();
      con.close();
    }
    catch( Exception e ) {
      e.printStackTrace();
    }
  }
}

