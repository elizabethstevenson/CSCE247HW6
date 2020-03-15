/**
 * @author Elizabeth Stevenson, Victoria Condos
 * Purpose: a document is being saved
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
