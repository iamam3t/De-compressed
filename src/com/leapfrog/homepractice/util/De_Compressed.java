package com.leapfrog.homepractice.util;
public class De_Compressed {
    public String text = "AAAA!wwwweeeerhhhqwe";
    private String compressed_output="",decompressed_output="";
    private char prev = '0';
    private int count = 0;
    
    public String getCompressed(){
        System.out.println("The compression value of "+text+" is ");
        for(int i = 0; i<text.length();i++){
            
            if(i==text.length()){
                System.out.print(count + String.valueOf(prev));
            }
            if(prev=='0'){
                prev= text.charAt(i);
                count=1;
            }
            else if(prev!=text.charAt(i)){
                compressed_output= compressed_output.concat(Integer.toString(count));
                //converts integer value to string and concat with the value of  compressed output
                compressed_output= compressed_output.concat(Character.toString(prev));
                //converts character value to string and concat with the value of  compressed output
                prev=text.charAt(i);
                count = 1;
            }else{
                count++;
            }
            if(i == text.length()-1){
               compressed_output= compressed_output.concat(Integer.toString(count));
               compressed_output= compressed_output.concat(Character.toString(prev));
            }
        }
        return compressed_output;
    }
    public String getDecomposer(){
        
        for(int i =0;i<compressed_output.length();i++){
            prev=compressed_output.charAt(i);
            boolean yes = Character.isDigit(prev);
            //it checks whether the character is digit or not and assign true or flase to variable yes
            if(yes){
                i++;//to display the alphabetic character we need to access alphabetic value
                for(int j=0; j<Character.getNumericValue(prev);j++){
                    decompressed_output = decompressed_output.concat(Character.toString(compressed_output.charAt(i)));
                }//Character.getNumericValue(prev) converts the digit in string to numeric value. 
            }
        }
        System.out.println("The decompression value of "+compressed_output+" is ");
        return decompressed_output;
    }
    
    public void check(){
        if(text.equals(decompressed_output)){
            System.out.println("Compression and decompression Successful");
        }else{
            System.out.println("Something went wrong please check your code");
        }
    }
}
