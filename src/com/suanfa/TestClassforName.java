package com.suanfa;

public class TestClassforName {
    private String name = "hhhh";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	    TestClassforName Object = (TestClassforName)Class.forName("com.look.myObject").newInstance();
	    Object.setName("jjjj");
	    System.out.println(Object.getName());
	}
}
