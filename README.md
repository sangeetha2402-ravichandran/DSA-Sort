# Sorting Algorithms: Insertion Sort, Selection Sort, Bubble Sort

This repository explains three basic sorting algorithms used in computer science: **Insertion Sort**, **Selection Sort**, and **Bubble Sort**.  

Sorting is the process of arranging elements of an array or list in a certain order (usually ascending or descending).  

---

## 📌 1. Insertion Sort

**Idea:** Think of sorting cards in your hand. Pick one card at a time and insert it into the correct position in the sorted hand.  

**Algorithm:**
1. Start from the second element (index 1).
2. Pick the element (`key`) and compare it with elements in the sorted part (left side).
3. Shift all larger elements one position to the right.
4. Insert the `key` in the correct position.
5. Repeat until the array is sorted.

**Properties:**
- **Time Complexity:**  
  - Best: `O(n)` (already sorted)  
  - Average/Worst: `O(n²)`  
- **Space Complexity:** `O(1)` (in-place)  
- **Stable:** ✅ Yes  
- **Adaptive:** ✅ Yes  




## Selection Sort Algorithm

**Selection Sort** is a simple and intuitive sorting algorithm. It repeatedly selects the smallest (or largest) element from the unsorted portion of the array and places it at the beginning.  

---

## 📌 How Selection Sort Works

**Idea (analogy):**  
Imagine you have a messy pile of books. Each time, you look through the unsorted pile, pick the smallest book, and place it in order on the shelf. Repeat until all books are sorted.

**Steps:**
1. Start with the first element of the array.
2. Find the **minimum element** in the unsorted portion.
3. Swap it with the first unsorted element.
4. Move the boundary of the sorted portion one step forward.
5. Repeat until the array is fully sorted.

---

## ⚙️ Properties

| Feature                  | Details |
|---------------------------|---------|
| **Time Complexity (Best/Avg/Worst)** | O(n²) |
| **Space Complexity**       | O(1) (in-place) |
| **Stable**                 | ❌ No (default implementation) |
| **Adaptive**               | ❌ No |
| **Number of swaps**        | At most n−1 |

**Notes:**
- Always performs the same number of comparisons (`n(n−1)/2`).  
- Number of swaps is minimal compared to other O(n²) sorts.  
- Not stable by default (equal elements may change order).  

---

## 🧮 Step-by-Step Example

Array: `[6, 8, 2, 4, 3, 5]`

| Step | Action | Array State |
|------|--------|-------------|
| Initial | Start | `[6, 8, 2, 4, 3, 5]` |
| 1 | Find min (2), swap with 6 | `[2, 8, 6, 4, 3, 5]` |
| 2 | Find min (3), swap with 8 | `[2, 3, 6, 4, 8, 5]` |
| 3 | Find min (4), swap with 6 | `[2, 3, 4, 6, 8, 5]` |
| 4 | Find min (5), swap with 6 | `[2, 3, 4, 5, 8, 6]` |
| 5 | Find min (6), swap with 8 | `[2, 3, 4, 5, 6, 8]` |
| Sorted | Done | `[2, 3, 4, 5, 6, 8]` |

---

## ✅ Key Points

- Selection Sort **minimizes swaps**, which is useful when write operations are expensive.  
- **Not adaptive:** even if the array is already sorted, it still performs all comparisons.  
- **Not stable:** can change the order of equal elements.  

---
# Bubble Sort Algorithm

**Bubble Sort** is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. Larger elements “bubble up” to the end of the list with each pass.

---

## 📌 How Bubble Sort Works

**Idea (analogy):**  
Imagine bubbles rising in water. Each pass through the array moves the largest unsorted element to its correct position at the end, just like a bubble floating to the surface.

**Steps:**
1. Start from the first element of the array.
2. Compare each pair of adjacent elements.
3. Swap them if the left element is greater than the right.
4. Repeat for each element until the array is sorted.
5. If in a pass no swaps occur, the arra

