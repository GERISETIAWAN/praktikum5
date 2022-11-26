public class utama{
    public static void main(String[] args){

    //membuat object
    manager gaklengkap = new manager ("GERI SETIAWAN");
    manager sedang = new manager ("GERI SETIAWAN", 500000);
    manager lengkap = new manager("GERI SETIAWAN", 6000000, 2000000);

    programmer gaklengkapprogrammer = new programmer ("YANTO BIN YANTI");
    programmer sedangprogrammer = new programmer ("YANTO BIN YANTI", 500000);
    programmer lengkapprogrammer = new programmer("YANTO BIN YANTI", 6000000, 500000);

    gaklengkap.cetakInfo();
    sedang.cetakInfo();
    lengkap.cetakInfo();

    gaklengkapprogrammer.cetakInfo();
    sedangprogrammer.cetakInfo();
    lengkapprogrammer.cetakInfo();



    }
}