import java.util.Arrays;
import java.util.Date;
import java.util.Timer;

public class Exam {
	int idExam;
	String code;
	String title;
	CategoryQuestion idCategory;
	int duration;
	int idCreator;
	Date createDate;
	Question[] questions;

	public Exam(int idExam, String code, String title, CategoryQuestion idCategory, int duration, int idCreator,
			Date createDate) {
		super();
		this.idExam = idExam;
		this.code = code;
		this.title = title;
		this.idCategory = idCategory;
		this.duration = duration;
		this.idCreator = idCreator;
		this.createDate = createDate;
	}

	public int getIdExam() {
		return idExam;
	}

	public void setIdExam(int idExam) {
		this.idExam = idExam;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public CategoryQuestion getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(CategoryQuestion idCategory) {
		this.idCategory = idCategory;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
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

	public Question[] getQuestions() {
		return questions;
	}

	public void setQuestions(Question[] questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "Exam [idExam=" + idExam + ", code=" + code + ", title=" + title + ", idCategory=" + idCategory
				+ ", duration=" + duration + ", idCreator=" + idCreator + ", createDate=" + createDate + ", questions="
				+ Arrays.toString(questions) + "]";
	}

}
