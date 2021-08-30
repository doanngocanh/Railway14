import java.time.Instant;
import java.util.Date;
import java.util.Iterator;

public class Exercise2 {
	public static void main(String[] args) {

		Account[] accounts = new Account[5];
		for (int i = 1; i < accounts.length + 1; i++) {
			Account acc = new Account();
			acc.setId(i);
			acc.setUserName("User name " + i);
			acc.setFullName("Full name " + i);
			acc.setCreateDate(Date.from(Instant.now()));

			System.out.println("ID: " + acc.getId() + " User name: " + acc.getUserName() + " Full name: "
					+ acc.getFullName() + " Create Date: " + acc.getCreateDate());

		}

	}

}
