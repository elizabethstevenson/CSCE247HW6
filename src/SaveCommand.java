/**
 * @author Elizabeth Stevenson, Victoria Condos, Brett Logeais, Elijah Dawkins
 * Purpose: a document is being saved
 * @param Document - Document file to be saved.
 * 
 */
public class SaveCommand implements Command {
	private Document doc;
	
	public SaveCommand(Document doc) {
		this.doc = doc;
	}
	
	public void execute() {
		doc.save();
	}
}
