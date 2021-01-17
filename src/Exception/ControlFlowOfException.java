package Exception;

public class ControlFlowOfException {
    public static void main(String[] args) {
        ControlFlowOfException test = new ControlFlowOfException();
        test.tryCatchFinally();

    }

    public void tryCatchFinally() {
        int[] array = new int[5];

        try {
            // 처리해야하는 코드 - (1)
            System.out.println(array[5]);
            System.out.println("Try statement is done");
        }
//        catch(Throwable t){
//            t.printStackTrace();
//        }

        catch(NullPointerException e){
            // 예외가 잡혔을 때 처리할 코드 - (2)
            // 부모클래스를 먼저 catch 문의 조건으로 잡으면 컴파일이 되지 않음.  - (2.1)
            // java: exception java.lang.NullPointerException has already been caught
            // NullPointerException 이 아닌경우 해당 catch 문은 수행되지 않음 - (2.2)
            System.out.println("Catch Block is called");
            e.printStackTrace();

        }
        catch (Exception e) {
            // 예외가 잡혔을 때 처리할 코드 - (2)
            // Exception은 Throwable 을 상속받음 - (2.3)

            // printStackTrace - (2.4)
            e.printStackTrace();
            System.out.println(e.getMessage());
            // getCause - (2.6)
            System.out.println(e.getCause());

        }
        finally {
            // 예외 발생과는 상관없이 언제나 실행되는 코드, 생략가능 - (3)
            System.out.println("Finally Block is called");
        }
    }
}
