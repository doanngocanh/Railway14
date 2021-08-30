import java.util.Date;

public class GroupAccount {
	Group idGroup;
	Account idAccount;
	Date joinDate;

	public GroupAccount(Group idGroup, Account idAccount, Date joinDate) {
		super();
		this.idGroup = idGroup;
		this.idAccount = idAccount;
		this.joinDate = joinDate;
	}

	public Group getIdGroup() {
		return idGroup;
	}

	public void setIdGroup(Group idGroup) {
		this.idGroup = idGroup;
	}

	public Account getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(Account idAccount) {
		this.idAccount = idAccount;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	@Override
	public String toString() {
		return "GroupAccount [idGroup=" + idGroup + ", idAccount=" + idAccount + ", joinDate=" + joinDate + "]";
	}

}
