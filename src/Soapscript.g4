grammar Soapscript; // Subset of Javascript

program : header block ;
header  : 'PROGRAM' ID ';' ;
block   : stmt_list* 'end';

stmt_list : stmt ( ';' stmt )* ;

stmt : if_stmt
     | for_stmt
     | while_stmt
     | bubble_stmt
     | clean_stmt
     | assignment
     | expr
     |';' // Do we need this???
     ;

if_stmt     : IF expr stmt ( ELSE stmt ) ;
for_stmt    : FOR expr ;
while_stmt  : WHILE expr stmt ;
bubble_stmt : BUBBLE expr ;
clean_stmt  : CLEAN  expr ;
stmt_expr   : expr ;

expr  :  primary
      |   expr '.' ID
      |   expr '[' expr ']'
      |   expr ('++' | '--')
      |   ('+'|'-'|'++'|'--') expr
      |   ('~'|'!') expr
      |   expr ('*'|'/'|'%') expr
      |   expr ('+'|'-') expr
      |   expr ('<' '=' | '>' '=' | '>' | '<') expr
      |   expr ('==' | '!=') expr
      |   expr '&' expr
      |   expr '^' expr
      |   expr '|' expr
      ;

primary : '(' expr ')'
        | INT
        | ID
        | FLOAT
        ;

variable    : type_id ID
            | ID ;
assignment  : variable '=' expr;

COMMENT       : '/*' .*? '*/'    -> channel(HIDDEN); // match anything between /* and */ ;
LINE_COMMENT  : '//' ~[\r\n]* '\r'? '\n' -> channel(HIDDEN) ;  //everything after in same line

declarations : VAR decl_list ';' ;
decl_list    : decl ( ';' decl )* ;
decl         : var_list ':' type_id ;
var_list     : var_id ( ',' var_id )* ;
var_id       : ID ;
type_id      : ID ;

variableDeclarator  : ID ('=' expr)? ; //changed identifier to ID

ID      : [a-zA-Z][a-zA-Z0-9]* ;
INT     : [0-9]+ ;
FLOAT   : [0-9]+.[0-9]+ ;
NEWLINE : '\r'? '\n' -> skip ;  // return newlines to parser (is end-statement signal)
WS      : [ \t]+ -> skip ;      // toss out whitespace

IF      : 'if' ;
ELSE    : 'else';
FOR     : 'for';
WHILE   : 'while';
BUBBLE  : 'bubble';   //  spawn unicorns or something
CLEAN   : 'clean';    // erase bubbles or something
VAR     : 'var';
