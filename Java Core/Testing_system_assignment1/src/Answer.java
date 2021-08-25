
public class Answer {
	int idAnswer;
	String content;
	Question idQuestion;
	boolean isCorrect;

	public Answer(int idAnswer, String content, Question idQuestion, boolean isCorrect) {
		super();
		this.idAnswer = idAnswer;
		this.content = content;
		this.idQuestion = idQuestion;
		this.isCorrect = isCorrect;
	}

	public int getIdAnswer() {
		return idAnswer;
	}

	public void setIdAnswer(int idAnswer) {
		this.idAnswer = idAnswer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Question getIdQuestion() {
		return idQuestion;
	}

	public void setIdQuestion(Question idQuestion) {
		this.idQuestion = idQuestion;
	}

	public boolean isCorrect() {
		return isCorrect;
	}

	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}

	@Override
	public String toString() {
		return "Answer [idAnswer=" + idAnswer + ", content=" + content + ", idQuestion=" + idQuestion + ", isCorrect="
				+ isCorrect + "]";
	}

}
