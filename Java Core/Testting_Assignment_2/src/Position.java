
public class Position {
	int id;
	PositionName positionName;

	public Position(int id, PositionName positionName) {
		super();
		this.id = id;
		this.positionName = positionName;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public PositionName getPositionName() {
		return positionName;
	}

	public void setPositionName(PositionName positionName) {
		this.positionName = positionName;
	}

	@Override
	public String toString() {
		return "Position [id=" + id + ", positionName=" + positionName + "]";
	}

}