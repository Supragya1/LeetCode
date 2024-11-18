## Java History
# Java Overview

- Java started as a research project in **1991** known as the Green Project at Sun Microsystems.
- The first name of Java was **Oak**, but it was already a registered trademark, so it was renamed to **Java**.
- Founder of Java is **James Gosling**.
- Oak was renamed to Java in **1994**.
- The first version of Java was released in **1996**.
- Java is currently owned by **Oracle Corporation**.
- The latest Java version used in the industry is **Java 17** due to its LTS (long-term support) version.
- Java versions having LTS support are 8,11,17 and 21.
- Java versions are released every 6 months.
- Java is a high-level, class-based, object-oriented programming language.
- Java is a platform-independent language.

## Why use Java?

1. Java is a platform-independent language.
2. Java is an Object-Oriented Language.
3. Java is a robust language - strong and reliable.
4. Java is a secure language.
5. Java is a multi-threaded and dynamic language.
6. Java is an automatic memory management language.
7. Java is a distributed language - used to create distributed applications.
8. Java is a high-performance language.
9. Java is a strongly typed language.

## Personal Experience with Java

1. Java can be used for DSA (Data Structure and Algorithm) and Competitive Programming.
2. Java can be used for Web Development in the backend (Spring Boot).
3. Java can be used for Android Development.
4. Many big companies use Java for their backend services.

# Getting Started

## As we know Java is platform independent language, so we can run Java code on any platform.

- As C and C++ use a compiler to convert code to machine code, and Python uses an interpreter, Java uses both Compiler and Interpreter.

- To run Java code, install **JDK** (Java Development Kit), which contains **JRE** (Java Runtime Environment) and **JVM** (Java Virtual Machine).

  - **JDK:** Needed to develop Java applications. It includes JRE and various development tools like Java compiler, Javadoc, Jar, etc.
  - **JRE:** The runtime environment where Java bytecode can be executed. It consists of JVM and a set of class libraries. It is a subset of JDK.
  - **JVM:** The heart of the Java programming language, responsible for converting bytecode into machine code. It provides core functions like memory management, garbage collection, security, etc.

- We write code, which is then converted to bytecode by the Java Compiler, combined with different libraries, and interpreted by JVM to be converted to machine code.

- **JDK = JRE + Development Tools**
- **JRE = JVM + Java Packages Classes**

- Java code -> Java Compiler -> Bytecode -> JVM -> Machine Code

- Java is a case-sensitive and strongly typed language.

## JDK Installation

