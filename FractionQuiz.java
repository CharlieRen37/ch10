public class FractionQuiz {

public static void main (String[] args) {
	
	System.out.println("Let the Fraction Quiz Begin. Answers should be in lowest terms. Good luck!");
	System.out.println((int)(Math.random()*10)+ "/"+ (int)(Math.random()*10) " " +);
	
	
	
	
	
	
	Fraction f1 = new Fraction();
	Fraction f2 = new Fraction(2,4);	
	System.out.println(f1);
	Fraction half=new Fraction("1/2");
	Fraction third=new Fraction("1/3");
	f2.reduce();
	//Fraction sum=Fraction.add(half,third);
	Fraction anotherHalf=new Fraction(half);
	System.out.println(f1);
	System.out.println(f2);
	System.out.println(half);
	System.out.println(third);
	System.out.println(anotherHalf);
	Fraction f3= Fraction.mult(half,third);
	System.out.println(f3);
}

}
          
