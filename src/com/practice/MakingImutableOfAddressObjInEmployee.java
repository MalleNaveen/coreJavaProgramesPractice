package com.practice;

import java.util.HashMap;

 final class MakingImutableOfAddressObjInEmployee {
	private final String empName;
	   private final int age;
	   private final MakeAddressImutableInEmployeeClass address;
	   //if list or map making imputable
	   private final HashMap<String,String> testMap;
	   public MakingImutableOfAddressObjInEmployee(String name, int age, MakeAddressImutableInEmployeeClass address,HashMap<String,String> testMap) {
	      super();
	      this.empName = name;
	      this.age = age;
	      this.address = address;
	      this.testMap=testMap;
	   }
	   public String getEmpName() {
	      return empName;
	   }
	   public int getAge() {
	      return age;
	   }
	   /* public Address getAddress() {
	      return address;
	      }
	   */
	   //while returning object of address give copy of that
	   public MakeAddressImutableInEmployeeClass getAddress() throws CloneNotSupportedException {
	      return (MakeAddressImutableInEmployeeClass) address.clone();
	   }

	
	/**
	 * Accessor function for mutable objects
	 */
	@SuppressWarnings("unchecked")
	public HashMap<String, String> getTestMap()  throws CloneNotSupportedException{
		//return testMap;
		return (HashMap<String, String>) testMap.clone();
	}

}
