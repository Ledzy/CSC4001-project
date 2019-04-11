/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author new
 */
public class ShiftReport extends Report {

	Warehouse senderWarehouse;
	Warehouse receiverWarehouse;
	int damageAmount = 0;
	
	public ShiftReport(int amount, Manager creator, Warehouse swh, Warehouse rwh) {
		super(amount, creator);
		// TODO Auto-generated constructor stub
		this.senderWarehouse = swh;
		this.receiverWarehouse = rwh;
	}

    public void updateDamage(int damage) {
    	this.damageAmount = damage;
    }
	
}
