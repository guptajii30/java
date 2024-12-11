package myPackSCC1;
import java.util.List;

public class Question1 {
	private int id;
	private String nm;
	private List<Answer>ans;
	
	public Question1() {
		super();
	}

	public Question1(int id, String nm, List<Answer> ans) {
		super();
		this.id = id;
		this.nm = nm;
		this.ans = ans;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public List<Answer> getAns() {
		return ans;
	}

	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}

}
