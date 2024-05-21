import java.io.*;
 public class ByteArrayOutputStreamExample {
    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();

        FileOutputStream fout1=new FileOutputStream(args[0]);    
        FileOutputStream fout2=new FileOutputStream(args[1]);

        //writing some numbers 
        for (int i=0;i<10;i++) {
            bout.write((byte) (Math.random() * 100));
        }
        
		 //Writing the content to two different files
	  	 bout.writeTo(fout1);    
        bout.writeTo(fout2);     
        bout.flush(); 
        
		 //reading from byte stream
        byte[] byteArray = bout.toByteArray();
        System.out.println("The original array:");
        
		 for (byte b : byteArray)
            System.out.print(b+" ");
    }
}