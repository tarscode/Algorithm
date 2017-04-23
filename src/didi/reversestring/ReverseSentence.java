package didi.reversestring;

/**
 * 工程: CodeOffer 包名: PACKAGE_NAME 类名: ReverseSentence
 * 作者: liuyang
 * 时间: 16/9/21 下午3:03
 * 题目: 翻转单词顺序列
 * 内容:
 * 版本: V1.1
 * 运行时间:
 * 备注: 用翻转函数代替栈，额外空间复杂度O(2)
 */
public class ReverseSentence {
    public String ReverseSentence(String str) {
        char[] arr = str.toCharArray();
        int len = str.length();
        int begin =0;
        int end;
        for(int i=0;i<len;i++){
            if(arr[i]==' '){
                end = i;
                Reverse(arr,begin,end-1);
                begin=end+1;
            }
            if(i==len-1){
                Reverse(arr,begin,i);
            }
        }
        arr = Reverse(arr,0,len-1);
        str = String.valueOf(arr);
        return str;
    }
    public char[] Reverse(char[] arr,int begin,int end){
        while(begin<end){
            char temp = arr[begin];
            arr[begin++]=arr[end];
            arr[end--] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        String str = "Student. heu am I";
        ReverseSentence t = new ReverseSentence();
        System.out.println(t.ReverseSentence(str));
        System.out.println(str);
    }
}