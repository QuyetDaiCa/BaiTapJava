package BT4.baitap4_phan4;

public abstract class People {
    private String name;
    private int namSing;
    private int heSoLuong;
    private float luong;

    public People() {
    }

    public People(String name, int namSing, int heSoLuong, float luong) {
        this.name = name;
        this.namSing = namSing;
        this.heSoLuong = heSoLuong;
        this.luong = luong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNamSing() {
        return namSing;
    }

    public void setNamSing(int namSing) {
        this.namSing = namSing;
    }

    public int getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    public abstract void nhap();

    public abstract void xuat();
}
