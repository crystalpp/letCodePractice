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
		findTheDifference("abcd","abcde");
		
	}
	public static void myprint(int[] a) {
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
		 return (char) ((sum2-sum1)-'a');
		
	 }
}

