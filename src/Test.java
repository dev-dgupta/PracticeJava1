class TestInheritance1{
    public String method() {
        return "Base Class - TestInheritance1";
    }
}

class TestInheritance2 extends TestInheritance1{

    private static int counter = 0;

    public String method(int x) {
        return "Derived Class - TestInheritance2";
    }

    public static void main(String[] args) {
        TestInheritance1 obj = new TestInheritance2();
        System.out.println(obj.method());
    }
}
