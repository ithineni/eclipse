package InterviewScripts;

public class RemoveJunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="^&89ithi @ shi #%";
		s= s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
