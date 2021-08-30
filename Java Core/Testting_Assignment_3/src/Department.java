
public class Department implements Comparable<Department> {
	int idDepartment = 1;
	String nameDepartment;

	public Department(int idDepartment, String nameDepartment) {
		super();
		this.idDepartment = idDepartment;
		this.nameDepartment = nameDepartment;
	}

	public int getIdDepartment() {
		return idDepartment;
	}

	public void setIdDepartment(int idDepartment) {
		this.idDepartment = idDepartment;
	}

	public String getNameDepartment() {
		return nameDepartment;
	}

	public void setNameDepartment(String nameDepartment) {
		this.nameDepartment = nameDepartment;
	}

	@Override
	public String toString() {
		return "Department [idDepartment=" + idDepartment + ", nameDepartment=" + nameDepartment + "]";
	}

	@Override
	public int compareTo(Department o) {
		if ( this.nameDepartment.equals(o.nameDepartment)) {
			return 1;
		}
		return 0;
	}

}
