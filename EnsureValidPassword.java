
package extra;
public class EnsureValidPassword {
private String password;
private boolean isContiasDigit ;
private boolean isContainsUpperCase;
private boolean isContainsLowerCase ;
public EnsureValidPassword(String password)
{
this.isContainsLowerCase=false ;
this.isContainsUpperCase=false ;
this.isContiasDigit=false ;
this.setPassWord(password);
}

    public String getPassword() {
        return password;
    }

public void setPassWord(String password)
{
boolean res = this.IsValidPawword(password);
if(res)
{
this.password=password;
}    
else {
throw new IllegalArgumentException("Your password is not Valid ");

}


}

public boolean IsValidPawword(String password)
{
int length = password.length();
for(int i =0 ;i<length;i++)
{
if(!this.isContiasDigit)
{
if(password.charAt(i)>=47&&password.charAt(i)<=57)
{
this.isContiasDigit=true;
}

}   

if(!this.isContainsUpperCase)
{
if(password.charAt(i)>=65&&password.charAt(i)<=90)
{
this.isContainsUpperCase=true;
}

}    
if(!this.isContainsLowerCase)
{
if(password.charAt(i)>=97&&password.charAt(i)<=122)
{
this.isContainsLowerCase=true;
}

}  
    
}
return this.isContiasDigit&this.isContainsLowerCase&this.isContainsUpperCase;
}



    
    
    
    
    
    
}
