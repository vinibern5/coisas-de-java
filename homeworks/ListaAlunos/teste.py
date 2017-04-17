import urllib.request
import random
import string
forca = [
'''
    +-----+
          |
          |
          |
          |
          |
          |
====================
''',
'''
    +-----+
    |     |
          |
          |
          |
          |
          |
====================
''',
'''
    +-----+
    |     |
    O     |
          |
          |
          |
          |
====================
''',
'''
    +-----+
    |     |
    O     |
    |     |
          |
          |
          |
====================''',
'''
    +-----+
    |     |
    O     |
    |\    |
          |
          |
          |
====================''',
'''
    +-----+
    |     |
    O     |
   /|\    |
          |
          |
          |
====================''',
'''
    +-----+
    |     |
    O     |
   /|\    |
   /       |
          |
          |
====================''',
'''
    +-----+
    |     |
    O     |
   /|\    |
   / \    |
          |
          |
====================''']

########
link = 'https://alcor.concordia.ca//~vjorge/Palavras-Cruzadas/Lista-de-Palavras.txt'
pagina = urllib.request.urlopen(link).read().decode('utf8').split()




palavra = random.choice(pagina).lower()
for simbol in string.punctuation:
    palavra = palavra.replace(simbol,' ')
certas = ''
erradas = ''
lista = ['_' for x in palavra]

print(palavra)
if len(palavra)>4:
    letra = random.choice(palavra)
    certas = certas + letra
    pos = -1
    while True:
            pos = palavra.find(letra,pos+1)
            if pos == -1:
                break
            else:
                lista[pos] = letra

def desenha():
    print(forca[len(erradas)])
    print(' '.join(lista))

def chute(letra):
    global certas,erradas
    if letra in (certas+erradas):
        print('Letra repetida!')
    elif letra in palavra:
        certas = certas + letra
        pos = -1
        while True:
            pos = palavra.find(letra,pos+1)
            if pos == -1:
                break
            else:
                lista[pos] = letra
    else:
        erradas = erradas + letra
    

#def again(y):
    

while True:
    desenha()
    if palavra == ''.join(lista):
        input("Parabéns!")
        break
    elif len(erradas)+1 == len(forca):
        print("A palavra era " +palavra +"!")
        input("Tchau!")
        break
    else:
        cht = input("Letra: ")
        chute(cht)
        
