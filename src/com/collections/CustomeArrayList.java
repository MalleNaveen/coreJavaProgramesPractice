package com.collections;

import java.util.Arrays;

/***
 *  Create Custom array list.
 * 
 * 
 **/
public class CustomeArrayList<E> {
	
	
	
	private int size = 0;
	private int midcount = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    
	
	public CustomeArrayList() {
		elements = new Object[DEFAULT_CAPACITY];
	}



	public void add(E e){
		
		if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
	}
	
	public E remove(int index) {
        rangeCheck(index);

        E oldValue = elements(index);

        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(elements, index+1, elements, index,
                             numMoved);
        elements[--size] = null; // clear to let GC do its work

        return oldValue;
    }
	
public E get(int i){
	 if (i>= size || i <0) {
         throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
     }
     return (E) elements[i];
 }
	

public void set(int i,E e){
	elements[i]=e;
}

private void ensureCapa() {
    int newSize = elements.length * 2;
    elements = Arrays.copyOf(elements, newSize);
}

private void rangeCheck(int index) {
    if (index >= size)
        throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
}
private String outOfBoundsMsg(int index) {
    return "Index: "+index+", Size: "+size;
}
@SuppressWarnings("unchecked")
E elements(int index) {
    return (E) elements[index];
}
}
