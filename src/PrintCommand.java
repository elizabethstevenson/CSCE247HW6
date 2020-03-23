/**
 * @author Elizabeth Stevenson, Victoria Condos, Brett Logeais, Elijah Dawkins
 * Purpose: a document is being printed
 */
public class PrintCommand implements Command {
	private Document doc;
	
	/**
	 * Purpose: creates a document to print
	 * @param doc: document to print
	 */
	public PrintCommand(Document doc) {
		this.doc = doc;
	}
	
	/**
	 * Purpose: execute the print command
	 */
	public void execute() {
		doc.print();
	}
}
