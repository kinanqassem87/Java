import java.io.*;
public class Test {

	public static void main(String[] args) {
		SMSClient sms = new SMSClient(1);
		sms.sendMessage("0933372016","hi,this message has been sent by computer");
	}

}
