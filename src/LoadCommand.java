/**
 * @author Elizabeth Stevenson, Victoria Condos, Brett Logeais, Elijah Dawkins
 * Purpose: a document is loaded into view
 * @param Document - Document file to be loaded.
 */
public class LoadCommand implements Command {
	private Document doc;
	
	public LoadCommand(Document doc) {
		this.doc = doc;
	}
	
	public void execute() {
		doc.load();
	}
}
