package com.lti.demo;

	public class Person 
	{
		private int perId;
		private String perName;
		private double salary;
		public int getPerId() {
			return perId;
		}
		public void setPerId(int perId) {
			this.perId = perId;
		}
		public String getPerName() {
			return perName;
		}
		public void setPerName(String perName) {
			this.perName = perName;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public Person(int perId, String perName, double salary) {
			super();
			this.perId = perId;
			this.perName = perName;
			this.salary = salary;
		}
		public Person() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Person [perId=" + perId + ", perName=" + perName + ", salary=" + salary + "]";
		}
		

	}
