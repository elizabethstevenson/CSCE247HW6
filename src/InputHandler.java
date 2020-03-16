/**
 * @author Victoria Condos, Elizabeth Stevenson, Brett Logeais
 * Purpose: Holds a hashmap for commands and corresponding input keys
 */
import java.util.HashMap;
public class InputHandler {
	private HashMap<String, Command> commands = new HashMap<>();
	
	public InputHandler(Document document) {
		commands.put("load", new LoadCommand(document));
		commands.put("save", new SaveCommand(document));
		commands.put("spell", new SpellCommand(document));
		commands.put("print", new PrintCommand(document));
	}
	
	public void inputEntered(String data) {
		Command command = commands.get(data);
		if (command == null) {
			System.out.println("Sorry, we don't recognize that command");
		} else {
			command.execute();
		}
	}
}
