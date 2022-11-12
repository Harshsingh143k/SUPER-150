package Assignment01;

public class Q01 {

    /*
    queastion 1
        import java.util.*;
    public class Main {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int i=1;
            int lspace=0;
            int digit=0;
            int rspace=0;
            while(i<=n){
                if(i<=n/2+1){
                    lspace=n-i-i+1;
                    while(lspace>0){
                        System.out.print("  ");
                        lspace--;
                    }
                    digit=i;
                    while(digit>0){
                        System.out.print(digit + " ");
                        digit--;
                    }
                    rspace=i-1;
                    while(rspace>0){
                        System.out.print("  ");
                        rspace--;
                    }
                    rspace=i-2;
                    while(rspace>0){
                        System.out.print("  ");
                        rspace--;
                    }
                    if(i>1){
                        digit=1;
                        while(digit<=i){
                            System.out.print(digit + " ");
                            digit++;
                        }
                    }
                }
                else{
                    lspace=2*i-n-1;
                    while(lspace>0){
                        System.out.print("  ");
                        lspace--;
                    }
                    digit=n-i+1;
                    while(digit>0){
                        System.out.print(digit + " ");
                        digit--;
                    }
                    rspace=n-i;
                    while(rspace>0){
                        System.out.print("  ");
                        rspace--;
                    }
                    rspace=n-i-1;
                    while(rspace>0){
                        System.out.print("  ");
                        rspace--;
                    }
                    if(i<n){
                        digit=1;
                        while(digit<=n-i+1){
                            System.out.print(digit + " ");
                            digit++;
                        }
                    }
                }
                System.out.println();
                i++;
            }
        }
    }
    question 2
    import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int x, y, flg;





        for (x = 1; x <= N; x++) {


            if (x == 1 || x == 0)
                continue;


            flg = 1;

            for (y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    flg = 0;
                    break;
                }
            }

            if (flg == 1)
                System.out.println(x);
        }
    }
}



question3
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int num=0;
		int mul=10;
		while(n>0){
			int rem=n%10;
			num=num*mul+rem;
			n=n/10;
		}
		System.out.println(num);
    }
}


question 4
import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int i=0;
		int k=1;
		while(i!=n1){
			int c = 3*k+2;
			if(c%n2!=0){
				System.out.println(c);
				i++;
			}
			k++;
		}
    }
}

question 5
import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=0;
		int a=1;
		int b=0;
		// int num=
		while(i<n){
			int temp=a+b;
			while(a>0){
				System.out.print(a%10+b%10+" ");
				a=a/10;
				b=b/10;
			}
			b=temp;
			a=temp*10;
			i++;
			System.out.println();
		}
    }
}

question 6
import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=0;
		int digit=0;
		while(i<2*n+1){
			if(i<=n){
				int m=i+1;
				digit=n;
				while(m>0){
					System.out.print(digit+" ");
					digit--;
					m--;
				}
				int space=2*n-2*i-1;
				while(space>0){
					System.out.print("  ");
					space--;
				}
				digit=n-i;
				while(digit<=n){
					if(digit>0){
					System.out.print(digit+" ");
					}
					digit++;
				}
			}
			else{
				int m=2*n-i+1;
				digit=n;
				while(m>0){
					System.out.print(digit+" ");
					digit--;
					m--;
				}
				int space=2*(i-n)-1;
				while(space>0){
					System.out.print("  ");
					space--;
				}
				digit=i-n;
				while(digit<=n){
					if(digit>0){
					System.out.print(digit+" ");
					}
					digit++;
				}
			}
			i++;
			System.out.println();
		}
    }
}


question 7
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int min=sc.nextInt();
		int max=sc.nextInt();
		int step=sc.nextInt();
		while(min<=max){
			int C = ((min-32)*5)/9;
			System.out.println(min+" "+C);
			min=min+step;
		}
    }
}



question 8
import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		while(i<=n){
			int m=i;
			int digit=1;
			while(m>0){
				System.out.print(digit+" ");
				m--;
				digit++;
			}
			int space=2*n-2*i-1;
			while(space>0){
				System.out.print("  ");
				space--;
			}
			m=i;
			digit=i;
			while(m>0){
				if(digit!=n){
				System.out.print(digit+" ");
				}
				m--;
				digit--;
			}
			i++;
			System.out.println();
		}
    }
}


question 9

import java.util.*;
public class Main {
    public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		while(i<2*n-1){
			if(i<n){
				int star=n-i;
				while(star>0){
					System.out.print("*");
					star--;
				}
				int space=2*i-1;
				while(space>0){
					System.out.print(" ");
					space--;
				}
				star=n-i;
				if(i==0){
					star--;
				}
				while(star>0){
					System.out.print("*");
					star--;
				}
			}
			else{
				int star=i-n+2;
				while(star>0){
					System.out.print("*");
					star--;
				}
				int space=(2*n-1)-2*(i-n+2);
				while(space>0){
					System.out.print(" ");
					space--;
				}
				star=i-n+2;
				if(i==2*n-2){
					star--;
				}
				while(star>0){
					System.out.print("*");
					star--;
				}
			}
			i++;
			System.out.println();
		}
    }
}


question 10
import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=0;
		while(i<2*n+1){
			if(i<n+1){
				int space=i;
				while(space>0){
					System.out.print("  ");
					space--;
				}
				int digit=n-i;
				while(digit>=0){
					System.out.print(digit+" ");
					digit--;
				}
				digit=1;
				while(digit<=n-i){
					System.out.print(digit+" ");
					digit++;
				}

			}
			else{
				int space=2*n-i;
				while(space>0){
					System.out.print("  ");
					space--;
				}
				int digit=i-n;
				while(digit>=0){
					System.out.print(digit+" ");
					digit--;
				}
				digit=1;
				while(digit<=i-n){
					System.out.print(digit+" ");
					digit++;
				}
			}
			i++;
			System.out.println();

		}
    }
}
......................................................................................................................

question 11
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		int k=1;
		int c=n-4;
		while(i<n){
			int j=n;
			if(i==0 || i==n-1){
				while(j>0){
					System.out.print("* ");
					j--;
				}
			}
			else if(i<n/2+1){
				int p=n/2-i+1;
				while(p>0){
					System.out.print("* ");
					p--;
				}
				int m=k;
				while(m>0){
					System.out.print("  ");
					m--;
				}
				p=n/2-i+1;
				while(p>0){
					System.out.print("* ");
					p--;
				}
				k+=2;
			}
			else{

				int p=i-n/2+1;
				while(p>0){
					System.out.print("* ");
					p--;
				}
				int m=c;
				while(m>0){
					System.out.print("  ");
					m--;
				}
				p=i-n/2+1;
				while(p>0){
					System.out.print("* ");
					p--;
				}
				c-=2;
			}

			i++;
			System.out.println();

		}

    }
}


question 12
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		long num=0;
		long mul=1;
		while(n>0){
			long rem=(long)n%10;
			long k=(long)(9-rem);
			if(k<rem && !(k==0 && n/10==0)){
				num=k*mul+num;
			}else{
				num=rem*mul+num;
			}
			mul*=10;
			n=n/10;
		}
		System.out.println(num);
    }
}


question 13
import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int space=0;
		int digit=0;
		// int k=2;
		while(i<=n){
			space=n-i;
			while(space>0){
				System.out.print("  ");
				space--;
			}
			int m=i;
			digit=i;
			while(m>0){
				System.out.print(digit+" ");
				digit++;
				m--;
			}
			m=i-1;
			digit-=2;
			while(m>0){
				System.out.print(digit+" ");
				digit--;
				m--;
			}
			i++;
			System.out.println();
		}
    }
}

question 14
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int i=1;
		int space=0;
		int star=0;
		int mul=0;
		while(i<=n){
			if(i<=n/2+1){
				space=n/2-i+1;
				star=2*i-1;
				while(space>0){
					System.out.print("  ");
					space--;
				}
				while(star>0){
					System.out.print("* ");
					star--;
				}

			}
			else{
				space=i-n/2-1;
				star=2*(n-i)+1;
				while(space>0){
					System.out.print("  ");
					space--;
				}
				while(star>0){
					System.out.print("* ");
					star--;
				}
			}
			i++;
			System.out.println();
		}
    }
}


question 15
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=1;
		int i=1;
		while(k<=n){
			int m=k;
			while(m>0){
				System.out.print(i+" ");
				m--;
				i++;
			}
			System.out.println();
			k++;
		}
    }
}


question 16
import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int i=n-1;
		while(i>=0){
			int space=i;
			while(space>0){
				System.out.print(" ");
				space--;
			}
			if(i==0 || i==n-1){
				int k=n;
				while(k>0){
					System.out.print("*");
					k--;
				}
			}
			else{
				int k=n-2;
				System.out.print("*");
				while(k>0){
					System.out.print(" ");
					k--;
				}
				System.out.print("*");
			}
			System.out.println();
			i--;
		}
    }
}

question 17

import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int digit=0;
		while(i<=2*n-1){
			if(i<=n){
				int space=n-i;
				while(space>0){
					System.out.print("  ");
					space--;
				}
				int m=i;
				digit=i;
				while(m>0){
					System.out.print(digit+" ");
					m--;
					digit++;
				}
				m=i-1;
				digit-=2;
				while(m>0){
					System.out.print(digit+" ");
					m--;
					digit--;
				}
			}
			else{
				int space=i-n;
				while(space>0){
					System.out.print("  ");
					space--;
				}
				int m=2*n-i;
				digit=2*n-i;
				while(m>0){
					System.out.print(digit+" ");
					m--;
					digit++;
				}
				m=2*n-i-1;
				digit-=2;
				while(m>0){
					System.out.print(digit+" ");
					m--;
					digit--;
				}
			}
			System.out.println();
			i++;
		}
    }
}

question 18
import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(1);
		int i=2;
		while(i<=n){
			int zero=i-2;
			System.out.print(i+" ");
			while(zero>0){
				System.out.print(0+" ");
				zero--;
			}
			System.out.println(i);
			i++;
		}
    }
}

question 19

import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int a=1;
		int sum=0;
		int i=1;

		while(i<=n){
			int m=i;
			while(m>0){
				System.out.print(sum+" ");
				m--;
				int temp=sum;
				sum+=a;
				a=temp;
			}
			i++;
			System.out.println();
		}
    }
}
question 20
import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt();
		while(k>0){
		int m=sc.nextInt();
		int n=sc.nextInt();
		int i=0;
		int a=0;
		int h=0;
		int flag=0;
		int count=1;
		while(i==0){
			a+=count;
			count++;
			h+=count;
			count++;
			if(a>m){
				flag=1;
				i=1;
			}
			else if(h>n){
				flag=-1;
				i=1;
			}
		}
		if(flag==1){
			System.out.println("Harshit");
		}
		else{
			System.out.println("Aayush");
		}
		k--;
		}
    }
}

question 21

import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		int odd=0;
		int even=0;
		while(n>0){
			int rem=n%10;
			if(i%2==0){
				even+=rem;
			}
			else{
				odd+=rem;
			}
			i++;
			n=n/10;
		}
		System.out.print(odd+"\n"+even);

    }
}
question 22

import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a= sc.nextInt();
		int count=0;
		while(n>0){
			int rem=n%10;
			if(rem==a){
				count++;
			}
			n=n/10;
		}
		System.out.println(count);
    }
}
question 23

import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		for(int i=0;i>=0;i++){
		int n =sc.nextInt();
		sum+=n;
		if(sum>=0){
			System.out.println(n);
		}
		else{
			System.exit(0);
		}
		}

    }
}
question 24

import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a1=sc.nextInt();
		int b2=sc.nextInt();
		int n1=a1;
		int n2=b2;
		while(n2!=0){
			int temp= n2;
			n2=n1%n2;
			n1=temp;
		}
		System.out.println((a1*b2)/n1);
    }
}
question 25
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=0;
		int b=1;
		int i=0;
		while(i<n){
			int temp=b;
			b=a+b;
			a=temp;
			i++;
		}
		System.out.println(a);
    }
}


question 26

import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=0;
		int num=0;
		while(n>0){
			int rem = n%10;
			k+=1;
			int p=k;
			while(rem-->1){
				p*=10;
			}
			num+=p;
			n=n/10;
		}
		System.out.print(num);
    }
}

question 27

import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int k= sc.nextInt();
		for(int i=0;i<k;i++){
			int n=sc.nextInt();
			int sum1=0;
			int sum2=0;
			int rem=0;
			while(n>0){
				rem=n%10;
				if(rem%2==0){
					sum1+=rem;
				}
				else{
					sum2+=rem;
				}
				n=n/10;
			}
			if(sum1%4==0 || sum2%3==0){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}

		}
    }
}
question 28
import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==2){
			System.out.println("Prime");
		}
		int i=2;
		int flag=0;
		while(i<=n/2){
			if(n%i==0){
				flag=1;
			}
			i++;
		}
		if(flag==1){
			System.out.println("Not Prime");
		}
		else{
			System.out.println("Prime");
		}
    }
}

question 29
import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		while(n2!=0){
			int temp=n2;
			n2=n1%n2;
			n1=temp;
		}
		System.out.println(n1);
    }
}


     */
}
