/**
 * @author Elizabeth Stevenson, Victoria Condos, Brett Logeais
 * Purpose: a document is being checked for spelling
 */
public class SpellCommand implements Command {
	private Document doc;
	
	public SpellCommand(Document doc) {
		this.doc = doc;
	}
	
	public void execute() {
		doc.spell();
	}
}
