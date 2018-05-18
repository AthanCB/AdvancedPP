grammar Play;

init : theatricalplay+;
theatricalplay : act act act 'BREAK'+ act act;
act : 'DIMLIGHTS'+ scene+ sceneContinue* 'STRONGLIGHTS';
scene : 'OPENCURTAIN'+ precursor* 'ENTRY'+ moreActions* 'CLOSECURTAIN'+;
sceneContinue : scene sceneContinue*;
precursor : 'TALK' precursor*;
moreActions : action moreActions*;
action : 'TALK' | 'MOVE' | 'ENTRY' | 'EXIT' | 'DEATH';

WS  :   [ \t\r\n]+ -> skip ;
LINE_COMMENT : '//' .*? '\r'? '\n' -> skip ; 
