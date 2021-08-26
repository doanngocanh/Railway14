import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise3 {
	public static void main(String[] args) {
		
		CategoryQuestion categoryQuestion1 = new CategoryQuestion(1, "Java");
		CategoryQuestion categoryQuestion2 = new CategoryQuestion(1, "SQL");
		CategoryQuestion categoryQuestion3 = new CategoryQuestion(1, "Ruby");

		Exam exam1 = new Exam(1, "A01", "Đề thi Văn", categoryQuestion1, 10, 1, new Date(2021 / 01 / 01));
		Exam exam2 = new Exam(2, "A02", "Đề thi Toán", categoryQuestion2, 10, 1, new Date(2021 / 01 / 01));
		Exam exam3 = new Exam(3, "A03", "Đề thi Anh", categoryQuestion2, 10, 1, new Date(2021 / 01 / 01));
		
		System.out.println(exam1.createDate);
		
		
		
		SimpleDateFormat createDate = new SimpleDateFormat("ngày dd tháng MM năm YYYY");
		try {
			Date a = {Date} createDate.parse(exam1.createDate);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
