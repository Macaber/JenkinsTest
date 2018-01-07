package common;

import com.sun.org.apache.bcel.internal.classfile.Node;

public class MyArrayStackEx<E> extends MyArrayStack {
	Object toPop;
	E add(Node x) {
		E element = (E) x;
		if(element.equals(toPop)) {
			System.out.println("pop(Object)方法内部出栈正确！");
			
		}else {
			System.out.println("pop(Object)方法内部出栈错误！");
		}
		return element;
	}
	

}
