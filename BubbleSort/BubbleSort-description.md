1. Main Loop (do-while):

Purpose: The main loop controls the entire bubble sort process. It continues to run until no more swaps are performed in the array, indicating that the array is completely sorted.

Structure: A do-while loop that runs at least once (due to the use of do). The condition that controls this loop is the swapped variable, which is initially set to false at the beginning of the loop. If a swap is made in the array in any pass of the algorithm, swapped is set to true, causing the main loop to continue running. If no swaps are made in a pass and swapped remains false, the main loop terminates.

Purpose: This loop ensures that the sorting algorithm continues to run until the array is completely sorted. The swapped variable is used to track whether swaps have been made in the current pass of the algorithm.

2. Inner Loop (do-while):

Purpose: The inner loop iterates through the array and compares adjacent elements to determine if they should be swapped. If swaps are made, the main loop continues to run; otherwise, the inner loop continues to perform additional passes until no more swaps are made in a complete pass.

Structure: A do-while loop nested inside the main loop. This loop runs as long as i (a counter) is less than n - 1, where n represents the current length of the array. The condition within the loop controls whether a swap is made in a pass, and if so, the swapped variable is adjusted.
Purpose: The inner loop performs comparisons and, if necessary, swaps adjacent elements. This contributes to having larger elements "bubble up" to the top of the array in each pass of the algorithm, a characteristic of Bubble Sort.

These loops work together to implement the Bubble Sort algorithm, which sorts the array by making larger elements "bubble up" to the top over several passes. The main loop controls the overall process, and the inner loop performs the necessary comparisons and swaps to achieve sorting.
