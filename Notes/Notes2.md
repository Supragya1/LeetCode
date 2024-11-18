## Java Tokens

1. Keywords
2. Identifiers
3. Literals
4. Operators
5. Separators
6. Comments

### Keywords

- Reserved words in Java.
- We cannot use keywords as identifiers.
- There are 50 keywords in Java.
- They are case-sensitive.
- Examples: `class`, `int`, `float`, `if`, `else`, `while`, `for`, `do`, `switch`, `case`, `break`, `continue`, `return`, `void`, `static`, `public`, `private`, `protected`, `final`, `abstract`, `synchronized`, `volatile`, `transient`, `native`, `strictfp`, `throws`, `try`, `catch`, `finally`, `throw`, `throws`, `extends`, `implements`, `interface`, `package`, `import`, `this`, `super`, `new`, `instanceof`, `true`, `false`, `null`.

### Identifiers

- Name given to a class, method, variable, etc.
- It is case-sensitive.
- It should start with a letter, currency character, or underscore.
- It can contain letters, currency characters, underscores, and digits.
- It should not be a keyword.
- It should not contain spaces.
- It should not start with a digit.
- Examples: `Name`, `name`, `Name123`, `name_123`, `name$123`, `$name`.

  ``` java
  public class naming{
      public static void main(String[] args) {
          int _name = 10;
          int $name = 20;
          int name = 30;
          int Name = 40;
          int name123 = 50;
          int name_123 = 60;
          int name$123 = 70;
          int Name123 = 80;
          int Name_123 = 90;
          int Name$123 = 100;
          // int 123name = 40;  # Error 
      }
  }
  ```

### Literals

-  A literal is a notation for representing a fixed value in source code.
- Constants in Java.
- Literals are used to initialize variables and constants.
- Literals are represented directly in the code without requiring computation.
- There are 5 types of literals in Java:
  - Integer Literals: `10`, `20`, `30`, `10_000`, `20_000`, `30_000`
  - Floating Point Literals: `10.5f`, `20.5f`, `30.5f`, `10.5`, `20_000.5`, `30_000.5`
  - Character Literals: `'A'`, `'B'`, `'C'` , `'\u0000'`, `'\u0001'`, `'\u0002'`, `65`, `66`, `67`
  - String Literals: `"Supragya"`, `"Gandotra"`, `"Java"`
  - Boolean Literals: `true`, `false`, `True`, `False`
  - Null Literals: `null`

- Prefix 0 is used to represent octal literals.
- Prefix 0x or 0X is used to represent hexadecimal literals.
- Prefix 0b or 0B is used to represent binary literals.

  ``` java
  public class literals{
      public static void main(String[] args) {
          float b = 10.5f;
          String str = "Supragya";
          boolean e = true;

          int decimal = 10;
          int octal = 010; // output will be 8 (here 010 is octal value and it will output the integer value of 010 ie 8)
          int hexadecimal = 0x10;// output will be 16 (here 0x10 is hexadecimal value and it will output the integer value of 0x10 ie 16)
          int binary = 0b10;// output will be 2 (here 0b10 is binary value and it will output the integer value of 0b10 ie 2)

          char character = 'A';
          char ch = 65; // output will be A (here 65 is the ASCII value of A)
          char unicode = '\u0041'; // output will be A (here \u0041 is the unicode value of A)

          int num = 10_00_000;// output will be 1000000 (here 10_00_000 is the integer value of 10_00_000 ie 1000000)
          double d = 12e6; // output will be 1.2E7 (here 12e6 is the double value of 12e6 ie 1.2E7)
      }
  }
  ```

#### Escape Sequence
- An escape sequence is a sequence of characters that does not represent itself when used inside a character or string literal, but is translated into another character or a sequence of characters that may be difficult or impossible to represent directly.
- Escape sequences are typically used to specify actions such as carriage returns and tab movements on terminals and printers.
- The backslash `\` is used to escape characters that otherwise have a special meaning, such as newline, backslash itself, or the quote character.
- The following escape sequences are available in Java:
  - `\\` - backslash
  - `\'` - single quote
  - `\"` - double quote
  - `\n` - newline
  - `\r` - carriage return
  - `\t` - tab
  - `\b` - backspace
  - `\f` - form feed - new page
  - `\uXXXX` - Unicode character
  - `\0` - null character
  - `\s` - space
  - `\ddd` - octal character (ddd)
  - `\uxxxx` - hexadecimal Unicode character (xxxx)

  ``` java
  public class escape{
    public static void main(String[] args) {
        System.out.println("Hello\nSupragya");
        System.out.println("Hello\tSupragya");
        System.out.println("Hello\r Supragya");
        System.out.println("Hello\b Supragya");
        System.out.println("Hello\f Supragya");
        System.out.println("Hello\" Supragya");
        System.out.println("Hello\' Supragya");
        System.out.println("Hello \\ Supragya");
        System.out.println("Hello \0 Supragya");//null character
        System.out.println("Hello \u0041 Supragya");//unicode character
    }
  }
    ```
  
