package lv08;

import java.util.ArrayList;

class MyArrayList {
	private int size;
	private Integer list[];

	public boolean add(Integer element) { // 처리 결과에 대한 성공 유무를 반환
		try {
			Integer[] temp = this.list;
			this.list = new Integer[this.size + 1];
			for (int i = 0; i < this.size; i++)
				this.list[i] = temp[i];
			this.list[this.size] = element;
			this.size++;
			return true;
		} catch (Exception e) {
//			e.printStackTrace();
			return false;
		}
	}

	public void add(int index, Integer element) { // insert
		if (index >= 0 && index < this.size) {
			Integer[] temp = this.list;
			this.list = new Integer[this.size + 1];
			for (int i = 0; i < this.size; i++) {
				if (i < index) {
					this.list[i] = temp[i];
				} else {
					this.list[i + 1] = temp[i];
				}
			}
			this.list[index] = element;
			this.size++;
		}
	}

	public void remove(int index) { // index로 삭제
		if (index >= 0 && index < this.size) {
			Integer[] temp = this.list;
			this.list = new Integer[this.size - 1];
			
			int n = 0;
			for (int i=0; i<this.size; i++) {
				if (i != index) {
					this.list[n] = temp[i];
					n++;
				}
			}
			this.size --;
		}
	}

	public boolean remove(Integer element) {// 값으로 삭제
		try {
			int delIdx = -1;
			for (int i=0; i<this.size; i++) {
				if (this.list[i].toString().equals(element.toString())) {
					delIdx = i;
				}
			}
			remove(delIdx);
			return true;
		} catch (Exception e) {
			// TODO: handle exception			
			return false;
		}
	}

	public Integer get(int index) {
		return this.list[index];
	}

	public Integer set(int index, Integer element) {
		int data = -1;
		if (index >= 0 && index < this.size) {
			data = this.list[index];
			this.list[index] = element;
		}
		return data;
	}
	@Override
	public String toString() {
		String str = "[";
		for (int i=0; i<this.size; i++) {
			str += this.list[i];
			if (i < this.size-1)
				str += ",";
		}
		str += "]";
		return str;
	}
}

public class Lv8_3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> temp = new ArrayList<Integer>();
		temp.add(1);
		temp.add(2);
		temp.add(3);
		
		System.out.println(temp.set(1,  10));
		System.out.println(temp);

		MyArrayList arr = new MyArrayList();
		System.out.println(arr);
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		System.out.println(arr);
		
		arr.add(0, 10);
		System.out.println(arr);
		
		arr.remove(0);
		System.out.println(arr);
		
		System.out.println(">>>>>>");
		
		System.out.println(arr.remove(new Integer(3)));
	
		
		System.out.println(arr);
		
	

	}

}
