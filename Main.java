public class Main {
    public static void main(String[] args) {
        Handler tfh = new TextFileHanler("1st handler");
        Handler ifh = new ImageFileHanler("3rd handler");
        Handler dfh = new DocFileHanler("2nd handler");
        tfh.setHandler(dfh);
        dfh.setHandler(ifh);
        
        tfh.process(new File("demo1", "text" , "C:OOP"));
        tfh.process(new File("demo2", "image" , "C:OOP"));
        tfh.process(new File("demo3 ","doc", "C:OOP"));
    }
}