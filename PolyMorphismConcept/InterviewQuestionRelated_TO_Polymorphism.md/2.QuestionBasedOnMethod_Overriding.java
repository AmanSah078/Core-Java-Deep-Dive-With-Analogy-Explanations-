🙋‍♂🙋‍♀️ //A.java
class A {
    void m1() {
        System.out.println("A m1");
    }

    void m2() {
        System.out.println("A m2");
    }
}
🙋‍♂🙋‍♀️ //B.java
class B extends A {

    void m1() {
        System.out.println("B m1");
    }

    void m3() {
        System.out.println("B m3");

   
        this.m1();
        this.m2();

        // Calls on superclass (compile-time binding to immediate parent)
        super.m1();
        super.m2();
    }
}

🙋‍♂🙋‍♀️ //C.java
class C extends B {

    void m1() {
        System.out.println("C m1");
    }
}

🙋‍♂🙋‍♀️ //D.java
class D extends C {

    void m1() {
        System.out.println("D m1");
    }

    void m2() {
        System.out.println("D m2");
    }
}
🙋‍♂🙋‍♀️ //D.java
public class Test {
    public static void main(String[] args) {
        D d1 = new D();
        d1.m1();
        d1.m2();
        d1.m3();
    }
}
// Let's try to understand the output of this question.
// Bhai, if you’ve already gone through [Basic_Concept.md](Basic_Concept.md),
// this will click instantly — same core idea, just in action here.
Ok Now Let's Find The ouput 
                      First we get the :- D m1 
                                          D m2
                                          B m3
                                          D m1
                                          D m2
                                          A m1
                                          B m2

  
🙋‍♀️🙋‍♀️ Hey, this.m1:  
I mean, if the m1 method is static, then the JVM executes it according to the current class where the method call is written.  
But if this.m1:  
I mean, if the m1 method is not static, then it executes according to the actual object.




  

