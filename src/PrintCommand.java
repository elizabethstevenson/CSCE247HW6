/**
 * @author Elizabeth Stevenson, Victoria Condos, Brett Logeais
 * Purpose: a document is being printed
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
