require 'rubygems'
gem 'treetop'
gem 'activesupport'
require 'treetop'
require 'coldfront_engine'
require 'test/unit'

Treetop.load("coldfront")

class ColdFrontClientTest < Test::Unit::TestCase
  
  def initialize(arg)
    super(arg)
    @parser = ColdFrontParser.new
  end
  
  def test_positive_coordinates_date_temperature
    parsing = @parser.parse("(39.70, 104.75)@{2010.12.03}^temperature")
    
    assert_not_nil(parsing)
    engine = parsing.run
    
    assert_equal("39.70, 104.75", engine.location_data)
    assert_equal(Time.local(2010, 12, 3), engine.datetime)
    assert_equal("temperature", engine.datatype)
  end
  
  def test_positive_coordinates_datetime_temperature
    parsing = @parser.parse("(39.70, 104.75)@{2010.12.03 14:36}^temperature")
    
    assert_not_nil(parsing)
    engine = parsing.run
    
    assert_equal("39.70, 104.75", engine.location_data)
    assert_equal(Time.local(2010, 12, 3, 14, 36), engine.datetime)
    assert_equal("temperature", engine.datatype)    
  end
  
  def test_mixed_coordinates_date_temperature
    parsing = @parser.parse("(39.70, -104.75)@{2010.12.03}^temperature")
    
    assert_not_nil(parsing)
    engine = parsing.run
    
    assert_equal("39.70, -104.75", engine.location_data)
    assert_equal(Time.local(2010, 12, 3), engine.datetime)
    assert_equal("temperature", engine.datatype)    
  end
  
  def test_mixed_coordinates_datetime_temperature
    parsing = @parser.parse("(-39.70, 104.75)@{2010.12.03 14:36}^temperature")
    
    assert_not_nil(parsing)
    engine = parsing.run
    
    assert_equal("-39.70, 104.75", engine.location_data)
    assert_equal(Time.local(2010, 12, 3, 14, 36), engine.datetime)
    assert_equal("temperature", engine.datatype)    
  end
  
  def test_negative_coordinates_date_temperature
    parsing = @parser.parse("(-39.70, -104.75)@{2010.12.03}^temperature")
    
    assert_not_nil(parsing)
    engine = parsing.run
    
    assert_equal("-39.70, -104.75", engine.location_data)
    assert_equal(Time.local(2010, 12, 3), engine.datetime)
    assert_equal("temperature", engine.datatype)    
  end
  
  def test_negative_coordinates_datetime_high
    parsing = @parser.parse("(-39.70, -104.75)@{2010.12.03 14:36}^high")
    
    assert_not_nil(parsing)
    engine = parsing.run
    
    assert_equal("-39.70, -104.75", engine.location_data)
    assert_equal(Time.local(2010, 12, 3, 14, 36), engine.datetime)
    assert_equal("high", engine.datatype)    
  end
  
  def test_address_date_temperature
    parsing = @parser.parse("({123 S Main St, Des Moines, IA})@{2010.12.03}^temperature")
    
    assert_not_nil(parsing)
    engine = parsing.run
    
    assert_equal("123 S Main St, Des Moines, IA", engine.location_data)
    assert_equal(Time.local(2010, 12, 3), engine.datetime)
    assert_equal("temperature", engine.datatype)  
  end
  
  def test_address_datetime_high
    parsing = @parser.parse("({123 S Main St, Des Moines, IA})@{2010.12.03 14:36}^high")
    
    assert_not_nil(parsing)
    engine = parsing.run
    
    assert_equal("123 S Main St, Des Moines, IA", engine.location_data)
    assert_equal(Time.local(2010, 12, 3, 14, 36), engine.datetime)
    assert_equal("high", engine.datatype)    
  end
  
  def test_address_temperature_datetime
    parsing = @parser.parse("({123 S Main St, Des Moines, IA})^temperature@{2010.12.03 14:36}")
    
    assert_not_nil(parsing)
    engine = parsing.run
    
    assert_equal("123 S Main St, Des Moines, IA", engine.location_data)
    assert_equal(Time.local(2010, 12, 3, 14, 36), engine.datetime)
    assert_equal("temperature", engine.datatype)    
  end
  
  
  def test_positive_coordinates_low_datetime
    parsing = @parser.parse("(39.70, 104.75)^low@{2010.12.03 02:14}")
    
    assert_not_nil(parsing)
    engine = parsing.run
    
    assert_equal("39.70, 104.75", engine.location_data)
    assert_equal(Time.local(2010, 12, 3, 2, 14), engine.datetime)
    assert_equal("low", engine.datatype)    
  end
  
end