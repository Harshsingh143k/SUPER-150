//package assignment;
//
//public class programs {
//
////    q1
//    import java.util.*;
//    public class Main {
//        public static long Kthroot(long n,long k){
//            long si=1;
//            long ei=n;
//            long ans=0;
//            while(si<=ei){
//                long mid=(ei-si)/2+si;
//                if(Math.pow(mid,k)<=n){
//                    ans=mid;
//                    si=mid+1;
//                }
//                else{
//                    ei=mid-1;
//                }
//            }
//            return ans;
//        }
//        public static void main(String args[]) {
//            Scanner sc=new Scanner(System.in);
//            int t=sc.nextInt();
//            while(t-->0){
//                long n=sc.nextLong();
//                long k=sc.nextLong();
//                System.out.println(Kthroot(n,k));
//            }
//        }
//    }
//
//
////    q2
// import java.util.*;
//    public class Main {
//        public static boolean isitpossible(int[] arr,int mint,int nop){
//            for(int i=0;i<arr.length;i++){
//                int tm=0;
//                int ct=1;
//                while(tm+ct*arr[i]<=mint && nop>0){
//                    tm+=ct*arr[i];
//                    nop--;
//
//                    ct++;
//                }
//                if(nop==0){
//                    return true;
//                }
//            }
//            return false;
//        }
//        public static int minimum(int[] arr,int nop){
//            int si=0;
//            int ei=100000000;
//            int ans=0;
//            while(si<=ei){
//                int mid=(ei-si)/2+si;
//                if(isitpossible(arr,mid,nop)){
//                    ans=mid;
//                    ei=mid-1;
//                }
//                else{
//                    si=mid+1;
//                }
//            }
//            return ans;
//        }
//        public static void main(String args[]) {
//            Scanner sc=new Scanner(System.in);
//            int n=sc.nextInt();// no of parathas ordered
//            int L=sc.nextInt();// no of cooks
//            int[] arr=new int[L];
//            for(int i=0;i<L;i++){// rank of a cook
//                arr[i]=sc.nextInt();
//            }
//            System.out.println(minimum(arr,n));
//        }
//    }
//
////    q3
//    import java.util.*;
//    public class Main {
//        public static void main(String args[]) {
//            Scanner sc = new Scanner(System.in);
//            int n= sc.nextInt();
//            int[] arr = new int[n];
//            for(int i=0;i<n;i++){
//                arr[i]=sc.nextInt();
//            }
//            int k=sc.nextInt();
//            int left=0;
//            int right=n;
//            int mid=(left+right)/2;
//            int p=-1;
//            while(left<right){
//                if(arr[mid]==k){
//                    p=mid;
//                    break;
//                }
//                else if(arr[mid]<k){
//                    left=mid;
//                }
//                else{
//                    right=mid;
//                }
//                if(mid==(left+right)/2){
//                    mid=-1;
//                    break;
//                }
//                mid=(left+right)/2;
//            }
//            System.out.println(mid);
//        }
//    }
////    q4
//    import java.util.*;
//    public class Main {
//        public static void main(String args[]) {
//            Scanner sc = new Scanner(System.in);
//            int t = sc.nextInt();
//            for(int i=0;i<t;i++){
//                int n=sc.nextInt();
//                int arr[] = new int[n];
//                int j=0;
//                for(j=0;j<n;j++){
//                    arr[j]=sc.nextInt();
//                }
//                int[] left = new int[n];
//                int[] right = new int[n];
//                left[0]=arr[0];
//                for(j=1;j<n;j++){
//                    if(arr[j]>left[j-1]){
//                        left[j]=arr[j];
//                    }
//                    else{
//                        left[j]=left[j-1];
//                    }
//                }
//                right[n-1]=arr[n-1];
//                for(j=n-2;j>=0;j--){
//                    if(arr[j]<right[j+1]){
//                        right[j]=right[j+1];
//                    }
//                    else{
//                        right[j]=arr[j];
//                    }
//                }
//                int sum=0;
//                for(j=0;j<n;j++){
//                    sum+=Math.min(left[j],right[j])-arr[j];
//                }
//                System.out.println(sum);
//            }
//        }
//    }
////    q5
//    import java.util.*;
//    public class Main {
//        public static void main(String args[]) {
//            // Your Code Here
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            int[] arr= new int[n];
//
//            for(int i=0;i<n;i++){
//                arr[i]=sc.nextInt();
//            }
//            int m=sc.nextInt();
//            int k=-1;
//            for(int i=0;i<n;i++){
//                if(arr[i]==m){
//                    k=i;
//                    break;
//                }
//            }
//            System.out.println(k);
//
//        }
//    }
////q6
//    import java.util.*;
//    public class Main {
//        public static void main (String args[]) {
//            Scanner sc = new Scanner(System.in);
//            long n = sc.nextInt();
//
//            long left=0;
//            long right=n;
//            long mid=n/2;
//            while(left<right){
//                if(mid*mid==n){
//                    break;
//                }
//                else if(mid*mid>n){
//                    right=mid;
//                }
//                else{
//                    left=mid;
//                }
//                if(mid==(left+right)/2){
//                    break;
//                }
//                mid=(left+right)/2;
//            }
//            if(n==1){
//                mid=1;
//            }
//            System.out.println(mid);
//        }
//    }
////    q8
//    import java.util.*;
//    public class Main {
//        public static void reverserange(int[] arr,int si,int ei){
//            while(si<=ei){
//                int temp=arr[si];
//                arr[si]=arr[ei];
//                arr[ei]=temp;
//                si++;
//                ei--;
//            }
//        }
//        public static void nextPermutation(int[] arr){
//            int p=0;
//            int q=0;
//            for(int i=arr.length-2;i>=0;i--){
//                if(arr[i]<arr[i+1]){
//                    p=i;
//                    break;
//                }
//            }
//            for(int i=arr.length-1;i>p;i--){
//                if(arr[i]>arr[p]){
//                    q=i;
//                    break;
//                }
//            }
//            if(p==0 && q==0){
//                reverserange(arr,0,arr.length-1);
//                return ;
//            }
//            int temp=arr[p];
//            arr[p]=arr[q];
//            arr[q]=temp;
//            reverserange(arr,p+1,arr.length-1);
//        }
//        public static void main(String args[]) {
//            Scanner sc=new Scanner(System.in);
//            int t=sc.nextInt();
//            while(t-->0){
//                int n=sc.nextInt();
//                int[] arr=new int[n];
//                for(int i=0;i<n;i++){
//                    arr[i]=sc.nextInt();
//                }
//                nextPermutation(arr);
//                for(int i=0;i<n;i++){
//                    System.out.print(arr[i]+" ");
//                }
//                System.out.println();
//            }
//        }
//    }
////    q9
////
//    import java.util.*;
//
//
//import java.util.Scanner;
//
//    public class Main {
//        public static int help(int[] a,int[] b,int c1,int c2,int c3,int c4,int n,int m ){
//            int cost2=0,cost3=0,cost4;
//            for(int i=0;i<a.length;i++){
//                cost2+=(Math.min(a[i]*c1,c2));
//            }
//            cost3=Math.min(cost2,c3);
//            cost2=0;
//            for(int i=0;i<b.length;i++){
//                cost2+=(Math.min(b[i]*c1,c2));
//            }
//            cost3+=Math.min(cost2,c3);
//            cost4=Math.min(cost3,c4);
//            return cost4;
//        }
//        public static void main(String[] args) {
//            Scanner sc=new Scanner(System.in);
//            int t=sc.nextInt();
//            while(t-->0){
//                int c1=sc.nextInt();
//                int c2=sc.nextInt();
//                int c3=sc.nextInt();
//                int c4=sc.nextInt();
//                int n= sc.nextInt();
//                int m=sc.nextInt();
//                int[] a=new int[n];
//                for(int i=0;i<n;i++){
//                    a[i]=sc.nextInt();
//                }
//                int[] b=new int[m];
//                for(int i=0;i<m;i++){
//                    b[i]=sc.nextInt();
//                }
//
//                System.out.println(help(a,b,c1,c2,c3,c4,n,m));
//            }
//        }
//    }
////    q10
//    import java.util.*;
//    public class Main {
//        public static void main(String args[]) {
//            Scanner sc =new Scanner(System.in);
//            int n=sc.nextInt();
//            int arr[]=new int[n];
//            for(int i=0;i<arr.length;i++){
//                arr[i]=sc.nextInt();
//            }
//            int[] ans=new int[n];
//            int c=0;
//            for(int i=0;i<n;i++){
//                if(arr[i]==0){
//                    ans[c]=arr[i];
//                    c++;
//                }
//            }
//            for(int i=0;i<n;i++){
//                if(arr[i]==1){
//                    ans[c]=arr[i];
//                    c++;
//                }
//            }
//            for(int i=0;i<n;i++){
//                if(arr[i]==2){
//                    ans[c]=arr[i];
//                    c++;
//                }
//            }
//            for(int i=0;i<n;i++){
//                System.out.print(ans[i]+" ");
//            }
//        }
//    }
////    q11
//    import java.util.*;
//    public class Main {
//        public static void printtriplet(int[] arr,int tar){
//            Arrays.sort(arr);
//            for(int i=0;i<arr.length;i++){
//                for(int j=i+1;j<arr.length;j++){
//                    int sum=arr[i]+arr[j];
//                    int  find=tar-sum;
//                    if(search(find,arr,j+1)){
//                        System.out.println(arr[i]+", "+arr[j]+" and "+find);
//
//                    }
//                }
//            }
//        }
//        public static boolean search(int find,int[] arr,int start){
//            for(int i=start;i<arr.length;i++){
//                if(arr[i]==find){
//                    return true;
//                }
//            }
//            return false;
//        }
//        public static void main(String args[]) {
//            Scanner sc=new Scanner(System.in);
//            int n=sc.nextInt();
//            int[] arr=new int[n];
//            for(int i=0;i<n;i++){
//                arr[i]=sc.nextInt();
//            }
//            int tar=sc.nextInt();
//            printtriplet(arr,tar);
//        }
//    }
//
////    q12
//    import java.util.*;
//    public class Main {
//        public static void main(String args[]) {
//            Scanner sc =new Scanner(System.in);
//            int n=sc.nextInt();
//            int arr[]=new int[n];
//            for(int i=0;i<n;i++){
//                arr[i]=sc.nextInt();
//            }
//            Arrays.sort(arr);
//            int t=sc.nextInt();
//            for(int i=0;i<n;i++){
//                for(int j=i+1;j<n;j++){
//                    if(arr[i]+arr[j]==t){
//                        System.out.println(arr[i] +" and "+arr[j]);
//                    }
//                }
//            }
//        }
//    }
////    q13
//
////    q14
//    import java.util.*;
//    public class Main {
//        public static void printpair(int[] arr,int dr){
//            Arrays.sort(arr);
//            int r1=0,r2=0;
//            int min=Integer.MAX_VALUE,c=0,diff=0;
//            for(int i=0;i<arr.length;i++){
//
//                for(int j=i+1;j<arr.length;j++){
//                    if(arr[i]+arr[j]==dr){
//
//                        diff=Math.abs(arr[i]-arr[j]);
//                        if(diff<min){
//                            min=diff;
//                            r1=arr[i];
//                            r2=arr[j];
//                        }
//
//
//                    }
//                }
//
//            }
//            System.out.println("Deepak should buy roses whose prices are "+r1+" and "+r2+".");
//        }
//        public static void main(String args[]) {
//            Scanner sc=new Scanner(System.in);
//            int t=sc.nextInt();
//            while(t-->0){
//                int n=sc.nextInt();// no of avalable roses
//                int[] arr=new int[n];// prices of avalable roses
//                for(int i=0;i<n;i++){
//                    arr[i]=sc.nextInt();
//                }
//                int deepkM=sc.nextInt();//
//
//                printpair(arr,deepkM);
//
//            }
//        }
//    }
////    q15
//import java.util.*;
//
//
//    public class Main {
//
//        public static void main(String[] args) {
//            // TODO Auto-generated method stub
//            Scanner sc = new Scanner(System.in);
//
//            int nos = sc.nextInt();
//            int noc = sc.nextInt();
//            int[] stalls = new int[nos];
//            for (int i = 0; i < stalls.length; i++) {
//                stalls[i] = sc.nextInt();
//            }
//            Arrays.sort(stalls);
//            System.out.println(largestminimumdistance(stalls, noc));
//
//        }
//
//        public static int largestminimumdistance(int[] stalls, int noc) {
//
//            int lo = 0;
//            int hi = stalls[stalls.length - 1] - stalls[0];
//            int ans = 0;
//            while (lo <= hi) {
//                int mid = (lo + hi) / 2;
//                if (isitpossible(stalls, mid, noc) == true) {
//                    ans = mid;
//                    lo = mid + 1;
//                } else {
//                    hi = mid - 1;
//                }
//            }
//            return ans;
//
//        }
//
//        public static boolean isitpossible(int[] stalls, int mid, int noc) {
//
//            int cow = 1;
//            int pos = stalls[0];
//            int i = 1;
//            while (i < stalls.length) {
//                if (stalls[i] - pos >= mid) {
//                    cow++;
//                    pos = stalls[i];
//                }
//
//                if (cow >= noc) {
//                    return true;
//                }
//                i++;
//            }
//            return false;
//        }
//
//    }
////    q16
//import java.util.Scanner;
//
//    public class Main {
//
//        public static void main(String[] args) {
//
//            Scanner sc = new Scanner(System.in);
//            int k = sc.nextInt(); // no. of painters
//            int n = sc.nextInt(); // no. of boards
//            int[] boards = new int[n];
//            for (int i = 0; i < boards.length; i++)
//                boards[i] = sc.nextInt();
//            System.out.println(minTime(boards, n, k));
//            sc.close();
//
//        }
//
//        public static int getMax(int arr[], int n) {
//            int max = Integer.MIN_VALUE;
//            for (int i = 0; i < n; i++)
//                if (arr[i] > max)
//                    max = arr[i];
//            return max;
//        }
//
//        public static int getSum(int arr[], int n) {
//            int total = 0;
//            for (int i = 0; i < n; i++)
//                total += arr[i];
//            return total;
//        }
//
//        static int numberOfPainters(int arr[], int n, int maxLen) {
//            int total = 0, numPainters = 1;
//
//            for (int i = 0; i < n; i++) {
//                total += arr[i];
//
//                if (total > maxLen) {
//
//                    total = arr[i];
//                    numPainters++;
//                }
//            }
//
//            return numPainters;
//        }
//
//        public static int minTime(int arr[], int n, int k) {
//            int lo = getMax(arr, n);
//            int hi = getSum(arr, n);
//
//            while (lo < hi) {
//                int mid = lo + (hi - lo) / 2;
//                int requiredPainters = numberOfPainters(arr, n, mid);
//                if (requiredPainters <= k)
//                    hi = mid;
//                else
//                    lo = mid + 1;
//            }
//            return lo;
//        }
//
//    }
////    q17
//import java.util.*;
//    public class Main {
//        public static int mcs(int[] arr){
//            int totalsum=0;
//            for(int i=0;i<arr.length;i++){
//                totalsum+=arr[i];
//            }
//            // int curr_max=arr[0],max_so_far=arr[0],curr_min=arr[0],min_so_far=arr[0];
//            int sum=0,maxsum=0,msum=0,minsum=0;
//            for(int i=0;i<arr.length;i++){
//                sum=Math.max(arr[i],sum+arr[i]);
//                maxsum=Math.max(sum,maxsum);
//
//                msum=Math.min(arr[i],msum+arr[i]);
//                minsum=Math.min(msum,minsum);
//
//            }
//
//            if(minsum==totalsum){
//                return maxsum;
//            }
//            return Math.max(maxsum,totalsum-minsum);
//        }
//        public static void main(String[] args) {
//            Scanner sc=new Scanner(System.in);
//            int t=sc.nextInt();
//            while(t-->0){
//                int n=sc.nextInt();
//                int[] arr=new int[n];
//                for(int i=0;i<n;i++){
//                    arr[i]=sc.nextInt();
//                }
//                System.out.println(mcs(arr));
//            }
//        }
//    }
//
//
//
//
//}
////q18
//import java.util.Scanner;
//
//public class Main {
//    public static boolean check(int[] arr,int a,int b){
//        int c=0;
//        for(int i=0;i<arr.length;i++){
//            if(a%arr[i]==0) {
//                c++;
//            }
//        }
//        if(c>=b){
//            return true;
//        }
//        return false;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        int q=sc.nextInt();
//        while(q-->0){
//            int a=sc.nextInt();
//            int b=sc.nextInt();
//            if(check(arr,a,b)){
//                System.out.println("Yes");
//            }
//            else{
//                System.out.println("No");
//            }
//        }
//    }
//}
////q19
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner sc=new Scanner(System.in);
//        int t=sc.nextInt();
//        for(int l=0;l<t;l++){
//            int n=sc.nextInt();
//            int nos=sc.nextInt();
//            int[] page=new int[n];
//            for(int i=0;i<n;i++){
//                page[i]=sc.nextInt();
//            }
//            System.out.println(minpage(page, nos));}
//
//    }
//
//    public static int minpage(int[] page, int nos) {
//        int hi = 0;
//        for (int i = 0; i < page.length; i++) {
//            hi += page[i];
//        }
//        int lo = 0;
//        int ans = 0;
//
//        while (lo <= hi) {
//            int mid = (lo + hi) / 2;
//            if (isitpossible(page, mid, nos) == true) {
//                ans = mid;
//                hi = mid - 1;
//            } else {
//                lo = mid + 1;
//            }
//        }
//        return ans;
//
//    }
//
//    private static boolean isitpossible(int[] page, int mid, int nos) {
//        // TODO Auto-generated method stub
//        int s = 1;
//        int reapapge = 0;
//        int i = 0;
//        while (i < page.length) {
//            if (reapapge + page[i] <= mid) {
//                reapapge += page[i];
//                i++;
//            } else {
//                reapapge = 0;
//                s++;
//
//            }
//            if (s > nos) {
//                return false;
//            }
//        }
//
//        return true;
//
//    }
//
//}
////q20
//import java.util.*;
//public class Main {
//    public static void main (String args[]) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        long[] arr=new long[n];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=sc.nextLong();
//        }
//        long[] lp=new long[n];
//        long[] rp=new long[n];
//        lp[0]=1;
//        for(int i=1;i<lp.length;i++){
//            lp[i]=arr[i-1]*lp[i-1];
//        }
//        rp[arr.length-1]=1;
//        for(int i=arr.length-2;i>=0;i--){
//            rp[i]=arr[i+1]*rp[i+1];
//        }
//        long[] ans=new long[n];
//        for(int i=0;i<n;i++){
//            ans[i]=lp[i]*rp[i];
//        }
//        for(int i=0;i<ans.length;i++){
//            System.out.print(ans[i]+" ");
//        }
//    }
//}
////q21
//import java.util.*;
//public class Main {
//
//    public static void main(String args[]) {
//        Scanner sc =new Scanner(System.in);
//        int n=sc.nextInt();
//        int arr[]=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        int[] ans=new int[n];
//        for(int i=0;i<n;i++){
//            ans[arr[i]]=i;
//        }
//        for(int i=0;i<n;i++){
//            System.out.print(ans[i]+" ");
//        }
//    }
//
//}
////q22
//import java.util.*;
//public class Main {
//    public static void main(String args[]) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        long[] arr=new long[n];
//        long[] ans=new long[n];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=sc.nextLong();
//        }
//        for(int i=0;i<arr.length;i++){
//            ans[i]=arr[i];
//        }
//        long q=sc.nextLong();
//        while(q-->0){
//            int k=sc.nextInt();
//            int pos=0;
//            for(int i=0;i<arr.length;i++){
//                pos=(arr.length+i-k)%arr.length;
//                ans[i]+=arr[pos];
//            }
//            for(int i=0;i<arr.length;i++){
//                arr[i]=ans[i];
//            }
//        }
//        long sum1=0;
//        for(int i=0;i<arr.length;i++){
//            sum1+=arr[i];
//        }
//        System.out.println((long)(sum1%(Math.pow(10,9)+7)));
//    }
//}
////q23
//import java.util.*;
//public class Main {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m=sc.nextInt();
//        for(int i=1;i<n;i++){
//            int p=sc.nextInt();
//            if(m<p){
//                m=p;
//            }
//        }
//        System.out.println(m);
//    }
//}
////q24
//import java.util.*;
//public class Main {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        for(int i=0;i<n/2;i++){
//            int temp=arr[i];
//            arr[i]=arr[n-1-i];
//            arr[n-1-i]=temp;
//        }
//        for(int i=0;i<n;i++){
//            System.out.println(arr[i]);
//        }
//    }
//}