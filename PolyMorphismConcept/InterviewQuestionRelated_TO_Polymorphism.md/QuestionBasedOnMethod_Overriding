🙋‍♀️🙋‍♂️//A.java
class A {
    static void m1() {
        System.out.println("A m1");
    }

    void m2() {
        System.out.println("A m2");
    }
}

🙋‍♀️🙋‍♂️//B.java
class B extends A {
    static void m1() {
        System.out.println("B m1");
    }

    void m2() {
        System.out.println("B m2");
    }
}

🙋‍♀️🙋‍♂️//C.java
class Test {
    public static void main(String[] args) {
        
        B b1 = new B();
        b1.m1();  // Output: B m1  → Due to Static Method(Becuase i already mention Basic-Concept.md ) 
        b1.m2();  // Output: B m2  → Due to Non-Static Method

        A a1 = new A();
        a1.m1();  // Output: A m1  →  Due to Static Method)
        a1.m2();  // Output: A m2  → Due to Non-Static Method

        A a2 = new B();
        a2.m1();  // Output: A m1  →  Due to Static Method)
        a2.m2();  // Output: Bm2  → Due to Non-Static Method
    }
}
