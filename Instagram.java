class Instagram{
public static String validateAndRegister(long mobileNumber,String psw,String birthday,String fullName,String userName){
    System.out.println("validateAndRegister method is started");
	String registerStatus= null;
	if(mobileNumber !=0 && psw != null && birthday != null && fullName != null && userName != null){// null pointer Exception
		 if(psw.length()>6 && fullName.length()>1 && userName.length()>4){
		    registerStatus ="Thank You "+fullName+" Registered Successfuly";  
		}else{
            registerStatus="Please check the length of psw,FullName,UserName";
		}
    }else{
       registerStatus ="Please enter the valid data ";
	}
	System.out.println("validateAndRegister method is ended");
	return registerStatus;
}
}

	
			