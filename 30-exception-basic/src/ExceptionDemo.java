
public class ExceptionDemo {

	public static void main(String[] args) {
		int c = 0;
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			c = a / b;
		}
		// always child exceptions should be first then the parent exceptions,because if
		// the parent exception is written first then it contains all the exceptions so
		// the child catch will not catch any exception.
//		catch (NumberFormatException e) {
//			System.out.println("NumberFormatException handled");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("ArrayIndexOutOfBoundsException handled");
//		} catch (ArithmeticException e) {
//			System.out.println("ArithmeticException handled");
//		} catch (RuntimeException e) {
//			System.out.println("RuntimeException handled");
//		}
		catch (Exception e) {
			System.out.println("Exception handled");
		} finally {
			System.out.println("In final block");
		}
		System.out.println(c);
	}

}
