package OOP;

enum Level{   // Enum  java.lang.Enum
	LOW("L"),MEDIAM("M"),HIGH("H");
	
	private String abbr;
	Level(String ab){
		abbr = ab;
	}
	public String getAbbr(){
		return abbr;
		
	}
}
public class EnumDemo {

	public static void main(String[] args) {
	Level a1 = Level.LOW;
	System.out.println(a1);
	System.out.println(a1.getAbbr());
	System.out.println(a1.ordinal());
	}

}
