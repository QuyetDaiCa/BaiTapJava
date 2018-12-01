package hochoi;

public class HinhTron {
    private Point tamO;
    private int banKinh;

    public HinhTron() {
    }

    public HinhTron(Point tamO, int banKinh) {
        this.tamO = tamO;
        this.banKinh = banKinh;
    }

    public Point getTamO() {
        return tamO;
    }

    public void setTamO(Point tamO) {
        this.tamO = tamO;
    }

    public int getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(int banKinh) {
        this.banKinh = banKinh;
    }
    void kiemTraDiem(Point point){
        int khoangCachTamDenDiem = (int) Math.sqrt(Math.pow((point.getHoanhDo()-tamO.getHoanhDo()),2)+ Math.pow((point.getTungTo()-tamO.getTungTo()),2));
                if (khoangCachTamDenDiem==banKinh)
                    System.out.println("Điểm A thuộc đường tròn nha");
                else System.out.println("Điểm A không thuộc đường tròn nha");
    }

    public static void main(String[] args) {
        Point point = new Point();
        Point tamO = new Point();
        System.out.println("Tọa độ điểm A");
        point.nhapToaDoDiem();
        System.out.println("Tọa độ điểm O");
        tamO.nhapToaDoDiem();
        HinhTron hinhTron = new HinhTron(tamO,5);
        hinhTron.kiemTraDiem(point);

    }
}
