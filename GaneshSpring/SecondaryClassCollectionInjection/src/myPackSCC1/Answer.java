package myPackSCC1;

public class Answer {
	private String nm;
	private int id;
	private String by;
	
	
	public Answer() {
		super();
	}
	
	public Answer(String nm, int id, String by) {
		super();
		this.nm = nm;
		this.id = id;
		this.by = by;
	}

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBy() {
		return by;
	}

	public void setBy(String by) {
		this.by = by;
	}
}
