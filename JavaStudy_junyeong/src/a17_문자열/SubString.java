package a17_���ڿ�;

/**
 * 
 * subStrin(int startIndex, int endIndex) �޼ҵ�
 * startIndex ���� endIndex ������ ���ڿ��� �߶��ִ� �޼ҵ��̴�.
 *
 * indexOf(���ڿ�) �޼ҵ�
 * 
 *
 */

public class SubString {

	public static void main(String[] args) {
		//String str = "�ȳ��ϼ���. �ݰ����ϴ�.";
		//System.out.println(str.substring(0, 6));
		
		String data = "# �ȳ��ϼ���. �ݰ����ϴ�.";
		while(data != "" || data == null) {
			System.out.println(data.substring(0, data.indexOf(" ")+1));
			data = data.substring(data.indexOf(" ")+1, data.length());
		}
		
		
		String number = "123456789";
		for(int i=0; i<number.length(); i++) {
			System.out.println(number.substring(i, i+1));
		}
	}
}

// mvnrepository.com
