//Subset of Javascript called Soapscript 

//https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Lexical_grammar

grammar Soapscript;


/** The start rule; begin parsing here. */
prog:   SOAP+ ; 

SOAP: ;

// Regular exprs that define your language tokens.

ID  :   [a-zA-Z][a-zA-Z0-9]* ;          // match identifiers <label id="code.tour.expr.3"/>
INT :   [0-9]+ ;                        // match integers
NEWLINE:'\r'? '\n' ;                    // return newlines to parser (is end-statement signal)
WS  :   [ \t]+ -> skip ;                // toss out whitespace


IF      : 'IF' ;
THEN    : 'THEN' ;
ELSE    : 'ELSE';
FOR : 'FOR'; 
WHILE : 'WHILE';
BUBBLE : 'BUBBLE';                      //spawn unicorns or something
CLEAN : 'CLEAN';                        // erase bubbles or something




// exprs with numeric constants and scalar variables. No type checking, no arrays or records yet.

stmt : stmt     // Stmt
     | if_stmt  // ifStmt
     | for_stmt // forStmt
     | while_stmt    // whileStmt
     | bubble_stmt   // bubbleStmt
     | clean_stmt   //cleanStmt
     ;


if_stmt     : IF expr THEN stmt ( ELSE stmt )? ;
for_stmt    : FOR expr;
while_stmt  : WHILE expr;
bubble_stmt : BUBBLE expr;
clean_stmt  : CLEAN  expr;
        


//identifier ←

statementexpr :   expr;

expr
    :   primary
    |   expr '.' ID
    // |   expr '.' 'this'
    // |   expr '.' 'new' ID '(' exprList? ')'
    // |   expr '.' 'super' '.' ID arguments?
    // |   expr '.' explicitGenericInvocation
    |   expr '[' expr ']'
    //  |   expr '(' exprList? ')'
    |   expr ('++' | '--')
    |   ('+'|'-'|'++'|'--') expr
    |   ('~'|'!') expr
   // |   '(' type ')' expr //NOT defined yet
   // |   'new' creator
    |   expr ('*'|'/'|'%') expr
    |   expr ('+'|'-') expr
    |   expr ('<' '<' | '>' '>' '>' | '>' '>') expr
    |   expr ('<' '=' | '>' '=' | '>' | '<') expr
    //|   expr 'instanceof' type
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
    ;

primary
    :   '(' expr ')'
//    |   'this'
//    |   'super'
//    |   literal
    |   Identifier
//    |   type '.' 'class'
//    |   'void' '.' 'class'
    ;


// Assignment statements.

variable : ID ;
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
    :   ID ('=' expr)?  //changed identifier to ID
    ;
/*
Identifier
    :   Letter (Letter|JavaIDDigit)*
    ;

// Might need to change these Letter and digit ranges to meet our JS needs
// JS uses double-precision floating-point arithmetic kappa kappa kappa 
fragment
Letter
    :  '\u0024' |
       '\u0041'..'\u005a' |
       '\u005f' |
       '\u0061'..'\u007a' |
       '\u00c0'..'\u00d6' |
       '\u00d8'..'\u00f6' |
       '\u00f8'..'\u00ff' |
       '\u0100'..'\u1fff' |
       '\u3040'..'\u318f' |
       '\u3300'..'\u337f' |
       '\u3400'..'\u3d2d' |
       '\u4e00'..'\u9fff' |
       '\uf900'..'\ufaff'
    ;

fragment
JavaIDDigit
    :  '\u0030'..'\u0039' |
       '\u0660'..'\u0669' |
       '\u06f0'..'\u06f9' |
       '\u0966'..'\u096f' |
       '\u09e6'..'\u09ef' |
       '\u0a66'..'\u0a6f' |
       '\u0ae6'..'\u0aef' |
       '\u0b66'..'\u0b6f' |
       '\u0be7'..'\u0bef' |
       '\u0c66'..'\u0c6f' |
       '\u0ce6'..'\u0cef' |
       '\u0d66'..'\u0d6f' |
       '\u0e50'..'\u0e59' |
       '\u0ed0'..'\u0ed9' |
       '\u1040'..'\u1049'
   ;
*/


