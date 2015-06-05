package arrays;

public class HHashMap {

	private final int SIZE=64;
	HashEntry[] entry;
	public HHashMap() {
	 entry=new HashEntry[SIZE];
	//entry is the array of hashEntry objects which contain the actual key and value and
	 //next pointer to the another object in the linked-list in that bucket location
	}
	
	

	public void put(String key,String value){
		int hash=key.hashCode()%SIZE;
		HashEntry entryObject=entry[hash];
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
				HashEntry newEntry=new HashEntry(key, value);
				entryObject.next=newEntry;
			}
		}else{
			//else we create a new entry object and insert it into the hash position
			HashEntry newEntry=new HashEntry(key, value);
			entry[hash]=newEntry;
		}
	}
	
	public String get(String key){
		int hash=key.hashCode()%SIZE;
		//get the entry object at the hash position of the key-hash
		HashEntry entryObject=entry[hash];
		//iterate through the linked list at the bucket position compare the key and return
		//the corresponding value
		while(entryObject!=null){
			if(entryObject.getKey().equals(key))
				return entryObject.getValue();
			}
		return null;
		}

}
