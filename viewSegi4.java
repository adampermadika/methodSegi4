//objek / tampilan
import java.util.*;

public class viewSegi4{
	public static void main (String[]args){
		Scanner sc=new Scanner(System.in);
		
		luasSegi4 l= new  luasSegi4();
		kelilingSegi4 k= new kelilingSegi4();
		totalSegi4 t= new totalSegi4();
		
		System.out.print("Masukan nilai panjang = ");
		int p = sc.nextInt();
		l.setPanjang(p);
		k.setPanjang(p);
		t.setPanjang(p);
		System.out.print("Masukan nilai lebar   = ");
		int lbr = sc.nextInt();
		l.setLebar(lbr);
		k.setLebar(lbr);
		t.setLebar(lbr);
		System.out.print("Masukan nilai luas    = ");
		int lu = sc.nextInt();
		t.setLuas(lu);
		System.out.println();	
		
		System.out.println("luas= "+p+"x"+lbr+"=" +l.getluas());
		System.out.println("kelliling= 2("+p+"x"+lbr+")="+k.getkeliling());
		System.out.println("total= "+lu+"("+p+"x"+lbr+")="+t.gettotal());
	}
}