/**
 * @author Elizabeth Stevenson, Victoria Condos, Brett Logeais, Elijah Dawkins
 * Purpose: a document is being saved
 */
public class SaveCommand implements Command {
	private Document doc;
	
	/**
	 * Purpose: creates a document to save
	 * @param doc: document to save
	 */
	public SaveCommand(Document doc) {
		this.doc = doc;
	}
	
	/**
	 * Purpose: execute the save command
	 */
	public void execute() {
		doc.save();
	}
}
