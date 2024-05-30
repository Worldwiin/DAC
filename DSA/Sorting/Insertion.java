package Sorting;

public class Insertion {
	void insertion_sort(int a[]) {
		int i, j, new_element;
		for (i = 0; i < a.length - 1; i++) {
			new_element = a[i + 1];
			j = i + 1;
			while (j > 0 && a[j - 1] > new_element) {
				a[j] = a[j - 1];
				j--;
			}
			a[j] = new_element;
		}
	}

	void print_Array(int a[]) {
		System.out.println("Array has:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " , ");
		}
		System.out.println(); // Print a new line at the end
	}

	public static void main(String args[]) {
		int a[] = { 55, 11, 22, 99, 33, 66, 44, 77, 88 };
		Insertion obj = new Insertion();
		obj.insertion_sort(a);
		obj.print_Array(a);
	}
}
