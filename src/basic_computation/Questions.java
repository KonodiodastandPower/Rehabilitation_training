package basic_computation;

import java.util.Random;

public class Questions {
	String name;//问题的名称
	int answer;//问题的答案
	public Questions() {
		Random random = new Random();
		int choose = random.nextInt(4);
//		System.out.println(choose);
		if(choose == 0) {//加法
			int num1 = random.nextInt(101);
			int num2 = random.nextInt(100 - num1 + 1);
			this.name = num1 + "+" + num2 + "=";
			this.answer = num1 + num2;
//			System.out.println(name);//调试
//			System.out.println(answer);//调试
		}else if(choose == 1) {//减法
			int num1 = random.nextInt(101);
			int num2 = random.nextInt(num1 + 1);
			this.name = num1 + "-" + num2 + "=";
			this.answer = num1 - num2;
//			System.out.println(name);
//			System.out.println(answer);
		}else if(choose == 2) {//乘法
			int num1 = random.nextInt(11);
			int num2 = random.nextInt(11);
			this.name = num1 + "×" + num2 + "=";
			this.answer = num1 * num2;
//			System.out.println(name);
//			System.out.println(answer);
		}else if(choose == 3) {//除法
			this.answer = random.nextInt(10) + 1;
			int num1 = random.nextInt(10) + 1;
			int num2 = num1 * this.answer;
			this.name = num2 + "÷" + num1 + "=";
//			System.out.println(name);
//			System.out.println(answer);
		}else {
			try {
				throw new Exception("选择随机数不在0-3之间");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public Questions(Object obj) {
		this.name = "按下Enter键开始";
		this.answer = 0;
	}
}
