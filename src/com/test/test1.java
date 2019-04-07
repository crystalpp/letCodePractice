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
//二维数组翻转
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
		/*int a[] = {5,1,5,5,4,4,4,4};
		int res = repeatedNTimes(a);*/
//		int a[] = {0,2,1,0};
//		int res = peakIndexInMountainArray(a);
//		System.out.println(res);
//		List <Integer> list = selfDividingNumbers(1,22);
//		System.out.println(list);
//		String a[] = {"cba", "daf", "ghi"};
//		System.out.println(isnotDesc(a));
//		System.out.println(minDeletionSize(a));
		Scanner scanner = new Scanner(System.in);
//		ArrayList<Charactor> list =new ArrayList<Charactor>();
//		int N=scanner.nextInt();
//		System.out.println(fib(N));
//		String s= scanner.nextLine();
//		String res = reverseWords(s);
//		System.out.println(res);
//		int a []=shortestToChar("loveleetcode", 'e');
//		System.out.println(addDigits(38));
		/*int A[]= {1,2,3,4,5,7,8,9};
		int q[][] = {{1,0},{-3,1},{-4,0},{2,3},{2,3},{2,3},{2,3},{2,3},{2,3}};
		int res[]=sumEvenAfterQueries(A,q);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}*/
		
		/*String ops[] = {"5","-2","4","C","D","9","+","+"};
		System.out.println(calPoints(ops));*/
//		Scanner scanner = new Scanner(System.in);
		  /*int na = scanner.nextInt();
		  int nb = scanner.nextInt();
		  int[] aa = new int[na];
		  int[] bb = new int[nb];
		  int i = 0;
		  while (scanner.hasNext()) {
		   aa[i++] = scanner.nextInt();
		   if (i == aa.length) {
		    break;
		   }
		  }
		  i = 0;
		  while (scanner.hasNext()) {
		   bb[i++] = scanner.nextInt();
		   if (i == bb.length) {
		    break;
		   }
		  }
		int res[] =intersection(aa,bb);
		myprint(res);*/
//		generate(5);
		/*int a[] = {2,2,1};
		singleNumber(a);*/
		/*String s= "abcdefghijklmnopqrstuvwxyz";
		int widths [] = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		myprint(numberOfLines(widths,s));*/
		/*String A[] = {"cool","lock","cook"};
		System.out.println(commonChars(A));*/
		/*int a[][] = {{0,1,0,0},
		             {1,1,1,0},
		             {0,1,0,0},
		             {1,1,0,0}};
		System.out.println(islandPerimeter(a));*/
		
//		System.out.println(hasAlternatingBits(10));
//		System.out.println(countPrimeSetBits(10,15));
		/*int a[][] = {{1,2,3,4},
		             {5,1,2,3},
		             {9,5,1,2}}
		matrixReshape(a,2,2);*/
		
//		System.out.println(fizzBuzz(15));
		/*int a[][] = {{1,2},
	             {2,2}};
		isToeplitzMatrix(a);*/
		/*int num=scanner.nextInt();
		System.out.println(binaryGap(num));*/
//		int len=scanner.nextInt();
//		int a[] =new int[len];
//		for(int i=0;i<len;i++) {
//			a[i] = scanner.nextInt();
//		}
//		System.out.println(largestPerimeter(a));
//		findTheDifference("abcd","abcde");
		/*String a[] = {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"};
		myprint(reorderLogFiles(a));*/
//		System.out.println(toGoatLatin("over the lazy dog"));
//		System.out.println(rotatedDigits(10));
//		System.out.println(detectCapitalUse("mL"));
//		System.out.println(countAndSay(7));
//		System.out.println(addBinary("1010","1011"));
//		System.out.println(checkRecord("PPALLP"));
//		String a = scanner.nextLine();
//		String b = scanner.nextLine();
//		System.out.println(canConstruct(a,b));
//		System.out.println(reverseVowels("aA"));
		/*System.out.println(countBinarySubstrings("01"));
		reverseOnlyLetters("Test1ng-Leet=code-Q!");*/
