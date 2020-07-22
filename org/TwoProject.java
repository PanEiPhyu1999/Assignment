package FirstBestBright.org;

public class TwoProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str="BestBright";
        System.out.println(charRemoveAt(str,4));
         
	}

	private static String charRemoveAt(String str, int p) {
		
		return str.substring(0,p) + str.substring(p+1);
	}
}
