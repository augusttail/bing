java字符串实验
========
一、实验目的
-----------
1.掌握字符串String及其方法的使用  
2.掌握异常处理结构

二、业务要求
-----------
内容：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能函数，并运行。达到如下功能：

1.每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
2.允许提供输入参数，统计古诗中某个字或词出现的次数
3.考虑操作中可能出现的异常，在程序中设计异常处理程序

输入：汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行<未完，待续>  
输出：
汉皇重色思倾国，御宇多年求不得。
杨家有女初长成，养在深闺人未识。
天生丽质难自弃，一朝选在君王侧。
回眸一笑百媚生，六宫粉黛无颜色。
春寒赐浴华清池，温泉水滑洗凝脂。
侍儿扶起娇无力，始是新承恩泽时。
云鬓花颜金步摇，芙蓉帐暖度春宵。
春宵苦短日高起，从此君王不早朝。
…………

三、核心代码
----------

               
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
          
         
       ----------------------------------------------------------
         private static void method(String s) {
		// 定义 一个容器
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();
		// 将这TreeMap中的key全部取出来，然后储存到set集合中去
		Set<Character> st = tm.keySet();
		// 将所需要统计的字符串转换成一个字符数组
		char[] c = s.toCharArray();
		// 通过for循环逐一统计每个字符出现的次数
		for (int x = 0; x < c.length; x++) {
			if (!st.contains(c[x])) {
				tm.put(c[x], 1);
			} else {
				tm.put(c[x], tm.get(c[x]) + 1);
			}
		}
		// 调用自定义方法在控制台上输出统计信息
		printMapDemo(tm);
四、运行结果
------------

汉皇重色思倾国,御宇多年求不得。
杨家有女初长成,养在深闺人未识。
天生丽质难自弃,一朝选在君王侧。
回眸一笑百媚生,六宫粉黛无颜色。
春寒赐浴华清池,温泉水滑洗凝脂。
侍儿扶起娇无力,始是新承恩泽时。
云鬓花颜金步摇,芙蓉帐暖度春宵。
春宵苦短日高起,从此君王不早朝。
承欢侍宴无闲暇,春从春游夜专夜。
后宫佳丽三千人,三千宠爱在一身。
金屋妆成娇侍夜,玉楼宴罢醉和春。
姊妹弟兄皆列士,可怜光采生门户。
遂令天下父母心,不重生男重生女。
骊宫高处入青云,仙乐风飘处处闻。
缓歌慢舞凝丝竹,尽日君王看不足。
渔阳鼙鼓动地来,惊破霓裳羽衣曲。
九重城阙烟尘生,千乘万骑西南行。  
输出想要查找的字符串出现的次数：

五、实验心得
------------
先查数组，查到7的倍数插入逗号，查到14的倍数插入句号。从键盘上键入你想要查询的字符串，查询你要查找的出现字数的重复次数。
这次实验循环想了好久，不知道怎么查数组。第二个就是找了一个treemap（）方法通过for循环可以把所有字出现的次数都统计出来。

