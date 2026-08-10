package ExceptionHandling;

class DivZeroException extends Exception {
    String msg;

    public DivZeroException(String msg) {
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return msg;
    }
}

public class TryCatch {
    static void main(String[] args) {
        int i = 10;
        int j = 0;

        try {
            //Check condition BEFORE division occurs
            if (j == 0) {
                throw new DivZeroException("Cannot Div by Zero");
            }
            int k = i / j;
            System.out.println("Result: " + k);
        } catch (DivZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}
