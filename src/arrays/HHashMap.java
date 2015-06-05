package arrays;

public class HHashMap<Item> {

	private final int SIZE=64;
	private Object[] entry;
	//HashEntry<Item>[] entry;
	public HHashMap() {
	 entry = new Object[SIZE];
	}
	
	
	public void put(Item key,Item value){
		int hash=key.hashCode()%SIZE;
		// I have to include  a cast as java doesn't support generic arrays.
		@SuppressWarnings("unchecked")
		HashEntry<Item> entryObject=(HashEntry<Item>) entry[hash];
		//first we check that if there is any entryObject at that particular position 
		if(entryObject!=null){
			//if the key equals the key already inserted, we replace the value
			if(entryObject.getKey().equals(key)){
				entryObject.setValue(value);
			}else{
			// if the key is not same but hash of two keys is same, we handle the collision
			//by maintaining a linked-list and we traverse through the end of the linked-list 
			//at that bucket and append the new entry object at the end.
				while(entryObject.getNext()!=null){
					entryObject=entryObject.getNext();
				}
				HashEntry<Item> newEntry=new HashEntry<Item>(key, value);
				entryObject.next=newEntry;
			}
		}else{
			//else we create a new entry object and insert it into the hash position
			HashEntry<Item> newEntry=new HashEntry<Item>(key, value);
			entry[hash]=newEntry;
		}
	}
	
	public Item get(Item key){
		int hash=key.hashCode()%SIZE;
		//get the entry object at the hash position of the key-hash
		@SuppressWarnings("unchecked")
		HashEntry<Item> entryObject=(HashEntry<Item>) entry[hash];
		//iterate through the linked list at the bucket position compare the key and return
		//the corresponding value
		while(entryObject!=null){
			if(entryObject.getKey().equals(key))
				return entryObject.getValue();
			}
		return null;
		}

}
