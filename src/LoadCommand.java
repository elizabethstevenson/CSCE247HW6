/**
 * @author Elizabeth Stevenson, Victoria Condos, Brett Logeais
 * Purpose: a document is loaded into view
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
