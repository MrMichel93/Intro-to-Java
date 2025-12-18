# Array Operations

Learn common operations and algorithms for working with arrays, including searching, sorting, and data manipulation.

## 🎯 Learning Objectives

- Search arrays for specific values
- Sort arrays in ascending/descending order
- Copy and compare arrays
- Perform array transformations
- Implement common array algorithms

## Searching Arrays

### Linear Search

```java
public static int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            return i;  // Return index
        }
    }
    return -1;  // Not found
}
```

### Binary Search (Sorted Array)

```java
public static int binarySearch(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;
    
    while (left <= right) {
        int mid = (left + right) / 2;
        
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return -1;
}
```

## Sorting Arrays

### Bubble Sort

```java
public static void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        for (int j = 0; j < arr.length - 1 - i; j++) {
            if (arr[j] > arr[j + 1]) {
                // Swap
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
```

### Selection Sort

```java
public static void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        // Swap
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }
}
```

## Array Manipulation

### Reverse Array

```java
public static void reverseArray(int[] arr) {
    int left = 0;
    int right = arr.length - 1;
    
    while (left < right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }
}
```

### Rotate Array

```java
public static void rotateLeft(int[] arr, int positions) {
    positions = positions % arr.length;
    
    for (int i = 0; i < positions; i++) {
        int first = arr[0];
        for (int j = 0; j < arr.length - 1; j++) {
            arr[j] = arr[j + 1];
        }
        arr[arr.length - 1] = first;
    }
}
```

## Copying Arrays

### Manual Copy

```java
public static int[] copyArray(int[] arr) {
    int[] copy = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
        copy[i] = arr[i];
    }
    return copy;
}
```

### Using System.arraycopy()

```java
int[] original = {1, 2, 3, 4, 5};
int[] copy = new int[original.length];
System.arraycopy(original, 0, copy, 0, original.length);
```

## Array Statistics

### Calculate Average

```java
public static double calculateAverage(int[] arr) {
    int sum = 0;
    for (int num : arr) {
        sum += num;
    }
    return (double) sum / arr.length;
}
```

### Find Median

```java
public static double findMedian(int[] arr) {
    Arrays.sort(arr);  // Must be sorted
    int mid = arr.length / 2;
    
    if (arr.length % 2 == 0) {
        return (arr[mid - 1] + arr[mid]) / 2.0;
    } else {
        return arr[mid];
    }
}
```

## Summary

✓ Linear search: Check each element sequentially
✓ Binary search: Fast search on sorted arrays  
✓ Sorting algorithms: Bubble sort, selection sort
✓ Array manipulation: Reverse, rotate, copy
✓ Statistics: Sum, average, min, max, median

## What's Next?

**[Next: Multidimensional Arrays →](03-multidimensional-arrays.md)**

---

[← Back to Array Basics](01-array-basics.md) | [Next: Multidimensional Arrays →](03-multidimensional-arrays.md)
