class SuperList{
   public static void main(String[] args){
		Class cls=null;
		try{
		//loading class into the memory
		cls=Class.forName(args[0]);

		//listing all super classes of the given class
		while((cls=cls.getSuperclass())!=null){
	 	    System.out.println(cls.getName());
		}
	}catch(Exception ex){
	     ex.printStackTrace();
	}
   }
}
	