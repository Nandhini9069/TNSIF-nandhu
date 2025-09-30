package com.tnsif.entity.java;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		private int id;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		private String name;
		private String city;
		@Override
		public String toString() {
			return "CustomerDemo [id=" + id + ", name=" + name + ", city=" + city + "]";
		}

		}



	}

}
