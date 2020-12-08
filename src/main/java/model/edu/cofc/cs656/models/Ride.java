package model.edu.cofc.cs656.models;

public class Ride{
	
	private RideStatus status;
	
	public enum RideStatus {
		Started () {
			@Override
			public boolean isStarted() {
				return true;
			}
		},	
		NotStarted () {
			@Override
			public boolean isNotStarted() {
				return false;
			}
		},
		
		Finished() {
			@Override
			public boolean isFinished() {
				return true;
			}
		},	

		Errored () {
			@Override
			public boolean isErrored() {
				return false;
			}
		};
		
		public boolean isStarted() {return false;}
		public boolean isNotStarted() {return true;}
		public boolean isFinished() {return false;}
		public boolean isErrored() {return true;}
		
		RideStatus () {
		}
		
	}
	
	public boolean isInProgress() {
		return this.status.isStarted();
	}

	public void setStatus(RideStatus s) {
		status = s;		
	}
	
	public RideStatus getStatus() {
		return status;
	}

    public static void main(String[] args) {
    	Ride rs = new Ride();
    	rs.setStatus(Ride.RideStatus.NotStarted);
    	System.out.println(rs.isInProgress());
    	
    	rs.setStatus(Ride.RideStatus.Started);
    	System.out.println(rs.isInProgress());
    	
    }
}
