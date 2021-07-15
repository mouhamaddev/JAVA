/*

Welcome to my Java course Summarization :)

-------------------------------------------

- What is Java?

Java is a popular programming language, created in 1995.
It is owned by Oracle, and more than 3 billion devices run Java.

- It is used for:

Mobile applications (specially Android apps)
Desktop applications
Web applications
Web servers and application servers
Games
Database connection
And much, much more!

- Why Use Java?

Java works on different platforms (Windows, Mac, Linux, Raspberry Pi, etc.)
It is one of the most popular programming language in the world
It is easy to learn and simple to use
It is open-source and free
It is secure, fast and powerful
It has a huge community support (tens of millions of developers)
Java is an object oriented language which gives a clear structure to programs and allows code to be reused, lowering development costs
As Java is close to C++ and C#, it makes it easy for programmers to switch to Java or vice versa




Everything is an object.
Each object consists of :
  - Attributes
  - Actions.
Example :
Car :
- Attributes : Company name : Cadillac / Color : Black / Realese Date : 2020.
- Actions : Move / Turn / Stop.


Class :                               Object :
1) Class is a collection of similar     1) Object is an instance of a
objects class                           class
2) Class is conceptual (is a            2)  Object is real
template) 
3) No memory is allocated for a         3) Each object has its own
class                                   memory
4) Class can exist without any          4) Objects can't exist without
Objects                                 a class
5) Class does not have any              5) Every object has its own
values associated with the              values associated with the
fields                  fields



class : Fruit.

objects : Apple / Banana / Mango.



An Class : SuperClass;
Another Class inside the previous : SubClass.

Difference between private, protected, package and public access modifier :

Modifier      Description
public        The code is accessible for all classes
private       The code is only accessible within the same class
protected     The code is accessible within the same class, or in a class that is inherited from that class.
internal      The code is only accessible within its own assembly, but not from another assembly.




*** Access Modifiers

For classes, you can use either public or default:

Modifier    Description
public    The class is accessible by any other class  
default   The class is only accessible by classes in the same package. This is used when you don't specify a modifier.

For attributes, methods and constructors, you can use the one of the following:

Modifier    Description
public      The code is accessible for all classes  
private     The code is only accessible within the declared class 
default     The code is only accessible in the same package. This is used when you don't specify a modifier.
protected   The code is accessible in the same package and subclasses.



*** Non-Access Modifiers

For classes, you can use either final or abstract:

Modifier    Description
final       The class cannot be inherited by other classes.
abstract    The class cannot be used to create objects (To access an abstract class, it must be inherited from another class.

For attributes and methods, you can use the one of the following:

Modifier        Description
final           Attributes and methods cannot be overridden/modified
static          Attributes and methods belongs to the class, rather than an object
abstract        Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from).
transient       Attributes and methods are skipped when serializing the object containing them
synchronized    Methods can only be accessed by one thread at a time

volatile  The value of an attribute is not cached thread-locally, and is always read from the "main memory"




public vs static :

public class MyClass {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[] args) {
    myStaticMethod(); // Call the static method

    MyClass myObj = new MyClass(); // Create an object of MyClass
    myObj.myPublicMethod(); // Call the public method
  }
}


* function = method in class


* class b extends a // all in a become in b
super.print() // from a



*/


public class MyClass {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}

public class MyClass {
  public static void main(String[] args) {
    String name = "Mohamad";
    System.out.println(name);
  }
}


int myNum = 5;               // Integer (whole number)
float myFloatNum = 5.99f;    // Floating point number
char myLetter = 'D';         // Character
boolean myBool = true;       // Boolean
String myText = "Hello";     // String


final int myNum = 15;
myNum = 20;  // will generate an error: cannot assign a value to a final variable


String firstName = "Mohamad ";
String lastName = "Masri";
String fullName = firstName + lastName;
System.out.println(fullName);


int x = 5, y = 6, z = 50;
System.out.println(x + y + z);


int myInt = 9;
double myDouble = myInt; // Automatic casting: int to double

System.out.println(myInt);      // Outputs 9
System.out.println(myDouble);   // Outputs 9.0


double myDouble = 9.78;
int myInt = (int) myDouble; // Explicit casting: double to int

System.out.println(myDouble);
System.out.println(myInt);


X ++ = x + 1 / X -- = X - 1;


//Modulus :
int x = 5;
int y = 2;
System.out.println(x % y);
//Output = 1; If Output = 0 : num1 can divided on num2.


Operator  Name            Description                              Example
+         Addition        Adds together two values                   x + y  
-         Subtraction       Subtracts one value from another           x - y  
*         Multiplication    Multiplies two values                      x * y  
/         Division        Divides one value by another               x / y  
%         Modulus           Returns the division remainder           x % y  
++          Increment       Increases the value of a variable by 1   ++x  
--          Decrement       Decreases the value of a variable by 1   --x


Operator  Example     Same As
=         x = 5     x = 5 
+=          x += 3    x = x + 3 
-=      x -= 3    x = x - 3 
*=      x *= 3    x = x * 3 
/=      x /= 3    x = x / 3 
%=      x %= 3    x = x % 3 
&=      x &= 3    x = x & 3 
|=      x |= 3    x = x | 3 
^=      x ^= 3    x = x ^ 3 
>>=     x >>= 3   x = x >> 3  
<<=     x <<= 3   x = x << 3



