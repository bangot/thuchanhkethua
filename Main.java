public class Main {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien();

        System.out.println(nv1.getThuNhap());
        NhanVien nv2 = new TruongPhong();
        TruongPhong nv3 = new TruongPhong();
    }
    public static class NhanVien {
        public double getThuNhap() {
            return 123;
        }
    }

    public static class TruongPhong extends NhanVien {
        public double getThuNhap() {
            return 13;
        }
    }


}
