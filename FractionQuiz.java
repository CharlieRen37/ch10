import java.util.Scanner;


public class FractionQuiz {

public static void main (String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Let the Fraction Quiz Begin. Answers should be in lowest terms. Good luck!");
	Fraction f4=new Fraction((int)(Math.random()*10),(int)(Math.random()*10));
	f4.reduce();
	Fraction f5=new Fraction((int)(Math.random()*10),(int)(Math.random()*10));
	f5.reduce();
	System.out.print(f4+" "+ Fraction.ope() +" "+f5+" = ");
	String answer = in.nextLine();
	//System.out.println(answer);
	Fraction f6= new Fraction(answer);
	System.out.println(Fraction.check(f4,f5,f6));
	 f4= new Fraction((int)(Math.random()*10),(int)(Math.random()*10));
	f4.reduce();
	f5= new Fraction((int)(Math.random()*10),(int)(Math.random()*10));
	f5.reduce();
	System.out.print(f4+" "+ Fraction.ope() +" "+f5+" = ");
	answer = in.nextLine();
	//System.out.println(answer);
	f6= new Fraction(answer);
	System.out.println(Fraction.check(f4,f5,f6));
	
	
	
	
	
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
          
