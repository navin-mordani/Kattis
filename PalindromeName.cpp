/*
 * PalindromeName.cpp
 *
 *  Created on: Jun 23, 2017
 *      Author: navin
 */


#include <iostream>
#include <stdio.h>
#include <string.h>
#include <cstring>
using namespace std;

int main(int argc, char **argv) {

	char input[100];
	cin >> input;
	int len = strlen(input);
	if(len == 1){
		cout<<0;
		return 0;
	}
	int indexLast = len - 1;
	int indexFirst = 0;
	int lowestNumberOfOperations = len / 2;
	int lenOfSubstring;
	int numberOfOperationsForSubstring = 0;
	for(indexFirst = 0; indexFirst<len/2; indexFirst++){
		numberOfOperationsForSubstring = 0;
		lenOfSubstring = len - indexFirst;
		if(lowestNumberOfOperations <= len - lenOfSubstring){
			cout<<lowestNumberOfOperations<<endl;
			return 0;
		}

		for(int i=indexFirst,j=indexLast;i<j;i++,j--){
			if(input[i]!=input[j])
				numberOfOperationsForSubstring++;

		}
		numberOfOperationsForSubstring += len - lenOfSubstring;
		if(numberOfOperationsForSubstring<lowestNumberOfOperations)
			lowestNumberOfOperations = numberOfOperationsForSubstring;


	}
	cout<<lowestNumberOfOperations<<endl;
}




