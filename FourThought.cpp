/*
 * FourThought.cpp
 *
 *  Created on: Jun 21, 2017
 *      Author: navin
 */
#include <stdio.h>
#include <map>
#include <string>
#include <iostream>
using namespace std;

void getOP1AndOP2(int*,int*,char);


int main(int argc, char **argv) {
	char array[4] = {'+','-','*','/'};

	char *equation;
	std::map<int,std::string> myMap;
	for(int i = 0;i<4;i++){
		for(int j = 0;j<4;j++){
			for(int k =0;k<4;k++){
				//printf("%c %c %c\n",array[i],array[j],array[k]);
				int op1 = 4,op2,op3,op4;
				getOP1AndOP2(&op1,&op2,array[i]);
				getOP1AndOP2(&op2,&op3,array[j]);
				getOP1AndOP2(&op3,&op4,array[k]);
				int ans = op1 + op2 + op3 + op4;

				asprintf(&equation,"4 %c 4 %c 4 %c 4 = %d\t",array[i],array[j],array[k],ans);
				myMap[ans] = equation;
				//printf("4 %c 4 %c 4 %c 4 = %d\t",array[i],array[j],array[k],ans);
				//printf("4 %c 4 %c 4 %c 4 = %d\n",myMap[ans][0],myMap[ans][1],myMap[ans][2],ans);

			}
		}
	}
	int numberOfCases;
	int inputArray[1000];


	scanf("%d",&numberOfCases);
	for(int i = 0;i<numberOfCases;i++){
		//scanf("%d",&input);
		cin >> inputArray[i];
	}
	for(int i = 0;i<numberOfCases;i++){
		if(myMap.find(inputArray[i]) == myMap.end())
			cout<<"no solution"<<endl;
		else
		cout<<myMap[inputArray[i]]<<endl;
	}

}

void getOP1AndOP2(int *operand1, int *operand2, char op){
	if(op == '+')
		*operand2 = 4;
	else if(op == '-')
		*operand2 = -4;
	else if(op == '*'){
		*operand2 = *operand1 * 4;
		*operand1 = 0;
	}
	else{
		*operand2 = *operand1 / 4;
		*operand1 = 0;
	}

}


