/**
 * 
 * @author Victoria Condos, Elizabeth Stevenson
 * Purpose: Holds a hashmpa for commands and corresponding input keys
 */
import java.util.HashMap;
public class InputHandler {
	private HashMap<String, Command> commands = new HashMap<String, Command>();
	
	public void InputHandler(Document document) {
		commands.put("load", document.load()); //TODO- I don't really understand hash maps -v
		commands.put("save", document.save());
		commands.put("spell", document.spell());
		commands.put("print", document.print());
	}
	public void InputEntered(String data) { //TODO- idk when data is used
		commands.get("load");
		commands.get("save");
		commands.get("spell");
		commands.get("print");
	}
}
