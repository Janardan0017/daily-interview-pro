import java.util.LinkedList;

public class LinkedListIntersection{

	public static void main(String[] args){

		LinkedList<Integer> list = new LinkedList<>();
		for(int i=5; i<11; i++){
			list.add(i);
		}
		System.out.println(list);
		LinkedList<Integer> list2 = new LinkedList<>();
		for(int i=1; i<5; i++){
			list2.add(i);
		}
		list2.addAll(list);
		System.out.println(list2);
		LinkedList<Integer> list3 = new LinkedList<>();
		for(int i=3; i<5; i++){
			list3.add(i);
		}
		list3.addAll(list);
		System.out.println(list3);
	}
}