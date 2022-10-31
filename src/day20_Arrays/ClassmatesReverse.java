package day20_Arrays;

public class ClassmatesReverse {
    public static void main(String[] args) {
        String[] str={"Java","Phyton","C#"};
        for (int i = 0; i < str.length; i++) {
            String name=str[i];
            String reverseName="";
            for(int j=name.length()-1; j>=0; j--){
                reverseName +=name.charAt(j);
            }
            System.out.println(reverseName);


        }
    }
}
/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}
        		output:
        			avaJ
        			nohtyp
        			#c
 */