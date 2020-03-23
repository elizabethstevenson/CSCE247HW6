/**
 * @author Victoria Condos, Elizabeth Stevenson, Brett Logeais, Elijah Dawkins
 * Purpose: Holds a hashmap for commands and corresponding input keys
 */
import java.util.HashMap;
public class InputHandler {
	private HashMap<String, Command> commands = new HashMap<>();
	
	/**
	 * Purpose: associates each command with the string
	 * @param document: commands are done to a document
	 */
	public InputHandler(Document document) {
		commands.put("load", new LoadCommand(document));
		commands.put("save", new SaveCommand(document));
		commands.put("spell", new SpellCommand(document));
		commands.put("print", new PrintCommand(document));
	}
	
	/**
	 * Purpose: to recognize the inputted command
	 * @param data: this is the what the user inputted for the command
	 */
	public void inputEntered(String data) {
		Command command = commands.get(data);
		if (command == null) {
			System.out.println("Sorry, we don't recognize that command");
		} else {
			command.execute();
		}
	}
}
