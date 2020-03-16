/**
 * 
 * @author Victoria Condos, Elizabeth Stevenson
 * Purpose: Holds a hashmpa for commands and corresponding input keys
 */
import java.util.HashMap;
public class InputHandler {
	private HashMap<String, Command> commands = new HashMap<>();
	
	public InputHandler(Document document) {
		commands.put("load", new LoadCommand(document)); //TODO- I don't really understand hash maps -v
		commands.put("save", new SaveCommand(document));
		commands.put("spell", new SpellCommand(document));
		commands.put("print", new PrintCommand(document));
	}
	public void inputEntered(String data) { //TODO- idk when data is used
		commands.get("load");
		commands.get("save");
		commands.get("spell");
		commands.get("print");
	}
}
