import java.io.IOException;
import java.util.Scanner;
class myhello
{
public static char bloc[]=new char[] {'0','1','2','3','4','5','6','7','8','9'};
public static int chance=1;
public static int ch=1;
public static int snd=0;
public static int chr;
public static void main(String... arg) throws IOException,InterruptedException
{
myhello my=new myhello();
block b=my.new block();
int q=1;
toSend s=my.new toSend();
int j=1;
int num=0;
b.print();
computer cc=my.new computer();
while(num<=9)
{
switch(q)
{
case 1:
{
new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
System.out.println("computer chance done");
cc.printcom();
b.print();
q=2;
++num;
++snd;
ch=1;
break;
}
case 2:
{
System.out.println("Enter the number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a=48+n;
char i=(char)a;
s.getnum(i);
if(snd==1)
 {
 chr=n;
 }
b.print();
q=1;
++num;
ch=2;
break;
}
}
 
}
}

class block 
{
public void print()
 {
  myhello mm=new myhello();
	System.out.println("	|	|");
	System.out.println("    "+mm.bloc[1]+"   |   "+mm.bloc[2]+"   |   "+mm.bloc[3]);
	System.out.println("	|	|");
	System.out.println(" -----------------------");
	System.out.println("	|	|");
	System.out.println("    "+mm.bloc[4]+"   |   "+mm.bloc[5]+"   |   "+mm.bloc[6]);
	System.out.println("	|	|");
	System.out.println(" -----------------------");
	System.out.println("	|	|");
	System.out.println("    "+mm.bloc[7]+"   |   "+mm.bloc[8]+"   |   "+mm.bloc[9]);
	System.out.println("	|	|");
 }
}


class toSend
{
void getnum(char a)
{
myhello my=new myhello();
char m='O';
if(a=='1' && my.bloc[1]=='1')
 my.bloc[1]=m;

else if(a=='2' && my.bloc[2]=='2')
 my.bloc[2]=m;

else if(a=='3' && my.bloc[3]=='3')
 my.bloc[3]=m;

else if(a=='4' && my.bloc[4]=='4')
 my.bloc[4]=m;

else if(a=='5' && my.bloc[5]=='5')
 my.bloc[5]=m;

else if(a=='6' && my.bloc[6]=='6')
 my.bloc[6]=m;

else if(a=='7' && my.bloc[7]=='7')
 my.bloc[7]=m;

else if(a=='8' && my.bloc[8]=='8')
 my.bloc[8]=m;

else if(a=='9' && my.bloc[9]=='9')
 my.bloc[9]=m;
}
}


class computer
{
void printcom()
{
myhello mn=new myhello();
int p=1;
while(p>=1)
{
if(mn.chance==1)
{
mn.bloc[1]='X';
mn.chance=2;
//System.out.println(chr);
return;
}

switch(chr)
{
 case 3:
{

if(mn.bloc[1]=='X' && mn.bloc[3]=='O' && mn.bloc[2]=='2' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='7' && mn.bloc[8]=='8' && mn.bloc[9]=='9')
{
mn.bloc[9]='X';
return;
}

if(mn.bloc[2]=='O' && mn.bloc[3]=='O' && mn.bloc[9]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='7' && mn.bloc[8]=='8')
{
mn.bloc[5]='X';//after 1 step, put 0 @ 2
return;
}

if(mn.bloc[2]=='2' && mn.bloc[3]=='O' && mn.bloc[9]=='X' && mn.bloc[4]=='O' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='7' && mn.bloc[8]=='8')
{
mn.bloc[5]='X'; //after 1 step, put 0 @ 4
return;
}

if(mn.bloc[2]=='2' && mn.bloc[3]=='O' && mn.bloc[9]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='O' && mn.bloc[7]=='7' && mn.bloc[8]=='8')
{
mn.bloc[5]='X'; //after 1 step, put 0 @ 6
return;
}

if(mn.bloc[2]=='2' && mn.bloc[3]=='O' && mn.bloc[9]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='O' && mn.bloc[8]=='8')
{
mn.bloc[5]='X'; //after 1 step, put 0 @ 7
return;
}

if(mn.bloc[2]=='2' && mn.bloc[3]=='O' && mn.bloc[9]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='7' && mn.bloc[8]=='O')
{
mn.bloc[5]='X'; //after 1 step, put 0 @ 8
return;
}

 if(mn.bloc[2]=='2' && mn.bloc[3]=='O' && mn.bloc[4]=='4' && mn.bloc[5]=='O' && mn.bloc[6]=='6' && mn.bloc[7]=='7' && mn.bloc[8]=='8' && mn.bloc[9]=='X')
{
mn.bloc[7]='X'; //to put 0  @ 5
return;
}

if(mn.bloc[2]=='O' && mn.bloc[3]=='O' && mn.bloc[9]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='O' && mn.bloc[6]=='6' && mn.bloc[7]=='X' && mn.bloc[8]=='8')
{
mn.bloc[4]='X'; //after 3 step, put 0 @ 2
return;
}

if(mn.bloc[2]=='2' && mn.bloc[3]=='O' && mn.bloc[9]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='O' && mn.bloc[6]=='O' && mn.bloc[7]=='X' && mn.bloc[8]=='8')
{
mn.bloc[8]='X'; //after 3 step, put 0 @ 2
return;
}

 if(mn.bloc[2]=='2' && mn.bloc[3]=='O' && mn.bloc[9]=='X' && mn.bloc[4]=='O' && mn.bloc[5]=='O' && mn.bloc[6]=='6' && mn.bloc[7]=='X' && mn.bloc[8]=='8')
{
mn.bloc[8]='X'; //after 3 step, put 0 @ 4
return;
}

if(mn.bloc[2]=='2' && mn.bloc[3]=='O' && mn.bloc[9]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='O' && mn.bloc[6]=='6' && mn.bloc[7]=='X' && mn.bloc[8]=='O')
{
mn.bloc[4]='X'; //after 3 step, put 0 @ 8
return;
}

else 
{
p=-1;
}

}

case 4:
{

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='3' && mn.bloc[4]=='O' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='7' && mn.bloc[8]=='8' && mn.bloc[9]=='9')
{
mn.bloc[3]='X'; 
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='X' && mn.bloc[4]=='O' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='O' && mn.bloc[8]=='8' && mn.bloc[9]=='9')
{
mn.bloc[2]='X'; // after step 1 put 0 @ 7
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='X' && mn.bloc[4]=='O' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='7' && mn.bloc[8]=='O' && mn.bloc[9]=='9')
{
mn.bloc[2]='X'; // after step 1 put 0 @ 8
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='X' && mn.bloc[4]=='O' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='7' && mn.bloc[8]=='8' && mn.bloc[9]=='O')
{
mn.bloc[2]='X'; // after step 1 put 0 @ 9
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='X' && mn.bloc[4]=='O' && mn.bloc[5]=='O' && mn.bloc[6]=='6' && mn.bloc[7]=='7' && mn.bloc[8]=='8' && mn.bloc[9]=='9')
{
mn.bloc[2]='X'; // after step 1 put 0 @ 5
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='X' && mn.bloc[4]=='O' && mn.bloc[5]=='5' && mn.bloc[6]=='O' && mn.bloc[7]=='7' && mn.bloc[8]=='8' && mn.bloc[9]=='9')
{
mn.bloc[2]='X'; // after step 1 put 0 @ 6
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='X' && mn.bloc[4]=='O' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='7' && mn.bloc[8]=='8' && mn.bloc[9]=='9')
{
mn.bloc[9]='X'; // after step 2 put 0 @ 2
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='X' && mn.bloc[4]=='O' && mn.bloc[5]=='O' && mn.bloc[6]=='6' && mn.bloc[7]=='7' && mn.bloc[8]=='8' && mn.bloc[9]=='X')
{
mn.bloc[6]='X'; // after step 3 put 0 @ 5
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='X' && mn.bloc[4]=='O' && mn.bloc[5]=='5' && mn.bloc[6]=='O' && mn.bloc[7]=='7' && mn.bloc[8]=='8' && mn.bloc[9]=='X')
{
mn.bloc[5]='X'; // after step 3 put 0 @ 6
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='X' && mn.bloc[4]=='O' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='O' && mn.bloc[8]=='8' && mn.bloc[9]=='X')
{
mn.bloc[5]='X'; // after step 3 put 0 @ 7
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='X' && mn.bloc[4]=='O' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='7' && mn.bloc[8]=='O' && mn.bloc[9]=='X')
{
mn.bloc[6]='X'; // after step 3 put 0 @ 5
return;
}
else 
{
p=-1;
}

}

case 6:
{

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='3' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='O' && mn.bloc[7]=='7' && mn.bloc[8]=='8' && mn.bloc[9]=='9')
{
mn.bloc[3]='X';
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='X' && mn.bloc[4]=='O' && mn.bloc[5]=='5' && mn.bloc[6]=='O' && mn.bloc[7]=='7' && mn.bloc[8]=='8' && mn.bloc[9]=='9')
{
mn.bloc[2]='X'; // after step 1 put 0 @ 4
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='O' && mn.bloc[6]=='O' && mn.bloc[7]=='7' && mn.bloc[8]=='8' && mn.bloc[9]=='9')
{
mn.bloc[2]='X'; // after step 1 put 0 @ 5
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='O' && mn.bloc[7]=='O' && mn.bloc[8]=='8' && mn.bloc[9]=='9')
{
mn.bloc[2]='X'; // after step 1 put 0 @ 7
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='O' && mn.bloc[7]=='7' && mn.bloc[8]=='O' && mn.bloc[9]=='9')
{
mn.bloc[2]='X'; // after step 1 put 0 @ 8
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='O' && mn.bloc[7]=='7' && mn.bloc[8]=='8' && mn.bloc[9]=='O')
{
mn.bloc[2]='X'; // after step 1 put 0 @ 9
return;
}


if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='O' && mn.bloc[7]=='7' && mn.bloc[8]=='8' && mn.bloc[9]=='9')
{
mn.bloc[7]='X'; // after step 2 put 0 @ 2**********
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='X' && mn.bloc[4]=='O' && mn.bloc[5]=='5' && mn.bloc[6]=='O' && mn.bloc[7]=='X' && mn.bloc[8]=='8' && mn.bloc[9]=='9')
{
mn.bloc[5]='X'; // after step 3 put 0 @ 4
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='O' && mn.bloc[7]=='X' && mn.bloc[8]=='O' && mn.bloc[9]=='9')
{
mn.bloc[4]='X'; // after step 3 put 0 @ 8
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='O' && mn.bloc[7]=='X' && mn.bloc[8]=='8' && mn.bloc[9]=='9')
{
mn.bloc[4]='X'; // after step 3 put 0 @ 5
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='O' && mn.bloc[7]=='X' && mn.bloc[8]=='8' && mn.bloc[9]=='O')
{
mn.bloc[5]='X'; // after step 3 put 0 @ 9
return;
}

else
{
p=-1;
}
}

case 2:
{

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='3' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='7' && mn.bloc[8]=='8' && mn.bloc[9]=='9')
{
mn.bloc[7]='X'; // first step @ 2
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='3' && mn.bloc[4]=='4' && mn.bloc[5]=='O' && mn.bloc[6]=='6' && mn.bloc[7]=='X' && mn.bloc[8]=='8' && mn.bloc[9]=='9')
{
mn.bloc[4]='X'; // after step 1 put 0 at 5
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='O' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='X' && mn.bloc[8]=='8' && mn.bloc[9]=='9')
{
mn.bloc[4]='X'; // after step 1 put 0 at 3
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='3' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='X' && mn.bloc[8]=='O' && mn.bloc[9]=='9')
{
mn.bloc[4]='X'; // after step 1 put 0 at 8
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='3' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='O' && mn.bloc[7]=='X' && mn.bloc[8]=='8' && mn.bloc[9]=='9')
{
mn.bloc[4]='X'; // after step 1 put 0 at 6
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='3' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='X' && mn.bloc[8]=='8' && mn.bloc[9]=='O')
{
mn.bloc[4]='X'; // after step 1 put 0 at 9
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='3' && mn.bloc[4]=='O' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='X' && mn.bloc[8]=='8' && mn.bloc[9]=='9')
{
mn.bloc[9]='X'; // after step 2 put 0 at 9
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='O' && mn.bloc[4]=='O' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='X' && mn.bloc[8]=='8' && mn.bloc[9]=='X')
{
mn.bloc[5]='X'; // after step 3 put 0 at 3
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='3' && mn.bloc[4]=='O' && mn.bloc[5]=='5' && mn.bloc[6]=='O' && mn.bloc[7]=='X' && mn.bloc[8]=='8' && mn.bloc[9]=='X')
{
mn.bloc[8]='X'; // after step 3 put 0 at 6
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='3' && mn.bloc[4]=='O' && mn.bloc[5]=='O' && mn.bloc[6]=='6' && mn.bloc[7]=='X' && mn.bloc[8]=='8' && mn.bloc[9]=='X')
{
mn.bloc[8]='X'; // after step 3 put 0 at 5
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='3' && mn.bloc[4]=='O' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='X' && mn.bloc[8]=='O' && mn.bloc[9]=='X')
{
mn.bloc[5]='X'; // after step 3 put 0 at 8
return;
}
else
{
p=-1;
}
}

case 7:
{

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='3' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='O' && mn.bloc[8]=='8' && mn.bloc[9]=='9')
{
mn.bloc[3]='X';
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='X' && mn.bloc[4]=='O' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='O' && mn.bloc[8]=='8' && mn.bloc[9]=='9')
{
mn.bloc[2]='X'; //after step 2 put 0 @ 4
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='O' && mn.bloc[6]=='6' && mn.bloc[7]=='O' && mn.bloc[8]=='8' && mn.bloc[9]=='9')
{
mn.bloc[2]='X'; //after step 2 put 0 @ 5
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='O' && mn.bloc[7]=='O' && mn.bloc[8]=='8' && mn.bloc[9]=='9')
{
mn.bloc[2]='X'; //after step 2 put 0 @ 6
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='O' && mn.bloc[8]=='O' && mn.bloc[9]=='9')
{
mn.bloc[2]='X'; //after step 2 put 0 @ 8
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='O' && mn.bloc[8]=='8' && mn.bloc[9]=='O')
{
mn.bloc[2]='X'; //after step 2 put 0 @ 9
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='O' && mn.bloc[8]=='8' && mn.bloc[9]=='9')
{
mn.bloc[9]='X'; //after step 2 put 0 @ 2
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='X' && mn.bloc[4]=='O' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='O' && mn.bloc[8]=='8' && mn.bloc[9]=='X')
{
mn.bloc[5]='X'; //after step 3 put 0 @ 4
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='O' && mn.bloc[6]=='6' && mn.bloc[7]=='O' && mn.bloc[8]=='8' && mn.bloc[9]=='X')
{
mn.bloc[6]='X'; //after step 3 put 0 @ 5
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='O' && mn.bloc[7]=='O' && mn.bloc[8]=='8' && mn.bloc[9]=='X')
{
mn.bloc[5]='X'; //after step 3 put 0 @ 6
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='O' && mn.bloc[8]=='O' && mn.bloc[9]=='X')
{
mn.bloc[5]='X'; //after step 3 put 0 @ 8
return;
}
else
{
p=-1;
}
}

case 8:
{

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='3' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='7' && mn.bloc[8]=='O' && mn.bloc[9]=='9')
{
mn.bloc[3]='X'; // step 2 put 0 @ 8
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='X' && mn.bloc[4]=='O' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='7' && mn.bloc[8]=='O' && mn.bloc[9]=='9')
{
mn.bloc[2]='X'; // after step 2 put 0 @ 4
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='O' && mn.bloc[6]=='6' && mn.bloc[7]=='7' && mn.bloc[8]=='O' && mn.bloc[9]=='9')
{
mn.bloc[2]='X'; // after step 2 put 0 @ 5
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='O' && mn.bloc[7]=='7' && mn.bloc[8]=='O' && mn.bloc[9]=='9')
{
mn.bloc[2]='X'; // after step 2 put 0 @ 6
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='O' && mn.bloc[8]=='O' && mn.bloc[9]=='9')
{
mn.bloc[2]='X'; // after step 2 put 0 @ 7
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='7' && mn.bloc[8]=='O' && mn.bloc[9]=='O')
{
mn.bloc[2]='X'; // after step 2 put 0 @ 9
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='7' && mn.bloc[8]=='O' && mn.bloc[9]=='9')
{
mn.bloc[5]='X'; // step 3 put 0 @ 2
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='X' && mn.bloc[4]=='O' && mn.bloc[5]=='X' && mn.bloc[6]=='6' && mn.bloc[7]=='7' && mn.bloc[8]=='O' && mn.bloc[9]=='9')
{
mn.bloc[9]='X'; // after step 3 put 0 @ 4
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='X' && mn.bloc[6]=='O' && mn.bloc[7]=='7' && mn.bloc[8]=='O' && mn.bloc[9]=='9')
{
mn.bloc[9]='X'; // after step 3 put 0 @ 6
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='X' && mn.bloc[6]=='6' && mn.bloc[7]=='O' && mn.bloc[8]=='O' && mn.bloc[9]=='9')
{
mn.bloc[9]='X'; // after step 3 put 0 @ 7
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='X' && mn.bloc[6]=='6' && mn.bloc[7]=='7' && mn.bloc[8]=='O' && mn.bloc[9]=='O')
{
mn.bloc[7]='X'; // after step 3 put 0 @ 9
return;
}

else
{
p=-1;
}
}

