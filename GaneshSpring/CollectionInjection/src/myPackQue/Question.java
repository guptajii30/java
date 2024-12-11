package myPackQue;
import java.util.List;

public class Question {
	private int id;
	private String nm;
	private List<String>ans;
	
	public Question() {
		super();
	}
	
	public Question(int id, String nm, List<String> ans) {
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
	public List<String> getAns() {
		return ans;
	}
	public void setAns(List<String> ans) {
		this.ans = ans;
	}
	
	public void displayInfo() {
		System.out.println(id+" "+nm);
		for(String str: ans) {
			System.out.println(str);
		}
	}

}	