### Comments

- Comments are used to document the code and improve its readability.
- Comments are ignored by the compiler and are not included in the executable code.
- There are 3 types of comments in Java:
  - Single Line Comment: `//`
  - Multi Line Comment: `/* */`
  - Documentation Comment: `/** */`

  ``` java
  public class comments{
      public static void main(String[] args) {
          // This is a single line comment
          /* This is a multi line comment */
          /**
           * This is a documentation comment
           */
      }
  }
  ```

### Separators in Java

- Separators are essential in Java to distinguish different parts of the program. They serve various purposes and include the following characters:

  - `;` - **Semicolon**: Used to terminate statements.

  - `,` - **Comma**: Separates consecutive identifiers in variable declarations and is also used to separate parameters in method definitions and invocations.

  - `.` - **Period**: Separates consecutive identifiers in variable declarations and is used to chain statements in the test expression of a for loop.

  - `()` - **Parentheses**: Used to contain a list of parameters in method definitions and invocations. Also used for defining precedence in expressions, control statements, and surrounding cast types.

  - `{}` - **Curly Braces**: Used to define a block of code, for classes, methods, and local scopes. Also used to contain the value of automatically initialized arrays.

  - `[]` - **Square Brackets**: Declares array types and is used when dereferencing array values.

  - `:` - **Colon**: Used after labels in switch statements and in the conditional operator.

  - `::` - **Double Colon**: Used in method references.

  - `...` - **Ellipsis**: Used in variable argument lists.

  - `<>` - **Angle Brackets**: Used in generics to specify type parameters.

  - `?` - **Question Mark**: Used in the conditional operator.


### Operators in Java

- Operators are used to perform operations on variables and values.

- The following are the types of operators in Java:

  - Arithmetic Operators: `+`, `-`, `*`, `/`, `%`
  - Relational Operators: `==`, `!=`, `>`, `<`, `>=`, `<=`
  - Logical Operators: `&&`, `||`, `!`
  - Bitwise Operators: `&`, `|`, `^`, `~`, `<<`, `>>`, `>>>`
  - Assignment Operators: `=`, `+=`, `-=`, `*=`, `/=`, `%=`, `&=`, `|=`, `^=`, `<<=`, `>>=`, `>>>=`
  - Conditional Operators: `? :` (Ternary Operator)
  - Unary Operators: `++`, `--`, `!`, `~`
  - Type comparison Operator: `instanceof`
  - Bitwise and Bit Shift Operators: `&`, `|`, `^`, `~`, `<<`, `>>`, `>>>`
  
#### Arithmetic Operators

- Arithmetic operators are used to perform arithmetic operations on variables and values.

- The following are the arithmetic operators in Java:

  - `+` - Addition
  - `-` - Subtraction
  - `*` - Multiplication
  - `/` - Division - It returns the quotient of the division.
  - `%` - Modulus - It returns the remainder of the division.

  ``` java
  public class arithmetic{
      public static void main(String[] args) {
          int a = 10;
          int b = 20;
          int c = a + b; // c = 30
          int d = a - b; // d = -10
          int e = a * b; // e = 200
          int f = b / a; // f = 2
          int g = b % a; // g = 0
      }
  }
  ```

#### Relational Operators

- Relational operators are used to compare two values.

- The following are the relational operators in Java:

  - `==` - Equal to
  - `!=` - Not equal to
  - `>` - Greater than
  - `<` - Less than
  - `>=` - Greater than or equal to
  - `<=` - Less than or equal to

  ``` java
  public class relational{
      public static void main(String[] args) {
          int a = 10;
          int b = 20;
          boolean c = a == b; // c = false
          boolean d = a != b; // d = true
          boolean e = a > b; // e = false
          boolean f = a < b; // f = true
          boolean g = a >= b; // g = false
          boolean h = a <= b; // h = true
      }
  }
  ```

#### Logical Operators

- Logical operators are used to combine conditional statements.

