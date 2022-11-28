package Sid;
import java.util.Scanner;
import java.sql.*;


	
	
	
	interface pharmacy1
	{
		void menulist();
		void order();
		void insert();
		void update();
		void display();
		void delete();
		void exit();
	}
	public class pharmacy implements pharmacy1
	{

		@Override
		public void menulist() {
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println("Enter your choice");
			System.out.println("1.INSERT RECORD: ");
			System.out.println("2.ORDER DETAILS: ");
			System.out.println("3.UPDATE ORDER: ");
			System.out.println("4.DISPLAY ORDER DETAILS: ");
			System.out.println("5.DELETE RECORD: ");
			System.out.println("6.EXIT");
			
		}

		@Override
		public void insert() {
			
			try {
				System.out.println("---------------");
				System.out.println("Enter your new customer details here");
				System.out.println("---------------");

				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy","root","");
				Scanner sc=new Scanner(System.in);
				PreparedStatement ps=con.prepareStatement("insert into pharmacy_details values(?,?,?,?,?,?,?,?)");
	            System.out.println("Enter the id");
	            int id=sc.nextInt();
	            System.out.println("Enter the name");
	            String name=sc.next();
	           System.out.println("Enter your order ");
	           String order_menu=sc.next();
	           System.out.println("Enter your order quantity");
	           int quantity=sc.nextInt();
	           System.out.println("Enter your bill");
	           int bill=sc.nextInt();
	           System.out.println("Enter your address");
	           String address=sc.next();
	           System.out.println("Enter your phoneno" );
	           String phoneno=sc.next();
	           System.out.println("Enter your order date");
	           String order_date=sc.next();
	           
	           ps.setInt(1,id);
	           ps.setString(2,name);
	           ps.setString(3, order_menu);
	           ps.setInt(4,quantity);
	           ps.setInt(5, bill);
	           ps.setString(6,address);
	           ps.setString(7,phoneno);
	           ps.setString(8,order_date);
	           int p=ps.executeUpdate();
	           System.out.println(p +"records add sucessfully");
	           con.close();
			}
			catch(SQLException e)
			{
				System.out.println("Duplicate entry");
			}
			catch(Exception e) {
				
				System.out.println(e);
			}
			} 
		@Override
		public void order() {
			System.out.println("***************");
			System.out.println("Order your required medicine");
			System.out.println("***************");
			System.out.println("----------------------------------------------");
			System.out.println("Here is the list of Medicine");
			System.out.println("----------------------------------------------");

	        System.out.println("Menu                                Price    ");
	        System.out.println("1.Dola-500                          40       ");
	        System.out.println("2.Paracetamol-500mg                 35       ");
	        System.out.println("3.Saridon                           20       ");
	        System.out.println("4.Cycra-d-200mg                     140      ");
	        System.out.println("5.Gasogel-syrup                     85       ");
	        System.out.println("6.Catasyn-syrup                     65       ");
	        System.out.println("7.Cheston coldDS-s                  67       ");
	        System.out.println("8.Zyncat-syrup                      150      ");
	        System.out.println("9.Telma-40mg                        120      ");
	        System.out.println("10.Metalac Z Sr-Tablet              100      ");
	        System.out.println("11.Dabur Pudinhara                  150      ");
	        System.out.println("12.Strepsils                        20       ");
	        System.out.println("13.Augmention 625-Tablet            223      ");
	        System.out.println("14.Azithral 500-Tablet              130      ");
	        System.out.println("15.Avil 25-Tablet                   09       ");
	        

				
			
		int Dola500=40;	
		int Paracetamol500mg=30;
		int Saridon = 20;
		int Cycrad200mg=140; 
		int Gasogel =85;
		int Catasyn=65;
		int Cheston=67;
		int Zyncat=150;   
		int Telma= 120;
		int Metalac=100;
		int Pudinhara=150;
		int Strepsils=20;
		int Augmention=223;
		int Azithral=130;
		int Avil = 9;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter order :   ");
		int ch=sc.nextInt();
		System.out.println("Enter your quantity:  ");
		int qu=sc.nextInt();
		if (ch==1)
		{
			int bill=Dola500*qu;
			System.out.println("your order no is:"+ch);
			System.out.println("your order quantity is:"+qu);
			System.out.println("your bill  = Dola500 price X quantity  :" + qu +" X  40 = " +bill);
			
		}
		else if(ch==2)
		{
			int bill=Paracetamol500mg*qu;
			System.out.println("your order no is:"+ch);
			System.out.println("your order quantity is:"+qu);
			System.out.println("your bill  = Paracetamol 500mg price X quantity:"+ qu +" X  30 = "+ bill);
		}
		else if(ch==3)
		{
			int bill=Saridon*qu;
			System.out.println("your order no is:"+ch);
			System.out.println("your order quantity is:"+qu);
			System.out.println("your bill  = Saridon price X quantity  :"+ qu +" X  20 = "+ bill);
			
		}
		else if(ch==4)
		{
			int bill=Cycrad200mg*qu;
			System.out.println("your order no is:"+ch);
			System.out.println("your order quantity is:"+qu);
			System.out.println("your bill = Cycrad200mg price X quantity:"+ qu +" X 140 = "+ bill);
			
		}
		else if(ch==5) 
		{
			int bill=Gasogel*qu;
			System.out.println("your order no is:"+ch);
			System.out.println("your order quantity is:"+qu);
			System.out.println("your bill = Gasogel price X quantity:"+ qu +" X 85 = "+ bill);
			
		}
		else if(ch==6)
		{   
			int bill=Catasyn*qu;
			System.out.println("your order no is:"+ch);
			System.out.println("your order quantity is:"+qu);
			System.out.println("your bill = Catasyn price X quantity:"+qu +" X 65 = "+ bill);
			
		}
		else if(ch==7)
		{
			int bill=Cheston*qu;
			System.out.println("your order no is:"+ch);
			System.out.println("your order quantity is:"+qu);
			System.out.println("your bill = Cheston price X quantity:"+qu +" X 67 = "+ bill);
			
		}
		else if(ch==8)
		{
			int bill=Zyncat*qu;
			System.out.println("your order no is:"+ch);
			System.out.println("your order quantity is:"+qu);
			System.out.println("your bill = Zyncat price X quantity  :"+qu +" X 150 = "+ bill);
		}
		else if(ch==9)
		{
			int bill=Telma*qu;
			System.out.println("your order no is:"+ch);
			System.out.println("your order quantity is:"+qu);
			System.out.println("your bill = Telma price X quantity:"+qu +" X 120 ="+ bill);
		}
		else if(ch==10)
		{
			int bill= Metalac*qu;
			System.out.println("your order no is:"+ch);
			System.out.println("your order quantity is:"+qu);
			System.out.println("your bill =  Metalac price X quantity:"+qu +" X 100 ="+ bill);
		}
		else if(ch==11)
		{
			int bill= Pudinhara*qu;
			System.out.println("your order no is:"+ch);
			System.out.println("your order quantity is:"+qu);
			System.out.println("your bill =  Pudinhara price X quantity:"+qu +" X 150 ="+ bill);
		}
		else if(ch==12)
		{
			int bill= Strepsils*qu;
			System.out.println("your order no is:"+ch);
			System.out.println("your order quantity is:"+qu);
			System.out.println("your bill =  Strepsils price X quantity:"+qu +" X 20 ="+ bill);
		}
		else if(ch==13)
		{
			int bill= Augmention*qu;
			System.out.println("your order no is:"+ch);
			System.out.println("your order quantity is:"+qu);
			System.out.println("your bill =  Augmention price X quantity:"+qu +" X 223 ="+ bill);
		}
		else if(ch==14)
		{
			int bill= Azithral*qu;
			System.out.println("your order no is:"+ch);
			System.out.println("your order quantity is:"+qu);
			System.out.println("your bill =  Azithral price X quantity:"+qu +" X 130 ="+ bill);
		}
		else if(ch==15)
		{
			int bill= Avil*qu;
			System.out.println("your order no is:"+ch);
			System.out.println("your order2 quantity is:"+qu);
			System.out.println("your bill =  Avil price X quantity:"+qu +" X 9 ="+ bill);
		}
		else {
			System.out.println("Kindly Choose Above Options");
		}
		}
			
			
				

			
			
		

		@Override
		public void update() {
			System.out.println("===============");
			System.out.println("Update your customer details here");
			System.out.println("===============");

			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy","root","");
			Scanner sc=new Scanner(System.in);
			PreparedStatement ps=con.prepareStatement("update pharmacy_details set order_details?,quantity=? ,bill=? where id=?");
			System.out.println("Enter the id");
			int id=sc.nextInt();
			System.out.println("Enter the order");
			String order=sc.next();
			System.out.println("Enter the quantity");
			int quantity=sc.nextInt();
			System.out.println("Enter the bill");
			int bill=sc.nextInt();
			
			ps.setInt(4,id);
			ps.setString(1,order);
			ps.setInt(2, quantity);
			ps.setInt(3,bill);
			int p=ps.executeUpdate();
			System.out.println(p+"update the record sucessfully");
			
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
			
		}

		@Override
		public void display() {
			System.out.println("==================================");
			System.out.println("Display your customer records here");
			System.out.println("==================================");

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy","root","");
				Statement st=con.createStatement();
				Scanner sc=new Scanner(System.in);
				ResultSet rs=st.executeQuery("select* from pharmacy_details");
				while(rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getInt(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8));
				}}
				catch(Exception e) {
					System.out.println(e);
				}
			
		}

		@Override
		public void delete() {
			System.out.println("=================================");
			System.out.println("Delete your customer details here");
			System.out.println("=================================");

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy","root","");
				Scanner sc=new Scanner(System.in);
				PreparedStatement ps=con.prepareStatement("delete from pharmacy_details where id=?");
				System.out.println("Enter the id");
				int id=sc.nextInt();
				
				ps.setInt(1, id);
				int p=ps.executeUpdate();
				System.out.println(p+"Delete the record sucessfully");
		}
			catch(Exception e) {
				System.out.println(e);
			}}
		@Override
		public void exit() {
			System.out.println("===========================================");
	System.out.println("Thank you for coming.....Visit Again");	
	System.out.println("====================================================");

		}
		
		
		

		
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("//////////////////////////////////////");
			System.out.println("======================================");
			System.out.println("                                      ");
			System.out.println("**WELCOME TO NETMEDS PHARMACY**");
			System.out.println("                                      ");
			System.out.println("                                      ");
			System.out.println("    !!INDIA KI PHARMACY!!");
			
			System.out.println("                                      ");
			
			System.out.println("======================================");
			System.out.println("//////////////////////////////////////");
			System.out.println("Enter Admin username:");
			String username=sc.next();
			System.out.println("Enter Admin password:");
			String pwd=sc.next();
			String user="Siddhesh";
			String pass="1234";
			if(pass.equals(pwd) && user.equals(username)) {
				System.out.println("=======================================");
				System.out.println("**WELCOME TO NETMEDS PHARMACY**");
				System.out.println("=======================================");
				pharmacy h= new pharmacy();
				int ch;
				while(true) {
				h.menulist();
				
				System.out.println("Select an option: ");
			    ch=sc.nextInt();
				switch(ch) {
			//System.out.println("--------------------------------");
				case 1:h.insert();
				break;
				case 2:h.order();
				break;
				case 3:h.update();
				break;
				case 4:h.display();
				break;
				case 5:h.delete();
				break;
				case 6:h.exit();
				break;
				default:
				{
					System.out.println("Please enter valid choice");
				}
				}
			
			}}
			else {
				System.out.println("something went wrong");
			}
			
			
			
			
	}
	
	
	
	
}
