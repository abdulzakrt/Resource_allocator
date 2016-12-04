
import java.time.LocalDate;
import java.time.LocalTime;
import java.sql.Time;
import java.util.Date;
import java.io.Serializable;



public class Resource implements Serializable{

	protected int ID,Resource_Status;
	protected LocalDate startDate,endDate;   
	protected LocalTime startTime,endTime;
	protected String location;
	protected char Allowance_time;
	public Resource() {
		
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getResource_Status() {
		return Resource_Status;
	}
	public void setResource_Status(int resource_Status) {
		Resource_Status = resource_Status;
	}
	public LocalTime getStart_Time() {
		return startTime;
	}
	public void setStart_Time(LocalTime startTime) {
                this.startTime = startTime;
	}
	public char getAllowance_time() {
		return Allowance_time;
	}
	public void setAllowance_time(char allowance_time) {
		Allowance_time = allowance_time;
	}
	public LocalDate getEnd_Time() {
		return this.endDate;
	}
	public void setEnd_Time(LocalTime end) {
		this.endTime = end;
	}
        public void setResourceLocation(String Location){
            this.location = Location;
        }
        public String getResourceLocation(){
            return this.location;
        }
        public void setStart_date(LocalDate startDate){
            this.startDate = startDate;
        }
        public LocalDate getStart_date(){
            return this.startDate;
        }
        public void setEnd_date(LocalDate endDate){
            this.endDate = endDate;
        }
        public LocalDate getend_date(){
            return this.endDate;
        }
        public String toString(){
            return ("id: "+this.ID + "Location: "+ this.location + " Start Date: " + this.startDate);
        }       
}
