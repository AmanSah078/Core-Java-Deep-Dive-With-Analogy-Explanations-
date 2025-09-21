Let's Try to Understand the Method Hiding?🤔
Dost It means,If A Subclass defines a static method with the same signature as a static method in its Superclass that is called "Method Hiding".

I know you think “Signature” means Shahrukh Khan or Ajay Devgan sponsored 😜 — but don’t think like that!
In Java, Signature means: Method Name + Parameter Types (number, order, and type) must be the same.
class Demo {
    void add(int a, String b) { }      // Signature: add(int, String)

Note:- So we can say that Static method is Method Overhidding.
       And Non-Static Method is Method Overriding.

These Below Questions u should now 
Ques1. Why Static Method is Called Method Hiding?
Reason:-
        - Static methods belong to the class, not the object
- When you call Superclass.display(), compiler & JVM don’t care about the actual object type — they bind it at compile time.
- Non‑runtime polymorphism
- Overriding works with runtime polymorphism (dynamic binding).
- Static methods use compile‑time binding (early binding), so no true overriding happens.
- Why called hiding?
- If a subclass defines a static method with the same signature as the parent’s static method, it doesn’t replace the parent’s version.
- It simply shadows (hides) it — both methods exist in their respective classes.


//Parent.java
class Parent {
    static void display() {
        System.out.println("Parent static method");
    }
}
//Child.java
class Child extends Parent {
    static void display() {
        System.out.println("Child static method");
    }
}
//Test.java
public class Test {
    public static void main(String[] args) {
        Parent p = new Child();
        p.display(); // Output: Parent static method (compile-time binding)
        
        Child.display(); // Output: Child static method
    }
}

Ques2.Why Non-Static Method is called Method Overriding?
Reason:-
       - Instance methods belong to the object
When we call obj.show(), the JVM looks at the actual object in memory, not just the reference type.
- Run‑Time Polymorphism
The decision of which method to execute is made at run time (dynamic binding).
- Parent’s version is replaced
The child class method with the same signature overrides the parent’s method, providing new behavior.
- Access rules
The overriding method cannot have a more restrictive access modifier than the overridden method.
- Return type flexibility
Covariant return types are allowed — the child method can return a subclass of the parent’s return type.

Here u can see in the Below code

class Parent {
    void display() {
        System.out.println("Parent static method");
    }
}

class Child extends Parent {
     void display() {
        System.out.println("Child static method");
    }
}

public class Test {
    public static void main(String[] args) {
        Parent p = new Child();
        p.display(); // Output: Child static method (Because Runtime Decision)
        
  
    }
}

Thank you for reading! I hope this explanation was helpful — keep learning and keep coding ✈️


        



