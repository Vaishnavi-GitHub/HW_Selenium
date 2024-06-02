package Week2.day4;

public abstract class MySqlConnection implements DatabseConnection {

	public void executeQuery() {
		System.out.println("executeQuery from abstract class");
	}
	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connect()");
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("disconnect()");
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("executeUpdate()");
	}


}
