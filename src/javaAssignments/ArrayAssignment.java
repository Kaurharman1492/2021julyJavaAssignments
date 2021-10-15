package javaAssignments;



public class ArrayAssignment {

	public static void main(String[] args) {


		for (int i=0;i<=9;i++) {
			for(int j=0;j<=9;j++) {
				System.out.print(i+""+j+" ");
			}
			System.out.println();
		}
		Object PlayerName []= new Object[7];
		PlayerName[0]="Yuvraj";
		PlayerName[1]="KingsPunjab";
		PlayerName[2]=41;
		PlayerName[3]=10081980;
		PlayerName[4]='m';
		PlayerName[5]=25.89;
		PlayerName[6]=true;
		
		for (int k=0;k<PlayerName.length;k++) {
			System.out.println(k+"="+PlayerName[k]);
		}
		int count=0;
		for(Object e: PlayerName) {
			System.out.println(count+"="+e);
			count++;
		}
		Object PName1 []= new Object[7];
		PName1[0]="Rahul";
		PName1[1]="KingsPunjab";
		PName1[2]=28;
		PName1[3]=10081992;
		PName1[4]='m';
		PName1[5]=38.85;
		PName1[6]=false;
		
		for (int m=0;m<PName1.length;m++) {
			System.out.println(m+"="+PName1[m]);
		}
		
		for(Object e: PName1) {
			System.out.println(e);
		}
		
		Object PlayerName3 []= new Object[7];
		PlayerName3[0]="Manpreet";
		PlayerName3[1]="KingsPunjab";
		PlayerName3[2]=24;
		PlayerName3[3]=10081996;
		PlayerName3[4]='m';
		PlayerName3[5]=37.04;
		PlayerName3[6]=true;
		for (int j=0;j<PlayerName3.length;j++) {
			System.out.println(j+"="+PlayerName3[j]);
		}
		
		for(Object e: PlayerName3) {
			System.out.println(e);
		}
		
		int j[]= new int[5];
		j[0]=4;
		j[1]=3;
		j[2]=2;
		j[3]=1;
		j[4]=0;
		
		
		for(int k=0;k<j.length;k++) {
			System.out.println ("n="+j[k]);
		}
		
	}
}


