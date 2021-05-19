# Exercício Python 32: Faça um programa que leia um ano qualquer
# e mostre se ele é bissexto.
from datetime import date
ano = int(input('Que ano quer analisar? Coloque 0 para analisar o ano atual. '))
if ano % 4 and ano % 100 != 0 or ano % 400 == 0:
    ano = date.today().year
    print('O ano {} é BISSEXTO'.format(ano))
else:
    print('O ano {} não é BISSEXTO'.format(ano))
