class TestObjectArray{
    public static void main(String[] args){
	ObjectArray oa=new ObjectArray(5);
	try{

	//adding eleements
	oa.addObject("Kiran",0);
	oa.addObject(new StringBuffer("nimai"),1);
	oa.addObject(new Integer(100),2);

	//reading elements
	String t=(String)oa.readObject(0);
	StringBuffer sb=(StringBuffer)oa.readObject(1);
	Integer ig=(Integer)oa.readObject(2);

	System.out.println(sb.toString());
	}catch(Exception ex){
 	     ex.printStackTrace();
	}
    }
}