Coldfront is a language for describing meteorological data.  It is used to describe atoms of weather information such as current temperature, high temperature, or low temperature at a particular location on Earth at a particular point in time.  Each Coldfront statement can be divided into three parts: the location, the time, and the atom.

##Location

Locations are are placed in parentheses.  You can describe locations by latitude and longitude coordinates like so:

`
  (<latitude>, <longitude>)
`    

For example:

Tulsa, Oklahoma, USA:
`
  (36.15, -95.99)
`
  
Perth, Australia:
`
  (-31.95, 115.86)
`

You may also specify locations using addresses. Place the address in curly braces:
`
  ({123 S Main St, Anytown, USA})
`  

The address may contain mixed case alphanumeric characters, spaces, or commas.


##Date/Time

Time in Coldfront follows the format YYYY.MM.DD HH:mm.  The HH:mm component is optional.  Date/Time expressions are placed in curly braces with a leading @ like so:

`
  @{YYYY.MM.DD HH:mm}
`

or without the time component:

`
  @{YYYY.MM.DD}
` 

For example, July 21st 1998 4:32 PM:

`
  @{1998.07.21 16:32}
`

Or without the time component:

`
  @{1998.07.21}
`

## Atoms

The atom or data type of the statement is of the form:

`
  ^atom
`

where "atom" is any arrangement of mixed case alpha characters.  For example

` ^temperature`

` ^high`

` ^low`

## All Together

The three components are composed together to form a complete statement:

`
  <location>(<datetime><atom>)
or
  <location>(<atom><datetime>)
`

Examples:

` (39.70, 104.75)@{2010.12.03}^temperature`

` (39.70, 104.75)@{2010.12.03 14:36}^temperature`

` ({123 S Main St, Des Moines, IA 12345})@{2010.12.03 14:36}^high`

` ({123 S Main St, Des Moines, IA 12345})^temperature@{2010.12.03 14:36}`

This project contains implementations of the language in both Ruby and Java, utilizing [Treetop](http://treetop.rubyforge.org/) and [ANTLR](http://www.antlr.org/) respectively.  Included in each implementation is a simple engine object which captures the tokens and components of a Coldfront statement.  You may extend this engine to make use of the DSL as you need to.
