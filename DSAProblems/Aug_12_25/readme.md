# Triangle Minimum Path Sum - Dry Run Explanation
## (Bottom-Up Approach)

We’ll assume the triangle is:

```
Index-0    [2],
Index-1    [3, 4],
Index-2    [6, 5, 7],
Index-3    [4, 1, 8, 3]
```

**N = 4**  
**Size of an array is 4**

---

**Step 1: Fill the array with the last row values**

```
i=0; i<4 ? True
Arr[0] = triangle.get[3].get[0] = 4    Arr = {4, 0, 0, 0}

i=1; i<4 ? True
Arr[1] = triangle.get[3].get[1] = 1    Arr = {4, 1, 0, 0}

i=2; i<4 ? True
Arr[2] = triangle.get[3].get[2] = 8    Arr = {4, 1, 8, 0}

i=3; i<4 ? True
Arr[3] = triangle.get[3].get[3] = 3    Arr = {4, 1, 8, 3}

i=4; i<4 ? False
```

---

**Step 2: Start from second last row → `row = n-2 = 2`**

```
col = 0; col <= 2 ? True
arr[0] = triangle[2].get(0) + Math.min(arr[0], arr[1])
       = 6 + Math.min(4, 1)
       = 6 + 1
       = 7
arr = {7, 1, 8, 3}

col = 1; col <= 2 ? True
arr[1] = triangle[2].get(1) + Math.min(arr[1], arr[2])
       = 5 + Math.min(1, 8)
       = 5 + 1
       = 6
arr = {7, 6, 8, 3}

col = 2; col <= 2 ? True
arr[2] = triangle[2].get(2) + Math.min(arr[2], arr[3])
       = 7 + Math.min(8, 3)
       = 7 + 3
       = 10
arr = {7, 6, 10, 3}

col = 3; col <= 2 ? False
```

---

**Step 3: Row = 1**

```
col = 0; col <= 1 ? True
arr[0] = triangle[1].get(0) + Math.min(arr[0], arr[1])
       = 3 + Math.min(7, 6)
       = 3 + 6
       = 9
arr = {9, 6, 10, 3}

col = 1; col <= 1 ? True
arr[1] = triangle[1].get(1) + Math.min(arr[1], arr[2])
       = 4 + Math.min(6, 10)
       = 4 + 6
       = 10
arr = {9, 10, 10, 3}

col = 2; col <= 1 ? False  | End of row 1.
```

---

**Step 4: Row = 0**

```
col = 0; col <= 0 ? True
arr[0] = triangle[0].get(0) + Math.min(arr[0], arr[1])
       = 2 + Math.min(9, 10)
       = 2 + 9
       = 11
arr = {11, 10, 10, 3}

col = 1; col <= 0 ? False  | End of row 0.
```

---

** Final Answer:**
```
arr[0] = 11
```
