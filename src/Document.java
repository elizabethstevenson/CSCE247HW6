/**
 * @author Elizabeth Stevenson
 * Purpose: this is a document where users can load, spell, save, and print
 */
public class Document {
	public String name;
	
	public Document(String name) {
		this.name = name;
		System.out.println("Document named " + name + " is created");
	}
	
	public void load() {
		System.out.println("document " + name + " is loaded into view");
	}
	
	public void spell() {
		System.out.println("document " + name + " is being checked for spelling errors");
	}
	
	public void save() {
		System.out.println("document " + name + " is being saved...");
	}
	
	public void print() {
		System.out.println("document " + name + " is printing...");
	}
}
