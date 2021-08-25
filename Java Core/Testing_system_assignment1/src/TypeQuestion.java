
public class TypeQuestion {
	int idType;
	String nameType;

	public TypeQuestion(int idType, String nameType) {
		super();
		this.idType = idType;
		this.nameType = nameType;
	}

	public int getIdType() {
		return idType;
	}

	public void setIdType(int idType) {
		this.idType = idType;
	}

	public String getNameType() {
		return nameType;
	}

	public void setNameType(String nameType) {
		this.nameType = nameType;
	}

	@Override
	public String toString() {
		return "TypeQuestion [idType=" + idType + ", nameType=" + nameType + "]";
	}

}
