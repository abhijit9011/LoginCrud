package com.crud;

public class User {
	
		private long id;
		private String userName;
	    private String email;
	    private String mobile;
	    private String userPassword;
		
	    public User() {
			
		}

		public User(long id, String userName, String email, String mobile, String userPassword) {
			super();
			this.id = id;
			this.userName = userName;
			this.email = email;
			this.mobile = mobile;
			this.userPassword = userPassword;
		}

		public User(String userName, String email, String mobile, String userPassword) {
			super();
			this.userName = userName;
			this.email = email;
			this.mobile = mobile;
			this.userPassword = userPassword;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getUserPassword() {
			return userPassword;
		}

		public void setUserPassword(String userPassword) {
			this.userPassword = userPassword;
		}
	    
	    

}
