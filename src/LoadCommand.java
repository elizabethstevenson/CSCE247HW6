/**
 * @author Elizabeth Stevenson, Victoria Condos, Brett Logeais, Elijah Dawkins
 * Purpose: a document is loaded into view
 */
public class LoadCommand implements Command {
	private Document doc;
	
	/**
	 * Purpose: creates a document to load
	 * @param doc: document to load
	 */
	public LoadCommand(Document doc) {
		this.doc = doc;
	}
	
	/**
	 * Purpose: execute the load command
	 */
	public void execute() {
		doc.load();
	}
}
