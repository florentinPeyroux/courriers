package letter;

public class LetterContent extends Contents {
	Letter<?> content;

	public LetterContent(Letter<?> letter) {
		this.content = letter;
	}

	@Override
	public String getDescription() {
		return "";
	}

	public Letter<?> getContent() {
		return this.content;
	}

	public void setContent(Letter<?> content) {
		this.content = content;
	}
}
