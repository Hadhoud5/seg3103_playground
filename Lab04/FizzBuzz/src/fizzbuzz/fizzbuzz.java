package fizzbuzz;

public class fizzbuzz {
	public static String finalResult(int n){
		if(n==0) {
			return "0";
		}
		else if(n%3==0 && n%5==0) {
			return ("fizzbuzz");
		}else if(n%3==0){
			return("fizz");
		}else if(n%5==0){
			return("buzz");
		}
		else {
			return String.valueOf(n);
		}
	}
	public static int amtFizz(int n){
		return (n/3)-(n/15);
	}
	public static int amtBuzz(int n){
		return (n/5)-(n/15);
	}
	public static int amtFizzbuzz(int n){
		return (n/15);
	}
}
