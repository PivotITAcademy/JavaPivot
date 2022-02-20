package StringExamples;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Inderjit Singh";
		
		System.out.println("New name : "+name.replace("jit", "preet"));
		
//		String randomText = "                 Inderjit knows kamaljit who doesn't know simarjit   ";
//		
//		System.out.println("randomText:"+randomText);
//		
//		System.out.println("randomText length before trim:"+randomText.length());
//		
//		System.out.println("randomText: "+randomText.trim());
//		
//		System.out.println("randomText length after trim:"+randomText.length());
//		
//		randomText = randomText.replaceAll("jit", "deep");
//		
//		System.out.println("randomText : "+randomText);
		
		
		String name2 = "     Inderjit Singh      ";
		
		
		System.out.println("Are equal "+name.equals(name2.trim()));
		
		
	}

}
