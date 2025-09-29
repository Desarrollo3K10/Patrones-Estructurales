package Adapter;

/*La clase del pj que quiere impirmir*/
public class PrinterUser implements Printer {
    private Adapter adapter;

    public PrinterUser() {
        adapter = new Adapter();
    }

    @Override
    //Este override trae el metodo del adapter
    public void print(String fileType, String fileName) {
        adapter.print(fileType, fileName);
    }

}

