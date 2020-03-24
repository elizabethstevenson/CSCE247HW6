/**
 * @author Elizabeth Stevenson, Victoria Condos, Brett Logeais, Elijah Dawkins
 * Purpose: a document is being checked for spelling
 */
public class SpellCommand implements Command {
	private Document doc;
	
	/**
	 * Purpose: creates a document to spell check
	 * @param doc: document to speck check
	 * @return current document
	 */
	public SpellCommand(Document doc) {
		this.doc = doc;
	}
	
	/**
	 * Purpose: execute the spell command
	 * @return spell command.
	 */
	public void execute() {
		doc.spell();
	}
}
