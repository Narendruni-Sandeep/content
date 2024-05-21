class TestGenObjectArray{
    public static void main(String[] args){
	GenObjectArray<StringBuffer> ga1=new GenObjectArray<StringBuffer>(5);
	GenObjectArray<Integer> ga2=new GenObjectArray<Integer>(5);
	try{
	//adding eleements
	//ga1.addObject("Kiran",0);	--will not allow
	ga1.addObject(new StringBuffer("Nimai"),1);
	//ga1.addObject(new Integer(100),2);	- will not allow
	ga1.addObject(new StringBuffer("KRsna"),2);

	//reading elements
	StringBuffer sb1=ga1.readObject(1);
	StringBuffer sb2=ga1.readObject(2);
	System.out.println(sb1.toString());
	System.out.println(sb2.toString());

	//adding eleements
	ga2.addObject(new Integer(200),1);
	ga2.addObject(new Integer(300),2);	
	//ga2.addObject(new StringBuffer("KRsna"),2);  - will not allow

	//reading elements
	Integer i1=ga2.readObject(1);
	Integer i2=ga2.readObject(2);
	System.out.println(i1.toString());
	System.out.println(i2.toString());

	}catch(Exception oe){
	}
    }
}