case 9:
{

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='3' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='7' && mn.bloc[8]=='8' && mn.bloc[9]=='O')
{
mn.bloc[3]='X'; // step 2 put 0 @ 9
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='X' && mn.bloc[4]=='O' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='7' && mn.bloc[8]=='8' && mn.bloc[9]=='O')
{
mn.bloc[2]='X'; // after step 2 put 0 @ 4
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='O' && mn.bloc[6]=='6' && mn.bloc[7]=='7' && mn.bloc[8]=='8' && mn.bloc[9]=='O')
{
mn.bloc[2]='X'; // after step 2 put 0 @ 5
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='O' && mn.bloc[7]=='7' && mn.bloc[8]=='8' && mn.bloc[9]=='O')
{
mn.bloc[2]='X'; // after step 2 put 0 @ 6
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='O' && mn.bloc[8]=='8' && mn.bloc[9]=='O')
{
mn.bloc[2]='X'; // after step 2 put 0 @ 7
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='7' && mn.bloc[8]=='O' && mn.bloc[9]=='O')
{
mn.bloc[2]='X'; // after step 2 put 0 @ 8
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='7' && mn.bloc[8]=='8' && mn.bloc[9]=='O')
{
mn.bloc[7]='X'; // step 3 put 0 @ 2
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='X' && mn.bloc[4]=='O' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='X' && mn.bloc[8]=='8' && mn.bloc[9]=='O')
{
mn.bloc[5]='X'; // after step 3 put 0 @ 4
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='O' && mn.bloc[6]=='6' && mn.bloc[7]=='X' && mn.bloc[8]=='8' && mn.bloc[9]=='O')
{
mn.bloc[4]='X'; // after step 3 put 0 @ 5
return;
}


