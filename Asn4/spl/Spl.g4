grammar Spl;

init : PROGRAM PNAME mainprogram;
PROGRAM : 'PROGRAM';

mainprogram : var_dec* BODY (s_body | r_body);

var_dec : VAR (id (COMMA id)* COLON type SEMICOLON*)+;
s_body : statement;
r_body : BEGIN statement+ END;
statement : assign_statement ;
assign_statement : (id ARRAY_BRACKS? ASSIGN (id*(PLUS | MINUS)*DIGIT+ | (TRUE | FALSE) | STRING)  SEMICOLON)+; //να μπορεί να έχει και μόνο id


type : INT_TYPE | BOOL_TYPE | STRING_TYPE | array_type;
array_type : ARRAY ARRAY_BRACKS OF type;


id : UNDERSCORE* LETTER (LETTER | DIGIT | UNDERSCORE)*;



INT_TYPE : 'INTEGER';
BOOL_TYPE : 'BOOLEAN';
STRING_TYPE : 'STRING';
ARRAY : 'ARRAY';
OF : 'OF';
READ : 'READ';
WRITE : 'WRITE';
IF : 'IF';
THEN : 'THEN';
ELSE : 'ELSE';
ELSE_IF : 'ELSE IF';
WHILE : 'WHILE';
DO : 'DO';
EXIT : 'EXIT';
VAR : 'VAR';
BODY : 'BODY';
BEGIN : 'BEGIN';
END : 'END';
AND : 'AND';
OR : 'OR';
NOT : 'NOT';
TRUE : 'TRUE';
FALSE : 'FALSE';

PLUS : '+';
MINUS:'-';
MULTIPLE : '*';
DIV : '/';
MOD : '%';
EQUALS : '=';
GREATER : '>';
LESS : '<';
LFPAR : '(';
RTPAR : ')';
COMMA:',';
COLON:':';
LBRA:'[';
RBRA:']';
S_CONC:'|';
UNDERSCORE : '_';
SEMICOLON:';';
ASSIGN:':=';
GTEQ:'>=';
LTEQ:'<=';
NEQ:'<>';


LETTER : [a-zA-Z]+;
DIGIT : [0-9];

PNAME : LETTER+ DIGIT*;
ARRAY_BRACKS : LBRA DIGIT+ RBRA;
STRING  : '"' (~('"' | '\\' | '\r' | '\n') | '\\' ('"' | '\\'))* '"';
COMMENT : '{' .*? '}' -> skip ;
WS : [ \t\r\n]+ -> skip ; 