class SamsungRunner{
public static void main(String [] max)
{
	
	Samsung.refInt=12345;
	Samsung.refByte=127;
	Samsung.refShort=5675;
	Samsung.refFloat=15000f;
	Samsung.refDouble=80.66;
	Samsung.refLong=877788931;
	Samsung.refBoolean=true;
	Samsung.refString="Samsung";
	Samsung.refChar='2';
	
System.out.println("Int default value:"+Samsung.refInt);
System.out.println("Float default value:"+Samsung.refFloat);
System.out.println("Short default value:"+Samsung.refShort);
System.out.println("Byte default value:"+Samsung.refByte);
System.out.println("Double default value:"+Samsung.refDouble);
System.out.println("Long default value:"+Samsung.refLong);
System.out.println("Boolean default value:"+Samsung.refBoolean);
System.out.println("String default value:"+Samsung.refString);
System.out.println("Char default value:"+Samsung.refChar);
}
}