if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='O' && mn.bloc[7]=='X' && mn.bloc[8]=='8' && mn.bloc[9]=='O')
{
mn.bloc[5]='X'; // after step 3 put 0 @ 6
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='5' && mn.bloc[6]=='6' && mn.bloc[7]=='X' && mn.bloc[8]=='O' && mn.bloc[9]=='O')
{
mn.bloc[5]='X'; // after step 3 put 0 @ 8
return;
}

else
{
p=-1;
}
}

case 5:
{

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='3' && mn.bloc[4]=='4' && mn.bloc[5]=='O' && mn.bloc[6]=='6' && mn.bloc[7]=='7' && mn.bloc[8]=='8' && mn.bloc[9]=='9')
{
mn.bloc[8]='X'; // step 2 put 0 @ 5
return;
}

//O2 @ 2

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='3' && mn.bloc[4]=='4' && mn.bloc[5]=='O' && mn.bloc[6]=='6' && mn.bloc[7]=='7' && mn.bloc[8]=='X' && mn.bloc[9]=='9')
{
mn.bloc[7]='X'; // after step 2 put 0 @ 2
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='3' && mn.bloc[4]=='O' && mn.bloc[5]=='O' && mn.bloc[6]=='6' && mn.bloc[7]=='X' && mn.bloc[8]=='X' && mn.bloc[9]=='9')
{
mn.bloc[9]='X'; // after step 2 put 0 @ 4
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='O' && mn.bloc[4]=='4' && mn.bloc[5]=='O' && mn.bloc[6]=='6' && mn.bloc[7]=='X' && mn.bloc[8]=='X' && mn.bloc[9]=='9')
{
mn.bloc[9]='X'; // after step 2 put 0 @ 3
return;
}


