# LeetCode 187 - Repeated DNA Sequences (Dry Run)

### Problem

We need to find all 10-letter-long DNA sequences that occur more than
once in a string.

------------------------------------------------------------------------

### Dry Run

**Start** - dnaSet = {} - retDnaSet = {}

**i = 0;** condition `0+9 < 32` → True\
Sub = `s.substring(0, 10)` = `"AAAAACCCCC"`\
`dnaSet.contains("AAAAACCCCC")` → False\
Add `"AAAAACCCCC"` into dnaSet\
dnaSet = {"AAAAACCCCC"}

------------------------------------------------------------------------

**i = 1;** condition `1+9 < 32` → True\
Sub = `s.substring(1, 11)` = `"AAAACCCCCA"`\
`dnaSet.contains("AAAACCCCCA")` → False\
dnaSet = {"AAAAACCCCC", "AAAACCCCCA"}

------------------------------------------------------------------------

**i = 2;** condition `2+9 < 32` → True\
Sub = `s.substring(2, 12)` = `"AAACCCCCAA"`\
`dnaSet.contains("AAACCCCCAA")` → False\
dnaSet = {"AAAAACCCCC", "AAAACCCCCA", "AAACCCCCAA"}

... (loop continues with new substrings) ...

------------------------------------------------------------------------

**i = 10;** condition `10+9 < 32` → True\
Sub = `s.substring(10, 20)` = `"AAAAACCCCC"`\
`dnaSet.contains("AAAAACCCCC")` → True → repeat found\
retDnaSet = {"AAAAACCCCC"}

------------------------------------------------------------------------

Later, when substring `"CCCCCAAAAA"` repeats:\
retDnaSet = {"AAAAACCCCC", "CCCCCAAAAA"}

------------------------------------------------------------------------

###  Final Answer

``` text
["AAAAACCCCC", "CCCCCAAAAA"]
```

-------------------------------------------------------------------------