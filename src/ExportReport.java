/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author new
 */
public class ExportReport extends Report {

	Warehouse senderWarehouse;
	
	public ExportReport(int amount, Manager creator, Warehouse wh) {
		super(amount, creator);
		// TODO Auto-generated constructor stub
		this.senderWarehouse = wh;
	}

}
