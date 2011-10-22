package org.kevinmorris.coldfront;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ColdfrontEngine {
  
  private String location;  
  private Date dateTime;
  private String dataType;

  public ColdfrontEngine() {
    
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Date getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateText, String timeText) {
    DateFormat df = new SimpleDateFormat("yyyy.MM.dd" + (timeText == null ? "" : " HH:mm"));    
    try {
      this.dateTime = df.parse(dateText.toString() + (timeText == null ? "" : " " + timeText.toString()));
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }

  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }
}