//		int a[] = {1,3,5,2,4};
//		int b[] = {6,5,4,3,2,1,7};
//		nextGreaterElement(a,b);
//		reverseStr("abcd",4);
//		isLongPressedName("leelee","lleeelee");
//		repeatedSubstringPattern("abcabcabc");
//		System.out.println(isPalindrome("0p      a"));
//		System.out.println(strStr("heloll","ll"));
		System.out.println(isValid("{[}"));
		;
	}
	public static void myprint(Object[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
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

    // 最长公共前缀
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

    //有序数组的平方
    public static int[] sortedSquares(int[] A) {
        int len = A.length;
        int res[] = new int[len];
        for(int i=0; i<A.length; i++) {
            res[i] = (A[i]*A[i]);
        }
        Arrays.sort(res);
        return res;
    }
    //二位数组的反转
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

    // 唯一摩尔斯密码
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

    //独特的电子邮件地址
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
	//657 机器人能否回到原点
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
	 //461 汉明距离
	 public static int hammingDistance(int x, int y) {
	        int temp=0,count=0;
	        temp=x^y;
	        while(temp!=0){
	            count++;
	            temp=(temp-1)&temp;
	        }
	        return count;
	 }
	 // 961 返回重复了n次的元素
	 public static int repeatedNTimes(int[] A) {
		 Set<Integer> set = new HashSet<>(A.length / 2 + 1);
	        for (int i : A) {
	            if (!set.add(i)) {
	                return i;
	            }
	        }
	        return 0;
		 
	        
	 }
	 // 852 山脉数组的封顶索引  02/04/2019
	 public static int peakIndexInMountainArray(int[] A) {
//		 int res = 0;
//		 boolean flag = false;
//		 for(int i =1; i<A.length;i++) {
//			 for(int j=i;j<A.length;j++) {
//				 if(A[j]>A[i]) {
//					 flag = true;
//				 } else {
//					 flag = false;
//				 }
//			 }
//			 for(int j=0;j<i;j++) {
//				 if(A[j]<A[i]) {
//					 flag = true;
//				 } else {
//					 flag = false;
//				 }
//			 }
//			 if(flag) {
//				 res = i;
//			 }
//		 }
//	     return res;
		 //由于已经确认是山脉数组了，所以不需要判断完
		 int flag = 0;
			int size = A.length;
			for (int i = 0; i < size; i++) {
				if (A[i + 1] > A[i]) {
					flag++;
				}
				else {
					return flag;
				}
			}
			return flag;
	 }
	 //728 自除数 
	 public static List<Integer> selfDividingNumbers(int left, int right) {
		 List<Integer> list = new ArrayList<Integer>();
		 int i=1;
		 boolean flag =false;
		 for(i=left;i<=right;i++) {
			 int k = i;
//			 System.out.println(i);
			 while(k!=0) {
				 int num = k%10;
				 if(num!=0) {
					 if(i%num ==0) {
						 flag =true;
					 } else {
						 flag =false;
						 break;
					 }
				 } else {
					 flag =false;
					 break;
				 }
				 k/=10; 
			 }
			 if(flag) {
				 list.add(i);
			 }
		 }
		 return list;
	  }
	 // 922 按奇偶排序数组
	 public static int[] sortArrayByParityII(int[] A) {
	   int res[] =new int [A.length];
	   int eval =0;
	   int odd =1;
	   for(int i=0;i<A.length;i++) {
		   if(A[i]%2==0) {
			   res[eval] = A[i];
			   eval+=2;
		   } else if(A[i]%2!=0) {
			   res[odd] =A[i];
			   odd+=2;
		   }
	   }
	   return res;
	 }
	 // 944删序造列
	 public static int minDeletionSize(String[] A) {
		 int num=1;
		 String res[] = new String[A.length];
		 char c[] =new char[A.length];
		 boolean flag =false;
		 while(!flag) {
			 for(int i=0;i<A.length;i++) {
//				 String a = A[i].s(0, num);
					res[i] = A[i].substring(num);
			  }
			 for(int j=0;j<res.length-1;j++) {
				for(int k=0;k<res[j].length();k++) {
					if(res[j].charAt(k)<=res[j+1].charAt(k)) {
						flag =true;
					} else {
						flag =false;
						break;
					}
				}
				if(!flag) {
					break;
				}
				
			 }
			 num++;
		 }
		 
		 
		 
		 return num;
	        
	 }
	 public static boolean isnotDesc(char[] chars) {
		 boolean flag =false;
		 for(int i=0;i<chars.length-1;i++) {
			 if(chars[i]<=chars[i+1]) {
				 flag = true;
			 } else {
				 flag =false;
				 break;
			 }
		 }
		 return flag;
	 }
	 // 翻转字符串，直接在原数组上修改
	 public static void reverseString(char[] s) {
		 if(s == null || s.length <= 1) return;
			int len = s.length;
		        for(int i = 0, k = len/2; i < k; i++){
		          char tmp = s[i];
		          s[i] = s[len-1-i];
		          s[len-1-i] = tmp;
		 }   
	 }
	 // 斐波那契数
	 public static int fib(int N) {
		 int sum =0;
		 if(N==0) {
			 sum=0;
		 } else if(N==1) {
			 sum=1;
		 } else {
			 sum=fib(N-1)+fib(N-2);
		 }
		 return sum;
		 
	 }
	 // 字符串反转
	 public static String reverseWords(String s) {
	     String res[] = s.split(" ");
	     String result ="";
	     ArrayList<String> list =new ArrayList<String>();
	     for(int i=0;i<res.length;i++) {
	    	 String tmp = "";
	    	 for(int j=res[i].length()-1;j>=0;j--) {
	    		 tmp+=res[i].charAt(j);
	    	 }
	    	 list.add(tmp);
	     }
	     for(int k=0;k<list.size();k++) {
	    	 result+=list.get(k);
	    	 if(k<list.size()-1) {
	    		 result+=" ";
	    	 }
	    	 
	     }
	     return result;
	 }
	 // 字符的最短距离
	 public static int[] shortestToChar(String S, char C) {
	      ArrayList<Integer> arr = new ArrayList<Integer>();
	      boolean flag =false;
	      for(int i=0;i<S.length();i++) {
	    	  ArrayList<Integer> arr1 = new ArrayList<Integer>();
	    	  for(int j=0;j<S.length();j++) {
	    		  if(S.charAt(j)==C) {
	    			  arr1.add(Math.abs(j-i));  
	    		  }
	    	  }
	    	  Collections.sort(arr1);
	    	  arr.add(arr1.get(0));
	      }
	      System.out.println(arr);
	      int a[] =new int[arr.size()];
	      for(int k=0;k<arr.size();k++) {
	    	  a[k]=arr.get(k);
	      }
	      return a;
	 }
	 // 转置矩阵
	 public static int[][] transpose(int[][] A) {
		 int R = A.length, C = A[0].length;
	        int[][] ans = new int[C][R];
	        for (int r = 0; r < R; ++r)
	            for (int c = 0; c < C; ++c) {
	                ans[c][r] = A[r][c];
	            }
	        return ans;
	 }
	 //各位相加
	 public static int addDigits(int num) {
		while(num/10!=0) {
			int tmp =num;
			int sum =0;
			while(tmp!=0) {
		    	int a = tmp%10;
		    	sum+=a;
		    	tmp/=10;
		    }
			num=sum;
		}
		return num;
	    
	 }
	 // 查询后的偶数和
	 public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
		 int res[] =new int[queries.length];
	     for(int i=0;i<queries.length;i++) {
	    	 int index = queries[i][1];
	    	 A[index]+=queries[i][0];
	    	 int sum =0;
	    	 for(int j=0;j<A.length;j++) {
	    		 if(A[j]%2==0) {
	    			 sum+=A[j];
	    		 }
	    		 res[i] =sum;
	    	 }
	     }
	     return res;
	     
	 }
	 // 682棒球比赛
	 public static int calPoints(String[] ops) {
	    int sum =0;
	    ArrayList<Integer> arr =new ArrayList<Integer>();
	    for(int i=0;i<ops.length;i++) {
	    	 if(ops[i].charAt(0) == '+') {
	    		sum+=arr.get(arr.size()-1);
	    		sum+=arr.get(arr.size()-2);
	    		arr.add(arr.get(arr.size()-1)+arr.get(arr.size()-2));
	    	} else if(ops[i].charAt(0) == 'D') {
	    		sum+=(arr.get(arr.size()-1)*2);
	    		arr.add(arr.get(arr.size()-1)*2);
	    	} else if(ops[i].charAt(0) == 'C') {
	    		sum-=(arr.get(arr.size()-1));
	    		arr.remove(arr.size()-1);
	    	} else {
	    		int score = Integer.valueOf(ops[i]);
	    		arr.add(score);
	    		sum+=score;
	    	}
	    }
	    return sum;
	 }
	 // 349两个数组的交集
	 public static int[] intersection(int[] nums1, int[] nums2) {
		 ArrayList<Integer> arr = new ArrayList<Integer>();
		 for(int i=0;i<nums1.length;i++) {
			 for(int j=0;j<nums2.length;j++) {
				 if(nums1[i] == nums2[j]) {
					 if(!arr.contains(nums1[i])) {
						 arr.add(nums1[i]);
					 }
				 }
			 }
		 }
		 int res[] =new int[arr.size()];
		 for(int k=0;k<arr.size();k++) {
			 res[k]=arr.get(k);
		 }
		 return res;
	 }
	 // 杨辉三角
	 public static List<List<Integer>> generate(int numRows) {
		 List<List<Integer>> res = new ArrayList<List<Integer>>();
	    for(int i=0;i<numRows;i++) {
	    	List<Integer> list = new ArrayList<Integer>();
	    	if(i==0) {
	    		list.add(1);
	    		res.add(list);
	    	} else if(i == 1) {
	    		list.add(1);
	    		list.add(1);
	    		res.add(list);
	    	} else {
	    		list.add(1);
	    		for(int j=1;j<i;j++) {
	    			list.add(res.get(i-1).get(j)+res.get(i-1).get(j-1));
	    		}
	    		list.add(1);
	    		res.add(list);
	    	}
	    }
	    return res;
	 }
	 // 只出现一次的数字
	 public static int singleNumber(int[] nums) {
	      int sum=0;
	        for(int i=0;i<nums.length-1;i++) {
	          sum^= nums[i];
	        }
	      return sum;
	    }
	 // 806写字符串需要的行数
	 public static int[] numberOfLines(int[] widths, String S) {
		 int line =1;
		 int sum =0;
		 int rest = 0;
		 int res[] =new int[2];
	    for(int i=0;i<S.length();i++) {
    	 if(rest+widths[S.charAt(i)-97]>100)
		  {
			  line++;
			  rest=0;
		  }
		  rest+=widths[S.charAt(i)-97];
	    }
	   res[0] = line;
	   res[1] = rest;
	   return res;
	  }
	 // 1002 查找常用字符串
	 public static List<String> commonChars(String[] A) {
	   List<String> list = new ArrayList<String>();
	   
		   boolean flag = false;
		   for(int j=0;j<A[0].length();j++) {
			   for(int i=1;i<A.length;i++) {
				   String f= A[i];
				   char re = A[0].charAt(j);
				   if(f.indexOf(re)>=0) {
					   flag=true;
				   } else {
					   flag =false;
					   break;
				   }
			   }
			   if(flag) {
				   list.add(A[0].charAt(j)+"");
				   for(int k=1;k<A.length;k++) {
					   A[k] = A[k].substring(0, A[k].indexOf(A[0].charAt(j))) +A[k].substring(A[k].indexOf(A[0].charAt(j))+1);
				   }
				   
			   }
	   }
	   return list;
	 }
	 // 463 岛屿的周长
	 public static int islandPerimeter(int[][] grid) {
		 if (grid == null || grid.length == 0) {
	            return 0;
	        }
	        int rsp = 0;
	        for (int i = 0; i < grid.length; i++) {
	            for (int j = 0; j < grid[i].length; j++) {
	                if (grid[i][j] == 1) {
	                    rsp += 4;
	                    if (i > 0 && grid[i - 1][j] == 1) {
	                        rsp -= 2;
	                    }
	                    if (j > 0 && grid[i][j - 1] == 1) {
	                        rsp -= 2;
	                    }
	                }
	            }
	        }
	        return rsp;
	 }
	 // 693 交替二进制
	 public static boolean hasAlternatingBits(int n) {
		 ArrayList <Integer> list = new ArrayList<Integer>();
	    while(n!=0) {
	    	list.add(n%2);
	    	n=n/2;
	    }
	    boolean flag= true;
	    for(int i=0;i<list.size()-1;i++) {
	    	if(list.get(i)==list.get(i+1)) {
	    		flag=false;
	    		break;
	    	}
	    }
	    return flag;
	 }
	 //762. 二进制表示中质数个计算置位
	 public static int countPrimeSetBits(int L, int R) {
		 int num=0;
	       for(int i=L;i<=R;i++) {
	    	   int sum=0;
	    	   int temp=i;
	    	   while(temp!=0) {
	    		  int tmp=temp%2;
	    		  if(tmp==1) {
	    			  sum++;
	    		  }
	    		  temp/=2;
	    	   }
	    	   if(isZhishu(sum)) {
	    		   num++;
	    	   }
	       }
	       return num;
	 }
	 public static boolean isZhishu(int num) {
		 boolean flag = true;
		 if(num==2) {
			 flag=true;
		 } else if(num==1) {
			 flag=false;
		 } else {
			 for(int i=2;i<num;i++) {
				 if(num%i==0) {
					flag =false; 
				 }
			 }
		 }
		 return flag;
	 }
	 //566重塑矩阵
	 public static int[][] matrixReshape(int[][] nums, int r, int c) {
		 if(nums.length*(nums[0].length)<r*c) {
			 return nums;
		 } else {
			ArrayList<Integer> list = new ArrayList<Integer>();
			 int res[][] =new int[r][c];
			 for(int i=0;i<nums.length;i++) {
				 for(int j=0;j<nums[0].length;j++) {
					 list.add(nums[i][j]);
				 }
			 }
			 int index=0;
			 for(int k=0;k<res.length;k++) {
				 for(int z=0;z<res[k].length;z++) {
					 index++;
					 res[k][z] = list.get(index);
				 }
			 }
			 return res;
		 }
	 }
	 //412 FizzBuzz
	 public static List<String> fizzBuzz(int n) {
	    List<String> list = new ArrayList<String>();
	    for(int i=1;i<=n;i++) {
	    	String s ="";
	    	if(i%3==0) {
	    		s+="fizz";
	    	} 
	    	if(i%5==0) {
	    		s+="Buzz";
	    	}  
	    	if(i%3!=0 && i%5!=0) {
	    		s=i+"";
	    	}
	    	list.add(s);
	    	
	    	
	    }
	    return list;
	 }
	 //766. 托普利茨矩阵
	 public static boolean isToeplitzMatrix(int[][] matrix) {
	      boolean flag =true;
	      for(int j=1;j<matrix[0].length;j++) {
	    	  int k=j;
	      for(int i=matrix.length-1;i>0;i--) {
		    	 if(k==0||i==0) {
		    		 break;
		    	 } else {
		    		 if(matrix[i][k]!=matrix[i-1][k-1]) {
		    			  flag = false;
		    			  break;
		    		  }
		    		  k--;
		    	 }
	    		 
	    	  }
	      }
	      return flag;
	 }
	 //868二进制间距
	 public static int binaryGap(int N) {
	     String s="";
	     while(N!=0) {
	    	 s+=N%2;
	    	 N/=2;
	     }
	     int distance = 0;
	     for(int i=0;i<s.length();i++) {
	    	 if(s.charAt(i)=='1') {
	    		 int len=0;
	    		 for(int j=i+1;j<s.length();j++) {
		    		 if(s.charAt(j)=='1') {
		    			 len=j-i;
		    			 break;
		    		 }
		    	 }
	    		 distance = distance>len?distance:len;
	    	 }
	    	
	     }
	     return distance;
	 }
	 // 三角形的最大周长
	 public static int largestPerimeter(int[] A) {
		 for(int i=0;i<A.length-1;i++){//外层循环控制排序趟数
			for(int j=0;j<A.length-1-i;j++){//内层循环控制每一趟排序多少次
				if(A[j]>A[j+1]){
				int temp=A[j];
				A[j]=A[j+1];
				A[j+1]=temp;
				}
			}
		 } 
		 for (int i = A.length - 3; i >= 0; --i) {
			 if (A[i] + A[i+1] > A[i+2])
	                return A[i] + A[i+1] + A[i+2];
	        
		 }
		 return 0;     
	    
	 }
	 //389 找不同
	 public static char findTheDifference(String s, String t) {
//		 char[] arrays = s .toCharArray();
//
//		 char[] arrayt = t .toCharArray();
		 int sum1=0;
		 int sum2=0;
		 for(int i=0;i<s.length();i++) {
			 sum1+=(int)s.charAt(i);
		 }
		 for(int i=0;i<t.length();i++) {
			 sum2+=(int)t.charAt(i);
		 }
		 return (char) ((sum2-sum1));
		
	 }
	 // 杨辉三角II
	 public static List<Integer> getRow(int rowIndex) {
		 List<Integer> list = new ArrayList<>();
	        if(rowIndex == 0) list.add(1);
	        if(rowIndex == 1) {list.add(1);list.add(1);}
	        if(rowIndex >= 2) {
	            list.add(1);
	            List<Integer> preList = getRow(rowIndex - 1);
	            for(int i = 0; i < preList.size() - 1; i++) {
	                list.add(preList.get(i) + preList.get(i + 1));
	            }
	            list.add(1);
	        }
	        return list;
	 }
	 // 感觉题目没读懂
	 public static String[] reorderLogFiles(String[] logs) {
		 List<String> list = new ArrayList<String>();
		 List<String> list1 = new ArrayList<String>();
		 String arr[] =new String[logs.length];
	   for(int i=0;i<logs.length;i++) {
		   boolean flag = false;
			 String temp[] =logs[i].split(" ");
			 for(int j=0;j<temp.length;j++) {
				 if(temp[j].charAt(0)>='a'&&temp[j].charAt(0)<='z') {
					flag = true;
				 } else {
					 flag = false;
					 list1.add(logs[i]);
					 break;
				 }
			 }
			 if(flag) {
				 
				 list.add(logs[i]);
			 }
	   	}
	   list.addAll(list1);
	   return list.toArray(arr);
	 }
	 // 824 山羊拉丁文
	 public static String toGoatLatin(String S) {
	
		
	    String arr[] = S.split(" ");
	    String res ="";
	    for(int i=0;i<arr.length;i++) {
	    	String firstChar = (arr[i].charAt(0)+"").toLowerCase();
//	    	System.out.println(firstChar);
	    	if(firstChar== "o") {
				System.out.println("xixixi");
			}
	    	if(firstChar.equals("a") || firstChar.equals("e")||firstChar.equals("i")||firstChar.equals("o")||firstChar.equals("u")) {
	    		arr[i]+="ma";
	    		
	    	} else {
	    		arr[i] = arr[i].substring(1)+arr[i].substring(0, 1);
	    		arr[i]+="ma";
	    	}
	    	
	    	for(int j=0;j<=i;j++) {
	    		arr[i]+="a";
	    	}
	    	res+=arr[i];
	    	if(i!=arr.length-1) {
	    		res+=" ";
	    	}
	    	
	    }
	    return res;
	 }
	 // 788 旋转数字
	 public static int rotatedDigits(int N) {
	    int sum=0;
	    boolean flag = false;
	    for(int i=0;i<=N;i++) {
	    	flag= false;
	    	int a= i;
	    	while(a!=0) {
	    		int temp = a%10;
	    		if(temp==2||temp==5||temp==6||temp==9) {
	    			flag = true;
	    		} else {
	    			flag= false;
	    			break;
	    		}
	    		a/=10;
	    	}
	    	if(flag) {
	    		sum++;
	    	}
	    }
	    return sum;
	 }
	 // 520 检测大写字母
	 public static boolean detectCapitalUse(String word) {
		 boolean flag = false;
		 int sum=1;
		 int sum1=1;
	     for(int i=1;i<word.length();i++) {
	    	 if(Character.isUpperCase(word.charAt(0))) {
	    		 if(Character.isUpperCase(word.charAt(i))) {
	    			 sum++;
	    		 }
	    	 } else {
	    		 if(!Character.isUpperCase(word.charAt(i))) {
	    			 sum1++;
	    		 }
	    	 }
	     }
	     if(Character.isUpperCase(word.charAt(0))) {
	    	 if(sum==word.length()||sum==1) {
		    	 flag = true;
		     } else if(sum<word.length()) {
		    	 flag=false;
		     }
	     } else {
	    	 if(sum1==word.length()) {
	    		 flag = true;
		     } else if(sum1<word.length()) {
		    	 flag=false;
	    	 }
	     }
	     
	     return flag;
	 }
	 public static String countAndSay(int n) {
	    String res = "";
	    
	    if(n==1) {
	    	return "1";
	    } else if(n==2) {
	    	return "11";
	    }
	    String s = countAndSay(n-1);
	    int num=1;
	    boolean flag = false;
	    for(int i=0;i<s.length();i++) {
    			if(s.charAt(i)==s.charAt(i+1)) {
    	    		num++;
    	    		if((i+1)==s.length()-1) {
    	    			flag=true;
    	    			res+=(num+"");
        	    		res+=(s.charAt(i)+"");
    	    		}
    	    	} else {  
    	    		if((i+1)==s.length()-1) {
    	    			flag=true;
    	    			res+=(num+"");
    		    		res+=(s.charAt(i)+"");
    		    		res+=("1");
    		    		res+=(s.charAt(i+1)+"");
    	    		} else {
    	    			res+=(num+"");
        	    		res+=(s.charAt(i)+"");
        	    		num=1;
    	    		}
    	    	}

	    	if(flag) {
	    		break;
	    	}
	    }
	    return res;
	 }
	 // 67 二进制求和
	 public static String addBinary(String a, String b) {
	     int len = a.length()>b.length()?a.length():b.length();
	     int num=0;
	     String res = "";
	     int j=b.length()-1;
	     int k=a.length()-1;
	     for(int i=len-1;i>=0;i--) {
	    	 int  a1=0;
	    	 int b1=0;
	    	 if(a.length()>b.length()) {
	    		
	    		 a1=a.charAt(i)-48;
	    		 if(j<0) {
	    			 b1=0;
	    		 } else {
	    			 b1=b.charAt(j)-48;
	    			 j--;
	    		 }
	    	 } else {
	    		 
	    		 b1=b.charAt(i)-48;
	    		 if(k<0) {
	    			 a1=0;
	    		 } else {
	    			 a1=a.charAt(k)-48;
	    			 k--;
	    		 }
	    	 }
	    	 
	    	
	    	 if(a1+b1+num==3) {
	    		 num=1;
	    		 res+="1";
	    	 } else if(a1+b1+num==2){
	    		 res+="0";
	    		 num=1;
	    	 } else if(a1+b1+num==1){
	    		 res+="1";
	    		 num=0;
	    	 } else {
	    		 res+="0";
	    		 num=0;
	    	 }
	     }
	     if(num==1) {
	    	 res+="1";
	     }
	     String s ="";
	     for(int z=res.length()-1;z>=0;z--) {
	    	 s+=res.charAt(z);
	     }
	     return s;
	 }
	 // 551学生出勤记录
	 public static boolean checkRecord(String s) {
		 int a=0,c=0;
		 for(int i=0;i<s.length();i++)
	        {
	            if(s.charAt(i)=='A')a++;
	            if(a>1)return false;
	            if(s.charAt(i)=='L')c++;
	            if(c>2)return false;
	            if(s.charAt(i)!='L')c=0;
	        }
	        return true;
	 }
	 // 383 赎金信
	 public static boolean canConstruct(String ransomNote, String magazine) {
		 boolean flag = false;
	     if(ransomNote.length()==magazine.length()) {
	    	 if(ransomNote.equals(magazine)) {
	    		 flag = true;
	    	 }
	     } else {
	    	 StringBuffer res = new StringBuffer(ransomNote);
	    	 for(int i=0;i<magazine.length();i++) {
	    		 int index = res.toString().indexOf(magazine.charAt(i));
	    		 if(index>=0) {
	    			 res=res.replace(index,index+1,"");
	    		 }
	    	 }
	    	 if(res.length()==0) {
	    		 flag=true;
	    	 }
	     }
	     return flag;
	 }
	 // 345 反转字符串中的元音字母
	 public static String reverseVowels(String s) {
		 String res = "";
		 char arr[] =s.toCharArray();
		 List<Integer> list = new ArrayList<Integer> ();
	     for(int i=0;i<arr.length;i++) {
	    	 String ch = (arr[i]+"").toLowerCase();
	    	 if(ch.equals("a")||ch.equals("e")||ch.equals("i")||ch.equals("o")||ch.equals("u")) {
	    		 list.add(i);
	    	 }
	    	 
	    	 if(list.size()==2) {
	    		 char temp = arr[list.get(0)];
	    		 arr[list.get(0)] = arr[list.get(1)];
	    		 arr[list.get(1)] = temp;
	    		 list.remove(0);
	    	 }
	     }
	     for(int k=0;k<arr.length;k++) {
	    	 res+=(arr[k]+"");
	     }
	     return res;
	 }
	 public static int countBinarySubstrings(String s) {
		 String sub ="";
		 int sum=0;
		 
	    for(int i=0;i<s.length();i++) {
	    	for(int j=i;j<s.length();j++) {
	    		sub = s.substring(i, j+1);
//	    		System.out.println(sub);
	    		if(sub.length()%2==0&&sub.length()!=s.length()) {
	    			if(sub.length()==2) {
	    				if(sub.charAt(0)!=sub.charAt(1)) {
	    					System.out.println(sub);
	    					sum++;
	    				}
	    			} else {
	    				int k=0;
	    				int num1=0;
	    				 int num0=0;
	    				while(k<sub.length()-1) {
			    			if(sub.charAt(k)==sub.charAt(k+1)) {
			    				if(sub.charAt(k)=='0') {
			    					num0++;
			    				} else {
			    					num1++;
			    				}
			    				
			    			} else {
			    				num0--;
			    			}
			    			k+=2;
			    		}
	    				if(num0==num1&&num0!=0&&num1!=0) {
	    					System.out.println(sub);
	    					sum++;
	    				}
	    			}
	    			
	    		}
	    		
	    	}
	    }
	    return sum;
	 }
	 // 仅仅反转字母
	 public static String reverseOnlyLetters(String S) {
//		 List <Integer> index = new ArrayList<Integer>();
		 String reverS="";
		 for(int j=S.length()-1;j>=0;j--) {
			 char ch = S.charAt(j);
	    	 if(Character.isLetter(ch)) {
	    		 reverS+=(ch+"");
	    	 }
		 }
		 String s ="";
		 char ch = ' ';
		 int n =0; //差值
		 int m=0; // 开始位置
		 int start = 0;
		 int end =0;
	     for(int i=0;i<S.length();i++) {
	    	 ch = S.charAt(i);
	    	 if(!Character.isLetter(ch)) {
	    		n = i-m;	
	    		end=start+n;	 
	    		s+= reverS.substring(start,end);
	    		s+=(ch+"");	 
	    		start = end;
	    		 m=i+1;
	    	 } else {
	    		 if(i==S.length()-1) {
		    		 s+=reverS.substring(start);
		    	 }
	    	 }
	    	 
	    	 
	     }
	     return s;
	 }
	 // 496 下一个更大元素1
	 public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
	       
	       List<Integer> list = new ArrayList<Integer> ();
	       int j=0;
	       for(int i=0;i<nums1.length;i++) {
	    	   for(int k=0;k<nums2.length;k++) {
	    		   if(nums1[i] == nums2[k]) {
	    			   j = k+1;
	    			   if(k==nums2.length-1) {
	    				   list.add(-1);
	    			   } else {
	    				   while(j<nums2.length) {
		    				   if(nums2[j]>nums1[i]) {
		    					   list.add(nums2[j]);
		    					   j=nums2.length;
		    				   }
		    				   if(j==nums2.length-1) {
		    					   list.add(-1);
		    				   }
		    				   j++;
		    			   }
	    			   }
	    			   
	    		   }
	    	   }
	       }
	       System.out.println(list);
	       int res[] =new int[list.size()];
	       for(int i=0;i<list.size();i++) {
	    	   res[i] =list.get(i);
	       }
	       return res;
	 }
	 // 812 最大三角形
	 public double largestTriangleArea(int[][] points) {
		 double a = 0;
		 double b = 0;
	    for(int i=0;i<points.length-1;i++) {
	    	a=points[i][0]>points[i+1][0]?points[i][0]:points[i+1][0];
	    	b=points[i][1]>points[i+1][1]?points[i][1]:points[i+1][1];
	    }
	    a = points[points.length-1][0]>a?points[points.length-1][0]:a;
	    b = points[points.length-1][1]>a?points[points.length-1][1]:a;
	    return (double)(a+b)/2;
	 }
	 //541反转字符串
	 public static String reverseStr(String s, int k) {
	    String res = "";
	    int start = 0;
	    String firstTwo = "";
	    String lastTwo ="";
	    String ss ="";
	    String ss1=s;
	    
	    if(ss1.length()<k*2) {
    		if(ss1.length()<k) {
	    		res+=new StringBuilder(ss1).reverse().toString();
	    	} else {
	    		ss1=new StringBuilder(ss1.substring(0,k)).reverse().toString() + ss1.substring(k);
	    		res+=ss1;
	    		ss1="";
	    	}
    	} else {
    		while((k*2)<=ss1.length()) {
    	    	ss = ss1.substring(start, 2*k);
    	    	ss1=ss1.substring(2*k);
    	    	firstTwo = ss.substring(start,k);
    	    	lastTwo = ss.substring(k,2*k);
    	    	firstTwo =new StringBuilder(firstTwo).reverse().toString();
    	    	res+=(firstTwo+lastTwo);
    	    	if(ss1.length()<k*2) {
    	    		if(ss1.length()<k) {
    		    		res+=new StringBuilder(ss1).reverse().toString();
    		    	} else {
    		    		ss1=new StringBuilder(ss1.substring(0,k)).reverse().toString() + ss1.substring(k);
    		    		res+=ss1;
    		    		ss1="";
    		    	}
    	    	}
    	    }
    	}
	    return res;
	 }
	 // 字符串相加
	 public String addStrings(String num1, String num2) {
	    StringBuilder sb = new StringBuilder();
	    int len1 = num1.length();
	    int len2 = num2.length();
	    int a =0;
	    while(len1!=0||len2!=0||a!=0) {
	    	if(len1>0) {
	    		len1--;
	    		a+=num1.charAt(len1)-'0';
	    	}
	    	if(len2>0) {
	    		len2--;
	    		a+=num2.charAt(len2)-'0';
	    	}
	    	sb.append(a%10);
	    	a/=10;
	    }
	    return sb.reverse().toString();
	 }
	 // 925长按输入
	 public static boolean isLongPressedName(String name, String typed) {
		 if (name.length() > typed.length()) {
	            return false;
	        }
	        int oldIndex = 0;
	        for (int i = 0; i < name.length(); i++) {
	            char value = name.charAt(i);
	            int j = oldIndex;
	            boolean flag = false;
	            for (; j < typed.length(); j++) {
	                if (typed.charAt(j) == value) {
	                    flag = true;
	                    oldIndex = j + 1;
	                    break;
	                }
	            }
	            if (!flag) {
	                return false;
	            }
	        }
	        return true;
	 }
	 // 459 重复的字符串
	 public static boolean repeatedSubstringPattern(String s) {
		 String sub = "";
		 String res = "";
		 boolean flag = false;
		 int len=0;
		 StringBuilder sb = new StringBuilder(s);
	     for(int i=0;i<s.length();i++) {
	    	 for(int j=i+1;j<s.length();j++) {
	    		 sub = sb.substring(i,j);
	    		 while(len<s.length()) {
		    			res+=sub;
		    			len =len+sub.length();
	    			}
	    	 
	    		 
	    		 len=0;
	    		 if(res.equals(s)) {
	    			 flag = true;
	    			 i=s.length();
	    			 j=s.length();
	    		 }
	    		 res="";
	    	 }
	     }
	     System.out.println(flag);
	     return flag;
	 }
	 // 125 验证回文串
	 public static boolean isPalindrome(String s) {
		 if(s == null) {
			 return true;
		 }
		 StringBuilder sb = new StringBuilder();
		 char a[] = s.toLowerCase().toCharArray();
		 for(int i = 0;i<a.length;i++) {
			if(Character.isLetterOrDigit(a[i])) {
				sb.append(a[i]);
			}
		 }
		 return sb.toString().equals(sb.reverse().toString());
	 }
	 // strStr
	 public static int strStr(String haystack, String needle) {
	     if(needle.length() == 0) {
	         return 0;
	     }
	     if(needle.length()>haystack.length()) {
	         return -1;
	     }
	     int res = -1;
	     int k = 0;
	     String sub ="";
	     char a[] =haystack.toCharArray();
	     for(int i=0;i<a.length;i++) {
	         if(needle.charAt(0) == a[i]) {
	             k = i+needle.length();
	             if( k >= haystack.length()) {
	                 sub =haystack.substring(i);
	             } else {
	                 sub = haystack.substring(i, k);
	             }
	             if(sub.equals(needle)) {
	                 res = i;
	                 i=a.length;
	                 k=a.length;
	             }
	         }
	     }
	     return res;   
	 }
	 // 20 有效的括号
	 public static boolean isValid(String s) {
	     Stack<Character> stack = new Stack<Character>();
	     char ss[] =s.toCharArray();
	     boolean flag = false;
	     if(s.length() == 0) {
	         return true;
	     }
	     if(s.length() == 1) {
	         return false;
	     }
	     for(int i=0;i<ss.length;i++) {
             if(ss[i] == '[' || ss[i] == '{' || ss[i] == '(') {
                 stack.push(ss[i]);
             } else {
                 if(stack.isEmpty()) {
                     i=ss.length;
                     flag= false;
                 } else {
                     if(stack.peek() == '[' && ss[i] == ']') {
                         stack.pop();
                     } else if(stack.peek() == '{' && ss[i] == '}') {
                         stack.pop();
                     } else if(stack.peek() == '(' && ss[i] == ')') {
                         stack.pop();
                     } else {
                         i=ss.length;
                         flag= false;
                     }
                     if(stack.isEmpty()) {
                         flag = true;
                     } else {
                         flag =  false;
                     }
                 }
                 
             }
	       }
	    
	     return flag;
	 }
}

