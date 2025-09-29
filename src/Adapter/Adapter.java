package Adapter;

//Creamos el Adapter
class Adapter implements Printer{
    //Referenciamos las clases
    private ImpresoraPDF impresoraPDFAdapted;
    private ImpresoraTexto impresoraTextoAdapted;
    //Creamos el constructor
    public Adapter(){
        impresoraPDFAdapted = new ImpresoraPDF();
        impresoraTextoAdapted = new ImpresoraTexto();
    }
    //Hacemos un override con el método de la interfaz
    @Override
    public void print(String fileType, String fileName){
        if (fileType.equalsIgnoreCase("pdf")){//equalsIgnoreCase es un método que ignora mayúsculas
            /*Si nuestro archivo es pdf, llamamos al método de la clase pdfFileAdapted que imprime pdfs*/
            impresoraPDFAdapted.printPdf(fileName);
            /*Si nuestro archivo es txt, llamamos al método de la clase txtFileAdapted que imprime pdfs*/
        } else if (fileType.equalsIgnoreCase("txt")){
            impresoraTextoAdapted.printTxt(fileName);
        } else{
            System.out.println("Formato no soportado: " + fileType);
        }
    }
}

