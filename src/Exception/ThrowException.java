package Exception;

public class ThrowException {
    public static void main(String[] args) {
        ThrowException exception = new ThrowException();
        exception.howToThrowExceptionWithTryCatch();
        try {
            exception.howToThrowExceptionWithOutTryCatch();
        } catch (Exception e) {
            e.printStackTrace();
        }
        exception.throwUncheckedException();

        // Runtime Exception 미처리로 인한 프로그램 종료
        System.out.println("Runtime Exception not handled");

    }

    // Exception handling by try-catch - (1)
    public void howToThrowExceptionWithTryCatch() {
        try {
            throw new Exception("예외 발생!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Exception handling with throws - (2)
    public void howToThrowExceptionWithOutTryCatch() throws Exception {
        // try-catch 문 없이는 throws 키워드를 메소드 시그니처에 추가하여 호출자에게 처리를 요청
        // 이 경우, main에서 try-catch 처리를 하거나 throws 를 통해 처리해야함.
        // main에서 throws하는 경우 프로그램 종료!
        throw new Exception("예외 발생!");
    }

    public void throwUncheckedException() {
        // 컴파일러가 예외처리를 요청하지 않음. Unchecked Exception이기 때문! - (3)
        throw new RuntimeException("Unchecked Exception!");
    }


}
