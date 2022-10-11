package kodlamaIoNLayeredApp.core.logging;

public class DatabaseLogger implements Logger {

	@Override
	public void Log(String data) {
		System.out.println("Veri tabanına loglandı : " + data);
		
	}

}
