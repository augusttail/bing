import java.util.Scanner;

public class Test {
	    public static void main(String args[]) {
	        try {
	            if (args.length == 0) {
	                throw new IllegalArgumentException("Please input 长恨歌");
	            }
	        } catch (IllegalArgumentException e) {
	            System.err.println(e.getMessage());
	        }
	        String res = args[0];
	        for(int i = 0; i < res.length(); i++){
	            char c = res.charAt(i);
	            System.out.print(c);
	            if((i + 1) % 14 == 0){
	                System.out.println("。");
	                continue;
	            }
	            if((i + 1) % 7 == 0)
	                System.out.print(",");
	        }

	        System.out.println("输出想要查找的字符串出现的次数：");
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
	        System.out.println(s+"出现的次数为"+count+"次");
	    }
	}


	class A{
	    public static void main(String[] args) {
	        String[] s = {"汉皇重色思倾国"+ "御宇多年求不得"
					+ "杨家有女初长成"+ "养在深闺人未识"
					+ "天生丽质难自弃"+ "一朝选在君王侧"
					+ "回眸一笑百媚生"+ "六宫粉黛无颜色"
					+ "春寒赐浴华清池"+ "温泉水滑洗凝脂"
					+ "侍儿扶起娇无力"+ "始是新承恩泽时"
					+ "云鬓花颜金步摇"+ "芙蓉帐暖度春宵"
					+ "春宵苦短日高起"+ "从此君王不早朝"
					+ "承欢侍宴无闲暇"+ "春从春游夜专夜"
					+ "后宫佳丽三千人"+ "三千宠爱在一身"
					+ "金屋妆成娇侍夜"+ "玉楼宴罢醉和春"
					+ "姊妹弟兄皆列士"+ "可怜光采生门户"
					+ "遂令天下父母心"+ "不重生男重生女"
					+ "骊宫高处入青云"+ "仙乐风飘处处闻"
					+ "缓歌慢舞凝丝竹"+ "尽日君王看不足"
					+ "渔阳鼙鼓动地来"+ "惊破霓裳羽衣曲"
					+ "九重城阙烟尘生"+ "千乘万骑西南行"};
	        Test.main(s);
	    }

}
