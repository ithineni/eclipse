package InterviewScripts;

public class DumplicateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[]= {"Java","Javascript","Ruby","C","Python","Java","Ruby"};
		for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i].equals(names[j])) {
					System.out.println("Duplicate element is::" +names[i]);
				}
			}
		}

	}

}
