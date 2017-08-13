package stack;

import dataStruct.IDataStruct;

public interface IStack<T> extends IDataStruct {
	 public T pop();
	 public boolean push(T t);
	 public int stackSize();
	 public int grow();
	 public int grow(int n);
	 public int trimToSize();
}
