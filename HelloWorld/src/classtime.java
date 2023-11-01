import java.io.PrintWriter;
import java.io.File;
public class classtime {
	public static void main(String[] args)
	{
		PrintWriter writer;
		try {
		writer = new PrintWriter(new File("myFile.txt"));
		}
		catch (Exception e) {
			System.err.println("there was a problem opening the file");
			//System.exit.(0);
			return;
		}
		writer.close();
		
		
		
		
		
		
		
		
		/*catch (ArrayIndexOutOfBoundsException e) {
			System.our.println("Bad array index!");
		}
		catch (exception e) {
			
		}
		*/
	}
}
