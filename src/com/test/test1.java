package com.test;
import java.util.*;
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int sum =  numJewelsInStones("aA","aAAbbbb");
//      System.out.println(sum);
//      Boolean a= isPalindrome(0);
//      System.out.println(a);
//       String ss[] = {"flower","flow","flight"};
//       String s = longestCommonPrefix(ss);
//       System.out.println(s);
//��ά���鷭ת
/*       int a[][] = new int[][]{{1,1,0},{1,0,1},{0,0,0}};
       int result [][] = flipAndInvertImage(a);
       System.out.println(result);*/
       /*String words[] = {"gin", "zen", "gig", "msg"};
       int sum = uniqueMorseRepresentations(words);
       String a = map('b');*/
       /*String words[] = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
       int sum = numUniqueEmails(words);*/
		/*System.out.println("hello world");
		int a[] = {3,1,2,4};
		int result[] = sortArrayByParity(a);*/
//		boolean a = judgeCircle("LL");
//		int res = hammingDistance(1,4);
		int a[] = {5,1,5,5,4,4,4,4};
		int res = repeatedNTimes(a);

	}
	public static int numJewelsInStones(String J, String S) {
        int sum = 0;
        for (int i=0;i<S.length();i++) {
            for(int j=0;j<J.length();j++) {
                if(S.charAt(i) == J.charAt(j)){
                    sum++;
                }
            }
        }
        return sum;
    }
    public static boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        } else {
            if(x<0 || x%10 ==0) {
                return false;
            }else {
                int rev = 0;
                while(x!=0) {
                    int poi = 0;
                    poi = x %10;
                    x/=10;
                    rev = rev*10+poi;
                    System.out.println(rev);
                }
                if(rev == x) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }

    // �����ǰ׺
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1){
            return strs[0];
        }
        StringBuilder sb = new StringBuilder();
        if (strs.length>1) {
            int len = strs[0].length();
            for (int i = 0; i < len; i++) {
                char curr = strs[0].charAt(i);
                for (int j = 1; j < strs.length; j++) {
                    if (strs[j].length()<=i ||strs[j].charAt(i) != curr) {
                        return sb.toString();
                    }
                    if (strs[j].charAt(i) == curr && j == strs.length - 1) {
                        sb.append(curr);
                    }
                }
            }
        }
        return sb.toString();
    }

    //���������ƽ��
    public static int[] sortedSquares(int[] A) {
        int len = A.length;
        int res[] = new int[len];
        for(int i=0; i<A.length; i++) {
            res[i] = (A[i]*A[i]);
        }
        Arrays.sort(res);
        return res;
    }
    //��λ����ķ�ת
    public static int[][] flipAndInvertImage(int[][] A) {
        int result [][] = new int[A.length][A[0].length];
        for (int i=0;i<A.length;i++) {
            int len = A[i].length;
            int temp [] =new int[len];
            int k=0;
            for(int j=A[i].length-1;j>=0;j--) {
                temp[k] = A[i][j] ^ 1;
                k++;
            }
            result[i] = temp;
        }
        return result;
    }

    // ΨһĦ��˹����
    public static String map (char temp) {
        String map [] = {
                ".-",
                "-...",
                "-.-.",
                "-..",
                ".",
                "..-.",
                "--.",
                "....",
                "..",
                ".---",
                "-.-",
                ".-..",
                "--",
                "-.",
                "---",
                ".--.",
                "--.-",
                ".-.",
                "...",
                "-",
                "..-",
                "...-",
                ".--",
                "-..-",
                "-.--",
                "--.."
        };
        int index = temp -'a';
        return map[index];
    }
    public static int uniqueMorseRepresentations(String[] words) {
        String result[] =new String[words.length];
        for(int i=0; i< words.length;i++) {
            String temp ="";
            for(int j=0;j<words[i].length();j++) {
                temp+=map(words[i].charAt(j));
            }
            result[i] = temp;
        }
        List list = new ArrayList();
        for(int k=0; k<result.length;k++) {
            if(!list.contains(result[k])){
                list.add(result[k]);
            }
        }
        return list.size();
    }

    //���صĵ����ʼ���ַ
    public static int numUniqueEmails(String[] emails) {
        ArrayList<String> result = new ArrayList<String>();
        for(int i=0; i<emails.length;i++) {
            int a = emails[i].indexOf('@');
            String front = emails[i].substring(0,emails[i].indexOf('@'));
            String end = emails[i].substring(emails[i].indexOf('@'));
            if(front.indexOf('.')>0) {
                front = front.replace(".","");
            }
            if(front.indexOf('+')>0) {
                front = front.substring(0,front.indexOf('+'));
            }
            String email = front+end;
            if(!result.contains(email)) {
                result.add(email);
            }



        }
        return result.size();
    }

    public static int[] diStringMatch(String S) {
        int des = -1;
        int resultArr[] =new int[S.length()+1];
        int add = S.length()+1;
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=0; i<S.length();i++) {
            if(S.charAt(i)=='I') {
                des++;
                result.add(des);
            } else if(S.charAt(i)=='D') {
                add--;
                result.add(add);
            }
            if(i == S.length()-1) {
                add--;
                result.add(add);
            }
        }
        for(int j=0;j<result.size();j++){
            resultArr[j] = result.get(j);
        }
        return resultArr;

    }
	 
	public static int[] sortArrayByParity(int[] A) {
			int result[] =new int[A.length];
			ArrayList<Integer> res = new ArrayList<Integer>();
			for(int i=0;i<A.length;i++) {
				if(A[i]%2==0) {
					res.add(A[i]);
				}
			}
			for(int i=0;i<A.length;i++) {
				if(A[i]%2!=0) {
					res.add(A[i]);
				}
			}
			for(int j=0;j<res.size();j++) {
				result[j]=res.get(j);
			}
			return result;
		        
	}
	//657 �������ܷ�ص�ԭ��
	 public static boolean judgeCircle(String moves) {
		int num[] = {0,0};
		boolean flag = true;
		for(int i=0; i<moves.length();i++) {
			if(moves.charAt(i) == 'R') {
				num[0]++;
			} else if(moves.charAt(i) == 'L') {
				num[0]--;
			} else if(moves.charAt(i) == 'U') {
				num[1]++;
			} else if(moves.charAt(i) == 'D') {
				num[1]--;
			}
		}
		int sum =0;
		for (int j=0;j<num.length;j++) {
			if(num[j]!=0) {
				flag = false;
				break;
			} else {
				flag = true;
			}
		}
		
		return flag;
	 }
	 //461 ��������
	 public static int hammingDistance(int x, int y) {
	        int temp=0,count=0;
	        temp=x^y;
	        while(temp!=0){
	            count++;
	            temp=(temp-1)&temp;
	        }
	        return count;
	 }
	 // 961 �����ظ���n�ε�Ԫ��
	 public static int repeatedNTimes(int[] A) {
		 Set<Integer> set = new HashSet<>(A.length / 2 + 1);
	        for (int i : A) {
	            if (!set.add(i)) {
	                return i;
	            }
	        }
	        return 0;
		 
	        
	 }
}
