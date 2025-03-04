public class ImageFileHanler implements Handler{
    private Handler handler;
    private String handlerName;

    public ImageFileHanler(String handlerName){
        this.handlerName = handlerName;
    }
    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void process(File file) {
        if(file.getFileType() .equals("image")){
            System.out.println("processing: " + file.getFilePath() + "/" +  file.getFileName() + " by " + handlerName);
        }else if(handler != null){
            System.out.println(handlerName + " forwards request to "
                    + handler.getHandlerName());
            handler.process(file);
        }

    }
    @Override
    public String getHandlerName() {
        return this.handlerName;
    }
}