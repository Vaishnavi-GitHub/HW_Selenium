package Week2.day4;

public class JavaConnection extends MySqlConnection implements DatabseConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection jc= new JavaConnection();
		jc.connect();
		jc.executeQuery();
	}

	
}
