package com.student.manage;

public class Student {

		private int studentId;
		private String studentNameString;
		private String studentPhoneString;
		private String studentCity;
		
		
		
		public int getStudentId() {
			return studentId;
		}

		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}

		public String getStudentNameString() {
			return studentNameString;
		}

		public void setStudentNameString(String studentNameString) {
			this.studentNameString = studentNameString;
		}

		public String getStudentPhoneString() {
			return studentPhoneString;
		}

		public void setStudentPhoneString(String studentPhoneString) {
			this.studentPhoneString = studentPhoneString;
		}

		public String getStudentCity() {
			return studentCity;
		}

		public void setStudentCity(String studentCity) {
			this.studentCity = studentCity;
		}

		public Student(int studentId, String studentNameString, String studentPhoneString, String studentCity) {
			super();
			this.studentId = studentId;
			this.studentNameString = studentNameString;
			this.studentPhoneString = studentPhoneString;
			this.studentCity = studentCity;
		}

		public Student(String studentNameString, String studentPhoneString, String studentCity) {
			super();
			this.studentNameString = studentNameString;
			this.studentPhoneString = studentPhoneString;
			this.studentCity = studentCity;
		}

		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Student [studentId=" + studentId + ", studentNameString=" + studentNameString
					+ ", studentPhoneString=" + studentPhoneString + ", studentCity=" + studentCity + "]";
		}
		
		
		
		
}
