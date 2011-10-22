package org.kevinmorris.coldfront;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;

public class ColdfrontTest {
  
  private ColdfrontLexer lexer;
  private ColdfrontParser parser;
  
  @Test
  public void testPositiveCoordinatesDateTemperature() throws RecognitionException, ParseException {
    lexer = new ColdfrontLexer(new ANTLRStringStream("(39.70, 104.75)@{2010.12.03}^temperature"));
    parser = new ColdfrontParser(new CommonTokenStream(lexer));
    
    ColdfrontEngine engine = parser.statement(null);
    
    DateFormat df = new SimpleDateFormat("yyyy.MM.dd");
    Date expectedDate = df.parse("2010.12.03");
    
    assertNotNull(engine);
    assertNotNull(engine.getLocation());
    assertNotNull(engine.getDateTime());
    assertNotNull(engine.getDataType());
    
    assertEquals("39.70, 104.75", engine.getLocation());
    assertEquals(expectedDate, engine.getDateTime());
    assertEquals("temperature", engine.getDataType());
  }
  
  @Test
  public void testPositiveCoordinatesDatetimeTemperature() throws RecognitionException, ParseException {
    lexer = new ColdfrontLexer(new ANTLRStringStream("(39.70, 104.75)@{2010.12.03 14:36}^temperature"));
    parser = new ColdfrontParser(new CommonTokenStream(lexer));
    
    ColdfrontEngine engine = parser.statement(null);
    
    DateFormat df = new SimpleDateFormat("yyyy.MM.dd HH:mm");
    Date expectedDate = df.parse("2010.12.03 14:36");
    
    assertNotNull(engine);
    assertNotNull(engine.getLocation());
    assertNotNull(engine.getDateTime());
    assertNotNull(engine.getDataType());
    
    assertEquals("39.70, 104.75", engine.getLocation()); 
    assertEquals(expectedDate, engine.getDateTime());
    assertEquals("temperature", engine.getDataType());
  }
  
  @Test
  public void testMixedCoordinatesDateTemperature() throws RecognitionException, ParseException {
    lexer = new ColdfrontLexer(new ANTLRStringStream("(39.70, -104.75)@{2010.12.03}^temperature"));
    parser = new ColdfrontParser(new CommonTokenStream(lexer));
    
    ColdfrontEngine engine = parser.statement(null);
    
    DateFormat df = new SimpleDateFormat("yyyy.MM.dd");
    Date expectedDate = df.parse("2010.12.03");
    
    assertNotNull(engine);
    assertNotNull(engine.getLocation());
    assertNotNull(engine.getDateTime());
    assertNotNull(engine.getDataType());
    
    assertEquals("39.70, -104.75", engine.getLocation()); 
    assertEquals(expectedDate, engine.getDateTime());
    assertEquals("temperature", engine.getDataType());
  }
  
  @Test
  public void testMixedCoordinatesDatetimeTemperature() throws RecognitionException, ParseException {
    lexer = new ColdfrontLexer(new ANTLRStringStream("(-39.70, 104.75)@{2010.12.03 14:36}^temperature"));
    parser = new ColdfrontParser(new CommonTokenStream(lexer));
    
    ColdfrontEngine engine = parser.statement(null);
    
    DateFormat df = new SimpleDateFormat("yyyy.MM.dd HH:mm");
    Date expectedDate = df.parse("2010.12.03 14:36");
    
    assertNotNull(engine);
    assertNotNull(engine.getLocation());
    assertNotNull(engine.getDateTime());
    assertNotNull(engine.getDataType());
    
    assertEquals("-39.70, 104.75", engine.getLocation()); 
    assertEquals(expectedDate, engine.getDateTime());
    assertEquals("temperature", engine.getDataType());
  }  
  
  @Test
  public void testNegativeCoordinatesDateTemperature() throws RecognitionException, ParseException {
    lexer = new ColdfrontLexer(new ANTLRStringStream("(-39.70, -104.75)@{2010.12.03}^temperature"));
    parser = new ColdfrontParser(new CommonTokenStream(lexer));
    
    ColdfrontEngine engine = parser.statement(null);
    
    DateFormat df = new SimpleDateFormat("yyyy.MM.dd");
    Date expectedDate = df.parse("2010.12.03");
    
    assertNotNull(engine);
    assertNotNull(engine.getLocation());
    assertNotNull(engine.getDateTime());
    assertNotNull(engine.getDataType());
    
    assertEquals("-39.70, -104.75", engine.getLocation()); 
    assertEquals(expectedDate, engine.getDateTime());
    assertEquals("temperature", engine.getDataType());
  }
  