- The following are the logical operators in Java:

  - `&&` - Logical AND
  - `||` - Logical OR
  - `!` - Logical NOT

  - The logical AND operator (`&&`) returns `true` if both the operands are `true`; otherwise, it returns `false`.
  - The logical OR operator (`||`) returns `true` if at least one of the operands is `true`; otherwise, it returns `false`.
  - The logical NOT operator (`!`) returns `true` if the operand is `false`; otherwise, it returns `false`.
  
    ``` 
    Logical AND Operator:
    | A | B | A && B |
    |---|---|--------|
    | T | T | T      |
    | T | F | F      |
    | F | T | F      |
    | F | F | F      |

    Logical OR Operator:
    | A | B | A || B |
    |---|---|--------|
    | T | T | T      |
    | T | F | T      |
    | F | T | T      |
    | F | F | F      |

    Logical NOT Operator:
    | A | !A |
    |---|----|
    | T | F  |
    | F | T  |

    ```
  
  ``` java
  public class logical{
      public static void main(String[] args) {
          boolean a = true;
          boolean b = false;
          boolean c = a && b; // c = false
          boolean d = a || b; // d = true
          boolean e = !a; // e = false
          boolean f = !b; // f = true
      }
  }
  ```

#### Bitwise Operators

- Bitwise and logical operators are used to perform bit-level and logical operations on variables.
- We will Study Bitwise Operators in Bit Manipulation Section in Detail.

#### Assignment Operators

- Assignment operators are used to assign values to variables.

- The following are the assignment operators in Java:

  - `=` - Assigns the value of the right operand to the left operand.
  - `+=` - Adds the right operand to the left operand and assigns the result to the left operand.
  - `-=` - Subtracts the right operand from the left operand and assigns the result to the left operand.
  - `*=` - Multiplies the left operand by the right operand and assigns the result to the left operand.
  - `/=` - Divides the left operand by the right operand and assigns the result to the left operand.
  - `%=` - Divides the left operand by the right operand and assigns the remainder to the left operand.
  - `&=` - Performs a bitwise AND between the left and right operands and assigns the result to the left operand.
  - `|=` - Performs a bitwise OR between the left and right operands and assigns the result to the left operand.
  - `^=` - Performs a bitwise XOR between the left and right operands and assigns the result to the left operand.
  - `<<=` - Shifts the bits of the left operand to the left by the number of positions specified by the right operand and assigns the result to the left operand.
  - `>>=` - Shifts the bits of the left operand to the right by the number of positions specified by the right operand and assigns the result to the left operand.
  - `>>>=` - Shifts the bits of the left operand to the right by the number of positions specified by the right operand and assigns the result to the left operand.

  ``` java
  public class assignment{
      public static void main(String[] args) {
          int a = 10;
          a += 5; // a = 15
          a -= 5; // a = 10
          a *= 5; // a = 50
          a /= 5; // a = 10
          a %= 5; // a = 0
          a &= 5; // a = 0
          a |= 5; // a = 5
          a ^= 5; // a = 0
          a <<= 5; // a = 0
          a >>= 5; // a = 0
          a >>>= 5; // a = 0
      }
  }
  ```

#### Conditional Operator (Ternary Operator)

- The conditional operator is the only ternary operator in Java.

- It is used to evaluate a boolean expression and return one of the two expressions based on the result of the evaluation.

- The syntax of the conditional operator is as follows:

  ``` java
  variable = (expression) ? value1 : value2;
  ```

- If the expression is `true`, the value of `value1` is assigned to the variable; otherwise, the value of `value2` is assigned to the variable.

  ``` java
  public class conditional{
      public static void main(String[] args) {
          int a = 10;
          int b = 20;
          int c = (a > b) ? a : b; // c = 20
      }
  }
  ```

#### Unary Operators

- Unary operators are used to perform operations on a single operand.

- The following are the unary operators in Java:

  - `++` - Increment
  - `--` - Decrement
  - `+` - Unary plus
  - `-` - Unary minus
  - `!` - Logical NOT
  - `~` - Bitwise NOT

  ``` java
  public class unary{
      public static void main(String[] args) {
          int a = 10;
          int b = 20;
          int c = ++a; // c = 11, a = 11
          int d = --b; // d = 19, b = 19
          int e = +a; // e = 11
          int f = -b; // f = -19
          boolean g = !true; // g = false
          int h = ~10; // h = -11
      }
  }
  ```

#### Type Comparison Operator

- The `instanceof` operator is used to test if an object is an instance of a class, subclass, or interface.

- The syntax of the `instanceof` operator is as follows:

  ``` java
  object instanceof class
  ```
    
    ``` java
    public class type{
        public static void main(String[] args) {
            String name = "Supragya";
            boolean a = name instanceof String; // a = true
        }
    }
    ```

### **Continue in the next part**.
### Written by *Supragya Gandotra*.
