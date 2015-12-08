package step07;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HDDPropertyEditor extends PropertyEditorSupport {

  HDD hdd;
  public HDDPropertyEditor() {
  }

  @Override
  public void setAsText(String text) throws IllegalArgumentException {
   try{
    hdd = new HDD();
    String[] storage = text.split(",");
    
    hdd.setCapacity(Integer.parseInt(storage[0]));
    hdd.setRpm(Integer.parseInt(storage[1]));
    
    this.setValue(hdd); // **********************
   } catch (Exception e) {
     throw new IllegalArgumentException(e);
     
   }
  }

}
