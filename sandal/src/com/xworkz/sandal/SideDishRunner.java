package com.xworkz.sandal;

import com.xworkz.sandal.data.SideDishData;
import com.xworkz.sandal.data.store.SideDishStore;

public class SideDishRunner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       SideDishStore sideDishStore=new  SideDishStore();
       //sideDishStore.display();
       
       SideDishData data1=new SideDishData("salad",500,"veg");
       sideDishStore.save(data1);
       sideDishStore.display();
       
       SideDishData data2=new SideDishData("french fries",100,"veg");
       sideDishStore.save(data2);
       sideDishStore.display();
       
       SideDishData data3=new SideDishData("sweet potatoes",250,"veg");
       sideDishStore.save(data3);
       sideDishStore.display();
       
       SideDishData data4=new SideDishData("pilaf",350,"veg");
       sideDishStore.save(data4);
       sideDishStore.display();
       
       SideDishData data5=new SideDishData("baked beans",400,"veg");
       sideDishStore.save(data5);
       sideDishStore.display();

}
}
