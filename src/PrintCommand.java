/**
 * @author Elizabeth Stevenson, Victoria Condos, Brett Logeais, Elijah Dawkins
 * Purpose: a document is being printed
 * @param Document - Document file to be printed.
 */
public class PrintCommand implements Command {
	private Document doc;
	
	public PrintCommand(Document doc) {
		this.doc = doc;
	}
	
	public void execute() {
		doc.print();
	}
}
