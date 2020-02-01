
package extra;

public class PasswordRestCode {
    public static void main (String []args)
    {
        System.out.println("Your Reset Code is "+MakeRestCode());
  
    }
    
    
  
    
    
     public static String MakeRestCode()
    {
        // create Array contins all symbol you need 
    char[] codeElement = {'0','1','2','3','4','5','6','7',
        '8','9','A','B','C','D','E','F','G','E','H','I','J','K','L','M',
        'N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c',
        'd','e','f','g','e','h','i','j','k','l','m','n','o','p','q','r','s','t'
           , 'u','v','w','x','y','z'
         };
    // define varbalie of int with random size 
    int sizeOfCode=5+(int)(Math.random()*2); // create random size from 5 to 7 
    char []partCode= new char [sizeOfCode];
    for(int i =0 ;i<sizeOfCode;i++)
    {
    int catcher= (int)(Math.random()*codeElement.length);    // here we choess randomly the index of element in codeElement  array
    char chosen =  codeElement[catcher]; // here we define varbaile as cher to take real elemnt form index 
    partCode[i]=chosen;  // here we assin each element of array of PartCode with randen char of codeElement array
 
    }
    String FinalCode=new String(partCode); // here we convert array of char part code to String varible 
    return    FinalCode; 
    }
}
