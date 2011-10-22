require 'date'

class Engine
    
  attr_accessor :location_data
  attr_reader :datetime
  attr_accessor :datatype
  
  def initialize
    @location_data = nil
    @datetime = nil
    @data_type = nil
  end
  
  def set_datetime(date_str, time_str)
#    raise "#{date_str}, #{time_str}"
    datetime = DateTime.strptime("#{date_str} #{time_str}", "%Y.%m.%d#{(time_str.to_s.empty? ? '' : ' %H:%M')}")    
    @datetime = Time.local(datetime.year, datetime.month, datetime.day, datetime.hour, datetime.min)
  end
end