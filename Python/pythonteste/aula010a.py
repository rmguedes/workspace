''' tempo = int(input('Quantos anos tem seu carro: '))
if tempo <=3:
    print('Carro Novo')
else:
    print('Carro Velho')
print('--FIM--') '''

''' tempo = int(input('Quantos anos tem seu carro: '))
print('Carro Novo'if tempo <=3 else 'Carro Velho')
print('--FIM--') '''

''' nome = str(input('Qual o seu nome? '))
if nome == 'Gustavo':
    print('Que nome lindo você tem!')
else:
    print('Seu nome é tão normal!')
print('Bom dia, {}!'.format(nome)) '''

n1 = float(input('Digite a primeira nota: '))
n2 = float(input('Digite a segunda note: '))
m = (n1 + n2) / 2
print('A sua média foi {:.1f}'.format(m))
if m >=6.0:
    print('Sua média foi boa! Parabéns!')
else:
    print('Sua média foi ruim! Estude mais!')
