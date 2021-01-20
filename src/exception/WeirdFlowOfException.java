package exception;

public class WeirdFlowOfException {
    public static void main(String[] args) {
        System.out.println("Weird");
        WeirdFlowOfException test = new WeirdFlowOfException();
        System.out.println("---------------------------------------------------");
        System.out.println(test.noReturnInCatchAndFinally());
        System.out.println("---------------------------------------------------");
        System.out.println(test.returnInCatch_noReturnInFinally());
        System.out.println("---------------------------------------------------");
        System.out.println(test.noReturnInCatch_returnInFinally());
        System.out.println("---------------------------------------------------");
        System.out.println(test.allReturn());
        System.out.println("---------------------------------------------------");

    }

    public String noReturnInCatchAndFinally() {
        System.out.println("noReturnInCatchAndFinally method is Called!!");
        int[] array = new int[5];

        try {
            System.out.println("try Block is called");
            System.out.println(array[5]);
        }
        catch (Exception e) {
            System.out.println("catch Block is called");
        }
        finally {
            System.out.println("finally Block is called");
        }
        return "endOfControl";

    }

    public String returnInCatch_noReturnInFinally() {
        System.out.println("returnInCatch_noReturnInFinally method is called!!");
        int[] array = new int[5];

        try {
            System.out.println("try Block is called");
            System.out.println(array[5]);
        }
        catch (Exception e) {
            System.out.println("catch Block is called");
            return "catch";
        }
        finally {
            System.out.println("finally Block is called");
        }
        // (1) try 문으로 이어짐.
        return "OutSideOffinally";
    }

    public String noReturnInCatch_returnInFinally() {
        System.out.println("noReturnInCatch_returnInFinally method is called!!");
        int[] array = new int[5];

        try {
            System.out.println("try Block is called");
            System.out.println(array[5]);
        }
        catch (Exception e) {
            System.out.println("catch Block is called");
        }
        finally {
            System.out.println("finally Block is called");
            // (2) try 의 return은 사라짐
            return "finally";
        }

    }

    public String allReturn() {
        System.out.println("allReturn method is called!!");
        int[] array = new int[5];

        try {
            System.out.println("try Block is called");
            System.out.println(array[5]);
            return "try";
        }
        catch (Exception e) {
            System.out.println("catch Block is called");
            return "catch";
        }
        finally {
            System.out.println("finally Block is called");
            // (2) try 및 catch 의 return은 사라짐
            return "finally";
        }
    }
}



