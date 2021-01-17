package Exception;

public class CustomException {

    public static void main(String[] args)  {
        CustomException custom = new CustomException();
        custom.makeCustomException(101);

    }

    // TODO: Custom Exception 을 만들기 전에, 예외 생성하는 방법 작성할 것
    public void makeCustomException(int number) throws Error {

//        try {
//            if(number > 100) {
//                throw new Exception("Number is over 100");
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        if (number > 100) {
            throw new RuntimeException("Number is over 100"); //
        }

    }

}
