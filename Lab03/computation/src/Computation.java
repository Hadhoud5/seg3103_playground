public class Computation {

	public int add(int a, int b) {
		return a+b;
	}

	public int multiply(int n, int m) {
		return n*m;
	}

	public int substract(int a, int b) {
		return a-b;
	}

	public void catchesException(var i) {
	  try {
      if (i instanceof Integer) {
		  return true;
		else{
			throw new NumberFormatException();
		}
	  } catch (NumberFormatException e) {
	      System.out.println("Number format Exception");
	  }
	}

	public double divide(double divisor, double divident) {
		return divisor/divident;
	}
}
