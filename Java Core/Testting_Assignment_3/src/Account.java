import java.util.Date;

public class Account implements Comparable<Account> {
	int id;
	String userName;
	String fullName;
	String email;
	Position positionId;
	Department department;
	Date createDate;
	Group[] groups;
	float salary;

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Group[] getGroups() {
		return groups;
	}

	public void setGroups(Group[] groups) {
		this.groups = groups;
	}

	public Account() {
		super();
	}

	public Account(int id, String userName, String fullName, String email, Position positionId, Department department,
			Date createDate, Group[] groups, float salary) {
		super();
		this.id = id;
		this.userName = userName;
		this.fullName = fullName;
		this.email = email;
		this.positionId = positionId;
		this.department = department;
		this.createDate = createDate;
		this.groups = groups;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Position getPositionId() {
		return positionId;
	}

	public void setPositionId(Position positionId) {
		this.positionId = positionId;
	}

	public Department getDepartmentId() {
		return department;
	}

	public void setDepartmentId(Department departmentId) {
		this.department = departmentId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", userName=" + userName + ", fullName=" + fullName + ", email=" + email
				+ ", positionId=" + positionId + ", departmentId=" + department + ", createDate=" + createDate + "]";
	}

	@Override
	public int compareTo(Account o) {
		if (this.department.equals(o.department)) {
			return 1;
		}
		return 0;

	}
}
