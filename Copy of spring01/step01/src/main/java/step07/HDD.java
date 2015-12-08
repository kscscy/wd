package step07;

import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;
import java.util.Date;

import org.springframework.beans.PropertyEditorRegistry;

public class HDD {
  
  //private PropertyEditor editor;
  
  protected int capacity;
  protected int rpm;
  protected Date createdDate;
  
  @Override
  public String toString() {
    return "HDD [capacity=" + capacity + ", rpm=" + rpm + ", createdDate=" + createdDate + "]";
  }
  
  
/*  public void setPropertyEditor(PropertyEditor editor) {
    this.editor = editor;
  }
  public void registerCustomEditors(PropertyEditorRegistry registry) {
    registry.registerCustomEditor(Date.class, editor);
  }*/
  
  
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }
  public int getCapacity() {
    return capacity;
  }
  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }
  public int getRpm() {
    return rpm;
  }
  public void setRpm(int rpm) {
    this.rpm = rpm;
  }
  
}
