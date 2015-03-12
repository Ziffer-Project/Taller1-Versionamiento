public class File{
	
    private String fileType;
    private Byte[] content;
    private double size;
 
	public void setFileType(String fileType){
		this.fileType = fileType;
	}
	   
    public String getFileType(){
        return fileType;
    }
    
	public void setContent(Byte[] content){
		this.content = content;
	}
	
    public Byte[] getContent(){
		return content;
	}

	public void setSize(double size){
		this.size = size;
	}
	
	public double getSize(){
		return size;
	}
	
	public void download(){
    	throw new UnsupportedOperationException("Método no implementado");
    }
    
    public void share(){
    	throw new UnsupportedOperationException("Método no implementado");
    }
}
