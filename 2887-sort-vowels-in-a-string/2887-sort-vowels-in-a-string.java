class Solution {
    public String sortVowels(String s) {
        StringBuilder str=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=Character.toLowerCase(s.charAt(i));
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
              str.append(s.charAt(i));
            } 
        }
        System.out.println(str);
        char ch[]=str.toString().toCharArray();
        // StringBuilder x=new StringBuilder();
        str.setLength(0);
        Arrays.sort(ch);
        int j=0;
        for(int i=0;i<n;i++){
            char c=Character.toLowerCase(s.charAt(i));
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
              str.append(ch[j]);
              j++;
            } 
            else{
                str.append(s.charAt(i));
            }
        }
        
        return str.toString();
    }
}