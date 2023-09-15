package com.jonty070.learn.config;// Java program to illustrate Cloneable interface
//import java.lang.Cloneable;
//
//// By implementing Cloneable interface
//// we make sure that instances of class A
//// can be cloned.
//class A implements Cloneable {
//    int i;
//    String s;
//
//    // A class constructor
//    public A(int i, String s)
//    {
//        this.i = i;
//        this.s = s;
//    }
//
//    // Overriding clone() method
//    // by simply calling Object class
//    // clone() method.
//    @Override
//    protected Object clone()
//            throws CloneNotSupportedException
//    {
//        return super.clone();
//    }
//}

public enum test {
    EVENT,SYNTAX;

    test(){

    }
    public static void main(String[] args) throws Exception
    {
        for(test t : test.values()){
            System.out.println("constructor: called, "+ t.ordinal());
        }
        return;
    }
}
//Answer: enum in java is a data type which contains a fixed set of constants.
//        In enum, we can also add variables, methods and constructors. Some
//        common examples of enums are: days of week, colors, excel report
//        columns etc.
//        Some points to remember:
//        - enum constants are static and final implicitly
//        - enum improves type safety
//- enum can be declared inside or outside of a class
//- enum can have fields, constructors (private) and methods
//        - enum cannot extend any class because it already extends
//        Enum class implicitly but it can implement many interfaces
//- We can use enum in switch statement
//        - We can have main() method inside an enum
//- enum has values(), ordinal() and valueOf() methods. values()
//        return an array containing all values present inside enum,
//        ordinal() method returns the index of given enum value and
//        valueOf() method returns the value of given constant enum
//- enum can be traversed
//- enum can have abstract methods
//        - enum cannot be instantiated because it contains private
//constructor only
//- The constructor is executed for each enum constant at the
//        time of enum class loading
//- While defining enum, constants should be declared first, prior
//        to any fields or methods, or else compile time error will come