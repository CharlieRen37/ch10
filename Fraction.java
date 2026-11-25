public class Fraction {
    // instance variable (atrributes, fields)

    int numerator, denominator;
    public static int sign;

    // constructors
    public Fraction() { // default constructor (no parameter)
        setNum(1);
        setDenom(1);
    }

    public Fraction(int n, int d) { // parameterized constructor
        setNum(n);
        setDenom(d);
    }
    public Fraction(String a){
		setNum(Integer.parseInt( a.substring(0,a.indexOf('/'))));
		setDenom(Integer.parseInt(a.substring(a.indexOf('/')+1)));
	}
	public Fraction(Fraction f){
		setNum(f.numerator);
		setDenom(f.denominator);
	}

    // behaviour methods (accessor, mutator, helper)
    public int getNum() { // accessor method, aka getters
        return numerator;
    }

    public int getDenom() { // accessor method
        return denominator;
    }
    //public String Fraction.add(String a, String b){
    public String toString(){
		return numerator + "/" + denominator;
	}
		
	public void setNum( int n ){
		numerator = n;
	}
	
	public void setDenom( int d ){
		if(d!=0){
			denominator = d;
		}else{
			denominator = 1;
			System.out.println("Error");
		}
	}
	
	
	public static Fraction mult(Fraction a, Fraction b) {
		int Mdenom=a.denominator * b.denominator;
		int Mnum= a.numerator * b.numerator;
		Fraction answer = new Fraction(Mnum,Mdenom);
		answer.reduce();
		return answer;
	}
	
	public static Fraction add(Fraction a, Fraction b) {
		int Mdenom=a.denominator * b.denominator;
		int Mnum= a.numerator * b.denominator + b.numerator * a.denominator;
		Fraction answer = new Fraction(Mnum,Mdenom);
		answer.reduce();
		return answer;
	}
	
	public static Fraction sub(Fraction a, Fraction b) {
		int Mdenom=a.denominator * b.denominator;
		int Mnum= a.numerator * b.denominator - b.numerator * a.denominator;
		Fraction answer = new Fraction(Mnum,Mdenom);
		answer.reduce();
		return answer;
	}
	
	public static Fraction div(Fraction a, Fraction b) {
		int Mdenom=a.denominator * b.numerator;
		int Mnum= a.numerator * b.denominator;
		Fraction answer = new Fraction(Mnum,Mdenom);
		answer.reduce();
		return answer;
	}
	
	public boolean equals(Fraction f){
		int a=getDenom();
		int b=getNum();
		if(a==f.denominator && b==f.numerator){
			return true;
		}else{
			return false;
		}
	}
	
	
	
	
	
	public void reduce(){
		int GCM;
		int a =getDenom();
		int b= getNum();
		while(a!=b){
			if(a>b){
				a=a-b;
			}else{
				b=b-a;
			}
		}
		GCM=a;
		setDenom(denominator/GCM);
		setNum(numerator/GCM);
	}
	public static String ope(){
		int operator=(int)(Math.random()*4);
		if(operator==0){
			sign=operator;
			return "+";
		}else if(operator==1){
			sign=operator;
			return "-";
		}else if(operator==2){
			sign=operator;
			return "*";
		}else{
			sign=operator;
			return "/";
		}
	}
	
	public static Fraction ans(Fraction a, Fraction b){
		if(sign==0){
			return Fraction.add(a,b);
		}else if(sign==1){
			return Fraction.sub(a,b);
		}else if(sign==2){
			return Fraction.mult(a,b);
		}else{
			return Fraction.div(a,b);
		}
	}
	
	public static String check(Fraction a,Fraction b, Fraction c){
		if((Fraction.ans(a,b)).equals(c)){
			return "Correct!";
		}else{
			return ("Wrong, the answer was " + Fraction.ans(a,b));
		}
	}
		
		
}
