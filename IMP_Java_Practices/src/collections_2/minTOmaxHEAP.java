package collections_2;

public class minTOmaxHEAP {
	public static void main(String[] args) {

	}

	static void MaxHeapify(int arr[], int i, int n) {
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int largest = i;
		if (left < n && arr[left] > arr[i])
			largest = left;
		if (right < n && arr[right] > arr[largest])
			largest = right;
		if (largest != i) {
			swap(arr[i], arr[largest]);
			MaxHeapify(arr, largest, n);
		}
	}

	static void swap(int arr, int arr2) {
		int t = arr;
		arr = arr2;
		arr2 = t;
	}

	static void convertMaxHeap(int arr[], int n) {
		// Start from bottommost and rightmost
		// internal mode and heapify all internal
		// modes in bottom up way
		for (int i = (n - 2) / 2; i >= 0; i--) {
			MaxHeapify(arr, i, n);
			}
	}
}