  @Test
  public void testNegativeCoordinatesDatetimeHigh() throws RecognitionException, ParseException {
    lexer = new ColdfrontLexer(new ANTLRStringStream("(-39.70, -104.75)@{2010.12.03 14:36}^high"));
    parser = new ColdfrontParser(new CommonTokenStream(lexer));
    
    ColdfrontEngine engine = parser.statement(null);
    
    DateFormat df = new SimpleDateFormat("yyyy.MM.dd HH:mm");
    Date expectedDate = df.parse("2010.12.03 14:36");
    
    assertNotNull(engine);
    assertNotNull(engine.getLocation());
    assertNotNull(engine.getDateTime());
    assertNotNull(engine.getDataType());
    
    assertEquals("-39.70, -104.75", engine.getLocation()); 
    assertEquals(expectedDate, engine.getDateTime());
    assertEquals("high", engine.getDataType());
  }
  
  @Test
  public void testAddressDateTemperature() throws RecognitionException, ParseException {
    lexer = new ColdfrontLexer(new ANTLRStringStream("({123 S Main St, Des Moines, IA 12345})@{2010.12.03}^temperature"));
    parser = new ColdfrontParser(new CommonTokenStream(lexer));
    
    ColdfrontEngine engine = parser.statement(null);
    
    DateFormat df = new SimpleDateFormat("yyyy.MM.dd");
    Date expectedDate = df.parse("2010.12.03");
    
    assertNotNull(engine);
    assertNotNull(engine.getLocation());
    assertNotNull(engine.getDateTime());
    assertNotNull(engine.getDataType());
    
    assertEquals("123 S Main St, Des Moines, IA 12345", engine.getLocation()); 
    assertEquals(expectedDate, engine.getDateTime());
    assertEquals("temperature", engine.getDataType());
  }
  
  @Test
  public void testAddressDatetimeHigh() throws RecognitionException, ParseException {
    lexer = new ColdfrontLexer(new ANTLRStringStream("({123 S Main St, Des Moines, IA 12345})@{2010.12.03 14:36}^high"));
    parser = new ColdfrontParser(new CommonTokenStream(lexer));
    
    ColdfrontEngine engine = parser.statement(null);
    
    DateFormat df = new SimpleDateFormat("yyyy.MM.dd HH:mm");
    Date expectedDate = df.parse("2010.12.03 14:36");
    
    assertNotNull(engine);
    assertNotNull(engine.getLocation());
    assertNotNull(engine.getDateTime());
    assertNotNull(engine.getDataType());
    
    assertEquals("123 S Main St, Des Moines, IA 12345", engine.getLocation()); 
    assertEquals(expectedDate, engine.getDateTime());
    assertEquals("high", engine.getDataType());
  }
  
  @Test
  public void testAddressTemperatureDatetime() throws RecognitionException, ParseException {
    lexer = new ColdfrontLexer(new ANTLRStringStream("({123 S Main St, Des Moines, IA 12345})^temperature@{2010.12.03 14:36}"));
    parser = new ColdfrontParser(new CommonTokenStream(lexer));
    
    ColdfrontEngine engine = parser.statement(null);
    
    DateFormat df = new SimpleDateFormat("yyyy.MM.dd HH:mm");
    Date expectedDate = df.parse("2010.12.03 14:36");
    
    assertNotNull(engine);
    assertNotNull(engine.getLocation());
    assertNotNull(engine.getDateTime());
    assertNotNull(engine.getDataType());
    
    assertEquals("123 S Main St, Des Moines, IA 12345", engine.getLocation());
    assertEquals(expectedDate, engine.getDateTime());
    assertEquals("temperature", engine.getDataType());
  }
  
  @Test
  public void testPositiveCoordinatesLowDatetime() throws RecognitionException, ParseException {
    lexer = new ColdfrontLexer(new ANTLRStringStream("(39.70, 104.75)^low@{2010.12.03 02:14}"));
    parser = new ColdfrontParser(new CommonTokenStream(lexer));
    
    ColdfrontEngine engine = parser.statement(null);
    
    DateFormat df = new SimpleDateFormat("yyyy.MM.dd HH:mm");
    Date expectedDate = df.parse("2010.12.03 2:14");
    
    assertNotNull(engine);
    assertNotNull(engine.getLocation());
    assertNotNull(engine.getDateTime());
    assertNotNull(engine.getDataType());
    
    assertEquals("39.70, 104.75", engine.getLocation());
    assertEquals(expectedDate, engine.getDateTime());
    assertEquals("low", engine.getDataType());
  }
}
