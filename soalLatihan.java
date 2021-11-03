import java.util.Scanner;

public class soalLatihan{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int bulan, tahun; 
		
		bulan = input.nextInt();
		tahun = input.nextInt();
	
		switch(bulan){
			case 1:
				System.out.println("Janurai " +tahun+ " memiliki 31 hari");
				break;
			case 2:
				System.out.println("Februari " +tahun+ " memiliki 28 hari");
				break;
			case 3:
				System.out.println("Maret " +tahun+ " memiliki 31 hari");
				break;
			case 4:
				System.out.println("April " +tahun+ " memiliki 30 hari");
				break;
			case 5:
				System.out.println("Mei " +tahun+ " memiliki 31 hari");
				break;
			case 6:
				System.out.println("Juni " +tahun+ " memiliki 30 hari");
				break;
			case 7:
				System.out.println("Juli " +tahun+ " memiliki 31 hari");
				break;
			case 8:
				System.out.println("Agustus " +tahun+ " memiliki 31 hari");
				break;
			case 9:
				System.out.println("September " +tahun+ " memiliki 30 hari");
				break;
			case 10:
				System.out.println("Oktober " +tahun+ " memiliki 31 hari");
				break;
			case 11:
				System.out.println("November " +tahun+ " memiliki 30 hari");
				break;
			case 12:
				System.out.println("Desember " +tahun+ " memiliki 31 hari");
				break;
			default:
				System.out.println("Inputan tidak valid");
				
				
		
		}
	}
}