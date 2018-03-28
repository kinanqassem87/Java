import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

public class HwUtil {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		writeToFile("A67");
		runExe();

	}
	
	public static void writeToFile(String value) throws IOException {
		Writer output = null;
	    String text = value;
	    File file = new File("d:/test/com.txt");
	    output = new BufferedWriter(new FileWriter(file));
	    output.write(text);
	    output.close();
	    System.out.println("Your file has been written");
	}
	
	public static void runExe() {
		Runtime run = Runtime.getRuntime();
		try {

			Process pp = run.exec("C:/Users/hp/Desktop/test serial/Serial");
			BufferedReader in = new BufferedReader(new InputStreamReader(pp.getErrorStream()));
			String line;
			while ((line = in.readLine()) != null) {
				System.out.println(line);
			}
			int exitVal = pp.waitFor();
			System.out.println("Process exitValue: " + exitVal);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
}
