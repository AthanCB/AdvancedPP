comp = input("Give the compressed string: ")
decomp = ""
for char in comp:
    if(char.isdigit()):
        if(comp[comp.index(char) + 1].isdigit()):
            decomp = ""
            break
        for i in range(0,int(char)):
            decomp += comp[comp.index(char) + 1];
print(decomp)
