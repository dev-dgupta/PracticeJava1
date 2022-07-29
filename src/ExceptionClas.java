public class ExceptionClas {

    void m1() {
        throw new NullPointerException();
    }

    void m2() throws Exception {
        try {
            m1();
        } catch(MyException me) {
            System.out.println("I am exception");
        }
        finally{
            System.out.println("Hi");
//            throw new RuntimeException();
        }
    }

    public static void main(String[] args) throws Exception {
        ExceptionClas e=new ExceptionClas();

        e.m2();
    }
}


class MyException extends NullPointerException{

}
