
public class Sports_Courts extends Resource{
    
        private static int courtCounter;
        private char courtType;
        private boolean lightAvailable;
        private boolean indoorCourt;

	public Sports_Courts() {
		courtCounter++;
	}
        
        private void setCourtType(char courtType){
            this.courtType = courtType;
        }

        private void setLightAvailablitiy(boolean light){
            this.lightAvailable = light;
        }
        
        private void setIndoor(boolean Indoor){
            this.indoorCourt = Indoor;
        }
        private char getCourtType(){
            return this.courtType;
        }
        
        private boolean isLightAvailable(){
            return this.lightAvailable;
        }
        
        private boolean isIndoorCourt(){
            return this.indoorCourt;
        }
}