Operator  Name            Example
==      Equal to          x == y  
!=      Not equal         x != y  
>     Greater than        x > y 
<     Less than         x < y 
>=      Greater than or equal to  x >= y  
<=      Less than or equal to   x <= y



Operator  Name      Description                         Example
&&      Logical and   Returns true if both statements are true          x < 5 &&  x < 10  
||      Logical or    Returns true if one of the statements is true       x < 5 || x < 4  
!     Logical not   Reverse the result, returns false if the result is true   !(x < 5 && x < 10)


String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.println("The length of the txt string is: " + txt.length());
//Output : The length of the txt string is: 26.


String txt = "Please locate where 'locate' occurs!";
System.out.println(txt.indexOf("locate"));
//Output : 7.


String txt = "We are the so-called \"Vikings\" from the north.";


Code  Result
\n    New Line  
\r    Carriage Return 
\t    Tab 
\b    Backspace 
\f    Form Feed


System.out.println(Math.max(5, 10)); //10
System.out.println(Math.min(5, 10)); //5


System.out.println(Math.sqrt(64)); // squared : 64 = 8/8


Math.abs(-4.7); // Make it positive.



Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive) // 0.0 <= X < 1.0
x = 3 * Math.random(); // 0.0 <= X < 3.0
x = Math.random() + 2; // 2.0 <= X < 3.0
x = 5 * Math.random() + 4; // 4.0 <= X < 9.0


if (20 > 18) {
  System.out.println("20 is greater than 18");
}


if (condition) {
  // block of code to be executed if the condition is true
} else {
  // block of code to be executed if the condition is false
}


int day = 4;
switch (day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
}
// Outputs "Thursday" (day 4)


int i = 0;
while (i < 5) {
  System.out.println(i);
  i++;
}


do {
  // code block to be executed
}
while (condition);

//Example :
int i = 0;
do {
  System.out.println(i);
  i++;
}
while (i < 5);


for (int i = 0; i <= 10; i = i + 2) {
  System.out.println(i);
}


String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}


for (int i = 0; i < 10; i++) {
  if (i == 4) {
    break;
  }
  System.out.println(i);
}


for (int i = 0; i < 10; i++) {
  if (i == 4) {
    continue;
  }
  System.out.println(i);
}



//Create a method inside MyClass:
public class MyClass {
  static void myMethod() {
    // code to be executed
  }
}



public class MyClass {
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  public static void main(String[] args) {
    myMethod();
  }
}
// Outputs "I just got executed!"



public class MyClass {
  static void myMethod(String fname) {
    System.out.println(fname + " Refsnes");
  }

  public static void main(String[] args) {
    myMethod("Liam");
    myMethod("Jenny");
    myMethod("Anja");
  }
}
// Liam Refsnes
// Jenny Refsnes
// Anja Refsnes




  static int myMethod(int x) {
    return 5 + x;
  }

  public static void main(String[] args) {
    System.out.println(myMethod(3));
  }




public class MyClass {
  int x = 5;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    System.out.println(myObj.x);
  }
}


public class MyClass {
  int x;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    myObj.x = 40;
    System.out.println(myObj.x);
  }
}



public class MyClass {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[] args) {
    myStaticMethod(); // Call the static method

    MyClass myObj = new MyClass(); // Create an object of MyClass
    myObj.myPublicMethod(); // Call the public method
  }
}


// Create a Car class
public class Car {
 
  // Create a fullThrottle() method
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  // Create a speed() method and add a parameter
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  // Inside main, call the methods on the myCar object
  public static void main(String[] args) {
    Car myCar = new Car();     // Create a myCar object
    myCar.fullThrottle();      // Call the fullThrottle() method
    myCar.speed(200);          // Call the speed() method
  }
}



Constructor :

// Create a MyClass class
public class MyClass {
  int x;  // Create a class attribute

  // Create a class constructor for the MyClass class
  public MyClass() {
    x = 5;  // Set the initial value for the class attribute x
  }

  public static void main(String[] args) {
    MyClass myObj = new MyClass(); // Create an object of class MyClass (This will call the constructor)
    System.out.println(myObj.x); // Print the value of x
  }
}

// Outputs 5




//parameter : 

public int sum(int a, int b)
{
    return a + b;
}

public void main()
{
    int x = sum(5, 5);
    //x = 10
}










// Create a window :
import java.awt.*;
import javax.swing.*;
// Create a simple GUI window
public class test {
   private static void createWindow() {
      //Create and set up the window.
      JFrame frame = new JFrame("Simple GUI");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JLabel textLabel = new JLabel("I'm a label in the window",SwingConstants.CENTER);
      textLabel.setPreferredSize(new Dimension(300, 100));
      frame.getContentPane().add(textLabel, BorderLayout.CENTER);
      //Display the window.
      frame.setLocationRelativeTo(null);
      frame.pack();
      frame.setVisible(true);
   }
   public static void main(String[] args) {
      createWindow();
   }
}



//Questions : 1) what is java oop?

//2)