import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="student_2")
public class pojo {
	@Id
	private int regno;
	
	private String name;
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
