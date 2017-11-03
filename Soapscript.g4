grammar Soapscript;

// Regular expressions that define your language tokens.


// Expressions with numeric constants and scalar variables. No type checking, no arrays or records yet.


// Assignment statements.


// Control statements.


// Variable declarations (no type definitions yet).


// Tester
r  : 'hello' ID ;         // match keyword hello followed by an identifier

ID : [a-z]+ ;             // match lower-case identifiers

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
