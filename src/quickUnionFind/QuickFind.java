package quickUnionFind;

public class QuickFind {

	private int[] id;
	private int[] siz;

	public QuickFind(int n) {
		id=new int[n];
		siz=new int[n];
		for(int i=0;i<n;i++){
			id[i]=i;
		}
	}
	public void union(int p,int q){
		int replace_value=id[q];
		int temp=id[p];
		for(int i=0;i<id.length;i++){
			if(id[i]==p){
				id[p]=replace_value;
			}
		}
		for(int i=0;i<id.length;i++){
			if(id[i]==temp){
				id[i]=replace_value;
			}
		}
	}

	public void quickUnion(int p,int q){
		int i=getroot(p);
		int j=getroot(q);
		id[i]=j;
	}


	public void weightedQuickUnion(int p,int q){
		int i=getroot(p);
		int j=getroot(q);
		if(i==j)
			return;
		if(siz[i]<siz[j]){
			id[i]=j;
			siz[j]+=siz[i];
		}
		else{
			id[j]=i;
			siz[i]+=siz[j];
		}
	}

	public boolean quickFind(int p,int q){
		return getroot(p)==getroot(q);
	}

	private int getroot(int p) {
		while(p!=id[p]){
			p=id[p];
		}
		return p;
	}
	public boolean find(int p,int q){
		return id[p]==id[q];
	}

	public void print(){
		for(int i=0;i<id.length;i++){
			System.out.print(id[i]+",");
		}
	}

}
