/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UpdateCode;

/**
 *
 * @author DELL
 */
public class MenuQLDV {

    public void hienThi() {
        QLDichVu qldv = new QLDichVu();

        Decoration a = new Decoration("Co dien", 30);
        Decoration a1 = new Decoration("Hien dai", 50);

        RentingKaraoke b = new RentingKaraoke(315, 150);
        RentingKaraoke b1 = new RentingKaraoke(200, 200);
        
        Singer c = new Singer("Ha Anh Tuan", 3, 1000);
        Singer c1 = new Singer("My Tam", 4, 2500);
        
        qldv.themTrangTri(a, a1);
        qldv.themKara(b, b1);
        qldv.themCaSi(c, c1);

        int choice;
        do {
            System.out.println("\n------------------QUAN LY DICH VU---------------------\n");
            System.out.println("1.Them trang ti");
            System.out.println("2.Xoa trang tri");
            System.out.println("3.Cap Nhat trang tri");
            System.out.println("4.Tim kiem trang tri theo ten");
            System.out.println("5.Hien thi danh sach cac trang tri");
            System.out.println("6.Them karaoke");
            System.out.println("7.Xoa karaoke");
            System.out.println("8.Cap nhat karaoke");
            System.out.println("9.Tim kiem karaoke");
            System.out.println("10.Hien thi danh sach karaoke");
            System.out.println("11.Them ca si");
            System.out.println("12.Xoa ca si");
            System.out.println("13.Cap Nhat ca si");
            System.out.println("14.Tim kiem Ca si theo ten");
            System.out.println("15.Hien thi danh sach cac Ca si");
            System.out.println("0.Thoat");
            System.out.println("-----------------------------------------------------");
            System.out.println("Hay chon mot thao tac tu 0-10: ");
            choice = CauHinh.sc.nextInt();
            CauHinh.sc.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.println("Them trang tri vao dich vu");
                    qldv.nhapTrangTri();
                }
                case 2 -> {
                    qldv.showDecoration();
                    System.out.print("\nNhap id trang tri can xoa: ");
                    int idDec = CauHinh.sc.nextInt();
                    CauHinh.sc.nextLine();
                    qldv.xoaTrangTri(idDec);
                }
                case 3 -> {
                    System.out.println("Nhap id trang tri can cap nhat: ");
                    qldv.showDecoration();
                    int chon = CauHinh.sc.nextInt();
                    CauHinh.sc.nextLine();
                    qldv.updateTrangTri(chon);
                }
                case 4 -> {

                    System.out.print("Nhap ten trang tri de tim kiem: ");
                    String kw = CauHinh.sc.nextLine();
                    qldv.searchTrangTriByName(kw);

                }
                case 5 -> {
                    System.out.print("\n===========Trang tri==========\n");
                    qldv.showDecoration();
                }
                case 6 -> {
                    System.out.println("Them karaoke vao dich vu");
                    qldv.nhapKara();
                }
                case 7 -> {
                    qldv.showKara();
                    System.out.print("\nNhap id kara can xoa: ");
                    int id = CauHinh.sc.nextInt();
                    CauHinh.sc.nextLine();
                    qldv.xoaKaraoke(id);
                }
                case 8 -> {
                    System.out.println("Nhap id kara can cap nhat: ");
                    qldv.showKara();
                    int chon = CauHinh.sc.nextInt();
                    CauHinh.sc.nextLine();
                    qldv.updateKaraoke(chon);
                }
                case 9 -> {

                    System.out.print("Nhap ten kara de tim kiem: ");
                    double kw = CauHinh.sc.nextDouble();
                    qldv.searchKaraByRentingTime(choice).hienThi();

                }
                case 10 -> {
                    System.out.print("\n===========Karaoke==========\n");
                    qldv.showKara();
                }
                case 11 -> {
                    System.out.println("Them thue ca si vao dich vu");
                    qldv.nhapThueCaSi();
                }
                case 12 -> {
                    qldv.showCaSi();
                    System.out.print("\nNhap id ca si can xoa: ");
                    int idDec = CauHinh.sc.nextInt();
                    CauHinh.sc.nextLine();
                    qldv.xoaCaSi(idDec);
                }
                case 13 -> {
                    System.out.println("Nhap id ca si can cap nhat: ");
                    qldv.showCaSi();
                    int chon = CauHinh.sc.nextInt();
                    CauHinh.sc.nextLine();
                    qldv.updateCaSi(chon);
                }
                case 14 -> {

                    System.out.print("Nhap ten ca si de tim kiem: ");
                    String kw = CauHinh.sc.nextLine();
                    qldv.searchSingerByName(kw);

                }
                case 15 -> {
                    System.out.print("\n===========Cac ca si==========\n");
                    qldv.showCaSi();
                }
            }
        } while (choice != 0);
    }
}
