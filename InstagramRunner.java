class InstagramRunner{
   public static void main(String []args){
      System.out.println("------First time method call------");
	  String ankit = Instagram.validateAndRegister(70865432187L,"Ant@1234","16-03-2025","ankit","ankit17");
	  System.out.println(ankit);
	  
	  System.out.println("------Second time method call------");
	  String ankitha = Instagram.validateAndRegister(3456783997L,null,"16-03-2025","ankitha","ankitha17");
	  System.out.println(ankitha);
	}
}	