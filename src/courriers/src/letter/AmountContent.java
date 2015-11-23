package letter;

public class AmountContent extends Contents {
	protected int content;

	public AmountContent(int content) {
		this.content = content;
	}

	public int getContent() {
		return content;
	}
	public void setContent(int content) {
		 this.content =content;
	}
	@Override
	public String getDescription() {
		return "" + content;
	}
}
