/*
 * Brexit.cpp
 *
 *  Created on: Jun 24, 2017
 *      Author: navin
 */


#include <iostream>
#include <queue>
#include <list>
using namespace std;

class country{
public:
	int numberOfCollaborators;
	int numberOfCollaboratorsOutOfUnion;
	list<int> listOfCollaborators;
	int visited = 0;
	country(){
		numberOfCollaborators = numberOfCollaboratorsOutOfUnion = visited = 0;
	}

};

int main(int argc, char **argv) {
	country countryArray[200001];
	int numberOfCountries = 0, numberOfPartnerships, homeCountry = 0, countryToLeaveFirst = 0;
	int partnerX,partnerY;
	queue<int> Q;
	cin>>numberOfCountries>>numberOfPartnerships>>homeCountry>>countryToLeaveFirst;
	while(numberOfPartnerships-- > 0){
		cin>>partnerX>>partnerY;
		countryArray[partnerX].listOfCollaborators.push_back(partnerY);
		countryArray[partnerX].numberOfCollaborators++;
		countryArray[partnerY].listOfCollaborators.push_back(partnerX);
		countryArray[partnerY].numberOfCollaborators++;
	}

	/*for(int loop = 1;loop<=numberOfCountries;loop++){
		cout<<endl<<loop<<" - ";
		for(list<int>::iterator i = countryArray[loop].listOfCollaborators.begin();
				i != countryArray[loop].listOfCollaborators.end(); i++){
			cout<<*i<<" ";
		}
	}*/
	Q.push(countryToLeaveFirst);
	while(!Q.empty()){
		int countryLeavingID = Q.front();
		Q.pop();
		if(countryLeavingID == homeCountry){
			cout<<"leave"<<endl;
			return 0;
		}
		country* countryLeavingObject = &countryArray[countryLeavingID];
		countryLeavingObject->visited = 1;
		//cout<<countryArray[countryLeavingID].visited<<endl;

		for(list<int>::iterator i = countryLeavingObject->listOfCollaborators.begin();
				i!=countryLeavingObject->listOfCollaborators.end();++i){
			country* collaboratorObj = &countryArray[*i];
			if(collaboratorObj->visited == 1) continue;
			collaboratorObj->numberOfCollaboratorsOutOfUnion++;
			if(collaboratorObj->numberOfCollaboratorsOutOfUnion >=
					(collaboratorObj->numberOfCollaborators + 1)/2){
				collaboratorObj->visited = 1;
				Q.push(*i);
			}


		}

	}
	cout<<"stay"<<endl;
}

