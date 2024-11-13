package project_2;

public class Employe {

	public static void main(String[] args) {
		
       private int eid;
       private String ename;
       private String city;
       
       
       public int getEid() {
    	   return eid;
       }
       public void setEid(int eid) {
    	   this.eid = eid;
       }
       public String getEname() {
    	   return ename;
       }
       public void setEname(String enmae) {
    	   this.ename = ename;	   
       }
       public String getCity() {
    	   return city;
       }
       public void setCity(String city) {
    	   this.city = city;
       }
       
       @Override
       public String toString() {
    	   return "employe [eid=" + eid+ ", ename=" + ename + ", city=" + city+ "]";
       }
       
	}

}