if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='3' && mn.bloc[4]=='4' && mn.bloc[5]=='O' && mn.bloc[6]=='O' && mn.bloc[7]=='X' && mn.bloc[8]=='X' && mn.bloc[9]=='9')
{
mn.bloc[9]='X'; // after step 2 put 0 @ 6
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='3' && mn.bloc[4]=='4' && mn.bloc[5]=='O' && mn.bloc[6]=='6' && mn.bloc[7]=='X' && mn.bloc[8]=='X' && mn.bloc[9]=='O')
{
mn.bloc[4]='X'; // after step 2 put 0 @ 9
return;
}

// O2 @ 3

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='O' && mn.bloc[4]=='4' && mn.bloc[5]=='O' && mn.bloc[6]=='6' && mn.bloc[7]=='7' && mn.bloc[8]=='X' && mn.bloc[9]=='9')
{
mn.bloc[7]='X'; // step 3 put 0 @ 3
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='O' && mn.bloc[4]=='4' && mn.bloc[5]=='O' && mn.bloc[6]=='6' && mn.bloc[7]=='X' && mn.bloc[8]=='X' && mn.bloc[9]=='9')
{
mn.bloc[9]='X'; // after step 3 put 0 @ 2
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='O' && mn.bloc[4]=='O' && mn.bloc[5]=='O' && mn.bloc[6]=='6' && mn.bloc[7]=='X' && mn.bloc[8]=='X' && mn.bloc[9]=='9')
{
mn.bloc[9]='X'; // after step 3 put 0 @ 4
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='O' && mn.bloc[4]=='4' && mn.bloc[5]=='O' && mn.bloc[6]=='O' && mn.bloc[7]=='X' && mn.bloc[8]=='X' && mn.bloc[9]=='9')
{
mn.bloc[9]='X'; // after step 3 put 0 @ 6
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='O' && mn.bloc[4]=='4' && mn.bloc[5]=='O' && mn.bloc[6]=='6' && mn.bloc[7]=='X' && mn.bloc[8]=='X' && mn.bloc[9]=='O')
{
mn.bloc[4]='X'; // after step 3 put 0 @ 9
return;
}

