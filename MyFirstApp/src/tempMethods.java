import java.text.SimpleDateFormat;
import java.util.Date;


public class tempMethods {
	public String getDate(){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String data = sdf.format(date);
		return data;
	}

}
