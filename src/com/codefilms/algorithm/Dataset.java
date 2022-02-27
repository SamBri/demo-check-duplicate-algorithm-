package com.codefilms.algorithm;

public class Dataset {

	public static void checkDuplicate(int[] numbers) {

		// let us have a copy of the numbers to find duplicate
		int[] tempNumbers = numbers;
		int duplicate;
		int scannerHead;
		System.out.println("Starting from left to right order(L-R) to check duplicate");
		for (int head = 0, end = tempNumbers.length - 1; head < end; head++) {
			// pick the first element in the array and compare to all others
			duplicate = tempNumbers[head];
			scannerHead = head;

			System.out.println("Scanner Head points at index:" + scannerHead);
			System.out.println("(L-R) order <-> Find Number  : " + duplicate);

			// start search of duplicate from the next element after the zero index
			for (int scanIndex = scannerHead + 1; scanIndex < tempNumbers.length; ++scanIndex) {
				// if there are no duplicates then show the scanned numbers
				if (duplicate != tempNumbers[scanIndex]) {
					System.out.println("Scanned Number:" + tempNumbers[scanIndex]);

					// Prompt user of no duplicate found when the scanIndex is at the end of the
					// container.
					if (scanIndex == tempNumbers.length)
						System.out.println("No duplicate found");

				}
				// for a duplicate found, show the scanned number and duplicate number which is
				// the scanned number and the scan index of the duplicate
				else {
					// Tell the user the
					System.out.println("Scanned Number:" + tempNumbers[scanIndex] + "\nDuplicate:" + duplicate
							+ "\nScanIndex:" + scanIndex);
				}

			}

		}

	}

}
