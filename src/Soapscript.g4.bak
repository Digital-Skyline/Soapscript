//Subset of Javascript called Soapscript 

grammar Soapscript;


/** The start rule; begin parsing here. */

program : header block ;
header  : 'PROGRAM' ID ';' ;
block   :  stmt_list* 'end';


// Regular exprs that define your language tokens.

ID  :   [a-zA-Z][a-zA-Z0-9]* ;          // match identifiers <label id="code.tour.expr.3"/>
INT :   [0-9]+ ;                        // match integers
FLOAT: [0-9]+.[0-9]+; //kappa
NEWLINE:'\r'? '\n' -> skip ;                    // return newlines to parser (is end-statement signal)
WS  :   [ \t]+ -> skip ;                // toss out whitespace


IF      : 'if' ;
//THEN    : 'THEN' ;
ELSE    : 'else';
FOR : 'for'; 
WHILE : 'while';
BUBBLE : 'bubble';                      //spawn unicorns or something
CLEAN : 'clean';                        // erase bubbles or something
VAR : 'var';



// exprs with numeric constants and scalar variables. No type checking, no arrays or records yet.

stmt :// stmt   // Stmt
     if_stmt    // ifStmt
     | for_stmt // forStmt
     | while_stmt    // whileStmt
     | bubble_stmt   // bubbleStmt
     | clean_stmt   //cleanStmt
|assignment
|   expr
|';'
     ;

stmt_list       : stmt (  ';' stmt )* ;

if_stmt     : IF expr stmt ( ELSE stmt ) ;
for_stmt    : FOR expr;
while_stmt  : WHILE expr stmt;
bubble_stmt : BUBBLE expr;
clean_stmt  : CLEAN  expr;
        


//identifier ?

statementexpr :   expr;

expr
    :   primary
    |   expr '.' ID
    |   expr '[' expr ']'
    |   expr ('++' | '--')
    |   ('+'|'-'|'++'|'--') expr
    |   ('~'|'!') expr
    |   expr ('*'|'/'|'%') expr
    |   expr ('+'|'-') expr
    |   expr ('<' '<' | '>' '>' '>' | '>' '>') expr
    |   expr ('<' '=' | '>' '=' | '>' | '<') expr
    |   expr ('==' | '!=') expr
    |   expr '&' expr
    |   expr '^' expr
    |   expr '|' expr
    |   expr '?' expr ':' expr
    |   expr
        ('^='<assoc=right>
        |'+='<assoc=right>
        |'-='<assoc=right>
        |'*='<assoc=right>
        |'/='<assoc=right>
        |'&='<assoc=right>
        |'|='<assoc=right>
        |'='<assoc=right>
        |'>' '>' '='<assoc=right>
        |'>' '>' '>' '='<assoc=right>
        |'<' '<' '='<assoc=right>
        |'%='<assoc=right>
        )
        expr
|';'
    ;

primary
    :   '(' expr ')'
    |INT
    |ID
    |FLOAT
    ;


// Assignment statements.

variable :type_id ID
| ID ;
assignment : variable '=' expr;     

//Comments or White Spaces
COMMENT:   '/*' .*? '*/'    -> channel(HIDDEN); // match anything between /* and */ ;
LINE_COMMENT : '//' ~[\r\n]* '\r'? '\n' -> channel(HIDDEN) ;  //everything after in same line






// Control statements.



// Variable declarations (no type definitions yet).
declarations : VAR decl_list ';' ;
decl_list    : decl ( ';' decl )* ;
decl         : var_list ':' type_id ;
var_list     : var_id ( ',' var_id )* ;
var_id       : ID ;
type_id      : ID ;

variableDeclarator
    :   ID ('=' expr)?; //changed identifier to ID
    
