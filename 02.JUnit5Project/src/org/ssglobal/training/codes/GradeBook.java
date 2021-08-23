package org.ssglobal.training.codes;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;

public class GradeBook<E> extends AbstractList<E> {

	@SuppressWarnings("unchecked")
	private E[] myData = (E[]) new Object[0];
	
	@Override
	public E get(int index) {
		E value = null;
		
		try {
			value = myData[index];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		}		
		
		return value;
	}

	@Override
	public int size() {		
		return myData.length;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean add(E e) {
		
		if (e != null) {
			try {
				E temp[] = (E[]) new Object[myData.length + 1];
				System.arraycopy(myData, 0, temp, 0, myData.length);
				temp[myData.length] = e;
				
				myData 	= null;
				myData 	= temp;
				Arrays.sort(myData, new ObjectComparator<E>());
				temp 	= null;
				
				return true;		
			} catch (Exception ex) {
				return false;
			}
		} else {
			return false;
		}		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean remove(Object o) {
		
		try {
			int counter = 0;
			
			for (E data : myData) {
				if ( data.equals(o)) {
					counter++;
				}
			}
			
			E[] temp = (E[]) new Object[myData.length - counter];
			
			int i = 0;
			for ( E data : myData) {
				if (!(data.equals(o))) {
					temp[i] = data;
					i++;
				}
			}
			
			myData = null;
			myData = temp;
			temp   = null;			
									
			return true;
		} catch (Exception ex) {			
			return false;
		}
	}		

	@SuppressWarnings("hiding")
	class ObjectComparator<E> implements Comparator<E> {

		@Override
		public int compare(E o1, E o2) {
			
			if (o1 instanceof String && o2 instanceof String) {
				String val1 = (String) o1;
				String val2 = (String) o2;
				
				if (val1.compareTo(val2) == 0) {
					return 0;
				} else if (val1.compareTo(val2) > 0) {
					return 2;
				} else {
					return -2;
				}
			} else {
				return 0;
			}	
				
		}
		
	}
}
