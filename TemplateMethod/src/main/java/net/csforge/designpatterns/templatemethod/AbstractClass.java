package net.csforge.designpatterns.templatemethod;

public abstract class AbstractClass {
	
	final void templateMethod(){
		primitiveOperation1();
		primitiveOperation2();
		concreteOperation();
		hook();
	}
	
	abstract void primitiveOperation1();
	abstract void primitiveOperation2();
	
	final void concreteOperation(){
		System.out.println(".........concreate operation.");
	}
	
	void hook(){}
}
