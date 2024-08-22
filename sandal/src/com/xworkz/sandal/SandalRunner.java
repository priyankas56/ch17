package com.xworkz.sandal;

import com.xworkz.sandal.data.SandalData;
import com.xworkz.sandal.data.store.SandalStore;

public class SandalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           SandalStore store=new SandalStore();
            //store.display();
           
           SandalData data1=new SandalData("relaxo",'6',500,"black");
               store.save(data1);
               store.display();
               
               SandalData data2=new SandalData("bata",'7',700,"black");
               store.save(data2);
               store.display();
               
               SandalData data3=new SandalData("crocs",'6',1000,"blue");
               store.save(data3);
               store.display();
               
               SandalData data4=new SandalData("adidas",'8',600,"white");
               store.save(data4);
               store.display();
               
               SandalData data5=new SandalData("mochi",'9',800,"pink");
               store.save(data5);
               store.display();
	}

}
