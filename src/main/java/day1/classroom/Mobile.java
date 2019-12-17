package day1.classroom;

public class Mobile {

	public int getmobilenumber(int mobilenum) {

		System.out.println("Make a call to");
		return mobilenum;

			
			}

		public String sendSMS(String SMS) {
			System.out.println("SMS content is");
			return SMS;
			
		}

		public boolean Shutdown() {
			System.out.println("Shutdown Successful");
			return true;
		}

		public static void main(String[] args) {
			Mobile Action = new Mobile();

			int getmobilenumber = Action.getmobilenumber(99888);
			System.out.println(getmobilenumber);
			
			String sendSMS = Action.sendSMS("How are you");
			System.out.println(sendSMS);
		}
}