//O2 @ 4

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='3' && mn.bloc[4]=='O' && mn.bloc[5]=='O' && mn.bloc[6]=='6' && mn.bloc[7]=='7' && mn.bloc[8]=='X' && mn.bloc[9]=='9')
{
mn.bloc[6]='X'; //step 2 put 0 at 4
return;
}
			//O3 @ 2

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='3' && mn.bloc[4]=='O' && mn.bloc[5]=='O' && mn.bloc[6]=='X' && mn.bloc[7]=='7' && mn.bloc[8]=='X' && mn.bloc[9]=='9')
{
mn.bloc[9]='X'; // after step 3 put 0 at 3
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='3' && mn.bloc[4]=='O' && mn.bloc[5]=='O' && mn.bloc[6]=='X' && mn.bloc[7]=='O' && mn.bloc[8]=='X' && mn.bloc[9]=='X')
{
mn.bloc[3]='X'; // after step 4 put 0 at 7
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='X' && mn.bloc[4]=='O' && mn.bloc[5]=='O' && mn.bloc[6]=='X' && mn.bloc[7]=='7' && mn.bloc[8]=='X' && mn.bloc[9]=='X')
{
mn.bloc[7]='X'; // after step 4 put 0 at 3
return;
}
			//O3 @ 3

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='O' && mn.bloc[4]=='O' && mn.bloc[5]=='O' && mn.bloc[6]=='X' && mn.bloc[7]=='7' && mn.bloc[8]=='X' && mn.bloc[9]=='9')
{
mn.bloc[7]='X'; // after step 3 put 0 at 3
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='O' && mn.bloc[4]=='O' && mn.bloc[5]=='O' && mn.bloc[6]=='X' && mn.bloc[7]=='X' && mn.bloc[8]=='X' && mn.bloc[9]=='O')
{
mn.bloc[2]='X'; // after step 4 put 0 at 9
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='O' && mn.bloc[4]=='O' && mn.bloc[5]=='O' && mn.bloc[6]=='X' && mn.bloc[7]=='X' && mn.bloc[8]=='X' && mn.bloc[9]=='9')
{
mn.bloc[9]='X'; // after step 4 put 0 at 2
return;
}
			//O3 @ 7

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='3' && mn.bloc[4]=='O' && mn.bloc[5]=='O' && mn.bloc[6]=='X' && mn.bloc[7]=='O' && mn.bloc[8]=='X' && mn.bloc[9]=='9')
{
mn.bloc[3]='X'; // after step 3 put 0 at 7
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='X' && mn.bloc[4]=='O' && mn.bloc[5]=='O' && mn.bloc[6]=='X' && mn.bloc[7]=='O' && mn.bloc[8]=='X' && mn.bloc[9]=='9')
{
mn.bloc[9]='X'; // after step 4 put 0 at 2
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='X' && mn.bloc[4]=='O' && mn.bloc[5]=='O' && mn.bloc[6]=='X' && mn.bloc[7]=='O' && mn.bloc[8]=='X' && mn.bloc[9]=='O')
{
mn.bloc[2]='X'; // after step 4 put 0 at 9
return;
}
			//O3 @ 9

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='3' && mn.bloc[4]=='O' && mn.bloc[5]=='O' && mn.bloc[6]=='X' && mn.bloc[7]=='7' && mn.bloc[8]=='X' && mn.bloc[9]=='O')
{
mn.bloc[3]='X'; // after step 3 put 0 at 9
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='X' && mn.bloc[4]=='O' && mn.bloc[5]=='O' && mn.bloc[6]=='X' && mn.bloc[7]=='7' && mn.bloc[8]=='X' && mn.bloc[9]=='O')
{
mn.bloc[7]='X'; // after step 4 put 0 at 2
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='X' && mn.bloc[4]=='O' && mn.bloc[5]=='O' && mn.bloc[6]=='X' && mn.bloc[7]=='O' && mn.bloc[8]=='X' && mn.bloc[9]=='O')
{
mn.bloc[2]='X'; // after step 4 put 0 at 7
return;
}

