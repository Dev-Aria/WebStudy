package com.springbook.ioc.injection;

import java.util.Map;

import org.springframework.web.servlet.mvc.Controller;

public class CollectionBean {
	
	//private List<String> addressList;
	
	/*
	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}
	
	public List<String> getAddressList() {
		return addressList;
	}
	*/
	
	/*
	private Set<String> addressList;
	
	public void setAddressList(Set<String> addressList) {
		this.addressList = addressList;
	}	
	*/

	//p91
/*
	private Map<String, Controller> addressList;
	
	public void setAddressList(Map<String, Controller> mappings) {
		this.mappings = mappings;
	}	
*/
	private Map<String, Controller> addressList;
	
	public void setAddressList(Map<String, Controller> mappings) {
		this.addressList = mappings;
	}	
}

	