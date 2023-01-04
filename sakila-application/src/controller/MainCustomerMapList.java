package controller;

import java.util.ArrayList;
import java.util.HashMap;

import dao.CustomerDao;

public class MainCustomerMapList {

	public static void main(String[] args) {
		CustomerDao customerDao = new CustomerDao();
		ArrayList<HashMap<String, Object>> list = customerDao.selectCustomerMapList(0, 5);
		for(HashMap<String, Object> m : list) {
			System.out.println(m.get("firstName") + ", ");
			System.out.println(m.get("lastName") + ", ");
			System.out.println(m.get("address") + ", ");
			System.out.println(m.get("district") + ", ");
			System.out.println(m.get("city") + ", ");
			System.out.println(m.get("country"));
			System.out.println("");
		}
	}

}