//O2 @ 6

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='3' && mn.bloc[4]=='4' && mn.bloc[5]=='O' && mn.bloc[6]=='O' && mn.bloc[7]=='7' && mn.bloc[8]=='X' && mn.bloc[9]=='9')
{
mn.bloc[4]='X'; //step 2 put 0 at 6
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='3' && mn.bloc[4]=='X' && mn.bloc[5]=='O' && mn.bloc[6]=='O' && mn.bloc[7]=='7' && mn.bloc[8]=='X' && mn.bloc[9]=='9')
{
mn.bloc[7]='X'; //step 3 put 0 at 2 *O3 @ 2
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='O' && mn.bloc[4]=='X' && mn.bloc[5]=='O' && mn.bloc[6]=='O' && mn.bloc[7]=='7' && mn.bloc[8]=='X' && mn.bloc[9]=='9')
{
mn.bloc[7]='X'; //step 3 put 0 at 3 * O3 @ 3
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='3' && mn.bloc[4]=='X' && mn.bloc[5]=='O' && mn.bloc[6]=='O' && mn.bloc[7]=='7' && mn.bloc[8]=='X' && mn.bloc[9]=='O')
{
mn.bloc[7]='X'; //step 3 put 0 at 9 * O3 @ 9
return;
}
			//O3 @ 7

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='3' && mn.bloc[4]=='X' && mn.bloc[5]=='O' && mn.bloc[6]=='O' && mn.bloc[7]=='O' && mn.bloc[8]=='X' && mn.bloc[9]=='9')
{
mn.bloc[3]='X'; //step 3 put 0 at 7 
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='X' && mn.bloc[4]=='X' && mn.bloc[5]=='O' && mn.bloc[6]=='O' && mn.bloc[7]=='O' && mn.bloc[8]=='X' && mn.bloc[9]=='9')
{
mn.bloc[9]='X'; // after step 3 put 0 at 2 
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='X' && mn.bloc[4]=='X' && mn.bloc[5]=='O' && mn.bloc[6]=='O' && mn.bloc[7]=='O' && mn.bloc[8]=='X' && mn.bloc[9]=='O')
{
mn.bloc[2]='X'; // after step 3 put 0 at 9 
return;
}

