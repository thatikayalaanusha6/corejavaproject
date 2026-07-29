
public class ProductDtls {
	Integer Product_ID = 101;
	String Product_Name = "Dell Laptop";
	Integer Product_Price = 50000;
	String Product_Rating = "*****";
	Boolean Product_Available_Status = true;
	Integer Stock_Quantity = 50;
	Double Discount_Percentage = 10.0;
	String Product_Code = "A1065CEE";
	
	
	void Disp()
	{
    System.out.println("DETAILS OF DELL PRODUCT");
    System.out.println("******************************************");
		
	System.out.println("PRODUCT ID : " +Product_ID);
	System.out.println("PRODUCT NAME : " +Product_Name);
	System.out.println("PRODUCT PRICE : " +Product_Price);
	System.out.println("PRODUCT RATE : " +Product_Rating);
	System.out.println("PRODUCT AVAIALABILITY STATUS : " +Product_Available_Status);
	System.out.println("STOCK OF THE PRODUCT : " +Stock_Quantity);
	System.out.println("DISCOUNT  : " +Discount_Percentage);
	System.out.println("PRODUCT CODE : " +Product_Code);
	}

	public static void main(String[] args) {
		ProductDtls pd = new ProductDtls();
		pd.Disp();
		

		
	}

}