1. Go to the [Oracle website](https://www.oracle.com/in/java/technologies/downloads/) and download JDK (x64 Installer).
2. Install JDK.
3. Set Environment Variables - C drive -> Program Files -> Java -> jdk -> bin -> copy path -> go to environment variables -> new -> paste path -> ok.
4. Check if Java is installed or not.(Write java --version in terminal or command prompt)

## Writing First Java Code

1. Open VS Code.
2. Create a new file.
3. Save the file with a `.java` extension.
4. Name the file as `Hello.java`.
5. class name and file name should be same.
6. Write the code.

  ```java
  class Hello {
      public static void main(String[] args) {
          System.out.println("Hello, Supragya!");
      }
  }
  ``` 
## Compiling and Running Java Code

- Open Terminal or Command Prompt.
- Go to the directory where the file is saved.
- Compile the code using `javac Hello.java`. This will create a `Hello.class` file.
- Here `javac` is the Java Compiler.
- Run the code using `java Hello`. This will print `Hello, World!`.

## Printing in Java

- We use `System.out.println()` to print in Java.
- Where `System` is a class, `out` is an object of `PrintStream` class, and `println()` is a method of `PrintStream` class.
- `System.out.println()` is used to print a line to the console and move to the next line.
- `System.out.print()` is used to print without a newline.
- `System.out.printf()` is used to print formatted output it is similar to `printf` in C.

  ```java
  System.out.println("Hello, Supragya!");
  System.out.print("Hello, Supragya!");
  String str = "Supragya";
  System.out.printf("Hello, %s!", str);
  System.out.printf("Hello, %s! My age is %d", str, 20);
  ```

## Data Types in Java

### 1. Primitive Data Types
### 2. Non-Primitive Data Types

### Primitive Data Types

- Numeric Data Types and Non-Numeric Data Types

#### Numeric Data Types

- Integer Data Types: `byte`, `short`, `int`, `long`
- Floating Point Data Types: `float`, `double`

#### Non-Numeric Data Types

- `char`, `boolean`

### Non-Primitive Data Types

- `String`, `Array`, `Class`, `Interface`

### Difference between Primitive and Non-Primitive Data Types

- Primitive Data Types are predefined by the language and named by a keyword.
- Non-Primitive Data Types are created by the programmer and not defined by the language.

### Sizes of Different Data Types

- `byte` - 1 byte
- `short` - 2 bytes
- `int` - 4 bytes
- `long` - 8 bytes
- `float` - 4 bytes
- `double` - 8 bytes
- `char` - 2 bytes
- `boolean` - 1 bit

### Default Values of Different Data Types

- `byte` - 0
- `short` - 0
- `int` - 0
- `long` - 0L
- `float` - 0.0f
- `double` - 0.0d
- `char` - '\u0000'
- `boolean` - false

### Declaring Variables in Java

- Syntax: `data_type variable_name = value;`

  ```java
  int a = 10;
  float b = 10.5f;
  char c = 'A';
  boolean d = true;
  double e = 10.5;
  String f = "Supragya";
  Long g = 1000000000000000000L;
  ```
- We have to write `L` after the value of `long` data type and `f` after the value of `float` data type.
- If we don't write `f` after the value of `float` data type, it will give an error.
- And normally 30.55 is considered as `double` data type.

### Taking Input in Java

- Use `Scanner` class to take input in Java.
- Create an object of `Scanner` class.
- Use `nextLine()` method to take input.
- We have to import `Scanner` class from `java.util` package.

  ```java
  import java.util.Scanner;
  ```
  
  ```java
  Scanner scan = new Scanner(System.in);
  String str = scan.nextLine();
  ```
- Here scan is the object of Scanner class. It is an Identifier and can be any name.

### Taking Input in Java using BufferedReader

- Usually used in Competitive Programming. Not used in normal development.
- Use `BufferedReader` class to take input in Java.
- Create an object of `BufferedReader` class.
- Use `readLine()` method to take input.
- We have to import `BufferedReader` class from `java.io` package.
- We have to declare , initialize and instantiate the object of `BufferedReader` class in try-catch block.
- For using try-catch block, we have to import `IOException` class from `java.io` package.

  ```java
  import java.io.BufferedReader;
  import java.io.InputStreamReader;
  import java.io.IOException;
  ```
    
    ```java
  public static void main(String[] args) {
      try {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int a = Integer.parseInt(br.readLine());
          float b = Float.parseFloat(br.readLine());
          char c = br.readLine().charAt(0);
      } catch (IOException e) {
          e.printStackTrace();
      }
  }
  ```
  
- Here br is the object of BufferedReader class. It is an Identifier and can be any name.
- BufferedReader is used to read text from a character-input stream.
- `parseInt()` and `parseFloat()` methods are used to convert `String` to `int` and `float` respectively.

#### Difference between Scanner and BufferedReader

- `Scanner` is used to parse primitive types and strings using regular expressions.
- `BufferedReader` is used to read text from a character-input stream.

### Taking Variable Input in Java using Scanner

- We can take input in Java using `Scanner` class.
- We have to use `nextInt()`, `nextFloat()`, `nextLine()` methods to take input.
  ```java
  Scanner scan = new Scanner(System.in);
  int a = scan.nextInt();
  float b = scan.nextFloat();
  String str = scan.nextLine(); // It will take the whole line as input.
  String str = scan.next(); // It will take the first word as input.
  char c = scan.next().charAt(0); // It will take the first character as input.
  boolean d = scan.nextBoolean();
  long e = scan.nextLong();
  ```
- Here scan is the object of Scanner class. It is an Identifier and can be any name.

### Taking Input in Java using Command Line Arguments

- We can take input in Java using command line arguments.
- We have to use `args` array to take input.

  ```java
  public static void main(String[] args) {
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      System.out.println(a + b);
  }
  ```
  ```java
  javac Hello.java
  java Hello 10 20
  ```
  - Here We are passing 10 and 20 as command line arguments.

## Type Conversion, Type Casting, Type Promotion

### Implicit Type Conversion or Type Conversion

- Converting one data type to another data type.
- Implicit Type Conversion is done automatically.
- It is also known as Automatic Type Conversion.
- It is done by the compiler.
- It is done when:
  - Smaller data type is converted to a larger data type.
  - When a literal is assigned to a variable of a larger data type.
  - When a value is returned from a method.

  ```java
  int a = 10;
  float b = a;
  ```
  - Here `int` is converted to `float` automatically.

  ```java
  int a = 10;
  long b = a;
  ```
  - Here `int` is converted to `long` automatically.

### Explicit Type Conversion or Type Casting

- It is also known as Type Casting.
- It is done by the programmer.
- It is done when:
  - Larger data type is converted to a smaller data type.
  - When a variable is assigned to another variable of a smaller data type.
  - When a value is passed to a method.
  - Compiler does not do it automatically because it may lead to loss of data.
  - if we try to convert a larger data type to a smaller data type, without type casting, it will give an error.

  ```java
  float a = 10.5f;
  int b = (int) a;
  ```
  - Here `float` is converted to `int` explicitly.

  ```java
  long a = 1000000000000000000L;
  int b = (int) a;
  ```
  - Here `long` is converted to `int` explicitly.

### **Continue in the next part**.
### Written by *Supragya Gandotra*.
