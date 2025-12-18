# Multidimensional Arrays

Multidimensional arrays are arrays of arrays, useful for representing tables, grids, matrices, and other structured data.

## 🎯 Learning Objectives

- Create and use 2D arrays
- Iterate through 2D arrays
- Perform matrix operations
- Work with jagged arrays
- Understand practical applications

## 2D Arrays

A 2D array is an array where each element is itself an array.

### Declaration and Creation

```java
// Declaration
int[][] matrix;

// Creation
int[][] matrix = new int[3][4];  // 3 rows, 4 columns

// With initial values
int[][] matrix = {
    {1, 2, 3, 4},
    {5, 6, 7, 8},
    {9, 10, 11, 12}
};
```

### Accessing Elements

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

System.out.println(matrix[0][0]);  // 1 (row 0, column 0)
System.out.println(matrix[1][2]);  // 6 (row 1, column 2)
System.out.println(matrix[2][1]);  // 8 (row 2, column 1)
```

## Iterating 2D Arrays

### Nested For Loops

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

### Enhanced For Loop

```java
for (int[] row : matrix) {
    for (int value : row) {
        System.out.print(value + " ");
    }
    System.out.println();
}
```

## Matrix Operations

### Sum of Elements

```java
public static int matrixSum(int[][] matrix) {
    int sum = 0;
    for (int[] row : matrix) {
        for (int value : row) {
            sum += value;
        }
    }
    return sum;
}
```

### Transpose Matrix

```java
public static int[][] transpose(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    int[][] result = new int[cols][rows];
    
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            result[j][i] = matrix[i][j];
        }
    }
    return result;
}
```

## Jagged Arrays

Arrays where rows have different lengths.

```java
int[][] jagged = {
    {1, 2},
    {3, 4, 5},
    {6, 7, 8, 9}
};

for (int i = 0; i < jagged.length; i++) {
    System.out.println("Row " + i + " length: " + jagged[i].length);
}
```

## Practical Applications

### Tic-Tac-Toe Board

```java
char[][] board = {
    {' ', ' ', ' '},
    {' ', ' ', ' '},
    {' ', ' ', ' '}
};

// Place X at row 0, col 0
board[0][0] = 'X';

// Place O at row 1, col 1
board[1][1] = 'O';
```

### Seating Chart

```java
String[][] seats = {
    {"Alice", "Bob", "Charlie"},
    {"David", "Emma", "Frank"},
    {"Grace", "Henry", "Ivy"}
};
```

## Summary

✓ 2D arrays represent tables/grids
✓ Syntax: `type[][] name`
✓ Access with: `array[row][col]`
✓ Iterate with nested loops
✓ Jagged arrays have varying row lengths

## What's Next?

**[Next: Arrays Utility Class →](04-arrays-utility-class.md)**

---

[← Back to Array Operations](02-array-operations.md) | [Next: Arrays Utility Class →](04-arrays-utility-class.md)
