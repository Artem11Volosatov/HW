package sourceit.homework_7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ListEvaluation {
	
	public static void main(String[]args) {
		
		List <Integer> arrayL = new ArrayList<>();
		List <Integer> linkedL = new LinkedList<>();
		
		fillOutList(linkedL, 1000000);
		fillOutList(arrayL, 1000000);
		
		System.out.println("ARRAY LIST\n\n");
		
		long mill = System.nanoTime();
		addElementsToBeginning(arrayL, 100);
		long add100ElementsToBeginning = (System.nanoTime()-mill)/1000;
		
		System.out.println("100 element added into the beginning: " + add100ElementsToBeginning);
		
		arrayL = new ArrayList<>();
		fillOutList(arrayL, 1_000_000);
		mill = System.nanoTime();
		addElementsToMiddle(arrayL, 100);
		long add100ElementArrayListMiddle = (System.nanoTime() - mill) / 10000;

		System.out.println(
				"100 element added into the middle: " + add100ElementArrayListMiddle);

		arrayL = new ArrayList<>();
		fillOutList(arrayL, 1_000_000);
		mill = System.nanoTime();
		addElementsToEnd(arrayL, 100);
		long add100ElementArrayListEnd = (System.nanoTime() - mill) / 10000;

		System.out
				.println("100 element added into the end: " + add100ElementArrayListEnd);

		arrayL = new ArrayList<>();
		fillOutList(arrayL, 1_000_000);
		mill = System.nanoTime();
		removeElementsFromBeginning(arrayL, 100);
		long remove100ElementArrayListBeginning = (System.nanoTime() - mill) / 10000;

		System.out.println("100 element removed from the beginning: "
				+ remove100ElementArrayListBeginning);

		arrayL = new ArrayList<>();
		fillOutList(arrayL, 1_000_000);
		mill = System.nanoTime();
		removeElementsFromMiddle(arrayL, 100);
		long remove100ElementArrayListMiddle = (System.nanoTime() - mill) / 10000;

		System.out.println("100 element removed from the middle: "
				+ remove100ElementArrayListMiddle);

		arrayL = new ArrayList<>();
		fillOutList(arrayL, 1_000_000);
		mill = System.nanoTime();
		removeElementsFromEnd(arrayL, 100);
		long remove100ElementArrayListEnd = (System.nanoTime() - mill) / 10000;

		System.out.println(
				"100 element removed from the end: " + remove100ElementArrayListEnd);

		// ============== 10.000 elements

		arrayL = new ArrayList<>();
		fillOutList(arrayL, 1_000_000);
		mill = System.nanoTime();
		addElementsToBeginning(arrayL, 10000);
		long add10000ElementArrayListBeginning = (System.nanoTime() - mill) / 10000;

		System.out.println("10.000 element added into the beginning: "
				+ add10000ElementArrayListBeginning);

		arrayL = new ArrayList<>();
		fillOutList(arrayL, 1_000_000);
		mill = System.nanoTime();
		addElementsToMiddle(arrayL, 10000);
		long add10000ElementArrayListMiddle = (System.nanoTime() - mill) / 10000;

		System.out.println("10.000 element added into the middle: "
				+ add10000ElementArrayListMiddle);

		arrayL = new ArrayList<>();
		fillOutList(arrayL, 1_000_000);
		mill = System.nanoTime();
		addElementsToEnd(arrayL, 10000);
		long add100000ElementArrayListEnd = (System.nanoTime() - mill) / 10000;

		System.out.println(
				"10.000 element added into the end: " + add100000ElementArrayListEnd);

		arrayL = new ArrayList<>();
		fillOutList(arrayL, 1_000_000);
		mill = System.nanoTime();
		removeElementsFromBeginning(arrayL, 10000);
		long remove10000ElementArrayListBeginning = (System.nanoTime() - mill) / 10000;

		System.out.println("10.000 element removed from the beginning: "
				+ remove10000ElementArrayListBeginning);

		arrayL = new ArrayList<>();
		fillOutList(arrayL, 1_000_000);
		mill = System.nanoTime();
		removeElementsFromMiddle(arrayL, 10000);
		long remove100000ElementArrayListMiddle = (System.nanoTime() - mill) / 10000;

		System.out.println("10.000 element removed from the middle: "
				+ remove100000ElementArrayListMiddle);

		arrayL = new ArrayList<>();
		fillOutList(arrayL, 1_000_000);
		mill = System.nanoTime();
		removeElementsFromEnd(arrayL, 10000);
		long remove10000ElementArrayListEnd = (System.nanoTime() - mill) / 10000;

		System.out.println(
				"10.000 element removed from the end: " + remove10000ElementArrayListEnd);

		// ============== 100.000 elements

		arrayL = new ArrayList<>();
		fillOutList(arrayL, 1_000_000);
		mill = System.nanoTime();
		addElementsToBeginning(arrayL, 100_000);
		long add1000000ElementArrayListBeginning = (System.nanoTime() - mill) / 10000;

		System.out.println("100.000 element added into the beginning: "
				+ add1000000ElementArrayListBeginning);

		arrayL = new ArrayList<>();
		fillOutList(arrayL, 1_000_000);
		mill = System.nanoTime();
		addElementsToMiddle(arrayL, 100_000);
		long add1000000ElementArrayListMiddle = (System.nanoTime() - mill) / 10000;

		System.out.println("100.000 element added into the middle: "
				+ add1000000ElementArrayListMiddle);

		arrayL = new ArrayList<>();
		fillOutList(arrayL, 1_000_000);
		mill = System.nanoTime();
		addElementsToEnd(arrayL, 100_000);
		long add10000000ElementArrayListEnd = (System.nanoTime() - mill) / 10000;

		System.out.println(
				"100.000 element added into the end: " + add10000000ElementArrayListEnd);

		arrayL = new ArrayList<>();
		fillOutList(arrayL, 1_000_000);
		mill = System.nanoTime();
		removeElementsFromBeginning(arrayL, 100_000);
		long remove1000000ElementArrayListBeginning = (System.nanoTime() - mill) / 10000;

		System.out.println("100.000 element removed from the beginning: "
				+ remove1000000ElementArrayListBeginning);

		arrayL = new ArrayList<>();
		fillOutList(arrayL, 1_000_000);
		mill = System.nanoTime();
		removeElementsFromMiddle(arrayL, 100_000);
		long remove10000000ElementArrayListMiddle = (System.nanoTime() - mill) / 10000;

		System.out.println("100.000 element removed from the middle: "
				+ remove10000000ElementArrayListMiddle);

		arrayL = new ArrayList<>();
		fillOutList(arrayL, 1_000_000);
		mill = System.nanoTime();
		removeElementsFromEnd(arrayL, 100_000);
		long remove1000000ElementArrayListEnd = (System.nanoTime() - mill) / 10000;

		System.out.println("100.000 element removed from the end: "
				+ remove1000000ElementArrayListEnd + "\n\n");

		System.out.println("LINKED LIST\n\n");

		// ============== 100 elements

		mill = System.nanoTime();
		addElementsToBeginning(linkedL, 100);
		long add100ElementLinkedListBeginning = (System.nanoTime() - mill) / 10000;

		System.out.println("100 element added into the beginning: "
				+ add100ElementLinkedListBeginning);

		linkedL = new LinkedList<>();
		fillOutList(linkedL, 1_000_000);
		mill = System.nanoTime();
		addElementsToMiddle(linkedL, 100);
		long add100ElementLinkedListMiddle = (System.nanoTime() - mill) / 10000;

		System.out.println(
				"100 element added into the middle: " + add100ElementLinkedListMiddle);

		linkedL = new LinkedList<>();
		fillOutList(linkedL, 1_000_000);
		mill = System.nanoTime();
		addElementsToEnd(linkedL, 100);
		long add100ElementLinkedListEnd = (System.nanoTime() - mill) / 10000;

		System.out
				.println("100 element added into the end: " + add100ElementLinkedListEnd);

		linkedL = new LinkedList<>();
		fillOutList(linkedL, 1_000_000);
		mill = System.nanoTime();
		removeElementsFromBeginning(linkedL, 100);
		long remove100ElementLinkedListBeginning = (System.nanoTime() - mill) / 10000;

		System.out.println("100 element removed from the beginning: "
				+ remove100ElementLinkedListBeginning);

		linkedL = new LinkedList<>();
		fillOutList(linkedL, 1_000_000);
		mill = System.nanoTime();
		removeElementsFromMiddle(linkedL, 100);
		long remove100ElementLinkedListMiddle = (System.nanoTime() - mill) / 10000;

		System.out.println("100 element removed from the middle: "
				+ remove100ElementLinkedListMiddle);

		linkedL = new LinkedList<>();
		fillOutList(linkedL, 1_000_000);
		mill = System.nanoTime();
		removeElementsFromEnd(linkedL, 100);
		long remove100ElementLinkedListEnd = (System.nanoTime() - mill) / 10000;

		System.out.println(
				"100 element removed from the end: " + remove100ElementLinkedListEnd);

		// ============== 10.000 elements

		linkedL = new LinkedList<>();
		fillOutList(linkedL, 1_000_000);
		mill = System.nanoTime();
		addElementsToBeginning(linkedL, 10000);
		long add10000ElementLinkedListBeginning = (System.nanoTime() - mill) / 10000;

		System.out.println("10.000 element added into the beginning: "
				+ add10000ElementLinkedListBeginning);

		linkedL = new LinkedList<>();
		fillOutList(linkedL, 1_000_000);
		mill = System.nanoTime();
		addElementsToMiddle(linkedL, 10000);
		long add10000ElementLinkedListMiddle = (System.nanoTime() - mill) / 10000;

		System.out.println("10.000 element added into the middle: "
				+ add10000ElementLinkedListMiddle);

		linkedL = new LinkedList<>();
		fillOutList(linkedL, 1_000_000);
		mill = System.nanoTime();
		addElementsToEnd(linkedL, 10000);
		long add100000ElementLinkedListEnd = (System.nanoTime() - mill) / 10000;

		System.out.println(
				"10.000 element added into the end: " + add100000ElementLinkedListEnd);

		linkedL = new LinkedList<>();
		fillOutList(linkedL, 1_000_000);
		mill = System.nanoTime();
		removeElementsFromBeginning(linkedL, 10000);
		long remove10000ElementLinkedListBeginning = (System.nanoTime() - mill) / 10000;

		System.out.println("10.000 element removed from the beginning: "
				+ remove10000ElementLinkedListBeginning);

		linkedL = new LinkedList<>();
		fillOutList(linkedL, 1_000_000);
		mill = System.nanoTime();
		removeElementsFromMiddle(linkedL, 10000);
		long remove100000ElementLinkedListMiddle = (System.nanoTime() - mill) / 10000;

		System.out.println("10.000 element removed from the middle: "
				+ remove100000ElementLinkedListMiddle);

		linkedL = new LinkedList<>();
		fillOutList(linkedL, 1_000_000);
		mill = System.nanoTime();
		removeElementsFromEnd(linkedL, 10000);
		long remove10000ElementLinkedListEnd = (System.nanoTime() - mill) / 10000;

		System.out.println(
				"10.000 element removed from the end: " + remove10000ElementLinkedListEnd);


		linkedL = new LinkedList<>();
		fillOutList(linkedL, 1_000_000);
		mill = System.nanoTime();
		addElementsToBeginning(linkedL, 100_000);
		long add1000000ElementLinkedListBeginning = (System.nanoTime() - mill) / 10000;

		System.out.println("100.000 element added into the beginning: "
				+ add1000000ElementLinkedListBeginning);
	}
	
	public static void addElementsToBeginning(List<Integer> list, int numberOfElementsToAdd) {
		for (int i = 0; i < numberOfElementsToAdd; i++) {
			list.add(0, Integer.MAX_VALUE);
		}
	}
	
	public static void addElementsToMiddle(List<Integer> list, int numberOfElementsToAdd) {
		for (int i = 0; i < numberOfElementsToAdd; i++) {
			list.add(list.size() / 2, Integer.MAX_VALUE);
			
		}
	}
	
	public static void addElementsToEnd(List<Integer> list, int numberOfElementsToAdd) {
		for (int i = 0; i < numberOfElementsToAdd; i++) {
			list.add(Integer.MAX_VALUE); 
		}
	}
	
	public static void removeElementsFromBeginning(List<Integer> list, int numberOfElementsToRemove) {
		for (int i = 0; i < numberOfElementsToRemove; i++) {
			list.remove(0);
		}
	}
	
	public static void removeElementsFromMiddle(List<Integer> list, int numberOfElementsToRemove) {
		for (int i = 0; i < numberOfElementsToRemove; i++) {
			list.remove(list.size() / 2);
		}
	}
	
	public static void removeElementsFromEnd(List<Integer> list, int numberOfElementsToRemove) {
		for (int i = 0; i < numberOfElementsToRemove; i++) {
			list.remove(list.size() - 1);
		}
	}
	
	public static void fillOutList(List<Integer> list, int numberOfElementsToRemove) {
		for (int i = 0; i < numberOfElementsToRemove; i++) {
			list.add(i);
		}
	}




	
}
