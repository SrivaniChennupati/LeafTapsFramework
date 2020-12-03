import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class prop {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
        Properties prop = new Properties();
		
		prop.load(new FileInputStream("./eng.properties"));
		
		System.out.println(prop.getProperty("Login.UName.id"));

	}

}
