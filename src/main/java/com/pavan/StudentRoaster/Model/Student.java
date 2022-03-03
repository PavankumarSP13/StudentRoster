package com.pavan.StudentRoaster.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	
	    public Student() {
		super();
	}


		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private long id;
		
		@Column(name="Name")
	    private String name;
		
		@Column(name="Technology")
	    private String tech;
		
		@Column(name="email")
	    private String email;
	 
	    
	    public long getId() {
			return id;
		}


		public void setId(long id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getTech() {
			return tech;
		}


		public void setTech(String tech) {
			this.tech = tech;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public Student(String name, String tech, String email) {
	         this.name = name;
	         this.tech = tech;
	         this.email = email;
	    }
	 
	   
	   
	       

}
