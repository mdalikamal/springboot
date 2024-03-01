package com.adding;
public class user {
   
	private  int   id;
      private String Firstname;        
	   private String Department;
        private String Surname;
        
        public user(int Id, String firstname, String department, String surname) {
			
			this.id = Id;
			Firstname = firstname;
			Department = department;
			Surname = surname;
		}
		public int getId() {
    		return id;
    	}
    	public void setId(int id) {
    		this.id = id;
    	}
    	public String getFirstname() {
    		return Firstname;
    	}
    	public void setFirstname(String firstname) {
    		Firstname = Firstname;
    	}
    	public String getDepartment() {
    		return Department;
    	}
    	public void setDepartment(String department) {
    		Department =Department;
    	}
    	public String getSurname() {
    		return Surname;
    	}
    	public void setSurname(String surname) {
    		Surname = Surname;
    	}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return  Firstname+""+Department+" "+Surname;
		}
    	
}
