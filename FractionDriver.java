public class FractionDriver {

public static void main (String[] args) {
	
	Fraction f1 = new Fraction();
	Fraction f2 = new Fraction(1,2);	
	System.out.println(f1);
	Fraction half=new Fraction("1/2");
	Fraction third=new Fraction("1/3");
	//Fraction sum=Fraction.add(half,third);
	Fraction anotherHalf=new Fraction(half);
	System.out.println(f1);
	System.out.println(f2);
	System.out.println(half);
	System.out.println(third);
	System.out.println(anotherHalf);
}

}
          
