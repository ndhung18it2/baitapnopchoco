package baitapso1;
import java.util.Scanner;
public class Banhang extends Dienthoai {
public static void nhapHoadon(Dienthoai dienthoai) {
	Scanner key=new Scanner(System.in);
	System.out.println("Mã hàng:  ");
	dienthoai.mahang=key.nextLine();
	System.out.println( "Tên hàng:  ");
	dienthoai.tenhang=key.nextLine();
	System.out.println("Đơn giá:  ");
    dienthoai.dongia=key.nextLong();
	System.out.println("Số lượng:  ");
	dienthoai.soluong=key.nextInt();
 }
public static double tinhTien() {
	long tinhTien;
	if(soluong==1) 
		tinhTien=dongia*soluong;
	else 
		tinhTien= (long) (dongia*soluong*0.9);
	return tinhTien;
 }
public static void inHoadon(Dienthoai dienthoai) {
	System.out.println(" Hóa đơn bán hàng: \n---------------------------\n -Mã hàng: "+dienthoai.mahang+"\n -Tên hàng: "
                                            +dienthoai.tenhang+"\n -Đơn giá: "
                                            +dienthoai.dongia+"\n -Số lượng: "+dienthoai.soluong 
                                            +"\n --------------------------\n Thành tiền: "
                                            +tinhTien()+" Đồng");   
    }	
public static void main(String[]args) {
	Dienthoai phone= new Dienthoai();
	nhapHoadon(phone);
	inHoadon(phone);
    }
 }
