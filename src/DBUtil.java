import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DBUtil {
	
	static Connection connected = null;
	
	static Connection getConnected(){
		try {
			Class.forName("org.h2.Driver");//("com.microsoft.sqlserver.jdbc.SQLServerDriver");///MYPC\\SQLEXPRESS;databaseName=MYDB;integratedSecurity=true"
			connected = DriverManager.getConnection("jdbc:h2:~person");//C:/Users/Иван/person");//("jdbc:h2:file:C:/person","sa","");//( "jdbc:h2:tcp://localhost/~/test","sa","");			
			//Statement st = connected.createStatement();
			//st.execute("create table person (f_name varchar(20),l_name varchar(20),age varchar(3),email varchar(20) primary key ,gender varchar(10),)");
			return connected;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// end try/catch
		return connected;
	}// end getConnected
	
}// end DBUtil
