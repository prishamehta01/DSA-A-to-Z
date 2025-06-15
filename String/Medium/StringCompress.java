public class StringCompress {
    public static int compress(char[] chars) {
        int i=0; //read
        int index = 0; //write
        while(i<chars.length){
            char cur = chars[i];
            int cnt = 0;
            while(i<chars.length && chars[i]==cur){
                i++;
                cnt++;
            }
            chars[index++] = cur;
            if(cnt>1){
                String num = Integer.toString(cnt);
                for(char c: num.toCharArray()){
                    chars[index++] = c;
                }
            }
        }
        return index;
    }
    public static void main(String[] args) {
        char[] c = {'a','a','b','b','c','c','c'};
        int len = compress(c);
        for(int i=0;i<len;i++){
            System.out.print(c[i]+" ");
        }

    }
}
