/*
2:Create an application for storing user information in vector.
  (Hint:User class with data member userid,name,email,pwd)
  Create Menu Driven app
  1:add user
  2:display all users
  3:search user
  4:change pwd
  5:delete all
*/

#include<iostream>
#include<vector>
using namespace std;

class User
{
private:
    int userId;
    string name;
    string email;
    string pwd;
public:
    User(){
        userId = 0;
        name = "";
        email = "";
        pwd = "";
    }

    User(int userId,string name,string email,string pwd)
    {
        this->userId = userId;
        this->name = name;
        this->email = email;
        this->pwd = pwd;
    }

    void changePwd(string pwd)
    {
        this->pwd = pwd;
    }


};

int main(){

        vector<User> u1;
        
}
