import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * The Project class is a java application which uses our 
 * SQL Concession Stand Inventory Database Structure. 
 * 
 * @authors cs-hu310, KatieHood, JaredRackley
 * Spring2019
*/


public class Project {
	public static void main(String[] args) {

		//TODO makeConnection() for using database
		
		if(args.length >= 1 && args.length <=4) {

			try{
				if(args[0].equals("/?")){
					printUsageStatement();
				}
				else if(args[0].equals("CreateItem")){

				}
				else if(args[0].equals("CreatePurchase")){

				}
				else if(args[0].equals("CreateShipment")){

				}
				else if(args[0].equals("GetItems")){

				}
				else if(args[0].equals("GetShipments")){

				}
				else if(args[0].equals("GetPurchases")){

				}
				else if(args[0].equals("ItemsAvailable")){

				}
				else if(args[0].equals("UpdateItem")){

				}
				else if(args[0].equals("DeleteItem")){

				}
				else if(args[0].equals("DeleteShipment")){

				}
				else if(args[0].equals("DeletePurchase")){

				}
				else{
					throw new IllegalArgumentException("IllegalArgument: This command is not valid");
					//printUsageStatement();
				}
			}
			catch(Exception e) {
				
			}
		}
		else {
			printUsageStatement();
		}
	}
	
	static void printUsageStatement(){
		System.out.println("Usage:\n" + "CreateItem <itemCode> <itemDescription> <price>\n"
		+ "CreatePurchase <itemCode> <PurchaseQuantity>\n" 		
		+ "CreateShipment <itemCode> <ShipmentQuantity> <shipmentDate>\n"
		+ "GetItems <itemCode>\n" + "GetShipments <itemCode>\n"
		+ "GetPurchases <itemCode>\n" + "ItemsAvailable <itemCode>\n"
		+ "UpdateItem <itemCode> <price>\n" + "DeleteItem <itemCode>\n"
		+ "DeleteShipment <itemCode>\n" + "DeletePurchase <itemCode>");
	}
	
	public static Connection makeConnection(String port, String database, String password) {
		try {
			Connection conn = null;
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:" + port+ "/" + database+
					"?verifyServerCertificate=false&useSSL=true", "msandbox",
					password);
			// Do something with the Connection
			System.out.println("Database " + database +" connection succeeded!");
			System.out.println();
			return conn;
		} catch (SQLException ex) {
			// handle any errors
			System.err.println("SQLException: " + ex.getMessage());
			System.err.println("SQLState: " + ex.getSQLState());
			System.err.println("VendorError: " + ex.getErrorCode());
		}
		return null;
	}

	//TODO make methods for method calls in main with commandline args
	
	//TODO make createItem method for commandline args
	//CreateItem <itemCode> <itemDescription> <price>
	void createItem(int itemCode, String itemDescription, double price) {
		
	}
	
	//TODO make createPurchase method for
	//CreatePurchase <itemCode> <PurchaseQuantity>
	void createPurchase(int itemCode, int PurchaseQuantity) {
		
	}
	
	//TODO make createShipment method for
	//CreateShipment <itemCode> <ShipmentQuantity> <shipmentDate>
	void createShipment(int itemCode, int ShipmentQuantity, Date ShipmentDate) {
		
	}
	
	//TODO make getItem method for 
	//GetItems <itemCode>
	int getItems(int itemCode) {
	
		
		return 0; //put actual return	
	}
	
	//TODO make getShipment method for
	//GetShipments <itemCode>
	int getShipment(int itemCode) {
		
		return 0; //put actual return
	}
	
	//TODO make getPurchase method for 
	//GetPurchases <itemCode>
	//?return type string for purchase item name or int for # of purchases???
	int getPurchases(int itemCode) {
		
		
		return 0; //put actual return
	}
	
	//TODO make itemsAvailable method for
	//ItemsAvailable <itemCode>
	int itemsAvailable(int itemCode) {
		
		return 0; //put actual return
	}
	
	//TODO make updateItem method for
	//UpdateItem <itemCode> <price>
	void updateItem(int itemCode, double price) {
		
	}
	
	//TODO make deleteItem method for
	//DeleteItem <itemCode>
	void deleteItem(int itemCode) {
		
	}
	
	//TODO make deleteShipment method for
	//DeleteShipment <itemCode>
	void deleteShipment(int itemCode) {
		
	}
	
	//TODO make deletePurchase method 
	//DeletePurchase <itemCode>
	void deletePurchase(int itemCode) {
		
	}
}
