package javaCampHomework.core.logging;

public class FileLogger implements ILogger {

	@Override
	public void log(String data) {
		System.out.println("Dosyaya loglandi : " + data);
		System.out.println("-------------------------------------");

	}

}
