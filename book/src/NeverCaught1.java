public class NeverCaught1 {
    static void f() throws ExceptionB{
        throw new ExceptionB("exception b");
    }
 
    static void g() throws ExceptionC {
        try {
            f();
        } catch (ExceptionB e) {
            ExceptionC c = new ExceptionC("exception a");
            //“Ï≥£¡¥
            c.initCause(e);
            throw c;
        }
    }
 
    public static void main(String[] args) {
            try {
                g();
            } catch (ExceptionC e) {
                e.printStackTrace();
            }
    }
 
}