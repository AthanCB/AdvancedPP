grammar Spl;

/* **Στο Sample5 δεν τρέχει διότι δεν αναγνωρίζει το s1,s2 επειδή περιέχει αριθμό παρόλο που
     έχουμε ορίσει στο id ότι μπορεί να δεχθεί και ψηφία. Αν δοκιμάσετε να αφαιρέσετε τους αριθμούς
     το Sample5 τρέχει κανονικά** */

//Εκκίνηση με το μη τερματικό init ορίζοντας όνομα και καλώντας το mainprogram που θα βρίσκεται μετα
//το τμήμα επικεφαλίδας
init : PROGRAM PNAME mainprogram;

//Έχουμε ορίσει ένα γενικό mainprogram που περιέχει το τμήμα δηλώσεων και το σώμα (είτε απλό, είτε σύνθετο)
mainprogram : var_dec* BODY (s_body | r_body);

//Τμήμα δηλώσεων. Μπορεί να δηλωθούν απο μία εώς πολλές μεταβλητές
var_dec : VAR (id (COMMA id)* COLON type SEMICOLON*)+;

//Δήλωση τύπων μεταβλητών. Το array_type είναι σύνθετος τύπος και αναλύεται παρακάτω
type : INT_TYPE | BOOL_TYPE | STRING_TYPE | array_type;
array_type : ARRAY array_bracks OF type;

//Το s_body είναι μιας γραμμής σώμα και το r_body είναι ένα σύνθετο σώμα που θα πρέπει να ξεκινά
//με BEGIN και να τελειώνει με END δίοτι θα περιέχει πολλαπλά statements
s_body : statement;
r_body : BEGIN (((statement+| r_body) SEMICOLON)* (statement | r_body))? END;

//Το statement μπορεί να είναι ένα απο όλα τα παρακάτω είδη
statement : assign_statement | ifelse_statement | while_statement | read_statement | write_statement | EXIT;

// απλή δήλωση μεταβλητής: όνομα_μεταβλητής := τιμή_μεταβλητής ;
// δίνεται η περίπτωση δήλωσης πίνακας  
assign_statement : id array_bracks? ASSIGN (id? comp_res? asn_numbers?| (TRUE | FALSE) | STRING);

//Δήλωση if else. Το if είναι υποχρεωτικό ενώ το else όχι και μπορεί να χρησιμοποιηθεί μόνο μια φορά
//Μπορούν να πάρουν είτε απλό σώμα είτε σύνθετο
ifelse_statement : if_st else_st?;
if_st :IF exp THEN (s_body | r_body);
else_st : ELSE (s_body | r_body);

//Διάβασμα μεταβλητής
read_statement : READ LFPAR (NOT|log_ops)? id (COMMA NOT? id)* RTPAR;

//Εμφάνιση στην οθόνη
write_statement : WRITE LFPAR NOT? output ((log_ops|COMMA|comp_ops) NOT? output)* RTPAR; 

//Εντολή While Do που μπορεί να περιέχει είτε απλό σώμα (ενός statement) είτε σύνθετο
while_statement : WHILE exp DO (s_body | r_body);

//Μήνυμα για εμφάνιση στην οθόνη
output : (STRING | DIGIT | bool_ops | id | exp)+;

//Δήλωση έκφρασης. Μπορεί να πάρει οποιαδήποτε μεταβλητή, σύγκριση μεταβλητών ή ορο
exp : term log_ops? comp_ops? term?;
term : bool_ops | comp_res | id;

//Συγκρίσεις μεταβλητών με όλους τους τελεστές
comp_res : asn_numbers ((DIV | MOD | MINUS | AND | MULTIPLE | GREATER | LESS | GTEQ | LTEQ | NEQ) asn_numbers)?;

//Operators
bool_ops: TRUE | FALSE;
log_ops : OR | AND;

//Αριθμοί αρνητικοί και θετικοί ή μεταβλητές αρνητικές και θετικές
asn_numbers : (PLUS | MINUS)?(DIGIT | id);

//Δήλωση πίνακα
array_bracks: LBRA (id |DIGIT)+ RBRA;

//Αναγνωριστικό για όνομα μεταβλητής
id : UNDERSCORE* LETTER (LETTER | DIGIT | UNDERSCORE)*;

//Δηλώσεις λεκτικών όρων
PROGRAM : 'PROGRAM';
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

comp_ops : EQUALS | GREATER | LESS | NEQ | LTEQ | GTEQ | DIV | MOD | S_CONC;
LETTER : [a-zA-Z]+;
DIGIT : [0-9]+;

PNAME : LETTER+ DIGIT*;

STRING  : '"' (~('"' | '\\' | '\r' | '\n') | '\\' ('"' | '\\'))* '"';
COMMENT : '{' .*? '}' -> skip ;
WS : [ \t\r\n]+ -> skip ; 