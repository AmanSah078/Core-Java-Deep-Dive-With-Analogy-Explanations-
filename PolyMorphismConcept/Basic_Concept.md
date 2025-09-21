
Hey I hope ur good
Don't Worry 
# Polymorphism Notes


1.Let's Try to understand 1st Polymorphism means ?
                It make from two words Poly-Multiple
                                      Morphism-Forms
  The polymorphism is one of the OOP principles,  it is an ability to provide multiple behaviours to an object operation.
   or
  It is the Process of Providing multiple implementations to the same operation based on sub type and based  on arguments is Called Polymorphism.
  
2.And also u think but how i can Develop Polymorphism 
Ans-So We can develop the Polymorphism in Two Ways:-🤔
1.By Using Method Overriding
2.By Using Method Overloading
                              ****Let's Try to Understand One by One****
   
1.By Using Method Overriding 🤔
                        -We should know in the  Method Overriding Method name should be same,Parameters Should Be Same But Implementation Should Be different.
Means: Chor wahi hain bas alag alag tarike se chori karta hai 😂 
“It’s the same thief, but he steals in different ways.” 😂

                        -Redefining Super class Method in Sub class to provide new Implementations as per sub class requirments is Callsed "Method Overidding".
                        -In Method Overriding the method in Super class and in Sub class Method is Called "Overidding Method"

  Note:-Super class Method is Called Overriden Method.
       Sub class Methdo is Called Overrding Method.

  Let's Try  to understand with Example:-
    //A.java
     //This is Super class Na
      class A {      
	static void m1()
	{
		System.out.println("A m1");
	}
}
   //This is Sub  class Na
//B.java
class B extends A {
	static void m1()
	{
		System.out.println("A m2");
	}
	
}
//Test.java
class Test {
	public static void main(String[] args)
	{
		A.m1();
	}
}                                              Hey!Dude we can see the Above code how we r using the  Method Overidding.


3.Run Time Polymorphism?
Dost It means Executing the Calling method from Different Subclasses based on the object Stored in this Referenced Variable is Called "Run Time Polymorphism".

Note:-😲But you should know Static Method doesn't comes under "Run Time Polymorphism" bcz it is not Executed based on the Object,It is executed from Ref.Variable  
    :-I mean Static method is only Care about Reference Variable it doesn't Think about object . 
      So at the Compilation time and run time it is only care about the Reference Variable.


Staic Method Be like: Humko Sirf Reference variable se mtlb Wahi mera sb kuch hain😂.  
😊 Let's Try to Understand Through the Example:-
🙋‍♂️🙋‍♀️//A.java
class A {
	static void m1()
	{
		System.out.println("A m1")
	}
} 
🙋‍♂️🙋‍♀️//b.java
class B extends A {
	static void m1()
	{
		System.out.println("B m1");
	}
}
🙋‍♂️🙋‍♀️//Test.java
class Test {
	public static void main(String[] args)
	{
		A b1= new B();  Reference Variable is :-A
                                 Object is :-B
		b1.m1();
	}
}
      //In the Above code we can see Both the Method is Static Method So firstly It will be go for the Compile According to Reference Variable and our Reference Var. is A then It search m1 method is availabe inside the 
        the Class A or not and u can see in the above code m1 is available inside the A class so It will be compile no Problem But u can see our m1 method is Static so we should not think about the Object we should also 
        Execute the Program According to the Referecnce Variable.

//Ouput we get A m1

Note:-😲 Only Non Static Overidden Method Comes under Run-Time-Polymorphism.
I know U think Hey Aman How we can say Non static Comes under  Run-Time-Polymorphism?
🙋‍♂️🙋‍♀️ Because We should know At the Compilation time Non static compile According to the Referecne Variable.
      But at the Run time Non static Execute according to the Actual Object.

😊 Let's Try to Understand Through the Example

🙋‍♂️🙋‍♀️//A.java
class A {
	 void m1()
	{
		System.out.println("A m1")
	}
} 
🙋‍♂️🙋‍♀️//b.java
class B extends A {
	void m1()
	{
		System.out.println("B m1");
	}
}
🙋‍♂️🙋‍♀️//Test.java
class Test {
	public static void main(String[] args)
	{
		A b1= new B();  Reference Variable is :-A
                                 Object is :-B
		b1.m1();
	}
}  
      //In the above code we can see Both the Method is Non-Static Method So firstly  It will be go for the Compile According to Reference Variable and our Reference Var. is A then It search m1 method is availabe inside the 
        the Class A or not and u can see in the above code m1 is available inside the A class so It will be compile no Problem.But🤚 I already told u na at the Execution time it will be execute according to the Object Not Refernce 
        Variable So it will be search the m1 method inside the object Which is B and also inside B class m1 method is Available, So it exeucte Successfully.

//Ouput we get-B m1.




Thank you for reading! I hope this explanation was helpful — keep learning and keep coding ✈️







