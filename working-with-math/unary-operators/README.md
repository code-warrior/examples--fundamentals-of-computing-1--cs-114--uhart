# Examples of Unary Post- and Pre-fix Increment and Decrement Operators

Unlike binary operators, such as assignment (`=`) and equality (`==`), each of which takes two operands, one on each side, the unary operators only take a single operand. In the examples below, the operand is `x`.

All unary operators work in two stages

  + Post-fix operators carry out the following order:
    1. Read memory
    2. Increment/decrement what’s currently in memory by one

  + Pre-fix operators carry out the following order:
    1. Increment/decrement what’s currently in memory by one
    2. Read memory

For all examples below, assume the following is included _before_ every increment/decrement operator.

```java
int x = 15;
```

---

### Postfix Increment Operator

```java
x++;                   // Return/read the value of `x`, then increment `x` by 1. In
                       // this case, nothing is done with the returned value.

System.out.println(x); // Prints 16
```

### Postfix Decrement Operator

```java
x--;                   // Return/read the value of `x`, then decrement `x` by 1.
                       // Again, nothing is done with the returned value.

System.out.println(x); // Prints 14
```

### Prefix Increment Operator

```java
++x;                   // Increment `x` by 1, then return the newly-incremented
                       // value. Do nothing with the returned value.

System.out.println(x); // Prints 16
```

### Prefix Decrement Operator

```java
--x;                   // Decrement `x` by 1, then return the newly-incremented
                       // value. Again, do nothing with the returned value.

System.out.println(x); // Prints 14
```
