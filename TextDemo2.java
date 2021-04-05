import java.util.Arrays;
import java.util.Stack;

public class TextDemo2 {

   //统计匹配检索规则的物品数量
//    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
//        int i = 0,count = 0;
//        if(ruleKey.equals("type")) i = 0;
//        if(ruleKey.equals("color")) i = 1;
//        if(ruleKey.equals("name")) i = 2;
//        for(int j = 0; j < items.size(); j++) {
//            if(items.get(j).get(i).equals(ruleValue)) {
//                count++;
//            }
//        }
//        return count;
//    }
    //重复子字符串未成功版
//    public static boolean repeatedSubstringPattern(String s) {
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < s.length(); i++) {
//            if(!sb.toString().contains(s.charAt(i) + "")) {
//                sb.append(s.charAt(i));
//            }
//        }
//        String str = sb.toString();
//        int n = str.length();
//        if(s.length() % n != 0) {
//            return false;
//        }
//        for(int i = 0; i < s.length(); i += n) {
//            if(!s.substring(i,i + n).equals(str)){
//                return false;
//            }
//        }
//        return true;
//    }

    //字符串压缩
//    public static  String compressString(String S) {
//        StringBuilder sb = new StringBuilder();
//        char[] ch = S.toCharArray();
//        int i = 0;
//        while(i < ch.length) {
//            int count = 1;
//        while(i < S.length() - 1 && ch[i] == ch[i + 1]) {
//            count++;
//            i++;
//        }
//        sb.append(ch[i]).append(count);
//        i++;
//    }
//    String str = sb.toString();
//        return S.length() > str.length() ? str : S;
//    }

    //生成每种字符都是奇数个的字符串
//    public String generateTheString(int n) {
//        String str = "";
//        if(n % 2 == 0) {
//            for(int i = 0; i < n -1; i++) {
//                str += 'a';
//            }
//            str += 'b';
//        } else {
//            for(int i = 0; i < n; i++) {
//                str += 'a';
//            }
//        }
//        return str;
//    }

    //括号的最大嵌套深度
//    public static int maxDepth(String s) {
//        Stack<Character> sc = new Stack<>();
//        int max = 0;
//        for(int i = 0; i < s.length(); i++) {
//            char tmp = s.charAt(i);
//            if(tmp == '(') sc.push(tmp);
//            if(tmp == ')' && sc.peek() == '(') {
//                max = Math.max(sc.size(),max);
//                sc.pop();
//            }
//        }
//        return max;
//    }


    //两个相同字符之间的最长子字符串
//    public int maxLengthBetweenEqualCharacters(String s) {
//        int max = -1;
//        for(int i = 0; i < s.length(); i++) {
//            for(int j = s.length() - 1; j >= 0; j--) {
//                if(s.charAt(i) == s.charAt(j)) {
//                    max = Math.max(j - i - 1,max);
//                }
//            }
//        }
//        return max;
//    }


    //字符串中的单词数
//    public static int countSegments(String s) {
//        String[] str = s.trim().split(" ");
//        int len = 0;
//        for(String tmp : str) {
//            if(!tmp.equals(" ") && !tmp.isEmpty()) len++;
//        }
//        return len;
//    }

    //最大重复子字符串
//    public static int maxRepeating(String sequence, String word) {
//        int n = word.length();
//        int  count = 0;
//        for(int i = 0; i < sequence.length(); i++) {
//            if(i + n < sequence.length() && sequence.substring(i,i + n).equals(word)) {
//                count++;
//            }
//        }
//        return count;
//    }

    //旅行终点站
//    public String destCity(List<List<String>> paths) {
//        HashMap<String,Integer> map = new HashMap<>();
//        for(int i = 0; i < paths.size(); i++) {
//            for(int j = 0; j < 2; j++) {
//                String tmp = paths.get(i).get(j);
//                if(map.containsKey(tmp)) {
//                    int n = map.get(tmp);
//                    map.put(tmp,n + 1);
//                } else {
//                    map.put(tmp,1);
//                }
//            }
//
//        }
//        String tmp = "";
//        for(int i = 0; i < paths.size(); i++) {
//            tmp = paths.get(i).get(1);
//            if(map.get(tmp) == 1) {
//                break;
//            }
//        }
//        return tmp;
//    }
    public static void main(String[] args) {

//        String sequence = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
//        String word = "aaaba";
//        System.out.println(maxRepeating(sequence, word));

//        String s =  "Hello, my name is John";
//        System.out.println(countSegments(s));
//        StringBuilder sb = new StringBuilder();
//        String str = "abcabc";
//        System.out.println(repeatedSubstringPattern(str));
//        String str = "bbbac";
//        String s = compressString(str);
//        System.out.println(s);
//        String a = "ab";
//        String b = "ba";
//        System.out.println(buddyStrings(a, b));
//        String s = "(1+(2*3)+((8)/4))+1";
//        System.out.println(maxDepth(s));


    }

}
