/**
 * @author Elizabeth Stevenson, Victoria Condos, Brett Logeais
 * Purpose: a document is being saved
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
