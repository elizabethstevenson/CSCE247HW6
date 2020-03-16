/**
 * @author Elizabeth Stevenson, Victoria Condos, Brett Logeais, Elijah Dawkins
 * Purpose: a document is being checked for spelling
 * @param Document - Document file to be manipulated.
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
