#include <string.h>;
#include<iostream>
using namespace std;
/*
3.1.3 实验内容
题目 1 计算员工周工资
编写一个程序，输入某雇员的每周工作时间（以小时计）和每小时的工资数，计算并输
出他的工资。若雇员周工作小时超过 40 小时，则超过部分按原工资的 1.5 倍的加班工资来
计算。若雇员每周工作小时超过 60 小时，则超过 60 的部分按原工资的 3 倍的加班工资
来计算，而 40 到 50 小时的工资仍按照原工资的 1.5 倍的加班工资来计算
*/
int main() {
	double hours;//声明每周小时数
	double wages;//声明工资
	double total;//声明总工资
	cout << "Please input employee’s work time(hour) " << endl;//提示输入每工作时间
	cin >> hours ;//从控制台输入每周工作时间
	cout << "Please input employee’s wage per hour($)" << endl;//提示输入员工的每小时的工资
	cin >> wages;//从控制台输入员工的每小时的工资
	if (hours >= 60) {//若雇员每周工作小时超过 60 小时，则超过 60 的部分按原工资的 3 倍的加班工资
		total = wages * 60 + (hours - 60) * 3 * wages;
	}
	else if (hours < 60 && hours>40) {//而 40 到 50 小时的工资仍按照原工资的 1.5 倍的加班工资来计算
		total = wages * 40 + (hours - 40) * 1.5 * wages;
	}
	else if (hours <= 40) {//原工资计算
		total = wages * hours;
	}
	cout << "The employee’s total wage :" << total<<"$";//打印输出总工资。
	//main函数返回值。
	return 0;

}
