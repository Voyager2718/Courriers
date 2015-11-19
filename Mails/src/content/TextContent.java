package content;

public class TextContent extends ContentDecorator {
	protected String text;

	public TextContent(String text, Content content) {
		super(content);
		this.text = text;
	}
}