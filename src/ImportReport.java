/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author new
 */
public class ImportReport extends Report {

	Warehouse receiverWarehouse;
    int damageAmount = 0;
	
	public ImportReport(int amount, Manager creator, Warehouse wh) {
		super(amount, creator);
		// TODO Auto-generated constructor stub
		this.receiverWarehouse = wh;
	}

    public void updateDamage(int damage) {
    	this.damageAmount = damage;
    }
	
}
