grammar Play;
reg : theatricalplay ;

theatricalplay : act act act 'BREAK' act act;

act : 'DIMLIGHTS' scene scenecontinue 'STRONGLIGHTS';
scene : 'OPENCURTAIN' precursor 'ENTRY' moreactions 'CLOSECURTAIN';
scenecontinue : scene scenecontinue | 'e';

precursor : 'TALK' precursor | 'e';
moreactions : action moreactions | 'e';
action : 'TALK' | 'MOVE' | 'ENTRY' | 'EXIT' | 'DEATH';

LINE_COMMENT : '//' -> skip ;
WS : [ \t\r\n]+ -> skip ;