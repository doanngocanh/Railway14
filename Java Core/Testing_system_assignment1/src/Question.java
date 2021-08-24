import java.util.Arrays;
import java.util.Date;

public class Question {
	int idQuestion;
	String content;
	CategoryQuestion idCategory;
	TypeQuestion idType;
	int idCreator;
	Date createDate;
	Exam[] exams;

	public Question(int idQuestion, String content, CategoryQuestion idCategory, TypeQuestion idType, int idCreator,
			Date createDate) {
		super();
		this.idQuestion = idQuestion;
		this.content = content;
		this.idCategory = idCategory;
		this.idType = idType;
		this.idCreator = idCreator;
		this.createDate = createDate;
	}

	public int getIdQuestion() {
		return idQuestion;
	}

	public void setIdQuestion(int idQuestion) {
		this.idQuestion = idQuestion;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public CategoryQuestion getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(CategoryQuestion idCategory) {
		this.idCategory = idCategory;
	}

	public TypeQuestion getIdType() {
		return idType;
	}

	public void setIdType(TypeQuestion idType) {
		this.idType = idType;
	}

	public int getIdCreator() {
		return idCreator;
	}

	public void setIdCreator(int idCreator) {
		this.idCreator = idCreator;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Exam[] getExams() {
		return exams;
	}

	public void setExams(Exam[] exams) {
		this.exams = exams;
	}

	@Override
	public String toString() {
		return "Question [idQuestion=" + idQuestion + ", content=" + content + ", idCategory=" + idCategory
				+ ", idType=" + idType + ", idCreator=" + idCreator + ", createDate=" + createDate + ", exams="
				+ Arrays.toString(exams) + "]";
	}

}
