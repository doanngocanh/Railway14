import java.util.Date;

public class Group {
	int idGroup;
	String nameGroup;
	int idCreator;
	Date createDate;

	public Group(int idGroup, String nameGroup, int idCreator, Date createDate) {
		super();
		this.idGroup = idGroup;
		this.nameGroup = nameGroup;
		this.idCreator = idCreator;
		this.createDate = createDate;
	}

	public int getIdGroup() {
		return idGroup;
	}

	public void setIdGroup(int idGroup) {
		this.idGroup = idGroup;
	}

	public String getNameGroup() {
		return nameGroup;
	}

	public void setNameGroup(String nameGroup) {
		this.nameGroup = nameGroup;
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

	@Override
	public String toString() {
		return "Group [idGroup=" + idGroup + ", nameGroup=" + nameGroup + ", idCreator=" + idCreator + ", createDate="
				+ createDate + "]";
	}

}
