class GenObjectArray<T>{
   Object[] oa=null;
   int capacity;
   public GenObjectArray(int cap){
	capacity=cap;
	oa=new Object[cap];
   }
   //method to add object to the array
   public void addObject(T o,int index) throws Exception{
	if (index < capacity-1){
		//adding elemeent at the given index
		oa[index]=o;	
	}else{
		throw new Exception();
	}
   }
   //method to read object from the array
   public T readObject(int index) throws Exception{
	T obj=null;
	if (index < capacity-1){
	    return (T)oa[index];	
	}else{
	    throw new Exception();
	}
   }
}