//O2 @ 7

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='3' && mn.bloc[4]=='4' && mn.bloc[5]=='O' && mn.bloc[6]=='6' && mn.bloc[7]=='O' && mn.bloc[8]=='X' && mn.bloc[9]=='9')
{
mn.bloc[3]='X'; //step 2 put 0 at 7 
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='O' && mn.bloc[6]=='6' && mn.bloc[7]=='O' && mn.bloc[8]=='X' && mn.bloc[9]=='9')
{
mn.bloc[4]='X'; //step 3 put 0 at 3 
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='X' && mn.bloc[4]=='X' && mn.bloc[5]=='O' && mn.bloc[6]=='O' && mn.bloc[7]=='O' && mn.bloc[8]=='X' && mn.bloc[9]=='9')
{
mn.bloc[9]='X'; // after step 3 put 0 at 6 
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='X' && mn.bloc[4]=='X' && mn.bloc[5]=='O' && mn.bloc[6]=='6' && mn.bloc[7]=='O' && mn.bloc[8]=='X' && mn.bloc[9]=='O')
{
mn.bloc[6]='X'; // after step 3 put 0 at 9 
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='X' && mn.bloc[4]=='O' && mn.bloc[5]=='O' && mn.bloc[6]=='6' && mn.bloc[7]=='O' && mn.bloc[8]=='X' && mn.bloc[9]=='9')
{
mn.bloc[2]='X'; //step 2 put 0 at 4 
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='O' && mn.bloc[6]=='O' && mn.bloc[7]=='O' && mn.bloc[8]=='X' && mn.bloc[9]=='9')
{
mn.bloc[2]='X'; //step 2 put 0 at 6 
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='O' && mn.bloc[6]=='6' && mn.bloc[7]=='O' && mn.bloc[8]=='X' && mn.bloc[9]=='O')
{
mn.bloc[2]='X'; //step 2 put 0 at 9 
return;
}

