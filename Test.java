import java.util.Scanner;

public class Test {
	    public static void main(String args[]) {
	        try {
	            if (args.length == 0) {
	                throw new IllegalArgumentException("Please input ���޸�");
	            }
	        } catch (IllegalArgumentException e) {
	            System.err.println(e.getMessage());
	        }
	        String res = args[0];
	        for(int i = 0; i < res.length(); i++){
	            char c = res.charAt(i);
	            System.out.print(c);
	            if((i + 1) % 14 == 0){
	                System.out.println("��");
	                continue;
	            }
	            if((i + 1) % 7 == 0)
	                System.out.print(",");
	        }

	        System.out.println("�����Ҫ���ҵ��ַ������ֵĴ�����");
	        Scanner scanner = new Scanner(System.in);
	        String find = scanner.nextLine();
	        countString(res, find);

	    }

	    private static void countString(String str,String s) {
	        int count = 0;
	        while(str.indexOf(s) != -1){

	            str = str.substring(str.indexOf(s)+1,str.length());
	            count++;

	        }
	        System.out.println(s+"���ֵĴ���Ϊ"+count+"��");
	    }
	}


	class A{
	    public static void main(String[] args) {
	        String[] s = {"������ɫ˼���"+ "��������󲻵�"
					+ "�����Ů������"+ "���������δʶ"
					+ "��������������"+ "һ��ѡ�ھ�����"
					+ "����һЦ������"+ "������������ɫ"
					+ "������ԡ�����"+ "��Ȫˮ��ϴ��֬"
					+ "�̶���������"+ "ʼ���³ж���ʱ"
					+ "���޻��ս�ҡ"+ "ܽ����ů�ȴ���"
					+ "��������ո���"+ "�Ӵ˾������糯"
					+ "�л���������Ͼ"+ "���Ӵ���ҹרҹ"
					+ "�󹬼�����ǧ��"+ "��ǧ�谮��һ��"
					+ "����ױ�ɽ���ҹ"+ "��¥�����ʹ�"
					+ "��õ��ֽ���ʿ"+ "����������Ż�"
					+ "�������¸�ĸ��"+ "������������Ů"
					+ "�깬�ߴ�������"+ "���ַ�Ʈ������"
					+ "����������˿��"+ "���վ���������"
					+ "����ܱ�Ķ�����"+ "��������������"
					+ "���س����̳���"+ "ǧ������������"};
	        Test.main(s);
	    }

}
