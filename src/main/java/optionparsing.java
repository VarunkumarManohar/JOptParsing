import java.io.IOException;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import junit.*;
import static java.io.File.*;
import static java.util.Arrays.*;


public class optionparsing {
	public static void main(String[] args) throws IOException 
	{
		OptionParser parser = new OptionParser();
		try
		{
			parser.accepts( "zkConnect").withRequiredArg().ofType(String.class).defaultsTo("localhost:9092");
	        parser.accepts( "dumpDirectory").withRequiredArg().ofType(String.class);
	        OptionSet options = parser.parse( args);
		}
		catch(Exception e)
		{
			System.out.println("USAGE is wrong");
			parser.printHelpOn(System.out);
		}
		
	}

}
