package main;

import java.util.Scanner;

public class AddDataView {
Scanner kb;
static String ename[],dept[];
static int eno[];


public AddDataView(){
ename = new String[3];
dept = new String[3];
eno = new int[3];
}

public void input(){
kb = new Scanner (System.in);
for(int x=0; x<3; x++){
System.out.print ("\nEnter employee("+(x+1)+") no: ");
eno[x] = Integer.parseInt(kb.nextLine());

System.out.print ("Enter employee("+(x+1)+") name: ");
ename[x] = kb.nextLine();

System.out.print ("Enter employee("+(x+1)+") department: ");
dept[x] = kb.nextLine();
}
}

public void display(){
System.out.println ("**********************");
for(int x=0;x<3; x++){
System.out.println ("\nEmployee no: "+eno[x]);
System.out.println ("Employee name: "+ename[x]);
System.out.println ("Employee department: "+dept[x]);
}
}

public static void main (String[] args) {
AddDataView t = new AddDataView();
t.input();
t.display();
}
}
