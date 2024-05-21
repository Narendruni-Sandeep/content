class ObjectArray{
   Object[] oa=null;
   int capacity;
   public ObjectArray(int cap){
	capacity=cap;
	oa=new Object[cap];
   }
   //method to add object to the array
   public void addObject(Object o,int index) throws Exception{
	if (index < capacity-1){
		//adding elemeent at the given index
		oa[index]=o;	
	}else{
		throw new Exception();
	}
   }
   //method to read object from the array
   public Object readObject(int index) throws Exception{
	Object obj=null;
	if (index < capacity-1){
	    return oa[index];	
	}else{
	    throw new Exception();
	}
   }
}