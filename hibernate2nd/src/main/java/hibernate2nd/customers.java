package hibernate2nd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

	
	@Entity
	@Table (name ="customers")
	public class customers {

		@Id
	    @Column(name = "user_id")
	    private int userid;
	 
	    @Column(name = "user_name")
	    private String username;
	 
	    @Column(name = "user_address")
	    private String useraddress;

		public int getUserid() {
			return userid;
		}

		public void setUserid(int userid) {
			this.userid = userid;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getUseraddress() {
			return useraddress;
		}

		public void setUseraddress(String useraddress) {
			this.useraddress = useraddress;
		}

		public customers() {
			super();
			// TODO Auto-generated constructor stub
		}

		public customers(int userid, String username, String useraddress) {
			super();
			this.userid = userid;
			this.username = username;
			this.useraddress = useraddress;
		}

		@Override
		public String toString() {
			return "customers [userid=" + userid + ", username=" + username + ", useraddress=" + useraddress + "]";
		
		}
	}
		


	
	
