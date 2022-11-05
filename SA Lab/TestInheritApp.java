class Parent {
    public String p = "This is parent";
    public void printParent(){
        System.out.println(p);
    }
}

class Child extends Parent {
    public String ch = "This is child";
    public void printChild(){
        System.out.println(ch);
    }
}

class TestInheritApp{
    public static void main(String[] args){
        Parent x = new Parent();
        Child y = new Child();

        x.printParent();
        y.printChild();
        y.printParent();
        System.out.println(y.p);
    }
}