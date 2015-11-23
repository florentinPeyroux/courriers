package letter;

public class TextContent extends Contents {

	protected String content;
	
	public TextContent(String content){
		this.content=content;
	}
	
	public String getContent(){
		return content;
	}
	
	@Override
	public String getDescription() {
		return content;
	}
}
