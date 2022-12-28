package string;

public class nonstaticmethods {

	public static void main(String[] args) {
		String s="apple";
		String n=" is a fruit";
		String p="Hello";
		char[]ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			char ch1=ch[i];
			System.out.print(ch1);
		}
		System.out.println( );
		
		
		System.out.println(n.charAt(8));
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.concat(n));
		System.out.println(n.contains("f"));
		System.out.println(n.indexOf('a'));
		System.out.println(n.substring(5));
		System.out.println(s.getBytes());
		System.out.println(s.split("f"));
		System.out.println(s.endsWith("r"));
		System.out.println(n.startsWith("f"));
		System.out.println(p.trim());
		System.out.println(s.equals("apple"));
		System.out.println(s.equalsIgnoreCase(s));
		System.out.println(s.compareTo("Apple"));
		System.out.println(p.hashCode());
		System.out.println(s.indexOf("f"));
		System.out.println(s.substring(2,4));
		
		
      
	}

}
