import java.util.*;

/* This file implements the class Report.
 * 
 */

/**
 * Class Report. The superclass of Import/Export/ShiftReport.
 * @author Liu Yang
 */
public class Report {
	
    static int REPORT_COUNT = 0;
    int reportID;
    int cargoAmount;
    Manager creator;            /* class Manager not declared yet */
    boolean saved = false;
    boolean confirmed = false;
    
    /**
     * Constructor
     * @param amount The cargo amount for this order
     * @param creator The creator of this report
     */
    public Report(int amount, Manager creator) {
    	REPORT_COUNT += 1;
    	this.reportID = REPORT_COUNT;
    	this.cargoAmount = amount;
    	this.creator = creator;
    }
    
    public int getID() {
    	return this.reportID;
    }
    
    public boolean isSaved() {
    	return this.saved;
    }
    
    public boolean isConfirmed() {
    	return this.confirmed;
    }
    
    public void setSaved() {
    	this.saved = true; 
    }
    
    public void resetSaved() {
    	this.saved = false; 
    }    
    
    public void setConfirmed() {
    	this.confirmed = true; 
    }
    
    public void resetConfirmed() {
    	this.confirmed = false; 
    }
    

    
    public Map<String, Object> viewInfo() {
    	Map<String, Object> reportView = new HashMap<String, Object>();
    	return reportView;
    }
}