//O2 @ 9

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='3' && mn.bloc[4]=='4' && mn.bloc[5]=='O' && mn.bloc[6]=='6' && mn.bloc[7]=='7' && mn.bloc[8]=='X' && mn.bloc[9]=='O')
{
mn.bloc[3]='X'; //step 2 put 0 at 9 
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='O' && mn.bloc[6]=='6' && mn.bloc[7]=='7' && mn.bloc[8]=='X' && mn.bloc[9]=='O')
{
mn.bloc[7]='X'; //step 3 put 0 at 2 
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='X' && mn.bloc[4]=='O' && mn.bloc[5]=='O' && mn.bloc[6]=='6' && mn.bloc[7]=='X' && mn.bloc[8]=='X' && mn.bloc[9]=='O')
{
mn.bloc[6]='X'; // after step 3 put 0 at 4 
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='O' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='O' && mn.bloc[6]=='O' && mn.bloc[7]=='X' && mn.bloc[8]=='X' && mn.bloc[9]=='O')
{
mn.bloc[4]='X'; // after step 3 put 0 at 6 
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='X' && mn.bloc[4]=='O' && mn.bloc[5]=='O' && mn.bloc[6]=='6' && mn.bloc[7]=='7' && mn.bloc[8]=='X' && mn.bloc[9]=='O')
{
mn.bloc[2]='X'; //step 3 put 0 at 4 
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='O' && mn.bloc[6]=='O' && mn.bloc[7]=='7' && mn.bloc[8]=='X' && mn.bloc[9]=='O')
{
mn.bloc[2]='X'; //step 3 put 0 at 6 
return;
}

if(mn.bloc[1]=='X' && mn.bloc[2]=='2' && mn.bloc[3]=='X' && mn.bloc[4]=='4' && mn.bloc[5]=='O' && mn.bloc[6]=='6' && mn.bloc[7]=='O' && mn.bloc[8]=='X' && mn.bloc[9]=='O')
{
mn.bloc[2]='X'; //step 3 put 0 at 7 
return;
}

else
{
p=-1;
}
}


//************************ case x1=1 end*********************



} //switch close

} //while close
}
}

class check
{
void checkresult(int a)
{
 myhello mm=new myhello();
 switch(a)
{
case 1:
{
 if(mm.bloc[1]=='X' && mm.bloc[2]=='X' && mm.bloc[3]=='X')
 {
 System.out.println("Computer wins");
 }

else if(mm.bloc[4]=='X' && mm.bloc[5]=='X' && mm.bloc[6]=='X')
 {
 System.out.println("Computer wins");
  
 }

else if(mm.bloc[7]=='X' && mm.bloc[8]=='X' && mm.bloc[9]=='X')
 {
 System.out.println("Computer wins");
  
 }

else if(mm.bloc[1]=='X' && mm.bloc[4]=='X' && mm.bloc[7]=='X')
 {
 System.out.println("Computer wins");
  
 }

else if(mm.bloc[2]=='X' && mm.bloc[5]=='X' && mm.bloc[8]=='X')
 {
 System.out.println("Computer wins");
  
 }

else if(mm.bloc[3]=='X' && mm.bloc[6]=='X' && mm.bloc[9]=='X')
 {
 System.out.println("Computer wins");
  
 }

else if(mm.bloc[1]=='X' && mm.bloc[5]=='X' && mm.bloc[9]=='X')
 {
 System.out.println("Computer wins");
  
 }

else if(mm.bloc[3]=='X' && mm.bloc[5]=='X' && mm.bloc[7]=='X')
{
 System.out.println("Computer wins");
  
}
break;
}
case 2: 
{
 if(mm.bloc[1]=='O' && mm.bloc[2]=='O' && mm.bloc[3]=='O')
{
 System.out.println("you win");
  
}

else if(mm.bloc[4]=='O' && mm.bloc[5]=='O' && mm.bloc[6]=='O')
{
 System.out.println("you win");
  
}

else if(mm.bloc[7]=='O' && mm.bloc[8]=='O' && mm.bloc[9]=='O')
{
 System.out.println("you win");
  
}

else if(mm.bloc[1]=='O' && mm.bloc[4]=='O' && mm.bloc[7]=='O')
{
 System.out.println("you win");
  
}

else if(mm.bloc[2]=='O' && mm.bloc[5]=='O' && mm.bloc[8]=='O')
 {
 System.out.println("you win");
  
 }

else if(mm.bloc[3]=='O' && mm.bloc[6]=='O' && mm.bloc[9]=='O')
 {
 System.out.println("you win");
  
 }

else if(mm.bloc[1]=='O' && mm.bloc[5]=='O' && mm.bloc[9]=='O')
 {
 System.out.println("you win");
  
 }

else if(mm.bloc[3]=='O' && mm.bloc[5]=='O' && mm.bloc[7]=='O')
 {
 System.out.println("you win");
  
 }
}
}
}
}
}