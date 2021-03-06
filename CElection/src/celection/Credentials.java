/**
* @author ${Ranjit Singh}
*/

package celection;

public class Credentials {
	private String name;
	private String password;
	private String id;
	private boolean hasVoted;
	private String assignedCandidate;
	
	public boolean isHasVoted() {
		return hasVoted;
	}
	public void setHasVoted(boolean hasVoted) {
		this.hasVoted = hasVoted;
	}
	public String getAssignedCandidate() {
		return assignedCandidate;
	}
	public void setAssignedCandidate(String assignedCandidate) {
		this.assignedCandidate = assignedCandidate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
