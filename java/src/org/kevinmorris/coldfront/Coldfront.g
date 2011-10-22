grammar Coldfront;

options {
  language = Java;
}

@header {
  package org.kevinmorris.coldfront;
}

@lexer::header {
  package org.kevinmorris.coldfront;
}

statement[Engine inEngine] returns [Engine retEngine] 
scope {
  Engine engine;
}
@init {
  $statement::engine = (inEngine == null) ? new Engine() : inEngine;
}
@after {
  $retEngine = $statement::engine;
}
: location data_description;

location : '(' (latlon | address) ')';   
address : ADDRESS { $statement::engine.setLocation($ADDRESS.getText().substring(1, $ADDRESS.getText().length() - 1)); }; 
latlon : (COORDINATE ',' ' '* COORDINATE) { $statement::engine.setLocation($text); }; 

data_description :
  (datetime datatype)
| (datatype datetime)
; 

datetime: '@{' DATE (' '+ TIME)? '}' { $statement::engine.setDateTime($DATE.text, $TIME.text); };
datatype: '^' atom=ALPHA { $statement::engine.setDataType($atom.text); };

DATE : ('0'..'9')('0'..'9')('0'..'9')('0'..'9') '\.' ('0'..'1')('0'..'9') '\.' ('0'..'3')('0'..'9');
TIME	: ('0'..'2')('0'..'9') ':' ('0'..'5')('0'..'9');


COORDINATE: '-'? ('0'..'9')+ ('.' ('0'..'9')+)?;
ADDRESS : '{' ('a'..'z' | 'A'..'Z' | '0'..'9' | ' ' | ',')+ '}';
ALPHA   : ('a'..'z' | 'A'..'Z')+;